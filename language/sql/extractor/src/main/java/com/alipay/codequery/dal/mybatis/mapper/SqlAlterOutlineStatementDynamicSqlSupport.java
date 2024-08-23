package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterOutlineStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_outline_statement")
    public static final SqlAlterOutlineStatement sqlAlterOutlineStatement = new SqlAlterOutlineStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_outline_statement.oid")
    public static final SqlColumn<Long> oid = sqlAlterOutlineStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_outline_statement.is_disable")
    public static final SqlColumn<Integer> isDisable = sqlAlterOutlineStatement.isDisable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_outline_statement.is_enable")
    public static final SqlColumn<Integer> isEnable = sqlAlterOutlineStatement.isEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_outline_statement.is_resync")
    public static final SqlColumn<Integer> isResync = sqlAlterOutlineStatement.isResync;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_outline_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlAlterOutlineStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_outline_statement")
    public static final class SqlAlterOutlineStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDisable = column("`is_disable`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isEnable = column("`is_enable`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isResync = column("`is_resync`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlAlterOutlineStatement() {
            super("sql_alter_outline_statement");
        }
    }
}