package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableAddClusteringKeyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_clustering_key")
    public static final SqlAlterTableAddClusteringKey sqlAlterTableAddClusteringKey = new SqlAlterTableAddClusteringKey();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_clustering_key.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableAddClusteringKey.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_clustering_key.name_oid")
    public static final SqlColumn<Long> nameOid = sqlAlterTableAddClusteringKey.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_clustering_key")
    public static final class SqlAlterTableAddClusteringKey extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlAlterTableAddClusteringKey() {
            super("sql_alter_table_add_clustering_key");
        }
    }
}