package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlRepeatStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_repeat_statement")
    public static final MySqlRepeatStatement mySqlRepeatStatement = new MySqlRepeatStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_repeat_statement.oid")
    public static final SqlColumn<Long> oid = mySqlRepeatStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_repeat_statement.condition_oid")
    public static final SqlColumn<Long> conditionOid = mySqlRepeatStatement.conditionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_repeat_statement.label_name")
    public static final SqlColumn<String> labelName = mySqlRepeatStatement.labelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_repeat_statement")
    public static final class MySqlRepeatStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> conditionOid = column("`condition_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> labelName = column("`label_name`", JDBCType.VARCHAR);

        public MySqlRepeatStatement() {
            super("my_sql_repeat_statement");
        }
    }
}