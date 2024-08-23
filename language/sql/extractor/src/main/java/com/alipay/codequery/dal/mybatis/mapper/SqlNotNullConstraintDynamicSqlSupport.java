package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlNotNullConstraintDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_not_null_constraint")
    public static final SqlNotNullConstraint sqlNotNullConstraint = new SqlNotNullConstraint();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_not_null_constraint.oid")
    public static final SqlColumn<Long> oid = sqlNotNullConstraint.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_not_null_constraint")
    public static final class SqlNotNullConstraint extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlNotNullConstraint() {
            super("sql_not_null_constraint");
        }
    }
}