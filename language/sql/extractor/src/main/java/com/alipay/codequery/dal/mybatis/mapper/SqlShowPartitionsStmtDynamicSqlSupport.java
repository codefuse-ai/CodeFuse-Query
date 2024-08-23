package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowPartitionsStmtDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    public static final SqlShowPartitionsStmt sqlShowPartitionsStmt = new SqlShowPartitionsStmt();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_partitions_stmt.oid")
    public static final SqlColumn<Long> oid = sqlShowPartitionsStmt.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_partitions_stmt.table_source_oid")
    public static final SqlColumn<Long> tableSourceOid = sqlShowPartitionsStmt.tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_partitions_stmt.where_oid")
    public static final SqlColumn<Long> whereOid = sqlShowPartitionsStmt.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_partitions_stmt")
    public static final class SqlShowPartitionsStmt extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableSourceOid = column("`table_source_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public SqlShowPartitionsStmt() {
            super("sql_show_partitions_stmt");
        }
    }
}