grammar Sycle;

start : additiveExpression;
additiveExpression : multiplicativeExpression | additiveExpression '+' multiplicativeExpression | additiveExpression '-' multiplicativeExpression;
multiplicativeExpression : unaryExpression | multiplicativeExpression '*' unaryExpression | multiplicativeExpression '/' unaryExpression;
unaryExpression : primary | '+' unaryExpression | '-' unaryExpression;
primary : literal | '(' additiveExpression ')';
literal : NUMBER;

NUMBER : DIGIT+ | DIGIT+ '.' DIGIT* | '.' DIGIT+;
fragment DIGIT : [0-9];
WS : [ \t\r\n]+ -> skip;