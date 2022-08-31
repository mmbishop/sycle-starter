grammar Sycle;

start : additiveExpression;
additiveExpression : multiplicativeExpression | additiveExpression '+' multiplicativeExpression | additiveExpression '-' multiplicativeExpression;
multiplicativeExpression : unaryExpression | multiplicativeExpression '*' unaryExpression | multiplicativeExpression '/' unaryExpression;
unaryExpression : '+' unaryExpression | '-' unaryExpression | '(' additiveExpression ')' | primary;
primary : NUMBER;

NUMBER : DIGIT+ | DIGIT+ '.' DIGIT* | '.' DIGIT+;
fragment DIGIT : [0-9];
WS : [ \t\r\n]+ -> skip;