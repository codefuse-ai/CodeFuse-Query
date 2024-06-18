package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class NpFileDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_file")
    public static final NpFile npFile = new NpFile();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_file.element_hash_id")
    public static final SqlColumn<Long> elementHashId = npFile.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_file.qualified_name")
    public static final SqlColumn<String> qualifiedName = npFile.qualifiedName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_file.name")
    public static final SqlColumn<String> name = npFile.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_file.project_hash_id")
    public static final SqlColumn<Long> projectHashId = npFile.projectHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_file")
    public static final class NpFile extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> qualifiedName = column("qualified_name", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Long> projectHashId = column("project_hash_id", JDBCType.BIGINT);

        public NpFile() {
            super("np_file");
        }
    }
}