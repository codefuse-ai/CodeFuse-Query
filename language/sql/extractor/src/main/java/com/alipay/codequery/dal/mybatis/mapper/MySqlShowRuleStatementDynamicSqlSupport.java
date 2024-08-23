package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowRuleStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    public static final MySqlShowRuleStatement mySqlShowRuleStatement = new MySqlShowRuleStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowRuleStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_statement.is_full")
    public static final SqlColumn<Integer> isFull = mySqlShowRuleStatement.isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_statement.is_version")
    public static final SqlColumn<Integer> isVersion = mySqlShowRuleStatement.isVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = mySqlShowRuleStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlShowRuleStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_statement.order_by_oid")
    public static final SqlColumn<Long> orderByOid = mySqlShowRuleStatement.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowRuleStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_statement")
    public static final class MySqlShowRuleStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFull = column("`is_full`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isVersion = column("`is_version`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowRuleStatement() {
            super("my_sql_show_rule_statement");
        }
    }
}