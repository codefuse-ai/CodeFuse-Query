package com.alipay.codequery.coref.model;

import com.alipay.codequery.dal.mybatis.domain.JavadocComment;
import com.alipay.codequery.dal.mybatis.domain.JavadocDataToken;
import com.alipay.codequery.dal.mybatis.domain.JavadocTag;
import com.alipay.codequery.dal.mybatis.domain.JavadocTagValue;

public class Comment extends Node {

    public String text;
    public String commentType;

    public Comment(Long hashId) {
        super(hashId);
    }

    public com.alipay.codequery.dal.mybatis.domain.Comment extractComment() {
        return new com.alipay.codequery.dal.mybatis.domain.Comment(this.hashId, this.text, this.parent.hashId, this.location.hashId, this.commentType);
    }

    public static class JavaDocComment extends Comment {

        public String text;
        public Node documentedItem;
        public int index;

        public JavaDocComment(Long hashId) {
            super(hashId);
        }

        public JavadocComment extractJavaDocComment() {
            return new JavadocComment(this.hashId, this.documentedItem.hashId, this.text, this.location.hashId, this.parent.hashId);
        }
    }

    public static class JavaDocTag extends JavaDocComment {

        public String name;
        public String value;
        public Comment containedComment;

        public JavaDocTag(Long hashId) {
            super(hashId);
        }

        public JavadocTag extractJavadocTag() {
            return new JavadocTag(this.hashId, this.name, this.value, this.containedComment.hashId, this.index, this.location.hashId);
        }
    }

    /**
     * Model for JavaDocTagValue element.
     */
    public static class JavaDocTagValue extends JavaDocTag {
        public JavaDocTagValue(Long hashId) {
            super(hashId);
        }

        public JavadocTagValue extractJavaDocTagValue() {
            return new JavadocTagValue(this.hashId, this.value, this.parent.hashId, this.location.getHashId());
        }
    }

    /**
     * Model for JavaDocDataToken element.
     */
    public static class JavaDocDataToken extends JavaDocTag {

        public JavaDocDataToken(Long hashId) {
            super(hashId);
        }

        public JavadocDataToken extractJavaDocDataToken() {
            return new JavadocDataToken(this.hashId, this.value, this.parent.hashId, this.index, this.location.getHashId());
        }
    }

}
