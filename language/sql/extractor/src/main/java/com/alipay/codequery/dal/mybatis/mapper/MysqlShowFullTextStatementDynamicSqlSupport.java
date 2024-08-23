package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MysqlShowFullTextStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_full_text_statement")
    public static final MysqlShowFullTextStatement mysqlShowFullTextStatement = new MysqlShowFullTextStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_show_full_text_statement.oid")
    public static final SqlColumn<Long> oid = mysqlShowFullTextStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_show_full_text_statement.type")
    public static final SqlColumn<String> type = mysqlShowFullTextStatement.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_full_text_statement")
    public static final class MysqlShowFullTextStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public MysqlShowFullTextStatement() {
            super("mysql_show_full_text_statement");
        }
    }
}