package com.alipay.codequery.coref.model;

import com.alipay.codequery.dal.mybatis.domain.*;
import com.alipay.codequery.dal.mybatis.domain.LocalClass;
import com.alipay.codequery.dal.mybatis.domain.clazz;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Class extends Node {
    public Class(Long hashId) {
        super(hashId);
    }

    public static class ClassDefinition extends Statement {

        public Identifier identifier;
        public List<ClassDefinition> superclass;
        public Modifier modifier;
        public List<Annotation.AnnotationModel> annotations;
        public String qualifiedName;
        public Expression restype;
        public ClassDefinition implemented;

        public ClassDefinition(Long hashId) {
            super(hashId);
        }

        public clazz extractClass() {
            return new clazz(this.hashId, qualifiedName, identifier.hashId, this.location.hashId, this.parent.hashId);
        }

        public InterfaceInfo extractInterface() {
            return new InterfaceInfo(this.hashId, qualifiedName, identifier.hashId, this.location.hashId, this.parent.hashId);
        }

        public LocalClass extractLocalClass() {
            return new LocalClass(this.hashId, this.identifier.name, this.debug_message, this.location.hashId, this.parent.hashId);
        }

    }

    public static class AnonymousClass extends ClassDefinition {
        public ClassDefinition baseClass;
        public Type baseType;

        public AnonymousClass(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.dal.mybatis.domain.AnonymousClass extractAnonymousClass() {
            return new com.alipay.codequery.dal.mybatis.domain.AnonymousClass(this.hashId, this.baseClass.hashId, this.baseType.hashId, this.location.hashId, this.parent.hashId);
        }
    }


    public static class ClassHierarchy extends Node {
        public Long child;
        public Long parent;

        public ClassHierarchy() {
            super();
        }

        public ClassHierarchy (Long childId, Long parentId) {
            this.child = childId;
            this.parent = parentId;
        }

        public com.alipay.codequery.dal.mybatis.domain.ClassHierarchy extractClassHierarchy() {
            return new com.alipay.codequery.dal.mybatis.domain.ClassHierarchy(child, parent);
        }
    }


}
