package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MysqlCreateFullTextAnalyzerStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    public static final MysqlCreateFullTextAnalyzerStatement mysqlCreateFullTextAnalyzerStatement = new MysqlCreateFullTextAnalyzerStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.oid")
    public static final SqlColumn<Long> oid = mysqlCreateFullTextAnalyzerStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.charfilters")
    public static final SqlColumn<String> charfilters = mysqlCreateFullTextAnalyzerStatement.charfilters;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mysqlCreateFullTextAnalyzerStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.tokenizer")
    public static final SqlColumn<String> tokenizer = mysqlCreateFullTextAnalyzerStatement.tokenizer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_analyzer_statement.tokenizers")
    public static final SqlColumn<String> tokenizers = mysqlCreateFullTextAnalyzerStatement.tokenizers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_analyzer_statement")
    public static final class MysqlCreateFullTextAnalyzerStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> charfilters = column("`charfilters`", JDBCType.VARCHAR);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> tokenizer = column("`tokenizer`", JDBCType.VARCHAR);

        public final SqlColumn<String> tokenizers = column("`tokenizers`", JDBCType.VARCHAR);

        public MysqlCreateFullTextAnalyzerStatement() {
            super("mysql_create_full_text_analyzer_statement");
        }
    }
}