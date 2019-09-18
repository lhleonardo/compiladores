lexer grammar Scanner;

@header {
	package br.ufla.compiladores.scanner;
}

PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED: 'protected';
STATIC: 'static';
ABSTRACT: 'abstract';

INT: 'int';
CHAR: 'char';
BOOLEAN: 'boolean';

INT_LITERAL: '0' | ('1'..'9')(DIGIT)*;

VOID: 'void';

BOOLEAN_TRUE: 'true';
BOOLEAN_FALSE: 'false';

EXTENDS: 'extends';
CLASS: 'class';
IMPORT: 'import';
PACKAGE: 'package';
SUPER: 'super';

THIS: 'this';
NEW: 'new';

RETURN: 'return';

NULL: 'null';

IF: 'if';
ELSE: 'else';
WHILE: 'while';

INSTANCEOF: 'instanceof';

OPEN_PARENTHESIS: '(';
CLOSE_PARENTHESIS: ')';

OPEN_BRACES: '{';
CLOSE_BRACES: '}';

OPEN_BRACKETS: '[';
CLOSE_BRACKETS: ']';

END_STATEMENT: ';';
SEMICOLON: ',';
DOT: '.';

STRING: '"' (~('\\'|'"') )* '"';
CHAR_LITERAL: '\'' (~('\\'|'"') ) '\'';

GREATER_EQUAL: '>=';
GREATER_THAN: '>';
LESS_EQUAL: '<=';
LESS_THAN: '<';
EQUAL: '==';
ASSIGN: '=';
NOT: '!';

ADD: '+';
SUB: '-';
MULT: '*';
INCREMENT: '++';
DECREMENT: '--';
PLUS: '+=';
REMOVE: '-=';

// aceita todos os tipos de nomes de variáveis que começam obrigatoriamente com uma letra ou underscore
IDENTIFIER: (LETTER | '_' | '$') (LETTER | DIGIT | '_' | '$')*;

// declaração de simbolos que podem existir na linguagem
LETTER: ('a' .. 'z') | ('A'..'Z');
DIGIT: ('0'..'9');

// ignora novas linhas, espaços e tabulações
NEW_LINE: ('\r' ? '\n') -> skip;
WHITE_SKEEP: [ \t]+ -> skip;

// ignora comentários
COMMENTS: '//' ~[\r\n]* -> skip;

NOT_IDENTIFIER : (LETTER | DIGIT | '_' | '$')+ ;