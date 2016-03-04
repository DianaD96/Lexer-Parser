# Lexer and Parser

Please put your Lexer.lex and Parser.cup files into the src subdirectory.

To build, issue `make`.

To test, issue `make test`.

# Ambiguities

1. We suppose there are no space in a sequence (e.g. only [1,2,3] is accepted; [1,2, 3] is not)
2. We cannot have empty bodies for functions. 
3. Datatypes are case sensitive (we can only have int, float etc.). Datatypes are key words.
4. Every function needs to have a semicolon at the end.
function_name {function_body};
5. The user cannot use key words to name variables such as data types (string, char etc). Therefore, "int char;" will not be parsed.
6. From the specification we expected print "smth"; to be accepted, but the example tests need brackets, so we accept both versions.