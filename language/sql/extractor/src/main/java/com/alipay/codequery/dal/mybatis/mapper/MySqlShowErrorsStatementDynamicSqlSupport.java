package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowErrorsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_errors_statement")
    public static final MySqlShowErrorsStatement mySqlShowErrorsStatement = new MySqlShowErrorsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_errors_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowErrorsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_errors_statement.is_count")
    public static final SqlColumn<Integer> isCount = mySqlShowErrorsStatement.isCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_errors_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = mySqlShowErrorsStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_errors_statement")
    public static final class MySqlShowErrorsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCount = column("`is_count`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public MySqlShowErrorsStatement() {
            super("my_sql_show_errors_statement");
        }
    }
}