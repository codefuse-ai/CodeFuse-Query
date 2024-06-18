package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FileDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    public static final File file = new File();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.element_hash_id")
    public static final SqlColumn<Long> elementHashId = file.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.qualified_name")
    public static final SqlColumn<String> qualifiedName = file.qualifiedName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.extension")
    public static final SqlColumn<String> extension = file.extension;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.name")
    public static final SqlColumn<String> name = file.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file.number_of_lines_hash_id")
    public static final SqlColumn<Long> numberOfLinesHashId = file.numberOfLinesHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    public static final class File extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> qualifiedName = column("qualified_name", JDBCType.VARCHAR);

        public final SqlColumn<String> extension = column("extension", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Long> numberOfLinesHashId = column("number_of_lines_hash_id", JDBCType.BIGINT);

        public File() {
            super("file");
        }
    }
}