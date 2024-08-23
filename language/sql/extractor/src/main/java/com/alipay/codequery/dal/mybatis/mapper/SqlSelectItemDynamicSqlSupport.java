package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSelectItemDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    public static final SqlSelectItem sqlSelectItem = new SqlSelectItem();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.oid")
    public static final SqlColumn<Long> oid = sqlSelectItem.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.alias")
    public static final SqlColumn<String> alias = sqlSelectItem.alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.alias2")
    public static final SqlColumn<String> alias2 = sqlSelectItem.alias2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.alias_list")
    public static final SqlColumn<String> aliasList = sqlSelectItem.aliasList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlSelectItem.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.is_connect_by_root")
    public static final SqlColumn<Integer> isConnectByRoot = sqlSelectItem.isConnectByRoot;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.is_udtf_select_item")
    public static final SqlColumn<Integer> isUdtfSelectItem = sqlSelectItem.isUdtfSelectItem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    public static final class SqlSelectItem extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> alias = column("`alias`", JDBCType.VARCHAR);

        public final SqlColumn<String> alias2 = column("`alias2`", JDBCType.VARCHAR);

        public final SqlColumn<String> aliasList = column("`alias_list`", JDBCType.VARCHAR);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isConnectByRoot = column("`is_connect_by_root`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isUdtfSelectItem = column("`is_udtf_select_item`", JDBCType.BIGINT);

        public SqlSelectItem() {
            super("sql_select_item");
        }
    }
}