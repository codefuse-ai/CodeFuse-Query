package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TokenDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: token")
    public static final Token token = new Token();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: token.element_hash_id")
    public static final SqlColumn<Long> elementHashId = token.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: token.value")
    public static final SqlColumn<String> value = token.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: token.location_hash_id")
    public static final SqlColumn<Long> locationHashId = token.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: token.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = token.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: token")
    public static final class Token extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public Token() {
            super("token");
        }
    }
}