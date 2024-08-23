package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableEnableConstraintDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_constraint")
    public static final SqlAlterTableEnableConstraint sqlAlterTableEnableConstraint = new SqlAlterTableEnableConstraint();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_enable_constraint.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableEnableConstraint.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_enable_constraint.constraint_name_oid")
    public static final SqlColumn<Long> constraintNameOid = sqlAlterTableEnableConstraint.constraintNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_constraint")
    public static final class SqlAlterTableEnableConstraint extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> constraintNameOid = column("`constraint_name_oid`", JDBCType.BIGINT);

        public SqlAlterTableEnableConstraint() {
            super("sql_alter_table_enable_constraint");
        }
    }
}