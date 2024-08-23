package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableDeleteByConditionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_delete_by_condition")
    public static final SqlAlterTableDeleteByCondition sqlAlterTableDeleteByCondition = new SqlAlterTableDeleteByCondition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_delete_by_condition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableDeleteByCondition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_delete_by_condition.where_oid")
    public static final SqlColumn<Long> whereOid = sqlAlterTableDeleteByCondition.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_delete_by_condition")
    public static final class SqlAlterTableDeleteByCondition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public SqlAlterTableDeleteByCondition() {
            super("sql_alter_table_delete_by_condition");
        }
    }
}