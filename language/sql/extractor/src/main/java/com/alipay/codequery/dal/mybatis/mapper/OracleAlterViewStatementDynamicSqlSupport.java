package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleAlterViewStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_view_statement")
    public static final OracleAlterViewStatement oracleAlterViewStatement = new OracleAlterViewStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_view_statement.oid")
    public static final SqlColumn<Long> oid = oracleAlterViewStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_view_statement.enable")
    public static final SqlColumn<Integer> enable = oracleAlterViewStatement.enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_view_statement.is_compile")
    public static final SqlColumn<Integer> isCompile = oracleAlterViewStatement.isCompile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_view_statement.name_oid")
    public static final SqlColumn<Long> nameOid = oracleAlterViewStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_view_statement")
    public static final class OracleAlterViewStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> enable = column("`enable`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCompile = column("`is_compile`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public OracleAlterViewStatement() {
            super("oracle_alter_view_statement");
        }
    }
}