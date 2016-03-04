# Ambiguities

1. We suppose there are no space in a sequence (e.g. only [1,2,3] is accepted; [1,2, 3] is not)
2. We cannot have empty bodies for functions. 
3. Datatypes are case sensitive (we can only have int, float etc.)
4. Every function needs to have a semicolon at the end.
function_name {function_body};
5. The user cannot use key words to name variables such as data types (string, char etc). Therefore, "int char;" will not be parsed.
6. The print function doesn't use any parentheses. (print "smth" should work)