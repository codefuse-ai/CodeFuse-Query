package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableAddConstraintDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_constraint")
    public static final SqlAlterTableAddConstraint sqlAlterTableAddConstraint = new SqlAlterTableAddConstraint();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_constraint.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableAddConstraint.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_constraint.constraint_oid")
    public static final SqlColumn<Long> constraintOid = sqlAlterTableAddConstraint.constraintOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_constraint.is_with_no_check")
    public static final SqlColumn<Integer> isWithNoCheck = sqlAlterTableAddConstraint.isWithNoCheck;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_constraint")
    public static final class SqlAlterTableAddConstraint extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> constraintOid = column("`constraint_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithNoCheck = column("`is_with_no_check`", JDBCType.BIGINT);

        public SqlAlterTableAddConstraint() {
            super("sql_alter_table_add_constraint");
        }
    }
}