package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCharacterDataTypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    public static final SqlCharacterDataType sqlCharacterDataType = new SqlCharacterDataType();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.oid")
    public static final SqlColumn<Long> oid = sqlCharacterDataType.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.char_set_name")
    public static final SqlColumn<String> charSetName = sqlCharacterDataType.charSetName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.char_type")
    public static final SqlColumn<String> charType = sqlCharacterDataType.charType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.collate")
    public static final SqlColumn<String> collate = sqlCharacterDataType.collate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.is_has_binary")
    public static final SqlColumn<Integer> isHasBinary = sqlCharacterDataType.isHasBinary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_character_data_type.length")
    public static final SqlColumn<Integer> length = sqlCharacterDataType.length;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    public static final class SqlCharacterDataType extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> charSetName = column("`char_set_name`", JDBCType.VARCHAR);

        public final SqlColumn<String> charType = column("`char_type`", JDBCType.VARCHAR);

        public final SqlColumn<String> collate = column("`collate`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isHasBinary = column("`is_has_binary`", JDBCType.BIGINT);

        public final SqlColumn<Integer> length = column("`length`", JDBCType.BIGINT);

        public SqlCharacterDataType() {
            super("sql_character_data_type");
        }
    }
}