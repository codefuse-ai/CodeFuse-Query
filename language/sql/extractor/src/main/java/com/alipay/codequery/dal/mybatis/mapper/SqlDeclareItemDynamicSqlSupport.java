package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDeclareItemDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_declare_item")
    public static final SqlDeclareItem sqlDeclareItem = new SqlDeclareItem();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_declare_item.oid")
    public static final SqlColumn<Long> oid = sqlDeclareItem.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_declare_item.data_type_oid")
    public static final SqlColumn<Long> dataTypeOid = sqlDeclareItem.dataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_declare_item.name_oid")
    public static final SqlColumn<Long> nameOid = sqlDeclareItem.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_declare_item.resolved_object")
    public static final SqlColumn<String> resolvedObject = sqlDeclareItem.resolvedObject;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_declare_item.type")
    public static final SqlColumn<String> type = sqlDeclareItem.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_declare_item.value_oid")
    public static final SqlColumn<Long> valueOid = sqlDeclareItem.valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_declare_item")
    public static final class SqlDeclareItem extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dataTypeOid = column("`data_type_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> resolvedObject = column("`resolved_object`", JDBCType.VARCHAR);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public final SqlColumn<Long> valueOid = column("`value_oid`", JDBCType.BIGINT);

        public SqlDeclareItem() {
            super("sql_declare_item");
        }
    }
}