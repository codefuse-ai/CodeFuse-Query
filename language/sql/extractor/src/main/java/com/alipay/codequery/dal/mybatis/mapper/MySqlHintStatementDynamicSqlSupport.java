package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlHintStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_hint_statement")
    public static final MySqlHintStatement mySqlHintStatement = new MySqlHintStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_hint_statement.oid")
    public static final SqlColumn<Long> oid = mySqlHintStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_hint_statement.hint_version")
    public static final SqlColumn<Integer> hintVersion = mySqlHintStatement.hintVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_hint_statement")
    public static final class MySqlHintStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> hintVersion = column("`hint_version`", JDBCType.BIGINT);

        public MySqlHintStatement() {
            super("my_sql_hint_statement");
        }
    }
}