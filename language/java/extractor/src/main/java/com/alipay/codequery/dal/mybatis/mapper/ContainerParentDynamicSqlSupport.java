package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ContainerParentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: container_parent")
    public static final ContainerParent containerParent = new ContainerParent();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: container_parent.child_hash_id")
    public static final SqlColumn<Long> childHashId = containerParent.childHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: container_parent.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = containerParent.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: container_parent")
    public static final class ContainerParent extends SqlTable {
        public final SqlColumn<Long> childHashId = column("child_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public ContainerParent() {
            super("container_parent");
        }
    }
}