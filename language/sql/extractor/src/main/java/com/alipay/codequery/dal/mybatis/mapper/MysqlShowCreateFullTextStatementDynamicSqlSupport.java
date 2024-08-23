package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MysqlShowCreateFullTextStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_create_full_text_statement")
    public static final MysqlShowCreateFullTextStatement mysqlShowCreateFullTextStatement = new MysqlShowCreateFullTextStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_show_create_full_text_statement.oid")
    public static final SqlColumn<Long> oid = mysqlShowCreateFullTextStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_show_create_full_text_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mysqlShowCreateFullTextStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_show_create_full_text_statement.type")
    public static final SqlColumn<String> type = mysqlShowCreateFullTextStatement.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_show_create_full_text_statement")
    public static final class MysqlShowCreateFullTextStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public MysqlShowCreateFullTextStatement() {
            super("mysql_show_create_full_text_statement");
        }
    }
}