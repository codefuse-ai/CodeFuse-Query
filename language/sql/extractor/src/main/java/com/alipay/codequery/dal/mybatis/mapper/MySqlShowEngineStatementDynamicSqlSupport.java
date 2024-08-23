package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowEngineStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_engine_statement")
    public static final MySqlShowEngineStatement mySqlShowEngineStatement = new MySqlShowEngineStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_engine_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowEngineStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_engine_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlShowEngineStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_engine_statement.option")
    public static final SqlColumn<String> option = mySqlShowEngineStatement.option;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_engine_statement")
    public static final class MySqlShowEngineStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> option = column("`option`", JDBCType.VARCHAR);

        public MySqlShowEngineStatement() {
            super("my_sql_show_engine_statement");
        }
    }
}