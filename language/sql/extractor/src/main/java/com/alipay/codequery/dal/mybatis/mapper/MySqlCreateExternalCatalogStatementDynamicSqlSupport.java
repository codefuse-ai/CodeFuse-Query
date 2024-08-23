package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlCreateExternalCatalogStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    public static final MySqlCreateExternalCatalogStatement mySqlCreateExternalCatalogStatement = new MySqlCreateExternalCatalogStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_external_catalog_statement.oid")
    public static final SqlColumn<Long> oid = mySqlCreateExternalCatalogStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_external_catalog_statement.comment_oid")
    public static final SqlColumn<Long> commentOid = mySqlCreateExternalCatalogStatement.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_external_catalog_statement.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = mySqlCreateExternalCatalogStatement.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_external_catalog_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlCreateExternalCatalogStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_external_catalog_statement.properties")
    public static final SqlColumn<String> properties = mySqlCreateExternalCatalogStatement.properties;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_external_catalog_statement")
    public static final class MySqlCreateExternalCatalogStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> properties = column("`properties`", JDBCType.VARCHAR);

        public MySqlCreateExternalCatalogStatement() {
            super("my_sql_create_external_catalog_statement");
        }
    }
}