package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MysqlDropFullTextStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_drop_full_text_statement")
    public static final MysqlDropFullTextStatement mysqlDropFullTextStatement = new MysqlDropFullTextStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_drop_full_text_statement.oid")
    public static final SqlColumn<Long> oid = mysqlDropFullTextStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_drop_full_text_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mysqlDropFullTextStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_drop_full_text_statement.type")
    public static final SqlColumn<String> type = mysqlDropFullTextStatement.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_drop_full_text_statement")
    public static final class MysqlDropFullTextStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public MysqlDropFullTextStatement() {
            super("mysql_drop_full_text_statement");
        }
    }
}