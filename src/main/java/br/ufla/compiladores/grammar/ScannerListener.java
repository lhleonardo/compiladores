// Generated from Scanner.g4 by ANTLR 4.7.2

	package br.ufla.compiladores.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScannerParser}.
 */
public interface ScannerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScannerParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ScannerParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ScannerParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(ScannerParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(ScannerParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(ScannerParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(ScannerParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(ScannerParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(ScannerParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdentifier(ScannerParser.QualifiedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdentifier(ScannerParser.QualifiedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(ScannerParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(ScannerParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ScannerParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ScannerParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classOptions}.
	 * @param ctx the parse tree
	 */
	void enterClassOptions(ScannerParser.ClassOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classOptions}.
	 * @param ctx the parse tree
	 */
	void exitClassOptions(ScannerParser.ClassOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(ScannerParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(ScannerParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classMembers}.
	 * @param ctx the parse tree
	 */
	void enterClassMembers(ScannerParser.ClassMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classMembers}.
	 * @param ctx the parse tree
	 */
	void exitClassMembers(ScannerParser.ClassMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(ScannerParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(ScannerParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(ScannerParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(ScannerParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(ScannerParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(ScannerParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ScannerParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ScannerParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#returnMethod}.
	 * @param ctx the parse tree
	 */
	void enterReturnMethod(ScannerParser.ReturnMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#returnMethod}.
	 * @param ctx the parse tree
	 */
	void exitReturnMethod(ScannerParser.ReturnMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(ScannerParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(ScannerParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ScannerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ScannerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(ScannerParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(ScannerParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ScannerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ScannerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(ScannerParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(ScannerParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(ScannerParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(ScannerParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(ScannerParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(ScannerParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(ScannerParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(ScannerParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(ScannerParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(ScannerParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(ScannerParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(ScannerParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(ScannerParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(ScannerParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(ScannerParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(ScannerParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ScannerParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ScannerParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ScannerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ScannerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(ScannerParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(ScannerParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(ScannerParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(ScannerParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(ScannerParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(ScannerParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ScannerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ScannerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#assigmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssigmentExpression(ScannerParser.AssigmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#assigmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssigmentExpression(ScannerParser.AssigmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(ScannerParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(ScannerParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ScannerParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ScannerParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ScannerParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ScannerParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ScannerParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ScannerParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ScannerParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ScannerParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ScannerParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ScannerParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#simpleUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleUnaryExpression(ScannerParser.SimpleUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#simpleUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleUnaryExpression(ScannerParser.SimpleUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(ScannerParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(ScannerParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(ScannerParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(ScannerParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ScannerParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ScannerParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(ScannerParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(ScannerParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#newArrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewArrayDeclarator(ScannerParser.NewArrayDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#newArrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewArrayDeclarator(ScannerParser.NewArrayDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScannerParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ScannerParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScannerParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ScannerParser.LiteralContext ctx);
}