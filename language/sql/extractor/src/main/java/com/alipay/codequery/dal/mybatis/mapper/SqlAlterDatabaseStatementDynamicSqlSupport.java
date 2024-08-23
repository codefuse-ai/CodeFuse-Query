package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterDatabaseStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    public static final SqlAlterDatabaseStatement sqlAlterDatabaseStatement = new SqlAlterDatabaseStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.oid")
    public static final SqlColumn<Long> oid = sqlAlterDatabaseStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.character_oid")
    public static final SqlColumn<Long> characterOid = sqlAlterDatabaseStatement.characterOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.is_upgrade_data_directory_name")
    public static final SqlColumn<Integer> isUpgradeDataDirectoryName = sqlAlterDatabaseStatement.isUpgradeDataDirectoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.item_oid")
    public static final SqlColumn<Long> itemOid = sqlAlterDatabaseStatement.itemOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlAlterDatabaseStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    public static final class SqlAlterDatabaseStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> characterOid = column("`character_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isUpgradeDataDirectoryName = column("`is_upgrade_data_directory_name`", JDBCType.BIGINT);

        public final SqlColumn<Long> itemOid = column("`item_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlAlterDatabaseStatement() {
            super("sql_alter_database_statement");
        }
    }
}