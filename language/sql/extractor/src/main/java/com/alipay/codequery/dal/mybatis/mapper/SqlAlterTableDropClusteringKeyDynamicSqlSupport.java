package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableDropClusteringKeyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_clustering_key")
    public static final SqlAlterTableDropClusteringKey sqlAlterTableDropClusteringKey = new SqlAlterTableDropClusteringKey();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_clustering_key.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableDropClusteringKey.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_clustering_key.key_name_oid")
    public static final SqlColumn<Long> keyNameOid = sqlAlterTableDropClusteringKey.keyNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_clustering_key")
    public static final class SqlAlterTableDropClusteringKey extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> keyNameOid = column("`key_name_oid`", JDBCType.BIGINT);

        public SqlAlterTableDropClusteringKey() {
            super("sql_alter_table_drop_clustering_key");
        }
    }
}