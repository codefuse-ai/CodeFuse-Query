package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LocationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    public static final Location location = new Location();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.element_hash_id")
    public static final SqlColumn<Long> elementHashId = location.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.file_hash_id")
    public static final SqlColumn<Long> fileHashId = location.fileHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.start_line_number")
    public static final SqlColumn<Integer> startLineNumber = location.startLineNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.start_column_number")
    public static final SqlColumn<Integer> startColumnNumber = location.startColumnNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.end_line_number")
    public static final SqlColumn<Integer> endLineNumber = location.endLineNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: location.end_column_number")
    public static final SqlColumn<Integer> endColumnNumber = location.endColumnNumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    public static final class Location extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> fileHashId = column("file_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> startLineNumber = column("start_line_number", JDBCType.INTEGER);

        public final SqlColumn<Integer> startColumnNumber = column("start_column_number", JDBCType.INTEGER);

        public final SqlColumn<Integer> endLineNumber = column("end_line_number", JDBCType.INTEGER);

        public final SqlColumn<Integer> endColumnNumber = column("end_column_number", JDBCType.INTEGER);

        public Location() {
            super("location");
        }
    }
}