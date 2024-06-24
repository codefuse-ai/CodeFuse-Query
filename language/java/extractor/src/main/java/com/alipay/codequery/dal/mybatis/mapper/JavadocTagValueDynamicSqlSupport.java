package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JavadocTagValueDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_tag_value")
    public static final JavadocTagValue javadocTagValue = new JavadocTagValue();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag_value.element_hash_id")
    public static final SqlColumn<Long> elementHashId = javadocTagValue.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag_value.value")
    public static final SqlColumn<String> value = javadocTagValue.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag_value.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = javadocTagValue.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_tag_value.location_hash_id")
    public static final SqlColumn<Long> locationHashId = javadocTagValue.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_tag_value")
    public static final class JavadocTagValue extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public JavadocTagValue() {
            super("javadoc_tag_value");
        }
    }
}