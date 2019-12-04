grammar Scanner;

@header {
	package br.ufla.compiladores.scanner;
}

compilationUnit: packageDeclaration? 
				 importDeclaration* 
				 typeDeclaration* EOF;
				 
packageDeclaration: PACKAGE qualifiedIdentifier END_STATEMENT;
importDeclaration: IMPORT qualifiedIdentifier END_STATEMENT;
typeDeclaration: modifiers classDeclaration;

qualifiedIdentifier: IDENTIFIER ('.' IDENTIFIER)*;

modifiers: (PUBLIC 
			| PROTECTED 
			| PRIVATE 
			| STATIC 
			| ABSTRACT)*;

classDeclaration: CLASS IDENTIFIER classOptions? classBody;

classOptions: EXTENDS qualifiedIdentifier;

classBody: OPEN_BRACES classMembers CLOSE_BRACES; 

classMembers: (modifiers memberDeclaration)*;

memberDeclaration: 
				constructorDeclaration // construtor
				| methodDeclaration // método
				| fieldDeclaration; // campo da classe

constructorDeclaration: IDENTIFIER formalParameters block;
methodDeclaration: (VOID | type) IDENTIFIER formalParameters (block | END_STATEMENT);
fieldDeclaration: type variableDeclarators END_STATEMENT;

block: OPEN_BRACES 
			(blockStatement)* 
	   CLOSE_BRACES;

blockStatement: localVariableDeclarationStatement | statement;

statement: 
		block 
		| IDENTIFIER TWO_POINTS statement  // dar nome a um bloco
		| IF parExpression statement (ELSE statement)? // if e if/else
		| RETURN expression? END_STATEMENT
		| END_STATEMENT
		| statementExpression END_STATEMENT;

formalParameters: OPEN_PARENTHESIS (formalParameter (SEMICOLON formalParameter)* )? CLOSE_PARENTHESIS;

formalParameter: type IDENTIFIER;

parExpression: OPEN_PARENTHESIS expression CLOSE_PARENTHESIS;

localVariableDeclarationStatement: type variableDeclarators END_STATEMENT;

variableDeclarators: variableDeclarator (SEMICOLON variableDeclarator)*;

variableDeclarator: IDENTIFIER (ASSIGN variableInitializer)?;

variableInitializer: arrayInitializer | expression;

arrayInitializer: OPEN_BRACES (variableInitializer (SEMICOLON variableInitializer)*)? CLOSE_BRACES;

arguments: OPEN_PARENTHESIS(expression(SEMICOLON expression))? CLOSE_PARENTHESIS;

type: referenceType | basicType;

basicType: BOOLEAN | CHAR | INT;

referenceType: (basicType OPEN_BRACKETS CLOSE_BRACKETS (OPEN_BRACKETS CLOSE_BRACKETS)*) | (qualifiedIdentifier (OPEN_BRACKETS CLOSE_BRACKETS)*);

statementExpression: expression;

expression: assigmentExpression;

assigmentExpression: conditionalAndExpression ((ASSIGN | PLUS) assigmentExpression)?;

conditionalAndExpression: equalityExpression (AND equalityExpression)*; 

equalityExpression: relationalExpression (EQUAL relationalExpression)*;

relationalExpression: additiveExpression 
				(
					((GREATER_THAN | LESS_EQUAL) additiveExpression) 
					|(INSTANCEOF referenceType)
				)?;

additiveExpression: multiplicativeExpression ((ADD | SUB) multiplicativeExpression)*;

multiplicativeExpression: unaryExpression (MULT unaryExpression)*;

unaryExpression: (INCREMENT unaryExpression)
				|(SUB unaryExpression)
				| simpleUnaryExpression;
				
simpleUnaryExpression: (NOT unaryExpression)
					| (OPEN_PARENTHESIS basicType CLOSE_PARENTHESIS unaryExpression)
					| (OPEN_PARENTHESIS referenceType CLOSE_PARENTHESIS simpleUnaryExpression)
					| postfixExpression;

postfixExpression: primary selector* DECREMENT*;

selector: DOT qualifiedIdentifier arguments?
		| OPEN_BRACKETS expression CLOSE_BRACKETS;
		
primary: parExpression
		| THIS arguments?
		| SUPER (arguments | (DOT IDENTIFIER arguments?))?
		| literal
		| NEW creator
		| qualifiedIdentifier arguments?;

creator: (basicType | qualifiedIdentifier)
		(
			arguments 
			| OPEN_BRACKETS CLOSE_BRACKETS (OPEN_BRACKETS CLOSE_BRACKETS)* arrayInitializer?
			| newArrayDeclarator  
		);

newArrayDeclarator: OPEN_BRACKETS expression CLOSE_BRACKETS 
					(OPEN_BRACKETS expression CLOSE_BRACKETS)*
					(OPEN_BRACKETS CLOSE_BRACKETS)*;
					
literal: INT_LITERAL
		| CHAR_LITERAL
		| STRING
		| BOOLEAN_TRUE
		| BOOLEAN_FALSE
		| NULL;
		
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
TWO_POINTS: ':';
DOT: '.';

STRING: '"' (~('\\'|'"') )* '"';
CHAR_LITERAL: '\'' (~('\\'|'"') ) '\'';

GREATER_EQUAL: '>=';
GREATER_THAN: '>';
LESS_EQUAL: '<=';
LESS_THAN: '<';
EQUAL: '==';
AND: '&&';
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