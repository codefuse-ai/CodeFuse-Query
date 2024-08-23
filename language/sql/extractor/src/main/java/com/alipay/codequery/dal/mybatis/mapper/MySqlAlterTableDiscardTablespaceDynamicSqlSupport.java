package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlAlterTableDiscardTablespaceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_discard_tablespace")
    public static final MySqlAlterTableDiscardTablespace mySqlAlterTableDiscardTablespace = new MySqlAlterTableDiscardTablespace();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_discard_tablespace.oid")
    public static final SqlColumn<Long> oid = mySqlAlterTableDiscardTablespace.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_discard_tablespace")
    public static final class MySqlAlterTableDiscardTablespace extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlAlterTableDiscardTablespace() {
            super("my_sql_alter_table_discard_tablespace");
        }
    }
}