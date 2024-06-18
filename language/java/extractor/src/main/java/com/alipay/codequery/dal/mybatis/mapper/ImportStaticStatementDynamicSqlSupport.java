package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ImportStaticStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: import_static_statement")
    public static final ImportStaticStatement importStaticStatement = new ImportStaticStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: import_static_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = importStaticStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: import_static_statement.reference_hash_id")
    public static final SqlColumn<Long> referenceHashId = importStaticStatement.referenceHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: import_static_statement.name")
    public static final SqlColumn<String> name = importStaticStatement.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: import_static_statement.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = importStaticStatement.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: import_static_statement.location_hash_id")
    public static final SqlColumn<Long> locationHashId = importStaticStatement.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: import_static_statement")
    public static final class ImportStaticStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> referenceHashId = column("reference_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public ImportStaticStatement() {
            super("import_static_statement");
        }
    }
}