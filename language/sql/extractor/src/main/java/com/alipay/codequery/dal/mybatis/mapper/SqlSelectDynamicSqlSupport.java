package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSelectDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    public static final SqlSelect sqlSelect = new SqlSelect();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.oid")
    public static final SqlColumn<Long> oid = sqlSelect.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.first_query_block_oid")
    public static final SqlColumn<Long> firstQueryBlockOid = sqlSelect.firstQueryBlockOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.for_xml_options")
    public static final SqlColumn<String> forXmlOptions = sqlSelect.forXmlOptions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.for_xml_options_size")
    public static final SqlColumn<Integer> forXmlOptionsSize = sqlSelect.forXmlOptionsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.head_hint_oid")
    public static final SqlColumn<Long> headHintOid = sqlSelect.headHintOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.hints_size")
    public static final SqlColumn<Integer> hintsSize = sqlSelect.hintsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.is_for_browse")
    public static final SqlColumn<Integer> isForBrowse = sqlSelect.isForBrowse;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.is_simple")
    public static final SqlColumn<Integer> isSimple = sqlSelect.isSimple;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.limit_oid")
    public static final SqlColumn<Long> limitOid = sqlSelect.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.offset_oid")
    public static final SqlColumn<Long> offsetOid = sqlSelect.offsetOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.order_by_oid")
    public static final SqlColumn<Long> orderByOid = sqlSelect.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.query_oid")
    public static final SqlColumn<Long> queryOid = sqlSelect.queryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.query_block_oid")
    public static final SqlColumn<Long> queryBlockOid = sqlSelect.queryBlockOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.restriction")
    public static final SqlColumn<String> restriction = sqlSelect.restriction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.row_count_oid")
    public static final SqlColumn<Long> rowCountOid = sqlSelect.rowCountOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.with_sub_query_oid")
    public static final SqlColumn<Long> withSubQueryOid = sqlSelect.withSubQueryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.xml_path_oid")
    public static final SqlColumn<Long> xmlPathOid = sqlSelect.xmlPathOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    public static final class SqlSelect extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> firstQueryBlockOid = column("`first_query_block_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> forXmlOptions = column("`for_xml_options`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> forXmlOptionsSize = column("`for_xml_options_size`", JDBCType.BIGINT);

        public final SqlColumn<Long> headHintOid = column("`head_hint_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> hintsSize = column("`hints_size`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForBrowse = column("`is_for_browse`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSimple = column("`is_simple`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> offsetOid = column("`offset_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> queryOid = column("`query_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> queryBlockOid = column("`query_block_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> restriction = column("`restriction`", JDBCType.VARCHAR);

        public final SqlColumn<Long> rowCountOid = column("`row_count_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> withSubQueryOid = column("`with_sub_query_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> xmlPathOid = column("`xml_path_oid`", JDBCType.BIGINT);

        public SqlSelect() {
            super("sql_select");
        }
    }
}