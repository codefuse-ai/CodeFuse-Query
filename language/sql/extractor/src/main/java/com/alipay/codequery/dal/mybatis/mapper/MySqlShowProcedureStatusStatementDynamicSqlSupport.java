package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowProcedureStatusStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_procedure_status_statement")
    public static final MySqlShowProcedureStatusStatement mySqlShowProcedureStatusStatement = new MySqlShowProcedureStatusStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_procedure_status_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowProcedureStatusStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_procedure_status_statement.like_oid")
    public static final SqlColumn<Long> likeOid = mySqlShowProcedureStatusStatement.likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_procedure_status_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowProcedureStatusStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_procedure_status_statement")
    public static final class MySqlShowProcedureStatusStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> likeOid = column("`like_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowProcedureStatusStatement() {
            super("my_sql_show_procedure_status_statement");
        }
    }
}