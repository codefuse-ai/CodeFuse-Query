package com.alipay.codequery.coref.storage;

import com.alipay.codequery.coref.model.*;
import com.alipay.codequery.coref.model.Class;
import com.alipay.codequery.coref.model.Comment;
import com.alipay.codequery.coref.model.Expression;
import com.alipay.codequery.coref.model.Location;
import com.alipay.codequery.coref.model.Module;
import com.alipay.codequery.coref.model.Statement;
import com.alipay.codequery.coref.model.*;
import com.alipay.codequery.coref.model.File;
import com.alipay.codequery.coref.model.Folder;
import com.alipay.codequery.coref.model.Identifier;
import com.alipay.codequery.coref.model.Modifier;
import com.alipay.codequery.coref.model.NpClass;
import com.alipay.codequery.coref.model.NpFile;
import com.alipay.codequery.coref.model.NpInterface;
import com.alipay.codequery.coref.model.NpMethod;
import com.alipay.codequery.coref.model.NpProject;
import com.alipay.codequery.coref.model.Program;
import com.alipay.codequery.dal.mybatis.domain.*;
import com.alipay.codequery.dal.mybatis.domain.Exception;
import com.alipay.codequery.coref.model.*;
import com.alipay.codequery.dal.mybatis.domain.Primitive;


public interface IStorage {
    void commit();

    void storeLocation(Location location);

    void storeStatementEnclosingExpression(StatementEnclosingExpression s);

    void storeCallableEnclosingExpression(CallableEnclosingExpression c);

    void storeCallableEnclosingStatement(CallableEnclosingStatement c);

    void storeNumberOfLines(Location.NumberOfLines numberOfLines);

    void storeNameStrings(NameString nameString);

    void storeReferenceRelation(ReferenceRelation referenceRelation);

    void storeCallableBinding(CallableBinding callableBinding);

    void storeParent(com.alipay.codequery.coref.model.Parent parent);

    void storeAnnotatedRelation(AnnotatedRelation annotatedRelation);

    void storeParameter(com.alipay.codequery.coref.model.Parameter parameter);

    void storeReferenceElement(com.alipay.codequery.coref.model.Expression reference);

    void storeImportStaticReferenceElement(com.alipay.codequery.coref.model.Expression reference);

    void storeTypeParameter(Type.TypeParameter parameter);

    void storeClassInitializer(com.alipay.codequery.coref.model.Expression initializer);

    void storeAnnotationDeclarationParameterDefaultValue(AnnotationDeclarationParameterDefaultValue parameter);

    void storeJavaDocTag(com.alipay.codequery.coref.model.Comment.JavaDocTag docTag);

    void storeAnonymousClass(Class.AnonymousClass clazz);

    void storeFileMd5Sum(FileMd5Sum file);

    void storeFileSHA256Sum(FileSha256Sum file);

    void storeReferenceType(Type type);

    void storeIfStatementWithElse(com.alipay.codequery.coref.model.Statement.IfStatement statement);

    void storeIfStatementWithoutElse(com.alipay.codequery.coref.model.Statement.IfStatement statement);

    void storeTypeElement(Type element);

    void storeYieldStatement(com.alipay.codequery.coref.model.Statement.YieldStatement statement);

    void storeSynchronizedStatement(com.alipay.codequery.coref.model.Statement.SynchronizedStatement statement);

    void storeExpressionStatement(com.alipay.codequery.coref.model.Statement.ExpressionStatement statement);

    void storeCodeBlock(com.alipay.codequery.coref.model.Statement.CodeBlock statement);

    void storeBlockStatement(com.alipay.codequery.coref.model.Statement.BlockStatement statement);

    void storeLabeledStatement(com.alipay.codequery.coref.model.Statement.LabeledStatement statement);

    void storeLambdaExpression(com.alipay.codequery.coref.model.Expression.LambdaExpression expression);

    void storeThisExpression(com.alipay.codequery.coref.model.Expression.ThisExpression expression);

    void storeThisExpressionWithQualifier(com.alipay.codequery.coref.model.Expression.ThisExpression expression);

    void storeSuperAccessExpression(com.alipay.codequery.coref.model.Expression.MethodCallExpression expression);

    void storeSuperConstructorInvocation(com.alipay.codequery.coref.model.Expression.MethodCallExpression expression);

    void storeEmptyStatement(com.alipay.codequery.coref.model.Statement.EmptyStatement statement);

    void storeWhileStatement(com.alipay.codequery.coref.model.Statement.WhileStatement statement);

    void storeTryStatementWithoutFinally(com.alipay.codequery.coref.model.Statement.TryStatement statement);

    void storeTryStatementWithFinally(com.alipay.codequery.coref.model.Statement.TryStatement statement);

    void storeThrowStatement(com.alipay.codequery.coref.model.Statement.ThrowStatement statement);

    void storeSwitchStatement(com.alipay.codequery.coref.model.Statement.SwitchStatement statement);

    void storeSwitchLabelStatement(com.alipay.codequery.coref.model.Statement.SwitchLabelStatement statement);

    void storeDoWhileStatement(com.alipay.codequery.coref.model.Statement.DoWhileStatement statement);

    void storeContinueStatement(com.alipay.codequery.coref.model.Statement.ContinueStatement statement);

    void storeBreakStatement(com.alipay.codequery.coref.model.Statement.BreakStatement statement);

    void storeReturnStatement(com.alipay.codequery.coref.model.Statement.ReturnStatement statement);

    void storeModule(Module module);

    void storeTypeLiteral(Type.TypeLiteral literal);

    void storeAssertStatement(com.alipay.codequery.coref.model.Statement.AssertStatement statement);

    void storeDeclarationElement(com.alipay.codequery.coref.model.Statement.DeclarationStatement statement);

