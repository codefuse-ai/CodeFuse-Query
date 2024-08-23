package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowSequencesStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_sequences_statement")
    public static final MySqlShowSequencesStatement mySqlShowSequencesStatement = new MySqlShowSequencesStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_sequences_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowSequencesStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_sequences_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = mySqlShowSequencesStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_sequences_statement.order_by_oid")
    public static final SqlColumn<Long> orderByOid = mySqlShowSequencesStatement.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_sequences_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowSequencesStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_sequences_statement")
    public static final class MySqlShowSequencesStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowSequencesStatement() {
            super("my_sql_show_sequences_statement");
        }
    }
}