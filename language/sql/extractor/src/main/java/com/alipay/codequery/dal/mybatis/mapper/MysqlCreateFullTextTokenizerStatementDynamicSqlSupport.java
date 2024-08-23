package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MysqlCreateFullTextTokenizerStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_tokenizer_statement")
    public static final MysqlCreateFullTextTokenizerStatement mysqlCreateFullTextTokenizerStatement = new MysqlCreateFullTextTokenizerStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_tokenizer_statement.oid")
    public static final SqlColumn<Long> oid = mysqlCreateFullTextTokenizerStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_tokenizer_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mysqlCreateFullTextTokenizerStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_tokenizer_statement.type_name_oid")
    public static final SqlColumn<Long> typeNameOid = mysqlCreateFullTextTokenizerStatement.typeNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_tokenizer_statement.user_defined_dict_oid")
    public static final SqlColumn<Long> userDefinedDictOid = mysqlCreateFullTextTokenizerStatement.userDefinedDictOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_tokenizer_statement")
    public static final class MysqlCreateFullTextTokenizerStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> typeNameOid = column("`type_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> userDefinedDictOid = column("`user_defined_dict_oid`", JDBCType.BIGINT);

        public MysqlCreateFullTextTokenizerStatement() {
            super("mysql_create_full_text_tokenizer_statement");
        }
    }
}