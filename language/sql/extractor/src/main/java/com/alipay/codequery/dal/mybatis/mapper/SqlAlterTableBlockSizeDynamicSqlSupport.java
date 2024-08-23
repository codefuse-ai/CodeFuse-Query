package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableBlockSizeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_block_size")
    public static final SqlAlterTableBlockSize sqlAlterTableBlockSize = new SqlAlterTableBlockSize();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_block_size.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableBlockSize.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_block_size.size_oid")
    public static final SqlColumn<Long> sizeOid = sqlAlterTableBlockSize.sizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_block_size")
    public static final class SqlAlterTableBlockSize extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> sizeOid = column("`size_oid`", JDBCType.BIGINT);

        public SqlAlterTableBlockSize() {
            super("sql_alter_table_block_size");
        }
    }
}