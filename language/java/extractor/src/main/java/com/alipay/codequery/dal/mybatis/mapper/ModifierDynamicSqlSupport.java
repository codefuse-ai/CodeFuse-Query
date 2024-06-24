package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ModifierDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    public static final Modifier modifier = new Modifier();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: modifier.element_hash_id")
    public static final SqlColumn<Long> elementHashId = modifier.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: modifier.name")
    public static final SqlColumn<String> name = modifier.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: modifier.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = modifier.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: modifier.location_hash_id")
    public static final SqlColumn<Long> locationHashId = modifier.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: modifier")
    public static final class Modifier extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public Modifier() {
            super("modifier");
        }
    }
}