package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableModifyClusteredByDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_modify_clustered_by")
    public static final SqlAlterTableModifyClusteredBy sqlAlterTableModifyClusteredBy = new SqlAlterTableModifyClusteredBy();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_modify_clustered_by.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableModifyClusteredBy.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_modify_clustered_by")
    public static final class SqlAlterTableModifyClusteredBy extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableModifyClusteredBy() {
            super("sql_alter_table_modify_clustered_by");
        }
    }
}