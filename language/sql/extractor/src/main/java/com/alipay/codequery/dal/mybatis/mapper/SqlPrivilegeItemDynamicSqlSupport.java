package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlPrivilegeItemDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_privilege_item")
    public static final SqlPrivilegeItem sqlPrivilegeItem = new SqlPrivilegeItem();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_privilege_item.oid")
    public static final SqlColumn<Long> oid = sqlPrivilegeItem.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_privilege_item.action_oid")
    public static final SqlColumn<Long> actionOid = sqlPrivilegeItem.actionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_privilege_item")
    public static final class SqlPrivilegeItem extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> actionOid = column("`action_oid`", JDBCType.BIGINT);

        public SqlPrivilegeItem() {
            super("sql_privilege_item");
        }
    }
}