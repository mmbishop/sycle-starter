//<editor-fold desc="Copyright (c) 2022 Michael Bishop">
// The file is part of Sycle-Starter
//
// Sycle-Starter is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License
// as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
//
// Sycle-Starter is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
// of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License along with Sycle-Starter. If not, see
// <https://www.gnu.org/licenses/>.
//</editor-fold>
grammar Sycle;

start : expression EOF;
expression : additiveExpression | assignmentExpression;
additiveExpression : multiplicativeExpression | additiveExpression ('+' | '-') multiplicativeExpression;
multiplicativeExpression : unaryExpression | multiplicativeExpression ('*' | '/') unaryExpression;
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