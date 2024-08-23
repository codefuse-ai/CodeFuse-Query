package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterViewRenameStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_rename_statement")
    public static final SqlAlterViewRenameStatement sqlAlterViewRenameStatement = new SqlAlterViewRenameStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_rename_statement.oid")
    public static final SqlColumn<Long> oid = sqlAlterViewRenameStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_rename_statement.change_owner_to_oid")
    public static final SqlColumn<Long> changeOwnerToOid = sqlAlterViewRenameStatement.changeOwnerToOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_rename_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlAlterViewRenameStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_rename_statement.to_oid")
    public static final SqlColumn<Long> toOid = sqlAlterViewRenameStatement.toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_rename_statement")
    public static final class SqlAlterViewRenameStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> changeOwnerToOid = column("`change_owner_to_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toOid = column("`to_oid`", JDBCType.BIGINT);

        public SqlAlterViewRenameStatement() {
            super("sql_alter_view_rename_statement");
        }
    }
}