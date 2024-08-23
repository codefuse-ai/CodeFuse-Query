package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleFileSpecificationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    public static final OracleFileSpecification oracleFileSpecification = new OracleFileSpecification();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_file_specification.oid")
    public static final SqlColumn<Long> oid = oracleFileSpecification.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_file_specification.auto_extend_on_oid")
    public static final SqlColumn<Long> autoExtendOnOid = oracleFileSpecification.autoExtendOnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_file_specification.is_auto_extend_off")
    public static final SqlColumn<Integer> isAutoExtendOff = oracleFileSpecification.isAutoExtendOff;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_file_specification.size_oid")
    public static final SqlColumn<Long> sizeOid = oracleFileSpecification.sizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    public static final class OracleFileSpecification extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> autoExtendOnOid = column("`auto_extend_on_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAutoExtendOff = column("`is_auto_extend_off`", JDBCType.BIGINT);

        public final SqlColumn<Long> sizeOid = column("`size_oid`", JDBCType.BIGINT);

        public OracleFileSpecification() {
            super("oracle_file_specification");
        }
    }
}