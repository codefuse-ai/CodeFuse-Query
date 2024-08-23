package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDropTableSpaceStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_space_statement")
    public static final SqlDropTableSpaceStatement sqlDropTableSpaceStatement = new SqlDropTableSpaceStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_space_statement.oid")
    public static final SqlColumn<Long> oid = sqlDropTableSpaceStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_space_statement.engine_oid")
    public static final SqlColumn<Long> engineOid = sqlDropTableSpaceStatement.engineOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_space_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlDropTableSpaceStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_space_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlDropTableSpaceStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_table_space_statement.table_space_name")
    public static final SqlColumn<String> tableSpaceName = sqlDropTableSpaceStatement.tableSpaceName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_table_space_statement")
    public static final class SqlDropTableSpaceStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> engineOid = column("`engine_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> tableSpaceName = column("`table_space_name`", JDBCType.VARCHAR);

        public SqlDropTableSpaceStatement() {
            super("sql_drop_table_space_statement");
        }
    }
}