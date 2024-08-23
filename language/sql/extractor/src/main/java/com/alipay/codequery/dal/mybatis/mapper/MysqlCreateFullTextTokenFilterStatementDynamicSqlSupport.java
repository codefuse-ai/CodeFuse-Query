package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MysqlCreateFullTextTokenFilterStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_token_filter_statement")
    public static final MysqlCreateFullTextTokenFilterStatement mysqlCreateFullTextTokenFilterStatement = new MysqlCreateFullTextTokenFilterStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_token_filter_statement.oid")
    public static final SqlColumn<Long> oid = mysqlCreateFullTextTokenFilterStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_token_filter_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mysqlCreateFullTextTokenFilterStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_create_full_text_token_filter_statement.type_name_oid")
    public static final SqlColumn<Long> typeNameOid = mysqlCreateFullTextTokenFilterStatement.typeNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_create_full_text_token_filter_statement")
    public static final class MysqlCreateFullTextTokenFilterStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> typeNameOid = column("`type_name_oid`", JDBCType.BIGINT);

        public MysqlCreateFullTextTokenFilterStatement() {
            super("mysql_create_full_text_token_filter_statement");
        }
    }
}