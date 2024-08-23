package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleAlterSynonymStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_synonym_statement")
    public static final OracleAlterSynonymStatement oracleAlterSynonymStatement = new OracleAlterSynonymStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_synonym_statement.oid")
    public static final SqlColumn<Long> oid = oracleAlterSynonymStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_synonym_statement.enable")
    public static final SqlColumn<Integer> enable = oracleAlterSynonymStatement.enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_synonym_statement.is_compile")
    public static final SqlColumn<Integer> isCompile = oracleAlterSynonymStatement.isCompile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_synonym_statement.name_oid")
    public static final SqlColumn<Long> nameOid = oracleAlterSynonymStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_synonym_statement")
    public static final class OracleAlterSynonymStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> enable = column("`enable`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCompile = column("`is_compile`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public OracleAlterSynonymStatement() {
            super("oracle_alter_synonym_statement");
        }
    }
}