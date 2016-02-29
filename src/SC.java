import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;

import java_cup.runtime.*;

class SC {
    public static void main(String[] args) {
    	
    	boolean showLexing;
    	boolean showParser; 
    	
0    	Lexer lexer;
    	
    	if (args.length < 1 || args.length>2)
    	{
    		System.err.printf("Wrong input");
    		System.exit(1);
    	}
    	
		try {
			lexer = new Lexer(new FileReader(args[0]));
			try {
				Parser parser = new Parser(lexer);
				Symbol result = parser.parse();
				if(!parser.syntaxErrors){
					System.out.println("parsing successful");
				}
				
				
			} catch (Exception e) {
				// Commented out because this output is uniformative.  ETB
				//e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
		      System.err.printf("Could not find file <%s>\n", args[0]);
		}
    }
}
