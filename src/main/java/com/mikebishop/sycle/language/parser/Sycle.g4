grammar Sycle;

start : expression;
expression : additiveExpression | assignmentExpression;
additiveExpression : multiplicativeExpression | additiveExpression '+' multiplicativeExpression | additiveExpression '-' multiplicativeExpression;
multiplicativeExpression : unaryExpression | multiplicativeExpression '*' unaryExpression | multiplicativeExpression '/' unaryExpression;
unaryExpression : primary | '+' unaryExpression | '-' unaryExpression;
primary : literal | '(' additiveExpression ')';
literal : NUMBER | IDENTIFIER;
assignmentExpression : IDENTIFIER '=' additiveExpression;

NUMBER : DIGIT+ | DIGIT+ '.' DIGIT* | '.' DIGIT+;
IDENTIFIER : LETTER (LETTER | DIGIT | '_')*;
fragment DIGIT : [0-9];
fragment LETTER : [A-Za-z];
WS : [ \t\r\n]+ -> skip;