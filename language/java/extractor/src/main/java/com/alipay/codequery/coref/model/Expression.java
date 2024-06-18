package com.alipay.codequery.coref.model;

import com.alipay.codequery.dal.mybatis.domain.*;

import java.util.ArrayList;
import java.util.List;


public class Expression extends Node {

    public Expression(Long hashId) {
        super(hashId);
    }

    public String baseName;

    public int index;
    public Type type;

    public com.alipay.codequery.dal.mybatis.domain.Expression extractExpression() {
        return new com.alipay.codequery.dal.mybatis.domain.Expression(this.hashId, this.baseName, this.parent.hashId, this.index, this.location.hashId, this.debug_message);
    }

    public ReferenceExpression extractReferenceExpression() {
        return new ReferenceExpression(this.hashId);
    }

    public ReferenceElement extractReferenceElement() {
        return new ReferenceElement(this.hashId, this.debug_message, this.parent.hashId, this.location.hashId);
    }

    public ImportStaticReferenceElement extractImportStaticReferenceElement() {
        return new ImportStaticReferenceElement(this.hashId, this.debug_message, this.parent.hashId, this.location.hashId);
    }

    public ClassInitializer extractClassInitializer() {
        return new ClassInitializer(this.hashId, this.debug_message, this.parent.hashId, this.location.hashId);
    }


    public static class ReferenceList extends ExpressionList {
        public String role;

        public ReferenceList(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.dal.mybatis.domain.ReferenceList extractReferenceList() {
            return new com.alipay.codequery.dal.mybatis.domain.ReferenceList(this.hashId, this.location.hashId, this.parent.hashId, this.debug_message, this.role);
        }
    }

    public static class ExpressionList extends Expression {
        public List<Expression> subexps = new ArrayList<>();
        public Expression list;

        public ExpressionList(Long hashId) {
            super(hashId);
        }

        public int indexOrder;
        public Type type;
        public int size;

        public com.alipay.codequery.dal.mybatis.domain.ExpressionList extractExpressionList() {
            return new com.alipay.codequery.dal.mybatis.domain.ExpressionList(this.hashId, this.parent.hashId, this.location.hashId, this.debug_message, size);
        }

        public ReferenceExpression extractReferenceExpression() {
            return new ReferenceExpression(this.hashId);
        }
    }

    public static class FieldAccess extends Expression {

        public FieldAccess(int id, Long hashId) {
            super(hashId);
        }

        public String name;
    }

    public static class InstanceOfExpression extends Expression {
        public InstanceOfExpression(Long hashId) {
            super(hashId);
        }

        public Expression operand;
        public Expression checkType;
        public Expression pattern;

        public InstanceofExpression extractInstanceOfExpression() {
            return new InstanceofExpression(this.hashId, this.operand.hashId, this.checkType.hashId, this.pattern.hashId);
        }
    }

    public static class ArrayExpression extends Expression {

        public ArrayExpression(Long hashId) {
            super(hashId);
        }

        List<Expression> elements;
    }

    public static class ArrayAccessExpression extends Expression {
        public ArrayExpression arrayExpression;
        public Expression indexExpression;

        public ArrayAccessExpression(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.dal.mybatis.domain.ArrayAccessExpression extractArrayAccessExpression() {
            return new com.alipay.codequery.dal.mybatis.domain.ArrayAccessExpression(this.hashId, this.indexExpression.hashId, this.arrayExpression.hashId);
        }

    }


    public static class InvokeExpression extends Expression {

        public InvokeExpression(Long hashId) {
            super(hashId);
        }

        public Expression callee;
        public Identifier identifier;
        public List<Expression> args = new ArrayList<>();

        public CallableBinding extractCallableBinding() {
            return new CallableBinding(this.hashId, this.callee.hashId);
        }
    }

    public static class CallExpression extends InvokeExpression {

        public CallExpression(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.dal.mybatis.domain.NewExpression extractNewExpression() {
            return new com.alipay.codequery.dal.mybatis.domain.NewExpression(this.hashId, this.callee.hashId, this.type.hashId);
        }
    }

    public static class MethodCallExpression extends CallExpression {

        public MethodCallExpression(Long hashId) {
            super(hashId);
        }

        public Expression reference;

        public ReferenceList argumentList;

        public int isConstructor;

        public MethodAccessExpressionWithoutType extractMethodAccessExpressionWithoutType() {
            return new MethodAccessExpressionWithoutType(this.hashId, this.reference.hashId, argumentList.hashId);
        }

        public MethodAccessExpressionWithType extractMethodAccessExpressionWithType() {
            return new MethodAccessExpressionWithType(this.hashId, this.type.hashId, reference.hashId, argumentList.hashId);
        }

        public MethodReferenceExpression extractMethodReferenceExpression() {
            return new MethodReferenceExpression(this.hashId, this.isConstructor);
        }

        public SuperAccessExpression extractSuperAccessExpression() {
            return new SuperAccessExpression(this.hashId);
        }

        public SuperConstructorInvocation extractSuperConstructorInvocation() {
            return new SuperConstructorInvocation(this.hashId);
        }

    }


    public static class NewExpression extends CallExpression {

        public NewExpression(Long hashId) {
            super(hashId);
        }

        public Expression qualifier;
        public Expression reference;
        public int dimension;

        public com.alipay.codequery.dal.mybatis.domain.NewExpression extractNewExpression() {
            return new com.alipay.codequery.dal.mybatis.domain.NewExpression(this.hashId, this.reference.hashId, this.type.hashId);
        }

        public ArrayCreationExpression extractArrayCreationExpression() {
            return new ArrayCreationExpression(this.hashId, this.dimension, this.type.hashId);
        }

