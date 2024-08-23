package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlConstraintImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    public static final SqlConstraintImpl sqlConstraintImpl = new SqlConstraintImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.oid")
    public static final SqlColumn<Long> oid = sqlConstraintImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.comment_oid")
    public static final SqlColumn<Long> commentOid = sqlConstraintImpl.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.enable")
    public static final SqlColumn<Integer> enable = sqlConstraintImpl.enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.name_oid")
    public static final SqlColumn<Long> nameOid = sqlConstraintImpl.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.rely")
    public static final SqlColumn<Integer> rely = sqlConstraintImpl.rely;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.validate")
    public static final SqlColumn<Integer> validate = sqlConstraintImpl.validate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    public static final class SqlConstraintImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> enable = column("`enable`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> rely = column("`rely`", JDBCType.BIGINT);

        public final SqlColumn<Integer> validate = column("`validate`", JDBCType.BIGINT);

        public SqlConstraintImpl() {
            super("sql_constraint_impl");
        }
    }
}