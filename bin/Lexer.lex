import java_cup.runtime.*;
//...
%%

%class Lexer      
%unicode
%cup
%line
%column

%{
  private boolean debug_mode;
  public  boolean debug()            { return debug_mode; }
  public  void    debug(boolean mode){ debug_mode = mode; }

  private void print_lexeme(int type, Object value){
    if(!debug()){ return; }

    System.out.print("<");
    switch(type){
      case sym.LET:
        System.out.print("LET"); break;
      case sym.EQUAL:
        System.out.print("="); break;
      case sym.SEMICOL:
        System.out.print(";"); break;
      case sym.PLUS:
        System.out.print("+"); break;
      case sym.MINUS:
        System.out.print("-"); break;
      case sym.MULT:
        System.out.print("*"); break;
      case sym.DIV:
        System.out.print("/"); break;
      case sym.LPAREN:
        System.out.print("("); break;
      case sym.RPAREN:
        System.out.print(")"); break;
      case sym.SLPAREN:
        System.out.print("["); break;
      case sym.SRPAREN:
        System.out.print("]"); break;
      case sym.CLPAREN:
        System.out.print("{"); break;
      case sym.CRPAREN:
        System.out.print("}"); break;
      case sym.PLPAREN:
        System.out.print("<"); break;
      case sym.PRPAREN:
        System.out.print(">"); break;
      case sym.COLON:
        System.out.print(":"); break;
      case sym.COMMA:
        System.out.print(","); break;
      case sym.DOT:
        System.out.print("."); break;
      case sym.DOTDOT:
        System.out.print("::"); break;
      case sym.EQEQ:
        System.out.print("=="); break;
      case sym.NOTEQ:
        System.out.print("!="); break;
      case sym.ANDAND:
        System.out.print("&&"); break;
      case sym.OROR:
        System.out.print("||"); break;
      case sym.DICTD:
        System.out.print("dict"); break;
      case sym.SEQD:
        System.out.print("seq"); break; 
      case sym.TDEF:
        System.out.print("tdef"); break;
      case sym.FDEF:
        System.out.print("fdef"); break;
      case sym.ALIAS:
        System.out.print("alias"); break;
      case sym.READ:
        System.out.print("read"); break;
      case sym.PRINT:
        System.out.print("print"); break;
      case sym.IF:
        System.out.print("if"); break;
      case sym.THEN:
        System.out.print("then"); break;
      case sym.FI:
        System.out.print("fi"); break;
      case sym.ELSE:
        System.out.print("else"); break;
      case sym.ELIF:
        System.out.print("elif"); break;
      case sym.WHILE:
        System.out.print("while"); break;
      case sym.DO:
        System.out.print("do"); break;
      case sym.OD:
        System.out.print("od"); break;
      case sym.FORALL:
        System.out.print("forall"); break;
      case sym.IN:
        System.out.print("in"); break;
      case sym.RETURN:
        System.out.print("return"); break;
      case sym.VOID:
        System.out.print("void"); break;
      case sym.MAIN:
        System.out.print("main"); break;
      case sym.INT:
        System.out.printf("INT %d", value); break;
      case sym.FLOAT:
        System.out.printf("FLOAT %f", value); break;
      case sym.RAT:
        System.out.printf("RAT %s", value); break;
      case sym.CHAR:
        System.out.printf("CHAR %s", value); break;
      case sym.IDENTIFIER:
        System.out.printf("IDENT %s", value); break;
      case sym.COMMENT:
        System.out.printf("COMMENT %s", value); break;
      case sym.BOOLEAN:
        System.out.printf("BOOL %s", value); break;
      case sym.STR:
        System.out.printf("STR %s", value); break;
      case sym.DICT:
        System.out.printf("DICT %s", value); break;
      case sym.DATATYPE:
        System.out.printf("DATATYPE %s", value); break;
      case sym.SEQ:
        System.out.printf("SEQUENCE %s", value); break;
    }
    System.out.print(">");
  }

  private Symbol symbol(int type) {
    print_lexeme(type, null);
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    print_lexeme(type, value);
    return new Symbol(type, yyline, yycolumn, value);
  }

%}


Whitespace = \r|\n|\r\n|" "|"\t" 
NonNewlineWhitespace = \r|" "|"\t" 

Letter = [a-zA-Z]
Digit = [0-9]
Character = "\'"{Letter}"\'" | "\'"{Digit}"\'" | "\'"{Punctuation}"\'"
Str = "\""({Letter}|{Digit}|{Punctuation}|{NonNewlineWhitespace})* "\""

Identifier = {Letter}("_" | {Letter} | {Digit})*
Punctuation = "!" | "\"" | "#" | "%" | "%" | "&" | "'" | "(" | ")" | "*" | "+" | "," | "-" | "." | "/" | "\\" | ":" | ";" | "<" | "=" | ">" | "?" | "@" | "[" | "]" | "^" | "_" | "`" | "{" | "}" | "|" | "~" 

Comment = {OneLineComment} | {MultipleLineComment}
OneLineComment = "#" {NonNewlineWhitespace}* (({Letter} | {Digit} | {Punctuation}) | {NonNewlineWhitespace})*
MultipleLineComment = "/#"(({Letter} | {Digit} | {Punctuation})|{Whitespace})*"#/"

