package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDropSynonymStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    public static final SqlDropSynonymStatement sqlDropSynonymStatement = new SqlDropSynonymStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_synonym_statement.oid")
    public static final SqlColumn<Long> oid = sqlDropSynonymStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_synonym_statement.is_force")
    public static final SqlColumn<Integer> isForce = sqlDropSynonymStatement.isForce;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_synonym_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlDropSynonymStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_synonym_statement.is_public")
    public static final SqlColumn<Integer> isPublic = sqlDropSynonymStatement.isPublic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_synonym_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlDropSynonymStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_synonym_statement.schema")
    public static final SqlColumn<String> schema = sqlDropSynonymStatement.schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_synonym_statement")
    public static final class SqlDropSynonymStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForce = column("`is_force`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPublic = column("`is_public`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> schema = column("`schema`", JDBCType.VARCHAR);

        public SqlDropSynonymStatement() {
            super("sql_drop_synonym_statement");
        }
    }
}