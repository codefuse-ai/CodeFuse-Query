package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlIndexOptionsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    public static final SqlIndexOptions sqlIndexOptions = new SqlIndexOptions();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.oid")
    public static final SqlColumn<Long> oid = sqlIndexOptions.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.algorithm")
    public static final SqlColumn<String> algorithm = sqlIndexOptions.algorithm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.comment_oid")
    public static final SqlColumn<Long> commentOid = sqlIndexOptions.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.index_type")
    public static final SqlColumn<String> indexType = sqlIndexOptions.indexType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.is_global")
    public static final SqlColumn<Integer> isGlobal = sqlIndexOptions.isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.is_invisible")
    public static final SqlColumn<Integer> isInvisible = sqlIndexOptions.isInvisible;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.is_local")
    public static final SqlColumn<Integer> isLocal = sqlIndexOptions.isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.is_visible")
    public static final SqlColumn<Integer> isVisible = sqlIndexOptions.isVisible;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.key_block_size_oid")
    public static final SqlColumn<Long> keyBlockSizeOid = sqlIndexOptions.keyBlockSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.lock")
    public static final SqlColumn<String> lock = sqlIndexOptions.lock;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_index_options.parser_name")
    public static final SqlColumn<String> parserName = sqlIndexOptions.parserName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_index_options")
    public static final class SqlIndexOptions extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> algorithm = column("`algorithm`", JDBCType.VARCHAR);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> indexType = column("`index_type`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isGlobal = column("`is_global`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isInvisible = column("`is_invisible`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLocal = column("`is_local`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isVisible = column("`is_visible`", JDBCType.BIGINT);

        public final SqlColumn<Long> keyBlockSizeOid = column("`key_block_size_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> lock = column("`lock`", JDBCType.VARCHAR);

        public final SqlColumn<String> parserName = column("`parser_name`", JDBCType.VARCHAR);

        public SqlIndexOptions() {
            super("sql_index_options");
        }
    }
}