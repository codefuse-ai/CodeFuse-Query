package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ClassHierarchyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_hierarchy")
    public static final ClassHierarchy classHierarchy = new ClassHierarchy();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: class_hierarchy.child_hash_id")
    public static final SqlColumn<Long> childHashId = classHierarchy.childHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: class_hierarchy.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = classHierarchy.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_hierarchy")
    public static final class ClassHierarchy extends SqlTable {
        public final SqlColumn<Long> childHashId = column("child_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public ClassHierarchy() {
            super("class_hierarchy");
        }
    }
}