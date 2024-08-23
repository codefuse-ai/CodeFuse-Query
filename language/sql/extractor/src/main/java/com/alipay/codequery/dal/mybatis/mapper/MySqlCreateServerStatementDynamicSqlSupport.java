package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlCreateServerStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    public static final MySqlCreateServerStatement mySqlCreateServerStatement = new MySqlCreateServerStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.oid")
    public static final SqlColumn<Long> oid = mySqlCreateServerStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.database_oid")
    public static final SqlColumn<Long> databaseOid = mySqlCreateServerStatement.databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.foreign_data_wrapper_oid")
    public static final SqlColumn<Long> foreignDataWrapperOid = mySqlCreateServerStatement.foreignDataWrapperOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.host_oid")
    public static final SqlColumn<Long> hostOid = mySqlCreateServerStatement.hostOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlCreateServerStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.owner_oid")
    public static final SqlColumn<Long> ownerOid = mySqlCreateServerStatement.ownerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.password_oid")
    public static final SqlColumn<Long> passwordOid = mySqlCreateServerStatement.passwordOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.port_oid")
    public static final SqlColumn<Long> portOid = mySqlCreateServerStatement.portOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.socket_oid")
    public static final SqlColumn<Long> socketOid = mySqlCreateServerStatement.socketOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.user_oid")
    public static final SqlColumn<Long> userOid = mySqlCreateServerStatement.userOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    public static final class MySqlCreateServerStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> databaseOid = column("`database_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> foreignDataWrapperOid = column("`foreign_data_wrapper_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> hostOid = column("`host_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> ownerOid = column("`owner_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> passwordOid = column("`password_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> portOid = column("`port_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> socketOid = column("`socket_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> userOid = column("`user_oid`", JDBCType.BIGINT);

        public MySqlCreateServerStatement() {
            super("my_sql_create_server_statement");
        }
    }
}