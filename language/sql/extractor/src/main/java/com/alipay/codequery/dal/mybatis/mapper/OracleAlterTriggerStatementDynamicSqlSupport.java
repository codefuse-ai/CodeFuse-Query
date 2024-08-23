package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleAlterTriggerStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    public static final OracleAlterTriggerStatement oracleAlterTriggerStatement = new OracleAlterTriggerStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_trigger_statement.oid")
    public static final SqlColumn<Long> oid = oracleAlterTriggerStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_trigger_statement.enable")
    public static final SqlColumn<Integer> enable = oracleAlterTriggerStatement.enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_trigger_statement.is_compile")
    public static final SqlColumn<Integer> isCompile = oracleAlterTriggerStatement.isCompile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_trigger_statement.name_oid")
    public static final SqlColumn<Long> nameOid = oracleAlterTriggerStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_trigger_statement")
    public static final class OracleAlterTriggerStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> enable = column("`enable`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCompile = column("`is_compile`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public OracleAlterTriggerStatement() {
            super("oracle_alter_trigger_statement");
        }
    }
}