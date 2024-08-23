package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MysqlAlterFullTextStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    public static final MysqlAlterFullTextStatement mysqlAlterFullTextStatement = new MysqlAlterFullTextStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_alter_full_text_statement.oid")
    public static final SqlColumn<Long> oid = mysqlAlterFullTextStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_alter_full_text_statement.item_oid")
    public static final SqlColumn<Long> itemOid = mysqlAlterFullTextStatement.itemOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_alter_full_text_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mysqlAlterFullTextStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_alter_full_text_statement.type")
    public static final SqlColumn<String> type = mysqlAlterFullTextStatement.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_full_text_statement")
    public static final class MysqlAlterFullTextStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> itemOid = column("`item_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public MysqlAlterFullTextStatement() {
            super("mysql_alter_full_text_statement");
        }
    }
}