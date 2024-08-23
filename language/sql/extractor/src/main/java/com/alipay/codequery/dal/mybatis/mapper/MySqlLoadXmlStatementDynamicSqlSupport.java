package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlLoadXmlStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    public static final MySqlLoadXmlStatement mySqlLoadXmlStatement = new MySqlLoadXmlStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.oid")
    public static final SqlColumn<Long> oid = mySqlLoadXmlStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.charset")
    public static final SqlColumn<String> charset = mySqlLoadXmlStatement.charset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.file_name_oid")
    public static final SqlColumn<Long> fileNameOid = mySqlLoadXmlStatement.fileNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.ignore_lines_number_oid")
    public static final SqlColumn<Long> ignoreLinesNumberOid = mySqlLoadXmlStatement.ignoreLinesNumberOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_concurrent")
    public static final SqlColumn<Integer> isConcurrent = mySqlLoadXmlStatement.isConcurrent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_ignore")
    public static final SqlColumn<Integer> isIgnore = mySqlLoadXmlStatement.isIgnore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_local")
    public static final SqlColumn<Integer> isLocal = mySqlLoadXmlStatement.isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_low_priority")
    public static final SqlColumn<Integer> isLowPriority = mySqlLoadXmlStatement.isLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_replicate")
    public static final SqlColumn<Integer> isReplicate = mySqlLoadXmlStatement.isReplicate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.rows_identified_by_oid")
    public static final SqlColumn<Long> rowsIdentifiedByOid = mySqlLoadXmlStatement.rowsIdentifiedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.table_name_oid")
    public static final SqlColumn<Long> tableNameOid = mySqlLoadXmlStatement.tableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    public static final class MySqlLoadXmlStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> charset = column("`charset`", JDBCType.VARCHAR);

        public final SqlColumn<Long> fileNameOid = column("`file_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> ignoreLinesNumberOid = column("`ignore_lines_number_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isConcurrent = column("`is_concurrent`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIgnore = column("`is_ignore`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLocal = column("`is_local`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLowPriority = column("`is_low_priority`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isReplicate = column("`is_replicate`", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsIdentifiedByOid = column("`rows_identified_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableNameOid = column("`table_name_oid`", JDBCType.BIGINT);

        public MySqlLoadXmlStatement() {
            super("my_sql_load_xml_statement");
        }
    }
}