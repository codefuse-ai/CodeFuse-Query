package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDropDatabaseStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    public static final SqlDropDatabaseStatement sqlDropDatabaseStatement = new SqlDropDatabaseStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.oid")
    public static final SqlColumn<Long> oid = sqlDropDatabaseStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.database_oid")
    public static final SqlColumn<Long> databaseOid = sqlDropDatabaseStatement.databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.database_name")
    public static final SqlColumn<String> databaseName = sqlDropDatabaseStatement.databaseName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.is_cascade")
    public static final SqlColumn<Integer> isCascade = sqlDropDatabaseStatement.isCascade;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlDropDatabaseStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.is_physical")
    public static final SqlColumn<Integer> isPhysical = sqlDropDatabaseStatement.isPhysical;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.is_restrict")
    public static final SqlColumn<Integer> isRestrict = sqlDropDatabaseStatement.isRestrict;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlDropDatabaseStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.restrict")
    public static final SqlColumn<Integer> restrict = sqlDropDatabaseStatement.restrict;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.server")
    public static final SqlColumn<String> server = sqlDropDatabaseStatement.server;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    public static final class SqlDropDatabaseStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> databaseOid = column("`database_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> databaseName = column("`database_name`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isCascade = column("`is_cascade`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPhysical = column("`is_physical`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRestrict = column("`is_restrict`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> restrict = column("`restrict`", JDBCType.BIGINT);

        public final SqlColumn<String> server = column("`server`", JDBCType.VARCHAR);

        public SqlDropDatabaseStatement() {
            super("sql_drop_database_statement");
        }
    }
}