package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlLeaveStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_leave_statement")
    public static final MySqlLeaveStatement mySqlLeaveStatement = new MySqlLeaveStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_leave_statement.oid")
    public static final SqlColumn<Long> oid = mySqlLeaveStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_leave_statement.label_name")
    public static final SqlColumn<String> labelName = mySqlLeaveStatement.labelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_leave_statement")
    public static final class MySqlLeaveStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> labelName = column("`label_name`", JDBCType.VARCHAR);

        public MySqlLeaveStatement() {
            super("my_sql_leave_statement");
        }
    }
}