package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableDropConstraintDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_constraint")
    public static final SqlAlterTableDropConstraint sqlAlterTableDropConstraint = new SqlAlterTableDropConstraint();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_constraint.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableDropConstraint.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_constraint.constraint_name_oid")
    public static final SqlColumn<Long> constraintNameOid = sqlAlterTableDropConstraint.constraintNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_constraint.is_cascade")
    public static final SqlColumn<Integer> isCascade = sqlAlterTableDropConstraint.isCascade;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_constraint.is_restrict")
    public static final SqlColumn<Integer> isRestrict = sqlAlterTableDropConstraint.isRestrict;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_constraint")
    public static final class SqlAlterTableDropConstraint extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> constraintNameOid = column("`constraint_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCascade = column("`is_cascade`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRestrict = column("`is_restrict`", JDBCType.BIGINT);

        public SqlAlterTableDropConstraint() {
            super("sql_alter_table_drop_constraint");
        }
    }
}