BooleanConstants = "T" | "F"

Number = {Integer} | {Rational} | {Float}
Integer = {Digit}+ | "-"{Digit}+ 
Rational = {Digit}+"/"{Digit}+ | "-"{Digit}+"/"{Digit}+ | {Digit}+"_"{Digit}+"/"{Digit}+ | "-"{Digit}+"_"{Digit}+"/"{Digit}+      //Dividing by zero?
Float =  {Digit}+"."{Digit}+ | "-"{Digit}+"."{Digit}+ 

DictionaryValue = {NonNewlineWhitespace}*{Top}{NonNewlineWhitespace}*":"{NonNewlineWhitespace}*{Top}{NonNewlineWhitespace}*
Dictionary = "{"({DictionaryValue}",")*{DictionaryValue}"}" | "{" {NonNewlineWhitespace}* "}"

Sequence = "=" {NonNewlineWhitespace}* "["  {NonNewlineWhitespace}* ({NonNewlineWhitespace}*({Top}|{Identifier})","{NonNewlineWhitespace}*)* ({Top}|{Identifier}) {NonNewlineWhitespace}* "]" | "=" {NonNewlineWhitespace}* "[""]"

Top = {Number} | {Character} | {BooleanConstants}
DataType = "bool" | "int" | "rat" | "float" | "char" | "top" | "string"

%%

<YYINITIAL> {
  "let"                          {return symbol(sym.LET);           }
  {Comment}                      {return symbol(sym.COMMENT, yytext());}
  "tdef"                         {return symbol(sym.TDEF);			}
  "fdef"						 {return symbol(sym.FDEF);			}
  "dict"	                     {return symbol(sym.DICTD);			}
  "seq"                          {return symbol(sym.SEQD);          }
  "alias"	                     {return symbol(sym.ALIAS);			}
  "read"						 {return symbol(sym.READ);			}
  "print"						 {return symbol(sym.PRINT);			}
  "if"							 {return symbol(sym.IF);			}
  "then"						 {return symbol(sym.THEN);			}
  "fi"							 {return symbol(sym.FI);			}
  "else"						 {return symbol(sym.ELSE);			}
  "elif"						 {return symbol(sym.ELIF); 			}
  "while"						 {return symbol(sym.WHILE); 		}
  "do"							 {return symbol(sym.DO);			}
  "od"							 {return symbol(sym.OD);			}
  "forall"						 {return symbol(sym.FORALL);		}
  "in"							 {return symbol(sym.IN);			}
  "return"						 {return symbol(sym.RETURN);		}
  "void"						 {return symbol(sym.VOID);			}
  "main"                         {return symbol(sym.MAIN);          }
  
  {DataType}  	                 {return symbol(sym.DATATYPE, yytext());}
  {Character}                    {return symbol(sym.CHAR, yytext());}
  {Str}                          {return symbol(sym.STR, yytext());}
  {Integer}                      {return symbol(sym.INT, Integer.parseInt(yytext())); }
  {Float}                        {return symbol(sym.FLOAT, Float.parseFloat(yytext())); }
  {Rational}                     {return symbol(sym.RAT, yytext()); }
  {BooleanConstants}             {return symbol(sym.BOOLEAN, yytext());}
  {Identifier}                   {return symbol(sym.IDENTIFIER, yytext());}
  {Dictionary}                   {return symbol(sym.DICT, yytext());}
  {Sequence}                     {return symbol(sym.SEQ, yytext());}
  {Whitespace}  			     { /* do nothing */               }


  "."                            {return symbol(sym.DOT);        }
  "="        				   	 {return symbol(sym.EQUAL);      }
  ";"           				 {return symbol(sym.SEMICOL);    }
  "+"           				 {return symbol(sym.PLUS);       }
  "-"           				 {return symbol(sym.MINUS);      }
  "*"           				 {return symbol(sym.MULT);       }
  "/"           				 {return symbol(sym.DIV);        }
  "("           				 {return symbol(sym.LPAREN);     }
  ")"           				 {return symbol(sym.RPAREN);     }
  "["           				 {return symbol(sym.SLPAREN);    }
  "]"           				 {return symbol(sym.SRPAREN);    }
  "{"           				 {return symbol(sym.CLPAREN);    }
  "}"           				 {return symbol(sym.CRPAREN);    }
  ":"           				 {return symbol(sym.COLON);      }
  ","           				 {return symbol(sym.COMMA);      }
  "<"							 {return symbol(sym.PLPAREN);	 }
  ">"							 {return symbol(sym.PRPAREN);	 }
  "::"							 {return symbol(sym.DOTDOT);	 }
  "=="							 {return symbol(sym.EQEQ);		 }
  "!="							 {return symbol(sym.NOTEQ);		 }
  "&&"							 {return symbol(sym.ANDAND);	 }
  "||"							 {return symbol(sym.OROR);		 }
}

[^]  {
  System.out.println("file:" + (yyline+1) +
    ":0: Error: Invalid input '" + yytext()+"'");
  return symbol(sym.BADCHAR);
}
