package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCreateOutlineStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_outline_statement")
    public static final SqlCreateOutlineStatement sqlCreateOutlineStatement = new SqlCreateOutlineStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_outline_statement.oid")
    public static final SqlColumn<Long> oid = sqlCreateOutlineStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_outline_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlCreateOutlineStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_outline_statement.on_oid")
    public static final SqlColumn<Long> onOid = sqlCreateOutlineStatement.onOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_outline_statement.to_oid")
    public static final SqlColumn<Long> toOid = sqlCreateOutlineStatement.toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_outline_statement.where_oid")
    public static final SqlColumn<Long> whereOid = sqlCreateOutlineStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_outline_statement")
    public static final class SqlCreateOutlineStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> onOid = column("`on_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toOid = column("`to_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public SqlCreateOutlineStatement() {
            super("sql_create_outline_statement");
        }
    }
}