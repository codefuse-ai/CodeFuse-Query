package com.alipay.codequery.coref.model;

import com.alipay.codequery.dal.mybatis.domain.*;

import java.util.ArrayList;
import java.util.List;


public class Statement extends Node{

    public String baseName;

    public Statement(Long hashId) {
        super(hashId);
    }
    public  int index;

    public com.alipay.codequery.dal.mybatis.domain.Statement extractStatement(){
        return new com.alipay.codequery.dal.mybatis.domain.Statement(this.hashId,this.parent.hashId,this.index,this.location.hashId,this.debug_message, this.baseName);
    }

    public static class ExpressionStatement extends Statement {

        public ExpressionStatement(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.coref.model.Expression expr;

        public com.alipay.codequery.dal.mybatis.domain.ExpressionStatement extractExpressionStatement(){
            return new com.alipay.codequery.dal.mybatis.domain.ExpressionStatement(this.hashId, this.expr.hashId);
        }
    }

    public static class BlockStatement extends Statement {

        public BlockStatement(Long hashId) {
            super(hashId);
        }

        public List<Statement> stats = new ArrayList<>();

        public CodeBlock codeBlock;
        public com.alipay.codequery.dal.mybatis.domain.BlockStatement extractBlockStatement(){
            return new com.alipay.codequery.dal.mybatis.domain.BlockStatement(this.hashId, this.codeBlock.hashId);
        }
    }

    public static class CodeBlock extends Node {

        public CodeBlock(Long hashId) {
            super(hashId);
        }

        public List<Statement> stats = new ArrayList<>();
        public int count;
        public int isEmpty;

        public com.alipay.codequery.dal.mybatis.domain.CodeBlock extractCodeBlock(){
            return new com.alipay.codequery.dal.mybatis.domain.CodeBlock(this.hashId, this.count, this.parent.hashId, this.isEmpty,this.location.hashId,this.debug_message);
        }
    }

    public static class ControlStatement extends Statement {

        public ControlStatement(Long hashId) {
            super(hashId);
        }
    }

    public static class ConstructorCallStatement extends Statement {

        public ConstructorCallStatement(Long hashId) {
            super(hashId);
        }
        public Constructor constructor;

    }

    public static class ImportStatement extends Statement {

        public ImportStatement(Long hashId) {
            super(hashId);
        }

        public Statement reference;
        public String referenceName;
        public int isForeignImport;

        public ImportStaticStatement extractImportStaticStatement(){
            return new ImportStaticStatement(this.hashId,this.reference.hashId,this.debug_message,this.parent.hashId,this.location.hashId);
        }

        public ImportInfo extractImport(){
            return new ImportInfo( this.hashId,this.reference.hashId, this.debug_message,this.parent.hashId,this.location.hashId, this.isForeignImport);
        }

    }

    public static class ContinueStatement extends Statement {

        public ContinueStatement(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.coref.model.Identifier discriminant;
        public Statement continuedStatement;

        public com.alipay.codequery.dal.mybatis.domain.ContinueStatement extractContinueStatement(){
            return new com.alipay.codequery.dal.mybatis.domain.ContinueStatement(this.hashId,this.continuedStatement.hashId);
        }

    }

    public static class BreakStatement extends Statement {

        public BreakStatement(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.coref.model.Identifier discriminant;
        public Statement exitedStatemnt;

        public com.alipay.codequery.dal.mybatis.domain.BreakStatement extractBreakStatement(){
            return new com.alipay.codequery.dal.mybatis.domain.BreakStatement(this.hashId, this.exitedStatemnt.hashId);
        }

    }

    public static class EmptyStatement extends Statement {

        public EmptyStatement(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.dal.mybatis.domain.EmptyStatement extractEmptyStatement(){
            return new com.alipay.codequery.dal.mybatis.domain.EmptyStatement( this.hashId);
        }

    }

    public static class LabeledStatement extends Statement {

        public LabeledStatement(Long hashId) {
            super(hashId);
        }

        public Identifier identifier;
        public Statement statement;

        public com.alipay.codequery.dal.mybatis.domain.LabeledStatement extractLabeledStatement(){
            return new com.alipay.codequery.dal.mybatis.domain.LabeledStatement( this.hashId,this.identifier.hashId, this.statement.hashId);
        }

    }


    public static class IfStatement extends ControlStatement {

        public IfStatement(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.coref.model.Expression condition;
        public Statement thenBranch;
        public Statement elseBranch;

        public IfStatementWithElse extractIfStatementWithElse(){
            return new IfStatementWithElse(this.hashId, condition.hashId, thenBranch.hashId, elseBranch.hashId);
        }

        public IfStatementWithoutElse extractIfStatementWithoutElse(){
            return new IfStatementWithoutElse(this.hashId, condition.hashId, thenBranch.hashId);
        }
    }
    public static class SwitchStatement extends ControlStatement {

        public SwitchStatement(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.coref.model.Expression discriminant;
        public BlockStatement body;

        public com.alipay.codequery.dal.mybatis.domain.SwitchStatement extractSwitchStatement(){
            return new com.alipay.codequery.dal.mybatis.domain.SwitchStatement(this.hashId, this.discriminant.hashId, this.body.hashId);
        }
    }

    public static class YieldStatement extends Statement {

        public YieldStatement(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.coref.model.Expression expression;
        public com.alipay.codequery.coref.model.Expression enclosingExpression;

        public com.alipay.codequery.dal.mybatis.domain.YieldStatement extractYieldStatement(){
            return new com.alipay.codequery.dal.mybatis.domain.YieldStatement(this.hashId,this.expression.hashId,this.enclosingExpression.hashId);
        }
    }

    public static class SynchronizedStatement extends Statement {

