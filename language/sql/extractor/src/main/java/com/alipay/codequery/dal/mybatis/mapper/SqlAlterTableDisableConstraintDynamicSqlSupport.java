package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableDisableConstraintDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    public static final SqlAlterTableDisableConstraint sqlAlterTableDisableConstraint = new SqlAlterTableDisableConstraint();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_disable_constraint.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableDisableConstraint.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_disable_constraint.constraint_name_oid")
    public static final SqlColumn<Long> constraintNameOid = sqlAlterTableDisableConstraint.constraintNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    public static final class SqlAlterTableDisableConstraint extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> constraintNameOid = column("`constraint_name_oid`", JDBCType.BIGINT);

        public SqlAlterTableDisableConstraint() {
            super("sql_alter_table_disable_constraint");
        }
    }
}