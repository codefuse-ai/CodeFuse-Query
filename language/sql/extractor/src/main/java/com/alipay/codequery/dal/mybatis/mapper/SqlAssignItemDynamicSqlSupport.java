package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAssignItemDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_assign_item")
    public static final SqlAssignItem sqlAssignItem = new SqlAssignItem();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_assign_item.oid")
    public static final SqlColumn<Long> oid = sqlAssignItem.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_assign_item.target_oid")
    public static final SqlColumn<Long> targetOid = sqlAssignItem.targetOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_assign_item.value_oid")
    public static final SqlColumn<Long> valueOid = sqlAssignItem.valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_assign_item")
    public static final class SqlAssignItem extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> targetOid = column("`target_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> valueOid = column("`value_oid`", JDBCType.BIGINT);

        public SqlAssignItem() {
            super("sql_assign_item");
        }
    }
}