package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MysqlAlterTableAlterCheckDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_table_alter_check")
    public static final MysqlAlterTableAlterCheck mysqlAlterTableAlterCheck = new MysqlAlterTableAlterCheck();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_alter_table_alter_check.oid")
    public static final SqlColumn<Long> oid = mysqlAlterTableAlterCheck.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_alter_table_alter_check.enforced")
    public static final SqlColumn<Integer> enforced = mysqlAlterTableAlterCheck.enforced;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_alter_table_alter_check.name_oid")
    public static final SqlColumn<Long> nameOid = mysqlAlterTableAlterCheck.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_alter_table_alter_check")
    public static final class MysqlAlterTableAlterCheck extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> enforced = column("`enforced`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public MysqlAlterTableAlterCheck() {
            super("mysql_alter_table_alter_check");
        }
    }
}