        public SynchronizedStatement(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.coref.model.Expression lockExpression;
        public Statement body;

        public com.alipay.codequery.dal.mybatis.domain.SynchronizedStatement extractSynchronizedStatement(){
            return new com.alipay.codequery.dal.mybatis.domain.SynchronizedStatement(this.hashId,this.lockExpression.hashId,this.body.hashId);
        }
    }


    public static class SwitchLabelStatement extends ControlStatement {

        public SwitchLabelStatement(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.coref.model.Expression caseValue;
        public BlockStatement enclosingSwitchBlock;
        public long nextSwitchCashHashId = 0;


        public com.alipay.codequery.dal.mybatis.domain.SwitchLabelStatement extractSwitchLabelStatement(){
            return new com.alipay.codequery.dal.mybatis.domain.SwitchLabelStatement(this.hashId,this.caseValue.hashId,this.enclosingSwitchBlock.hashId,this.nextSwitchCashHashId);
        }
    }
    public static class CaseStatement extends ControlStatement {

        public CaseStatement(int id, Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.coref.model.Expression label;
        public boolean isDefault;
        public Statement body;
    }
    public static class ForStatement extends ControlStatement {

        public ForStatement(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.coref.model.Expression init;
        public com.alipay.codequery.coref.model.Expression condition;
        public com.alipay.codequery.coref.model.Expression update;
        public Statement body;

        public com.alipay.codequery.dal.mybatis.domain.ForStatement extractForStatement(){
            return new com.alipay.codequery.dal.mybatis.domain.ForStatement( this.hashId,this.init.hashId,this.condition.hashId,this.update.hashId,this.body.hashId);
        }
    }

    public static class ForeachStatement extends ControlStatement {

        public ForeachStatement(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.coref.model.Expression iteratedValue;
        public Parameter iterationParameter;
        public Statement body;

        public com.alipay.codequery.dal.mybatis.domain.ForeachStatement extractForeachStatement(){
            return new com.alipay.codequery.dal.mybatis.domain.ForeachStatement(this.hashId,this.iteratedValue.hashId,this.iterationParameter.hashId,this.body.hashId);
        }
    }
    public static class TryStatement extends ControlStatement {

        public TryStatement(Long hashId) {
            super(hashId);
        }

        public CodeBlock tryBlock;
        public CodeBlock catchBlock;
        public CodeBlock finallyBlock;

        public TryStatementWithoutFinally extractTryStatementWithoutFinally(){
            return new TryStatementWithoutFinally(this.hashId, this.tryBlock.hashId);
        }

        public TryStatementWithFinally extractTryStatementWithFinally(){
            return new TryStatementWithFinally(this.hashId, this.tryBlock.hashId, this.finallyBlock.hashId);
        }

    }
    public static class CatchClause extends Node {

        public CatchClause(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.coref.model.Expression param;
        public TryStatement tryStatement;

        public int index;

        public CatchSection extractCatchSection(){
            return new CatchSection( this.hashId,this.debug_message,this.param.hashId,this.type.hashId,this.location.hashId,this.tryStatement.hashId, this.index);
        }

    }

    public static class ThrowStatement extends ControlStatement {

        public ThrowStatement(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.coref.model.Expression exception;
        public CodeBlock body;

        public com.alipay.codequery.dal.mybatis.domain.ThrowStatement extractThrowStatement(){
            return new com.alipay.codequery.dal.mybatis.domain.ThrowStatement(this.hashId, this.exception.hashId,this.body.hashId);
        }
    }
    public static class WhileStatement extends ControlStatement {

        public WhileStatement(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.coref.model.Expression condition;
        public Statement body;

        public com.alipay.codequery.dal.mybatis.domain.WhileStatement extractWhileStatement(){
            return new com.alipay.codequery.dal.mybatis.domain.WhileStatement(this.hashId,this.condition.hashId,this.body.hashId);
        }
    }
    public static class DoWhileStatement extends ControlStatement {

        public DoWhileStatement(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.coref.model.Expression condition;
        public Statement body;
        public String keyword;

        public com.alipay.codequery.dal.mybatis.domain.DoWhileStatement extractDoWhileStatement(){
            return new com.alipay.codequery.dal.mybatis.domain.DoWhileStatement(this.hashId,this.keyword,this.condition.hashId,this.body.hashId);
        }

    }

    public static class PackageStatement extends Statement{
        public Package referencePackage;

        public PackageStatement(Long hashId) {
            super(hashId);
        }
        public com.alipay.codequery.dal.mybatis.domain.PackageStatement extractPackage(){
            return new com.alipay.codequery.dal.mybatis.domain.PackageStatement(this.hashId, this.debug_message, this.location.hashId, this.referencePackage.hashId,this.parent.hashId);
        }
    }

    public static class ReturnStatement extends Statement {

        public ReturnStatement(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.coref.model.Expression returnExpression;

        public com.alipay.codequery.dal.mybatis.domain.ReturnStatement extractReturnStatement(){
            return new com.alipay.codequery.dal.mybatis.domain.ReturnStatement(this.hashId,this.returnExpression.hashId);
        }
    }

    public static class AssertStatement extends Statement {

        public AssertStatement(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.coref.model.Expression condition;
        public Expression description;

        public com.alipay.codequery.dal.mybatis.domain.AssertStatement extractAssertStatement() {
            return new com.alipay.codequery.dal.mybatis.domain.AssertStatement( this.hashId, this.condition.hashId, this.description.hashId);
        }
    }

    public static class DeclarationStatement extends Statement {

        public DeclarationStatement(Long hashId) {
            super(hashId);
        }

        public int index;

        public DeclarationElement extractDeclarationElement() {
            return new DeclarationElement( this.hashId, this.index, this.parent.hashId);
        }
    }
}
