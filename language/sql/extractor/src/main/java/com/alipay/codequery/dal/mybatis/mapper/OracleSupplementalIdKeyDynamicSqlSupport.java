package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleSupplementalIdKeyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    public static final OracleSupplementalIdKey oracleSupplementalIdKey = new OracleSupplementalIdKey();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.oid")
    public static final SqlColumn<Long> oid = oracleSupplementalIdKey.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_all")
    public static final SqlColumn<Integer> isAll = oracleSupplementalIdKey.isAll;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_foreign_key")
    public static final SqlColumn<Integer> isForeignKey = oracleSupplementalIdKey.isForeignKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_primary_key")
    public static final SqlColumn<Integer> isPrimaryKey = oracleSupplementalIdKey.isPrimaryKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_unique")
    public static final SqlColumn<Integer> isUnique = oracleSupplementalIdKey.isUnique;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_id_key.is_unique_index")
    public static final SqlColumn<Integer> isUniqueIndex = oracleSupplementalIdKey.isUniqueIndex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_id_key")
    public static final class OracleSupplementalIdKey extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAll = column("`is_all`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForeignKey = column("`is_foreign_key`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPrimaryKey = column("`is_primary_key`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isUnique = column("`is_unique`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isUniqueIndex = column("`is_unique_index`", JDBCType.BIGINT);

        public OracleSupplementalIdKey() {
            super("oracle_supplemental_id_key");
        }
    }
}