        public ConstructorInvocation extractConstructorInvocation() {
            return new ConstructorInvocation(this.hashId, this.reference.hashId);
        }

    }

    public static class CastExpression extends Expression {
        public  Expression operand;
        public CastExpression(Long hashId) {
            super(hashId);
        }

        public TypeCastExpression extractTypeCastExpressiont() {
            return new TypeCastExpression(this.hashId, this.operand.hashId);
        }
    }

    public static class UnaryExpression extends Expression {

        public UnaryExpression(Long hashId) {
            super(hashId);
        }

        public Expression operand;
        public String opcode;
        public int isPostfix;

        public com.alipay.codequery.dal.mybatis.domain.UnaryExpression extractUnaryExpression() {
            return new com.alipay.codequery.dal.mybatis.domain.UnaryExpression(this.hashId, this.operand.hashId, this.opcode, this.isPostfix);
        }

    }

    public static class UnaryOperator extends UnaryExpression {

        public UnaryOperator(int id, Long hashId) {
            super(hashId);
        }
    }

    public static class UpdateExpression extends Expression {

        public UpdateExpression(int id, Long hashId) {
            super(hashId);
        }
    }

    public static class UpdateOperator extends UpdateExpression {

        public UpdateOperator(int id, Long hashId) {
            super(id, hashId);
        }
    }

    public static class PolyadicExpression extends Expression {

        public PolyadicExpression(Long hashId) {
            super(hashId);
        }

        public int size;
        public String opcode;

        public com.alipay.codequery.dal.mybatis.domain.PolyadicExpression extractPolyadicExpression() {
            return new com.alipay.codequery.dal.mybatis.domain.PolyadicExpression(this.hashId, this.size, this.opcode);
        }
    }

    public static class BinaryExpression extends PolyadicExpression {

        public BinaryExpression(Long hashId) {
            super(hashId);
        }

        public Expression lhs;
        public Expression rhs;
        public String opcode;

        public com.alipay.codequery.dal.mybatis.domain.BinaryExpression extractBinaryExpression() {
            return new com.alipay.codequery.dal.mybatis.domain.BinaryExpression(this.hashId, this.lhs.hashId, this.rhs.hashId, this.opcode);
        }
    }

    public static class BinaryOperator extends Expression {

        public BinaryOperator(int id, Long hashId) {
            super(hashId);
        }

        public Expression opcode;
    }

    public static class AssignmentExpression extends Expression {

        public AssignmentExpression(Long hashId) {
            super(hashId);
        }

        public Expression lhs;
        public Expression rhs;
        public String opcode;

        public com.alipay.codequery.dal.mybatis.domain.AssignmentExpression extractAssignmentExpression() {
            return new com.alipay.codequery.dal.mybatis.domain.AssignmentExpression(this.hashId, this.lhs.hashId, this.rhs.hashId, this.opcode);
        }
    }

    public static class AssignmentOperator extends Expression {

        public AssignmentOperator(int id, Long hashId) {
            super(hashId);
        }
    }

    public static class LambdaExpression extends Expression {

        public LambdaExpression(Long hashId) {
            super(hashId);
        }

        public Statement body;
        public Expression paramterList;
        public int isVoidCompatible;
        public int isValueCompatible;

        public com.alipay.codequery.dal.mybatis.domain.LambdaExpression extractLambdaExpression() {
            return new com.alipay.codequery.dal.mybatis.domain.LambdaExpression(this.hashId, this.paramterList.hashId, this.body.hashId, this.isVoidCompatible, this.isValueCompatible);
        }

    }

    public static class ThisExpression extends Expression {

        public ThisExpression(Long hashId) {
            super(hashId);
        }

        public Expression qualifier;
        public Expression reference;

        public ThisAccessExpression extractThisAccessExpression() {
            return new ThisAccessExpression(this.hashId);
        }

        public ThisExpressionWithQualifier extractThisExpressionWithQualifier() {
            return new ThisExpressionWithQualifier(this.hashId, this.qualifier.hashId);
        }
    }


    public static class SuperExpression extends Expression {

        public SuperExpression(Long hashId) {
            super(hashId);
        }

        public Expression qualifier;

        public com.alipay.codequery.dal.mybatis.domain.SuperExpression extractSuperExpression() {
            return new com.alipay.codequery.dal.mybatis.domain.SuperExpression(this.hashId);
        }

        public SuperExpressionWithQualifier extractSuperExpressionWithQualifier() {
            return new SuperExpressionWithQualifier(this.hashId, qualifier.hashId);
        }

        public SuperAccessExpression extractSuperAccessExpression() {
            return new SuperAccessExpression(this.hashId);
        }

    }

    public static class ConditionalExpression extends Expression {

        public ConditionalExpression(Long hashId) {
            super(hashId);
        }

        public Expression condition;
        public Expression thenExpression;
        public Expression elseExpression;

        public com.alipay.codequery.dal.mybatis.domain.ConditionalExpression extractCondtionalExpression() {
            return new com.alipay.codequery.dal.mybatis.domain.ConditionalExpression(this.hashId, this.condition.hashId, this.thenExpression.hashId, this.elseExpression.hashId);
        }

    }

    public static class ArrayInitializationExpression extends Expression {

        public ArrayInitializationExpression(Long hashId) {
            super(hashId);
        }

        public Expression initializer;

        public ArrayInitializerExpression extractArrayInitializerExpression() {

            return new ArrayInitializerExpression(this.hashId, this.type.hashId);
        }


        public AnnotationArrayInitializer extractAnnotationArrayInitializer() {

            return new AnnotationArrayInitializer(this.hashId, this.debug_message, this.parent.hashId, this.location.hashId);
        }
    }

}
