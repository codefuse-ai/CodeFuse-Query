package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowRuleStatusStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_status_statement")
    public static final MySqlShowRuleStatusStatement mySqlShowRuleStatusStatement = new MySqlShowRuleStatusStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowRuleStatusStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.is_full")
    public static final SqlColumn<Integer> isFull = mySqlShowRuleStatusStatement.isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.is_lite")
    public static final SqlColumn<Integer> isLite = mySqlShowRuleStatusStatement.isLite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.is_version")
    public static final SqlColumn<Integer> isVersion = mySqlShowRuleStatusStatement.isVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = mySqlShowRuleStatusStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.order_by_oid")
    public static final SqlColumn<Long> orderByOid = mySqlShowRuleStatusStatement.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowRuleStatusStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_status_statement")
    public static final class MySqlShowRuleStatusStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFull = column("`is_full`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLite = column("`is_lite`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isVersion = column("`is_version`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowRuleStatusStatement() {
            super("my_sql_show_rule_status_statement");
        }
    }
}