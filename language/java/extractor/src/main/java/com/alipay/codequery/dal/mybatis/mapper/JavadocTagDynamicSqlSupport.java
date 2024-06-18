package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JavadocTagDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_tag")
    public static final JavadocTag javadocTag = new JavadocTag();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.element_hash_id")
    public static final SqlColumn<Long> elementHashId = javadocTag.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.name")
    public static final SqlColumn<String> name = javadocTag.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.value")
    public static final SqlColumn<String> value = javadocTag.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.containing_comment_hash_id")
    public static final SqlColumn<Long> containingCommentHashId = javadocTag.containingCommentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.index_order")
    public static final SqlColumn<Integer> indexOrder = javadocTag.indexOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag.location_hash_id")
    public static final SqlColumn<Long> locationHashId = javadocTag.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_tag")
    public static final class JavadocTag extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public final SqlColumn<Long> containingCommentHashId = column("containing_comment_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> indexOrder = column("index_order", JDBCType.INTEGER);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public JavadocTag() {
            super("javadoc_tag");
        }
    }
}