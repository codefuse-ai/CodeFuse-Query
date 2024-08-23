package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MysqlShowHtcStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    public static final MysqlShowHtcStatement mysqlShowHtcStatement = new MysqlShowHtcStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_show_htc_statement.oid")
    public static final SqlColumn<Long> oid = mysqlShowHtcStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_show_htc_statement.is_full")
    public static final SqlColumn<Integer> isFull = mysqlShowHtcStatement.isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_show_htc_statement.is_his")
    public static final SqlColumn<Integer> isHis = mysqlShowHtcStatement.isHis;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_htc_statement")
    public static final class MysqlShowHtcStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFull = column("`is_full`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isHis = column("`is_his`", JDBCType.BIGINT);

        public MysqlShowHtcStatement() {
            super("mysql_show_htc_statement");
        }
    }
}