package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowMasterStatusStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_master_status_statement")
    public static final MySqlShowMasterStatusStatement mySqlShowMasterStatusStatement = new MySqlShowMasterStatusStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_master_status_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowMasterStatusStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_master_status_statement")
    public static final class MySqlShowMasterStatusStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlShowMasterStatusStatement() {
            super("my_sql_show_master_status_statement");
        }
    }
}