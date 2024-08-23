package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsDeclareVariableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    public static final OdpsDeclareVariableStatement odpsDeclareVariableStatement = new OdpsDeclareVariableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_declare_variable_statement.oid")
    public static final SqlColumn<Long> oid = odpsDeclareVariableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_declare_variable_statement.data_type_oid")
    public static final SqlColumn<Long> dataTypeOid = odpsDeclareVariableStatement.dataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_declare_variable_statement.init_value_oid")
    public static final SqlColumn<Long> initValueOid = odpsDeclareVariableStatement.initValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_declare_variable_statement.variant")
    public static final SqlColumn<String> variant = odpsDeclareVariableStatement.variant;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    public static final class OdpsDeclareVariableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dataTypeOid = column("`data_type_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> initValueOid = column("`init_value_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> variant = column("`variant`", JDBCType.VARCHAR);

        public OdpsDeclareVariableStatement() {
            super("odps_declare_variable_statement");
        }
    }
}