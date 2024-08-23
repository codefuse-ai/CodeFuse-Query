package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowDdlStatusStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ddl_status_statement")
    public static final MySqlShowDdlStatusStatement mySqlShowDdlStatusStatement = new MySqlShowDdlStatusStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_ddl_status_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowDdlStatusStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_ddl_status_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = mySqlShowDdlStatusStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_ddl_status_statement.order_by_oid")
    public static final SqlColumn<Long> orderByOid = mySqlShowDdlStatusStatement.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_ddl_status_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowDdlStatusStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_ddl_status_statement")
    public static final class MySqlShowDdlStatusStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowDdlStatusStatement() {
            super("my_sql_show_ddl_status_statement");
        }
    }
}