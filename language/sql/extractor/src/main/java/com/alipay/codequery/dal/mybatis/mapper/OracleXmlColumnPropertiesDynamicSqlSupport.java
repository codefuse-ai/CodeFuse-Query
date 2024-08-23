package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleXmlColumnPropertiesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_xml_column_properties")
    public static final OracleXmlColumnProperties oracleXmlColumnProperties = new OracleXmlColumnProperties();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.oid")
    public static final SqlColumn<Long> oid = oracleXmlColumnProperties.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.allow_any_schema")
    public static final SqlColumn<Integer> allowAnySchema = oracleXmlColumnProperties.allowAnySchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.allow_non_schema")
    public static final SqlColumn<Integer> allowNonSchema = oracleXmlColumnProperties.allowNonSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.column_oid")
    public static final SqlColumn<Long> columnOid = oracleXmlColumnProperties.columnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.storage")
    public static final SqlColumn<String> storage = oracleXmlColumnProperties.storage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_xml_column_properties")
    public static final class OracleXmlColumnProperties extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> allowAnySchema = column("`allow_any_schema`", JDBCType.BIGINT);

        public final SqlColumn<Integer> allowNonSchema = column("`allow_non_schema`", JDBCType.BIGINT);

        public final SqlColumn<Long> columnOid = column("`column_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> storage = column("`storage`", JDBCType.VARCHAR);

        public OracleXmlColumnProperties() {
            super("oracle_xml_column_properties");
        }
    }
}