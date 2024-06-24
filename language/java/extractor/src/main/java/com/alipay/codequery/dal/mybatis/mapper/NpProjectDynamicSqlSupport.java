package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class NpProjectDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_project")
    public static final NpProject npProject = new NpProject();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_project.element_hash_id")
    public static final SqlColumn<Long> elementHashId = npProject.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_project.extension")
    public static final SqlColumn<String> extension = npProject.extension;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: np_project.name")
    public static final SqlColumn<String> name = npProject.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: np_project")
    public static final class NpProject extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> extension = column("extension", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public NpProject() {
            super("np_project");
        }
    }
}