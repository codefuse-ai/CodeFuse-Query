package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDropCatalogStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_catalog_statement")
    public static final SqlDropCatalogStatement sqlDropCatalogStatement = new SqlDropCatalogStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_catalog_statement.oid")
    public static final SqlColumn<Long> oid = sqlDropCatalogStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_catalog_statement.is_external")
    public static final SqlColumn<Integer> isExternal = sqlDropCatalogStatement.isExternal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_catalog_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlDropCatalogStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_catalog_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlDropCatalogStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_catalog_statement")
    public static final class SqlDropCatalogStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isExternal = column("`is_external`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlDropCatalogStatement() {
            super("sql_drop_catalog_statement");
        }
    }
}