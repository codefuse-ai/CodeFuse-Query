package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlColumnReferenceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    public static final SqlColumnReference sqlColumnReference = new SqlColumnReference();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.oid")
    public static final SqlColumn<Long> oid = sqlColumnReference.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.on_delete")
    public static final SqlColumn<String> onDelete = sqlColumnReference.onDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.on_update")
    public static final SqlColumn<String> onUpdate = sqlColumnReference.onUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.reference_match")
    public static final SqlColumn<String> referenceMatch = sqlColumnReference.referenceMatch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.table_oid")
    public static final SqlColumn<Long> tableOid = sqlColumnReference.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    public static final class SqlColumnReference extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> onDelete = column("`on_delete`", JDBCType.VARCHAR);

        public final SqlColumn<String> onUpdate = column("`on_update`", JDBCType.VARCHAR);

        public final SqlColumn<String> referenceMatch = column("`reference_match`", JDBCType.VARCHAR);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public SqlColumnReference() {
            super("sql_column_reference");
        }
    }
}