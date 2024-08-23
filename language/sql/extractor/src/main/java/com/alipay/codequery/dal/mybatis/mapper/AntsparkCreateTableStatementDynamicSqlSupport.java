package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AntsparkCreateTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    public static final AntsparkCreateTableStatement antsparkCreateTableStatement = new AntsparkCreateTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: antspark_create_table_statement.oid")
    public static final SqlColumn<Long> oid = antsparkCreateTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: antspark_create_table_statement.datasource_oid")
    public static final SqlColumn<Long> datasourceOid = antsparkCreateTableStatement.datasourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: antspark_create_table_statement.meta_life_cycle_oid")
    public static final SqlColumn<Long> metaLifeCycleOid = antsparkCreateTableStatement.metaLifeCycleOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: antspark_create_table_statement.serde_properties")
    public static final SqlColumn<String> serdeProperties = antsparkCreateTableStatement.serdeProperties;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    public static final class AntsparkCreateTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> datasourceOid = column("`datasource_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> metaLifeCycleOid = column("`meta_life_cycle_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> serdeProperties = column("`serde_properties`", JDBCType.VARCHAR);

        public AntsparkCreateTableStatement() {
            super("antspark_create_table_statement");
        }
    }
}