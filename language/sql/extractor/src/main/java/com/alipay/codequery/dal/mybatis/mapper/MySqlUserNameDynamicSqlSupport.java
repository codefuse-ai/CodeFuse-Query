package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlUserNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    public static final MySqlUserName mySqlUserName = new MySqlUserName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.oid")
    public static final SqlColumn<Long> oid = mySqlUserName.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.host")
    public static final SqlColumn<String> host = mySqlUserName.host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.identified_by")
    public static final SqlColumn<String> identifiedBy = mySqlUserName.identifiedBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.normalize_user_name")
    public static final SqlColumn<String> normalizeUserName = mySqlUserName.normalizeUserName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.resolved_column_oid")
    public static final SqlColumn<Long> resolvedColumnOid = mySqlUserName.resolvedColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.simple_name")
    public static final SqlColumn<String> simpleName = mySqlUserName.simpleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.user_name")
    public static final SqlColumn<String> userName = mySqlUserName.userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    public static final class MySqlUserName extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> host = column("`host`", JDBCType.VARCHAR);

        public final SqlColumn<String> identifiedBy = column("`identified_by`", JDBCType.VARCHAR);

        public final SqlColumn<String> normalizeUserName = column("`normalize_user_name`", JDBCType.VARCHAR);

        public final SqlColumn<Long> resolvedColumnOid = column("`resolved_column_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> simpleName = column("`simple_name`", JDBCType.VARCHAR);

        public final SqlColumn<String> userName = column("`user_name`", JDBCType.VARCHAR);

        public MySqlUserName() {
            super("my_sql_user_name");
        }
    }
}