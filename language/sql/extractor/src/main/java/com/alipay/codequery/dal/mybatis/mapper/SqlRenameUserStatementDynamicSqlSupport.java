package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlRenameUserStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_rename_user_statement")
    public static final SqlRenameUserStatement sqlRenameUserStatement = new SqlRenameUserStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rename_user_statement.oid")
    public static final SqlColumn<Long> oid = sqlRenameUserStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rename_user_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlRenameUserStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rename_user_statement.to_oid")
    public static final SqlColumn<Long> toOid = sqlRenameUserStatement.toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_rename_user_statement")
    public static final class SqlRenameUserStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toOid = column("`to_oid`", JDBCType.BIGINT);

        public SqlRenameUserStatement() {
            super("sql_rename_user_statement");
        }
    }
}