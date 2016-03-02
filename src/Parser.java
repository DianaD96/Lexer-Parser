
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150930 (SVN rev 66)
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20150930 (SVN rev 66) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\036\000\002\004\003\000\002\002\004\000\002\002" +
    "\004\000\002\002\002\000\002\003\003\000\002\003\003" +
    "\000\002\003\003\000\002\003\003\000\002\003\003\000" +
    "\002\006\004\000\002\007\003\000\002\007\003\000\002" +
    "\007\003\000\002\007\003\000\002\007\003\000\002\007" +
    "\003\000\002\007\003\000\002\007\003\000\002\007\005" +
    "\000\002\007\005\000\002\010\003\000\002\010\003\000" +
    "\002\010\003\000\002\010\003\000\002\010\003\000\002" +
    "\014\011\000\002\013\013\000\002\015\010\000\002\011" +
    "\003\000\002\005\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\032\002\ufffe\004\ufffe\005\ufffe\006\ufffe\007" +
    "\ufffe\010\ufffe\011\ufffe\012\ufffe\013\ufffe\014\ufffe\026\ufffe" +
    "\034\ufffe\001\002\000\032\002\001\004\007\005\026\006" +
    "\017\007\027\010\012\011\021\012\024\013\014\014\023" +
    "\026\010\034\025\001\002\000\004\002\006\001\002\000" +
    "\004\002\000\001\002\000\050\002\ufff7\004\ufff7\005\ufff7" +
    "\006\ufff7\007\ufff7\010\ufff7\011\ufff7\012\ufff7\013\ufff7\014" +
    "\ufff7\015\ufff7\016\ufff7\017\ufff7\020\ufff7\021\ufff7\022\ufff7" +
    "\026\ufff7\034\ufff7\035\ufff7\001\002\000\004\031\054\001" +
    "\002\000\032\002\ufffd\004\ufffd\005\ufffd\006\ufffd\007\ufffd" +
    "\010\ufffd\011\ufffd\012\ufffd\013\ufffd\014\ufffd\026\ufffd\034" +
    "\ufffd\001\002\000\050\002\ufff1\004\ufff1\005\ufff1\006\ufff1" +
    "\007\ufff1\010\ufff1\011\ufff1\012\ufff1\013\ufff1\014\ufff1\015" +
    "\ufff1\016\ufff1\017\ufff1\020\ufff1\021\ufff1\022\ufff1\026\ufff1" +
    "\034\ufff1\035\ufff1\001\002\000\032\002\ufffa\004\ufffa\005" +
    "\ufffa\006\ufffa\007\ufffa\010\ufffa\011\ufffa\012\ufffa\013\ufffa" +
    "\014\ufffa\026\ufffa\034\ufffa\001\002\000\050\002\ufff4\004" +
    "\ufff4\005\ufff4\006\ufff4\007\ufff4\010\ufff4\011\ufff4\012\ufff4" +
    "\013\ufff4\014\ufff4\015\ufff4\016\ufff4\017\ufff4\020\ufff4\021" +
    "\ufff4\022\ufff4\026\ufff4\034\ufff4\035\ufff4\001\002\000\032" +
    "\002\ufff9\004\ufff9\005\ufff9\006\ufff9\007\ufff9\010\ufff9\011" +
    "\ufff9\012\ufff9\013\ufff9\014\ufff9\026\ufff9\034\ufff9\001\002" +
    "\000\032\002\ufffc\004\ufffc\005\ufffc\006\ufffc\007\ufffc\010" +
    "\ufffc\011\ufffc\012\ufffc\013\ufffc\014\ufffc\026\ufffc\034\ufffc" +
    "\001\002\000\050\002\ufff6\004\ufff6\005\ufff6\006\ufff6\007" +
    "\ufff6\010\ufff6\011\ufff6\012\ufff6\013\ufff6\014\ufff6\015\ufff6" +
    "\016\ufff6\017\ufff6\020\ufff6\021\ufff6\022\ufff6\026\ufff6\034" +
    "\ufff6\035\ufff6\001\002\000\032\002\uffff\004\uffff\005\uffff" +
    "\006\uffff\007\uffff\010\uffff\011\uffff\012\uffff\013\uffff\014" +
    "\uffff\026\uffff\034\uffff\001\002\000\050\002\ufff3\004\ufff3" +
    "\005\ufff3\006\ufff3\007\ufff3\010\ufff3\011\ufff3\012\ufff3\013" +
    "\ufff3\014\ufff3\015\ufff3\016\ufff3\017\ufff3\020\ufff3\021\ufff3" +
    "\022\ufff3\026\ufff3\032\047\034\ufff3\001\002\000\046\002" +
    "\ufffb\004\ufffb\005\ufffb\006\ufffb\007\ufffb\010\ufffb\011\ufffb" +
    "\012\ufffb\013\ufffb\014\ufffb\015\036\016\046\017\035\020" +
    "\037\021\033\022\040\026\ufffb\034\ufffb\001\002\000\004" +
    "\011\042\001\002\000\050\002\ufff0\004\ufff0\005\ufff0\006" +
    "\ufff0\007\ufff0\010\ufff0\011\ufff0\012\ufff0\013\ufff0\014\ufff0" +
    "\015\ufff0\016\ufff0\017\ufff0\020\ufff0\021\ufff0\022\ufff0\026" +
    "\ufff0\034\ufff0\035\ufff0\001\002\000\024\004\007\005\026" +
    "\006\017\007\027\010\012\011\030\012\024\013\014\034" +
    "\025\001\002\000\050\002\ufff5\004\ufff5\005\ufff5\006\ufff5" +
    "\007\ufff5\010\ufff5\011\ufff5\012\ufff5\013\ufff5\014\ufff5\015" +
    "\ufff5\016\ufff5\017\ufff5\020\ufff5\021\ufff5\022\ufff5\026\ufff5" +
    "\034\ufff5\035\ufff5\001\002\000\050\002\ufff2\004\ufff2\005" +
    "\ufff2\006\ufff2\007\ufff2\010\ufff2\011\ufff2\012\ufff2\013\ufff2" +
    "\014\ufff2\015\ufff2\016\ufff2\017\ufff2\020\ufff2\021\ufff2\022" +
    "\ufff2\026\ufff2\034\ufff2\035\ufff2\001\002\000\050\002\ufff3" +
    "\004\ufff3\005\ufff3\006\ufff3\007\ufff3\010\ufff3\011\ufff3\012" +
    "\ufff3\013\ufff3\014\ufff3\015\ufff3\016\ufff3\017\ufff3\020\ufff3" +
    "\021\ufff3\022\ufff3\026\ufff3\034\ufff3\035\ufff3\001\002\000" +
    "\016\015\036\017\035\020\037\021\033\022\040\035\032" +
    "\001\002\000\050\002\uffee\004\uffee\005\uffee\006\uffee\007" +
    "\uffee\010\uffee\011\uffee\012\uffee\013\uffee\014\uffee\015\uffee" +
    "\016\uffee\017\uffee\020\uffee\021\uffee\022\uffee\026\uffee\034" +
    "\uffee\035\uffee\001\002\000\024\004\uffea\005\uffea\006\uffea" +
    "\007\uffea\010\uffea\011\uffea\012\uffea\013\uffea\034\uffea\001" +
    "\002\000\024\004\007\005\026\006\017\007\027\010\012" +
    "\011\030\012\024\013\014\034\025\001\002\000\024\004" +
    "\uffec\005\uffec\006\uffec\007\uffec\010\uffec\011\uffec\012\uffec" +
    "\013\uffec\034\uffec\001\002\000\024\004\uffed\005\uffed\006" +
    "\uffed\007\uffed\010\uffed\011\uffed\012\uffed\013\uffed\034\uffed" +
    "\001\002\000\024\004\uffeb\005\uffeb\006\uffeb\007\uffeb\010" +
    "\uffeb\011\uffeb\012\uffeb\013\uffeb\034\uffeb\001\002\000\024" +
    "\004\uffe9\005\uffe9\006\uffe9\007\uffe9\010\uffe9\011\uffe9\012" +
    "\uffe9\013\uffe9\034\uffe9\001\002\000\050\002\uffef\004\uffef" +
    "\005\uffef\006\uffef\007\uffef\010\uffef\011\uffef\012\uffef\013" +
    "\uffef\014\uffef\015\036\016\uffef\017\035\020\037\021\033" +
    "\022\040\026\uffef\034\uffef\035\uffef\001\002\000\004\015" +
    "\043\001\002\000\024\004\007\005\026\006\017\007\027" +
    "\010\012\011\030\012\024\013\014\034\025\001\002\000" +
    "\032\002\uffe4\004\uffe4\005\uffe4\006\uffe4\007\uffe4\010\uffe4" +
    "\011\uffe4\012\uffe4\013\uffe4\014\uffe4\026\uffe4\034\uffe4\001" +
    "\002\000\016\015\036\016\046\017\035\020\037\021\033" +
    "\022\040\001\002\000\032\002\ufff8\004\ufff8\005\ufff8\006" +
    "\ufff8\007\ufff8\010\ufff8\011\ufff8\012\ufff8\013\ufff8\014\ufff8" +
    "\026\ufff8\034\ufff8\001\002\000\004\011\050\001\002\000" +
    "\004\033\051\001\002\000\004\015\052\001\002\000\004" +
    "\011\053\001\002\000\032\002\uffe6\004\uffe6\005\uffe6\006" +
    "\uffe6\007\uffe6\010\uffe6\011\uffe6\012\uffe6\013\uffe6\014\uffe6" +
    "\026\uffe6\034\uffe6\001\002\000\004\027\055\001\002\000" +
    "\004\030\056\001\002\000\004\011\057\001\002\000\004" +
    "\015\060\001\002\000\004\024\061\001\002\000\032\002" +
    "\uffe8\004\uffe8\005\uffe8\006\uffe8\007\uffe8\010\uffe8\011\uffe8" +
    "\012\uffe8\013\uffe8\014\uffe8\026\uffe8\034\uffe8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\006\002\003\004\004\001\001\000\016\003" +
    "\017\005\010\006\015\007\021\014\012\015\014\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\010\033\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\007\030\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\010\033\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\007\040\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\010\033\001\001\000\002\001\001" +
    "\000\006\006\043\007\044\001\001\000\002\001\001\000" +
    "\004\010\033\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return lexer.next_token(); 
    }



  private boolean debug = false;
  public boolean  debug()         {return debug;}
  public void     debug(boolean b){debug = b;}

  static class Node {
    public ArrayList<Node> children;
    private static int globalCounter = 0;

    public int counter;
    private Object value;

    public Node(Object value){
      Node.globalCounter += 1;
      this.counter = Node.globalCounter;
      this.value = value;
      this.children = new ArrayList<Node>();
    }

    public void addChild(Node n){ children.add(n); }

    public String toString(){
      String ret = "";
      ret += String.format("%d [label=\"%s\"];\n",
                            counter, value.toString());
      for(Node n: children){
        ret += String.format("%d -> %d;\n", this.counter, n.counter);
        ret += n.toString();
      }
      return ret;
    }
  }

  private Lexer lexer;

  public Parser(Lexer lex) {
    super(lex);
    lexer = lex;
  }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // top_level ::= statements 
            {
              Object RESULT =null;
		int ssleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int ssright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object ss = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                if(debug()) System.out.println((Node)ss);
              
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("top_level",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= top_level EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // statements ::= statements statement 
            {
              Object RESULT =null;
		int ssleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int ssright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object ss = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                  Node n = (Node)ss;
                  n.addChild((Node)s);
                  RESULT = n;
               
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statements",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // statements ::= 
            {
              Object RESULT =null;
		
                  RESULT = new Node("Statements");
               
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statements",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // statement ::= let_bind 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                RESULT = (Node)s;
              
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // statement ::= full_exp 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                RESULT = (Node)s;
              
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // statement ::= simple_exp 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                RESULT = (Node)s;
              
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // statement ::= sequence 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                RESULT = (Node)s;
              
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // statement ::= dictionary_assignment 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                RESULT = (Node)s;
              
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // full_exp ::= simple_exp SEMICOL 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = (Node)e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("full_exp",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // simple_exp ::= INT 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Node(i); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("simple_exp",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // simple_exp ::= RAT 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Node(i); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("simple_exp",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // simple_exp ::= FLOAT 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Node(i); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("simple_exp",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // simple_exp ::= BOOLEAN 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Node(i); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("simple_exp",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // simple_exp ::= IDENTIFIER 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Node(i); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("simple_exp",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // simple_exp ::= CHAR 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Node(i); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("simple_exp",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // simple_exp ::= STR 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Node(i); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("simple_exp",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // simple_exp ::= COMMENT 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Node(t); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("simple_exp",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // simple_exp ::= simple_exp operator simple_exp 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                  Node n = (Node)o;
                  n.addChild((Node)e1);
                  n.addChild((Node)e2);
                  RESULT = n;
               
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("simple_exp",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // simple_exp ::= LPAREN simple_exp RPAREN 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
                 Node n = new Node("parens");
                 n.addChild(new Node("("));
                 n.addChild((Node)e);
                 n.addChild(new Node(")"));
                 RESULT = (Node)e;
               
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("simple_exp",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // operator ::= EQUAL 
            {
              Object RESULT =null;
		 RESULT = new Node("="); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // operator ::= PLUS 
            {
              Object RESULT =null;
		 RESULT = new Node("+"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // operator ::= MINUS 
            {
              Object RESULT =null;
		 RESULT = new Node("-"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // operator ::= MULT 
            {
              Object RESULT =null;
		 RESULT = new Node("*"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // operator ::= DIV 
            {
              Object RESULT =null;
		 RESULT = new Node("/"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("operator",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // sequence ::= SEQD PLPAREN DATATYPE PRPAREN IDENTIFIER EQUAL SEQ 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int kleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int kright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object k = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
              Node n = new Node("=");
              Node m = new Node(t);
              n.addChild(m);
              n.addChild(new Node(k));
              m.addChild(new Node("seq"));
              m.addChild(new Node("<"));
              m.addChild(new Node(i));
              m.addChild(new Node(">"));
              RESULT = (Node)n;
           
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sequence",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // dictionary ::= DICTD PLPAREN DATATYPE COMMA DATATYPE PRPAREN IDENTIFIER EQUAL DICT 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int jleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int jright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Object j = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int kleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int kright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object k = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                Node n = new Node("=");
                Node m = new Node (",");
                n.addChild(m);
                Node gr = new Node ("<");
                Node gl = new Node (">");
                m.addChild(gr);
                m.addChild(gl);
                gr.addChild(new Node("dict"));
                gr.addChild(new Node (i));
                gl.addChild(new Node (j));
                gl.addChild(new Node (t));
                n.addChild(new Node (k));
                RESULT = (Node)n;
              
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("dictionary",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // dictionary_assignment ::= IDENTIFIER SLPAREN IDENTIFIER SRPAREN EQUAL IDENTIFIER 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int jleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int jright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object j = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                          Node n = new Node("=");
                          Node m = new Node(t);
                          n.addChild(m);
                          n.addChild(new Node(j));
                          m.addChild(new Node("["));
                          m.addChild(new Node(i));
                          m.addChild(new Node("]"));
                          RESULT = (Node)n;
                       
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("dictionary_assignment",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // colon ::= COLON 
            {
              Object RESULT =null;
		 RESULT = new Node(":"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("colon",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // let_bind ::= LET IDENTIFIER EQUAL full_exp 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
               Node n = new Node("LET");
               n.addChild(new Node(i));
               n.addChild((Node)e);
               RESULT = n;
             
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("let_bind",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
