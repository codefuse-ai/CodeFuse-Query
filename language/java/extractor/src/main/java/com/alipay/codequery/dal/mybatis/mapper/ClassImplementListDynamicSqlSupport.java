package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ClassImplementListDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_implement_list")
    public static final ClassImplementList classImplementList = new ClassImplementList();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: class_implement_list.element_hash_id")
    public static final SqlColumn<Long> elementHashId = classImplementList.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: class_implement_list.implemented_element_hash_id")
    public static final SqlColumn<Long> implementedElementHashId = classImplementList.implementedElementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: class_implement_list")
    public static final class ClassImplementList extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> implementedElementHashId = column("implemented_element_hash_id", JDBCType.BIGINT);

        public ClassImplementList() {
            super("class_implement_list");
        }
    }
}