package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LocationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    public static final Location location = new Location();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.oid")
    public static final SqlColumn<Long> oid = location.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.file_oid")
    public static final SqlColumn<Long> fileOid = location.fileOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.start_line_number")
    public static final SqlColumn<Integer> startLineNumber = location.startLineNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.start_column_number")
    public static final SqlColumn<Integer> startColumnNumber = location.startColumnNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    public static final class Location extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fileOid = column("`file_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> startLineNumber = column("`start_line_number`", JDBCType.BIGINT);

        public final SqlColumn<Integer> startColumnNumber = column("`start_column_number`", JDBCType.BIGINT);

        public Location() {
            super("location");
        }
    }
}