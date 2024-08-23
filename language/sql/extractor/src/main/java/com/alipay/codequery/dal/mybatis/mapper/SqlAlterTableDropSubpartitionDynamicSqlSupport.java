package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableDropSubpartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_subpartition")
    public static final SqlAlterTableDropSubpartition sqlAlterTableDropSubpartition = new SqlAlterTableDropSubpartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_subpartition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableDropSubpartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_subpartition")
    public static final class SqlAlterTableDropSubpartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableDropSubpartition() {
            super("sql_alter_table_drop_subpartition");
        }
    }
}