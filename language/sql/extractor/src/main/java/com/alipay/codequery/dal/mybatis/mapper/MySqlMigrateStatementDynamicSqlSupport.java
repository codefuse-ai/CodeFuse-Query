package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlMigrateStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    public static final MySqlMigrateStatement mySqlMigrateStatement = new MySqlMigrateStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.oid")
    public static final SqlColumn<Long> oid = mySqlMigrateStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.from_ins_id_oid")
    public static final SqlColumn<Long> fromInsIdOid = mySqlMigrateStatement.fromInsIdOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.from_ins_ip_oid")
    public static final SqlColumn<Long> fromInsIpOid = mySqlMigrateStatement.fromInsIpOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.from_ins_port_oid")
    public static final SqlColumn<Long> fromInsPortOid = mySqlMigrateStatement.fromInsPortOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.from_ins_status_oid")
    public static final SqlColumn<Long> fromInsStatusOid = mySqlMigrateStatement.fromInsStatusOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.migrate_type_oid")
    public static final SqlColumn<Long> migrateTypeOid = mySqlMigrateStatement.migrateTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.schema_oid")
    public static final SqlColumn<Long> schemaOid = mySqlMigrateStatement.schemaOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.shard_names_oid")
    public static final SqlColumn<Long> shardNamesOid = mySqlMigrateStatement.shardNamesOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.to_ins_id_oid")
    public static final SqlColumn<Long> toInsIdOid = mySqlMigrateStatement.toInsIdOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.to_ins_ip_oid")
    public static final SqlColumn<Long> toInsIpOid = mySqlMigrateStatement.toInsIpOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.to_ins_port_oid")
    public static final SqlColumn<Long> toInsPortOid = mySqlMigrateStatement.toInsPortOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_migrate_statement.to_ins_status_oid")
    public static final SqlColumn<Long> toInsStatusOid = mySqlMigrateStatement.toInsStatusOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_migrate_statement")
    public static final class MySqlMigrateStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromInsIdOid = column("`from_ins_id_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromInsIpOid = column("`from_ins_ip_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromInsPortOid = column("`from_ins_port_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromInsStatusOid = column("`from_ins_status_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> migrateTypeOid = column("`migrate_type_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> schemaOid = column("`schema_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> shardNamesOid = column("`shard_names_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toInsIdOid = column("`to_ins_id_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toInsIpOid = column("`to_ins_ip_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toInsPortOid = column("`to_ins_port_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toInsStatusOid = column("`to_ins_status_oid`", JDBCType.BIGINT);

        public MySqlMigrateStatement() {
            super("my_sql_migrate_statement");
        }
    }
}