    void storeImport(com.alipay.codequery.coref.model.Statement.ImportStatement statement);

    void storeImportStaticStatement(com.alipay.codequery.coref.model.Statement.ImportStatement statement);

    void storeResourceList(ResourceList list);

    void storeMethodAccessExpressionWithoutType(com.alipay.codequery.coref.model.Expression.MethodCallExpression expression);

    void storeMethodAccessExpressionWithType(com.alipay.codequery.coref.model.Expression.MethodCallExpression expression);

    void storeMethodReferenceExpression(com.alipay.codequery.coref.model.Expression.MethodCallExpression expression);

    void storeArrayInitializerExpression(com.alipay.codequery.coref.model.Expression.ArrayInitializationExpression expression);

    void storeAnnotationArrayInitializer(com.alipay.codequery.coref.model.Expression.ArrayInitializationExpression expression);

    void storeArrayAccessExpression(com.alipay.codequery.coref.model.Expression.ArrayAccessExpression expression);

    void storeToken(Token token);

    void storeLocalVariable(com.alipay.codequery.coref.model.LocalVariable variable);

    void storeCastExpression(com.alipay.codequery.coref.model.Expression.CastExpression expression);

    void storeReferenceExpression(com.alipay.codequery.coref.model.Expression expression);

    void storeConstructorInvocation(com.alipay.codequery.coref.model.Expression.NewExpression expression);

    void storeConditionalExpression(com.alipay.codequery.coref.model.Expression.ConditionalExpression expression);

    void storeNewExpression(com.alipay.codequery.coref.model.Expression.NewExpression expression);

    void storeArrayCreationExpression(com.alipay.codequery.coref.model.Expression.NewExpression expression);

    void storeField(com.alipay.codequery.coref.model.Field field);

    void storeMethod(com.alipay.codequery.coref.model.Method method);

    void storeConstructor(com.alipay.codequery.coref.model.Method method);

    void storePrimitive(Primitive primitive);

    void storeCatchClauseStatement(com.alipay.codequery.coref.model.Statement.CatchClause catchClause);

    void storeLocalClass(Class.ClassDefinition statement);

    void storeEnumConstant(com.alipay.codequery.coref.model.Field enumField);

    void storeInstanceOfExpression(com.alipay.codequery.coref.model.Expression.InstanceOfExpression expression);

    void storeArray(Variable array);

    // void storeAnnotationAccess(com.alipay.codequery.coref.model.Annotation.AnnotationModel annotation);

    void storeAnnotationCanResolved(Annotation.AnnotationModel annotation);

    void storeAnnotationCanNotResolved(Annotation.AnnotationModel annotation);

    void storeAnnotationDeclaration(Annotation.AnnotationModel annotation);

    void storeAnnotationDeclarationParameter(Annotation.AnnotationParameter parameter);

    void storeExpression(com.alipay.codequery.coref.model.Expression expression);

    void storePackageStatement(com.alipay.codequery.coref.model.Statement.PackageStatement packages);

    void storeCuPackage(Cupackage cupackage);

    void storeClassHierarchy(Class.ClassHierarchy classHierarchy);

    void storeSuperExpression(com.alipay.codequery.coref.model.Expression.SuperExpression expression);

    void storeSuperExpressionWithQualifier(com.alipay.codequery.coref.model.Expression.SuperExpression expression);

    void storeException(Exception exception);

    void storeClass(Class.ClassDefinition classDefinition);

    void storeImplementlist(ClassImplementList list);

    void storeElement(Element e);

    void storeReferencelist(com.alipay.codequery.coref.model.Expression.ReferenceList list);

    void storeReferenceParameterlist(ParameterList.ReferenceParameterList list, int index);

    void storeEmptyReferenceParameterlist(ParameterList.ReferenceParameterList list);

    void storeInterface(Class.ClassDefinition classDefinition);

    void storeStatement(Statement statement);

    void storeComment(com.alipay.codequery.coref.model.Comment comment);

    void storeExpressionList(com.alipay.codequery.coref.model.Expression.ExpressionList list);

    void storeExpressionListExpressionRelation(ExpressionListExpressionRelation expressionListRelation);

    void storeJavaDocComment(com.alipay.codequery.coref.model.Comment.JavaDocComment comments);

    void storeJavaDocDataToken(com.alipay.codequery.coref.model.Comment.JavaDocDataToken javaDocDataToken);

    void storeJavaDocTagValue(Comment.JavaDocTagValue javaDocTagValue);

    void storeForStatement(Statement.ForStatement statement);

    void storeAssignmentExpression(com.alipay.codequery.coref.model.Expression.AssignmentExpression expression);

    void storeBinaryExpression(com.alipay.codequery.coref.model.Expression.BinaryExpression expression);

    void storePolyadicExpression(Expression.PolyadicExpression expression);

    void storeUnaryExpression(Expression.UnaryExpression expression);

    void storeForeachStatement(Statement.ForeachStatement statement);

    void storeAnnotationArgumentWithName(Annotation.AnnotationArgument annotationArgument);

    void storeAnnotationArgumentWithoutName(Annotation.AnnotationArgument annotationArgument);

    void storeProgram(Program program);

    void storeModifier(Modifier modifier);

    void storeModifierList(Modifier modifier);

    void storeFile(File file);

    void storeFolder(Folder folder);

    void storeContainerParent(ContainerParent container);

    void storeIdentifier(Identifier identifier);

    void handleLiteral(Literal literal);

    void storeLiteral(Literal literal, java.lang.Class mapperClass);

    void storeNpProject(NpProject npProject);

    void storeNpFile(NpFile npFile);

    void storeNpClass(NpClass npClass);

    void storeNpInterface(NpInterface npInterface);

    void storeNpMethod(NpMethod npMethod);
}
