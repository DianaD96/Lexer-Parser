import java_cup.runtime.*;

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
        System.out.print(":="); break;
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
      case sym.CLPAREN:
        System.out.print("{"); break;
      case sym.CRPAREN:
        System.out.print("}"); break;
      case sym.INT:
        System.out.printf("INT %d", value); break;
      case sym.FLOAT:
        System.out.printf("FLOAT %f", value); break;
      case sym.RAT:
        System.out.printf("RAT %s", value); break;
      case sym.CHAR:
        System.out.printf("CHAR %d", value); break;
      case sym.IDENTIFIER:
        System.out.printf("IDENT %s", value); break;
      case sym.COMMENT:
        System.out.printf("COMMENT %s", value); break;
      case sym.BOOLEAN:
        System.out.printf("BOOL %s", value); break;
      case sym.STRING:
        System.out.printf("STR %S", value); break;
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
Character = "\""{Letter}"\"" | "\""{Digit}"\"" | "\""{Punctuation}"\""
Str = "\" ({Letter}|{Digit}|{Punctuation}|{NonNewlineWhitespace})*  \""

Identifier = {Letter}("_" | {Letter} | {Digit})*
Punctuation = "!" | "\"" | "#" | "%" | "%" | "&" | "'" | "(" | ")" | "*" | "+" | "," | "-" | "." | "/" | "\\" | ":" | ";" | "<" | "=" | ">" | "?" | "@" | "[" | "]" | "^" | "_" | "`" | "{" | "}" | "|" | "~" 

Comment = {OneLineComment} | {MultipleLineComment}
OneLineComment = (({Letter} | {Digit} | {Punctuation}) | {NonNewlineWhitespace})*"#"
MultipleLineComment = "/#"(({Letter} | {Digit} | {Punctuation})|{Whitespace})*"#/"

BooleanConstants = "T" | "F"

Number = {Integer} | {Rational} | {Float}
Integer = {Digit}+ | "-"{Digit}+ 
Rational = {Digit}+"/"{Digit}+ | "-"{Digit}+"/"{Digit}+ | {Digit}+"_"{Digit}+"/"{Digit}+ | "-"{Digit}+"_"{Digit}+"/"{Digit}+      //Dividing by zero?
Float =  {Digit}+"."{Digit}+ | "-"{Digit}+"."{Digit}+


%%

<YYINITIAL> {
  "let"         { return symbol(sym.LET);        }
  {Comment} {return symbol(sym.COMMENT, yytext());}
  {Character} {return symbol(sym.CHAR, yytext());}
  {Str} {return symbol(sym.STR, yytext());}
  {Integer}     { return symbol(sym.INT, Integer.parseInt(yytext())); }
  {Float}     { return symbol(sym.FLOAT, Float.parseFloat(yytext())); }
  {Rational}     { return symbol(sym.RAT, yytext()); }
  {BooleanConstants} {return symbol(sym.BOOLEAN, yytext());}
  {Identifier}  { return symbol(sym.IDENTIFIER, yytext());   }

  {Whitespace}  { /* do nothing */               }

  ":="          { return symbol(sym.EQUAL);      }
  ";"           { return symbol(sym.SEMICOL);    }
  "+"           { return symbol(sym.PLUS);       }
  "-"           { return symbol(sym.MINUS);      }
  "*"           { return symbol(sym.MULT);       }
  "/"           { return symbol(sym.DIV);        }
  "("           { return symbol(sym.LPAREN);     }
  ")"           { return symbol(sym.RPAREN);     }
  "{"           { return symbol(sym.CLPAREN);    }
  "}"           { return symbol(sym.CRPAREN);    }

}

[^]  {
  System.out.println("file:" + (yyline+1) +
    ":0: Error: Invalid input '" + yytext()+"'");
  return symbol(sym.BADCHAR);
}
