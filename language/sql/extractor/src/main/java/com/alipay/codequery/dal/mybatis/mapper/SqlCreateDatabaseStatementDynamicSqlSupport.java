package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCreateDatabaseStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    public static final SqlCreateDatabaseStatement sqlCreateDatabaseStatement = new SqlCreateDatabaseStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.oid")
    public static final SqlColumn<Long> oid = sqlCreateDatabaseStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.character_set")
    public static final SqlColumn<String> characterSet = sqlCreateDatabaseStatement.characterSet;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.collate")
    public static final SqlColumn<String> collate = sqlCreateDatabaseStatement.collate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.comment_oid")
    public static final SqlColumn<Long> commentOid = sqlCreateDatabaseStatement.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.database_name")
    public static final SqlColumn<String> databaseName = sqlCreateDatabaseStatement.databaseName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = sqlCreateDatabaseStatement.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.is_physical")
    public static final SqlColumn<Integer> isPhysical = sqlCreateDatabaseStatement.isPhysical;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.location_oid")
    public static final SqlColumn<Long> locationOid = sqlCreateDatabaseStatement.locationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlCreateDatabaseStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.options")
    public static final SqlColumn<String> options = sqlCreateDatabaseStatement.options;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.password_oid")
    public static final SqlColumn<Long> passwordOid = sqlCreateDatabaseStatement.passwordOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.server")
    public static final SqlColumn<String> server = sqlCreateDatabaseStatement.server;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.stored_as_oid")
    public static final SqlColumn<Long> storedAsOid = sqlCreateDatabaseStatement.storedAsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.stored_by")
    public static final SqlColumn<String> storedBy = sqlCreateDatabaseStatement.storedBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.stored_in_oid")
    public static final SqlColumn<Long> storedInOid = sqlCreateDatabaseStatement.storedInOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.user")
    public static final SqlColumn<String> user = sqlCreateDatabaseStatement.user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    public static final class SqlCreateDatabaseStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> characterSet = column("`character_set`", JDBCType.VARCHAR);

        public final SqlColumn<String> collate = column("`collate`", JDBCType.VARCHAR);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> databaseName = column("`database_name`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPhysical = column("`is_physical`", JDBCType.BIGINT);

        public final SqlColumn<Long> locationOid = column("`location_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> options = column("`options`", JDBCType.VARCHAR);

        public final SqlColumn<Long> passwordOid = column("`password_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> server = column("`server`", JDBCType.VARCHAR);

        public final SqlColumn<Long> storedAsOid = column("`stored_as_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> storedBy = column("`stored_by`", JDBCType.VARCHAR);

        public final SqlColumn<Long> storedInOid = column("`stored_in_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> user = column("`user`", JDBCType.VARCHAR);

        public SqlCreateDatabaseStatement() {
            super("sql_create_database_statement");
        }
    }
}