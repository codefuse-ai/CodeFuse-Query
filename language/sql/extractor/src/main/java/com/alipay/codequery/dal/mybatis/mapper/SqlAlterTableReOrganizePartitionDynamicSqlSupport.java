package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableReOrganizePartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_re_organize_partition")
    public static final SqlAlterTableReOrganizePartition sqlAlterTableReOrganizePartition = new SqlAlterTableReOrganizePartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_re_organize_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableReOrganizePartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_re_organize_partition")
    public static final class SqlAlterTableReOrganizePartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableReOrganizePartition() {
            super("sql_alter_table_re_organize_partition");
        }
    }
}