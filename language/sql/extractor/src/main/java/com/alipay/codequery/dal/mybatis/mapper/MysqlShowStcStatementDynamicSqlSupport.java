package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MysqlShowStcStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_stc_statement")
    public static final MysqlShowStcStatement mysqlShowStcStatement = new MysqlShowStcStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_show_stc_statement.oid")
    public static final SqlColumn<Long> oid = mysqlShowStcStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_show_stc_statement.is_full")
    public static final SqlColumn<Integer> isFull = mysqlShowStcStatement.isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_show_stc_statement.is_his")
    public static final SqlColumn<Integer> isHis = mysqlShowStcStatement.isHis;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_stc_statement")
    public static final class MysqlShowStcStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFull = column("`is_full`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isHis = column("`is_his`", JDBCType.BIGINT);

        public MysqlShowStcStatement() {
            super("mysql_show_stc_statement");
        }
    }
}