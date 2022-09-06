grammar Sycle;

start : expression EOF;
expression : additiveExpression | assignmentExpression;
additiveExpression : multiplicativeExpression | additiveExpression '+' multiplicativeExpression | additiveExpression '-' multiplicativeExpression;
multiplicativeExpression : unaryExpression | multiplicativeExpression '*' unaryExpression | multiplicativeExpression '/' unaryExpression;
unaryExpression : primary | '+' unaryExpression | '-' unaryExpression;
primary : literal | identifierReference | '(' additiveExpression ')';
literal : NUMBER;
identifierReference: IDENTIFIER;
assignmentExpression : declaredIdentifier '=' additiveExpression;
declaredIdentifier : IDENTIFIER;

NUMBER : DIGIT+ | DIGIT+ '.' DIGIT* | '.' DIGIT+;
IDENTIFIER : LETTER (LETTER | DIGIT | '_')*;
fragment DIGIT : [0-9];
fragment LETTER : [A-Za-z];
WS : [ \t\r\n]+ -> skip;