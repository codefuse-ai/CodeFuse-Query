package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableSubpartitionLifecycleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_subpartition_lifecycle")
    public static final SqlAlterTableSubpartitionLifecycle sqlAlterTableSubpartitionLifecycle = new SqlAlterTableSubpartitionLifecycle();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_subpartition_lifecycle.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableSubpartitionLifecycle.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_subpartition_lifecycle")
    public static final class SqlAlterTableSubpartitionLifecycle extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableSubpartitionLifecycle() {
            super("sql_alter_table_subpartition_lifecycle");
        }
    }
}