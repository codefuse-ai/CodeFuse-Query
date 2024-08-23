package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleCreateSynonymStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    public static final OracleCreateSynonymStatement oracleCreateSynonymStatement = new OracleCreateSynonymStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_synonym_statement.oid")
    public static final SqlColumn<Long> oid = oracleCreateSynonymStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_synonym_statement.is_or_replace")
    public static final SqlColumn<Integer> isOrReplace = oracleCreateSynonymStatement.isOrReplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_synonym_statement.is_public")
    public static final SqlColumn<Integer> isPublic = oracleCreateSynonymStatement.isPublic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_synonym_statement.name_oid")
    public static final SqlColumn<Long> nameOid = oracleCreateSynonymStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_synonym_statement.object_oid")
    public static final SqlColumn<Long> objectOid = oracleCreateSynonymStatement.objectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_synonym_statement")
    public static final class OracleCreateSynonymStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOrReplace = column("`is_or_replace`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPublic = column("`is_public`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> objectOid = column("`object_oid`", JDBCType.BIGINT);

        public OracleCreateSynonymStatement() {
            super("oracle_create_synonym_statement");
        }
    }
}