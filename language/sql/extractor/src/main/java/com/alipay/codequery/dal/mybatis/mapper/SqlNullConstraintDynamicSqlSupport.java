package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlNullConstraintDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_null_constraint")
    public static final SqlNullConstraint sqlNullConstraint = new SqlNullConstraint();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_null_constraint.oid")
    public static final SqlColumn<Long> oid = sqlNullConstraint.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_null_constraint")
    public static final class SqlNullConstraint extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlNullConstraint() {
            super("sql_null_constraint");
        }
    }
}