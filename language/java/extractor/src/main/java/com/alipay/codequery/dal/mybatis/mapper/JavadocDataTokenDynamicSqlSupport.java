package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JavadocDataTokenDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    public static final JavadocDataToken javadocDataToken = new JavadocDataToken();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_data_token.element_hash_id")
    public static final SqlColumn<Long> elementHashId = javadocDataToken.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_data_token.value")
    public static final SqlColumn<String> value = javadocDataToken.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_data_token.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = javadocDataToken.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_data_token.index_order")
    public static final SqlColumn<Integer> indexOrder = javadocDataToken.indexOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: javadoc_data_token.location_hash_id")
    public static final SqlColumn<Long> locationHashId = javadocDataToken.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    public static final class JavadocDataToken extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> indexOrder = column("index_order", JDBCType.INTEGER);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public JavadocDataToken() {
            super("javadoc_data_token");
        }
    }
}