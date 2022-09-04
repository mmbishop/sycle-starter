grammar Sycle;

start : additiveExpression;
additiveExpression : multiplicativeExpression | additiveExpression '+' multiplicativeExpression | additiveExpression '-' multiplicativeExpression;
multiplicativeExpression : unaryExpression | multiplicativeExpression '*' unaryExpression | multiplicativeExpression '/' unaryExpression;
unaryExpression : unaryExpressionNotPlusMinus | '+' unaryExpression | '-' unaryExpression;
unaryExpressionNotPlusMinus : primary | '(' additiveExpression ')';
primary : NUMBER;

NUMBER : DIGIT+ | DIGIT+ '.' DIGIT* | '.' DIGIT+;
fragment DIGIT : [0-9];
WS : [ \t\r\n]+ -> skip;