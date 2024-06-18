package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JavadocCommentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_comment")
    public static final JavadocComment javadocComment = new JavadocComment();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_comment.element_hash_id")
    public static final SqlColumn<Long> elementHashId = javadocComment.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_comment.documentable_hash_id")
    public static final SqlColumn<Long> documentableHashId = javadocComment.documentableHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_comment.text")
    public static final SqlColumn<String> text = javadocComment.text;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_comment.location_hash_id")
    public static final SqlColumn<Long> locationHashId = javadocComment.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_comment.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = javadocComment.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_comment")
    public static final class JavadocComment extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> documentableHashId = column("documentable_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> text = column("text", JDBCType.VARCHAR);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public JavadocComment() {
            super("javadoc_comment");
        }
    }
}