package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlUpdateSetItemDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_update_set_item")
    public static final SqlUpdateSetItem sqlUpdateSetItem = new SqlUpdateSetItem();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_set_item.oid")
    public static final SqlColumn<Long> oid = sqlUpdateSetItem.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_set_item.column_oid")
    public static final SqlColumn<Long> columnOid = sqlUpdateSetItem.columnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_update_set_item.value_oid")
    public static final SqlColumn<Long> valueOid = sqlUpdateSetItem.valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_update_set_item")
    public static final class SqlUpdateSetItem extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> columnOid = column("`column_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> valueOid = column("`value_oid`", JDBCType.BIGINT);

        public SqlUpdateSetItem() {
            super("sql_update_set_item");
        }
    }
}