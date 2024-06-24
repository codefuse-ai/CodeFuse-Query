package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ModuleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: module")
    public static final Module module = new Module();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: module.element_hash_id")
    public static final SqlColumn<Long> elementHashId = module.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: module.name")
    public static final SqlColumn<String> name = module.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: module")
    public static final class Module extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public Module() {
            super("module");
        }
    }
}