package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FolderDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: folder")
    public static final Folder folder = new Folder();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: folder.element_hash_id")
    public static final SqlColumn<Long> elementHashId = folder.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: folder.qualified_name")
    public static final SqlColumn<String> qualifiedName = folder.qualifiedName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: folder.name")
    public static final SqlColumn<String> name = folder.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: folder.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = folder.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: folder")
    public static final class Folder extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> qualifiedName = column("qualified_name", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public Folder() {
            super("folder");
        }
    }
}