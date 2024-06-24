package com.alipay.codequery.coref.model;

import com.alipay.codequery.dal.mybatis.domain.*;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
public class Annotation extends Node {

    public Annotation(Long hashId) {
        super(hashId);
    }

    public static class AnnotationModel extends Node {

        public AnnotationModel(Long hashId) {
            super(hashId);
        }

        public Identifier name;
        public String qualifiedName;
        public Node resolveAnnotationType;

        public AnnotationCanResolved extractAnnotationCanResolved() {
            return new AnnotationCanResolved(this.hashId, this.name.name, this.resolveAnnotationType.hashId, this.location.hashId, this.debug_message, this.parent.hashId);
        }

        public AnnotationCanNotResolved extractAnnotationCanNotResolved() {
            return new AnnotationCanNotResolved(this.hashId, this.qualifiedName, this.location.hashId, this.debug_message, this.parent.hashId);
        }

        public AnnotationDeclaration extractAnnotationDeclaration() {
            return new AnnotationDeclaration(this.hashId, this.qualifiedName);
        }
    }

    public static class AnnotationArgument extends Annotation {

        public com.alipay.codequery.coref.model.Expression kind;
        public Expression value;
        public int index;

        public AnnotationArgument(Long hashId) {
            super(hashId);
        }

        public AnnotationAccessArgumentWithName extractAnnotationArgumentWithName() {
            return new AnnotationAccessArgumentWithName(this.hashId, this.parent.hashId, this.kind.hashId, this.value.hashId, this.location.hashId, this.index, this.debug_message);
        }

        public AnnotationAccessArgumentWithoutName extractAnnotationArgumentWithoutName() {
            return new AnnotationAccessArgumentWithoutName(this.hashId, this.parent.hashId, this.value.hashId, this.location.hashId, this.index, this.debug_message);
        }
    }

    public static class AnnotationParameter extends Method {
        public Type type;
        public Identifier name;

        public AnnotationParameter(Long hashId) {
            super(hashId);
        }

        public AnnotationDeclarationParameter extractAnnotationArgument() {
            return new AnnotationDeclarationParameter(this.hashId, this.parent.hashId, this.type.hashId, this.name.hashId, this.location.hashId, this.debug_message);
        }
    }


}
