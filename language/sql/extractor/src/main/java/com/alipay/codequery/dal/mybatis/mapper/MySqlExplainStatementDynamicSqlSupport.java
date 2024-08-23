package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlExplainStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    public static final MySqlExplainStatement mySqlExplainStatement = new MySqlExplainStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.oid")
    public static final SqlColumn<Long> oid = mySqlExplainStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.column_name_oid")
    public static final SqlColumn<Long> columnNameOid = mySqlExplainStatement.columnNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.connection_id_oid")
    public static final SqlColumn<Long> connectionIdOid = mySqlExplainStatement.connectionIdOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.is_describe")
    public static final SqlColumn<Integer> isDescribe = mySqlExplainStatement.isDescribe;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.is_distribute_info")
    public static final SqlColumn<Integer> isDistributeInfo = mySqlExplainStatement.isDistributeInfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.table_name_oid")
    public static final SqlColumn<Long> tableNameOid = mySqlExplainStatement.tableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.wild_oid")
    public static final SqlColumn<Long> wildOid = mySqlExplainStatement.wildOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    public static final class MySqlExplainStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> columnNameOid = column("`column_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> connectionIdOid = column("`connection_id_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDescribe = column("`is_describe`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDistributeInfo = column("`is_distribute_info`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableNameOid = column("`table_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> wildOid = column("`wild_oid`", JDBCType.BIGINT);

        public MySqlExplainStatement() {
            super("my_sql_explain_statement");
        }
    }
}