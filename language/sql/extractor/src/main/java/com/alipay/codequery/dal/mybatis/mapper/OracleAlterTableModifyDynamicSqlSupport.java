package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleAlterTableModifyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_table_modify")
    public static final OracleAlterTableModify oracleAlterTableModify = new OracleAlterTableModify();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_table_modify.oid")
    public static final SqlColumn<Long> oid = oracleAlterTableModify.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_table_modify")
    public static final class OracleAlterTableModify extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public OracleAlterTableModify() {
            super("oracle_alter_table_modify");
        }
    }
}