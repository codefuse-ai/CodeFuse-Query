package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableSetLocationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_set_location")
    public static final SqlAlterTableSetLocation sqlAlterTableSetLocation = new SqlAlterTableSetLocation();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_set_location.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableSetLocation.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_set_location.location_oid")
    public static final SqlColumn<Long> locationOid = sqlAlterTableSetLocation.locationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_set_location")
    public static final class SqlAlterTableSetLocation extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> locationOid = column("`location_oid`", JDBCType.BIGINT);

        public SqlAlterTableSetLocation() {
            super("sql_alter_table_set_location");
        }
    }
}