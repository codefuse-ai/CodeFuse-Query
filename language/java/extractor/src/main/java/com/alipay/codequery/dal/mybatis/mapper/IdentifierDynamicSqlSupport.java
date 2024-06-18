package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class IdentifierDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: identifier")
    public static final Identifier identifier = new Identifier();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: identifier.element_hash_id")
    public static final SqlColumn<Long> elementHashId = identifier.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: identifier.location_hash_id")
    public static final SqlColumn<Long> locationHashId = identifier.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: identifier.name")
    public static final SqlColumn<String> name = identifier.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: identifier.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = identifier.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: identifier")
    public static final class Identifier extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public Identifier() {
            super("identifier");
        }
    }
}