package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MysqlShowDbLockStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_db_lock_statement")
    public static final MysqlShowDbLockStatement mysqlShowDbLockStatement = new MysqlShowDbLockStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_show_db_lock_statement.oid")
    public static final SqlColumn<Long> oid = mysqlShowDbLockStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_db_lock_statement")
    public static final class MysqlShowDbLockStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MysqlShowDbLockStatement() {
            super("mysql_show_db_lock_statement");
        }
    }
}