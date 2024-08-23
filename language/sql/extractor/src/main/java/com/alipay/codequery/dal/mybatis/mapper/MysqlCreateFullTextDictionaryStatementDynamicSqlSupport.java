package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MysqlCreateFullTextDictionaryStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_dictionary_statement")
    public static final MysqlCreateFullTextDictionaryStatement mysqlCreateFullTextDictionaryStatement = new MysqlCreateFullTextDictionaryStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_dictionary_statement.oid")
    public static final SqlColumn<Long> oid = mysqlCreateFullTextDictionaryStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_dictionary_statement.column_oid")
    public static final SqlColumn<Long> columnOid = mysqlCreateFullTextDictionaryStatement.columnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_dictionary_statement.comment")
    public static final SqlColumn<String> comment = mysqlCreateFullTextDictionaryStatement.comment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_dictionary_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mysqlCreateFullTextDictionaryStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_dictionary_statement")
    public static final class MysqlCreateFullTextDictionaryStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> columnOid = column("`column_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> comment = column("`comment`", JDBCType.VARCHAR);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public MysqlCreateFullTextDictionaryStatement() {
            super("mysql_create_full_text_dictionary_statement");
        }
    }
}