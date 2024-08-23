package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAnnIndexDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    public static final SqlAnnIndex sqlAnnIndex = new SqlAnnIndex();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_ann_index.oid")
    public static final SqlColumn<Long> oid = sqlAnnIndex.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_ann_index.distance")
    public static final SqlColumn<String> distance = sqlAnnIndex.distance;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_ann_index.index_type")
    public static final SqlColumn<Integer> indexType = sqlAnnIndex.indexType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_ann_index.rt_index_type")
    public static final SqlColumn<Integer> rtIndexType = sqlAnnIndex.rtIndexType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    public static final class SqlAnnIndex extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> distance = column("`distance`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> indexType = column("`index_type`", JDBCType.BIGINT);

        public final SqlColumn<Integer> rtIndexType = column("`rt_index_type`", JDBCType.BIGINT);

        public SqlAnnIndex() {
            super("sql_ann_index");
        }
    }
}