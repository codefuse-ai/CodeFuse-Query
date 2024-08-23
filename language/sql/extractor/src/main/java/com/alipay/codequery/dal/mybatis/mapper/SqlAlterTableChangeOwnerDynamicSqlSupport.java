package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableChangeOwnerDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    public static final SqlAlterTableChangeOwner sqlAlterTableChangeOwner = new SqlAlterTableChangeOwner();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_change_owner.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableChangeOwner.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_change_owner.owner_oid")
    public static final SqlColumn<Long> ownerOid = sqlAlterTableChangeOwner.ownerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_change_owner")
    public static final class SqlAlterTableChangeOwner extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> ownerOid = column("`owner_oid`", JDBCType.BIGINT);

        public SqlAlterTableChangeOwner() {
            super("sql_alter_table_change_owner");
        }
    }
}