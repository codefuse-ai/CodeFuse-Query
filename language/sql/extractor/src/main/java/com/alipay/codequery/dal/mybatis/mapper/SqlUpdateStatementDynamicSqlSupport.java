package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlUpdateStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_update_statement")
    public static final SqlUpdateStatement sqlUpdateStatement = new SqlUpdateStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.oid")
    public static final SqlColumn<Long> oid = sqlUpdateStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.from_oid")
    public static final SqlColumn<Long> fromOid = sqlUpdateStatement.fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.order_by_oid")
    public static final SqlColumn<Long> orderByOid = sqlUpdateStatement.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.table_name_oid")
    public static final SqlColumn<Long> tableNameOid = sqlUpdateStatement.tableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.table_source_oid")
    public static final SqlColumn<Long> tableSourceOid = sqlUpdateStatement.tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.where_oid")
    public static final SqlColumn<Long> whereOid = sqlUpdateStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_statement.with_oid")
    public static final SqlColumn<Long> withOid = sqlUpdateStatement.withOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_update_statement")
    public static final class SqlUpdateStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromOid = column("`from_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableNameOid = column("`table_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableSourceOid = column("`table_source_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> withOid = column("`with_oid`", JDBCType.BIGINT);

        public SqlUpdateStatement() {
            super("sql_update_statement");
        }
    }
}