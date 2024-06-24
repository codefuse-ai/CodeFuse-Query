package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReferenceRelationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    public static final ReferenceRelation referenceRelation = new ReferenceRelation();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_relation.reference_element_hash_id")
    public static final SqlColumn<Long> referenceElementHashId = referenceRelation.referenceElementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_relation.definition_element_hash_id")
    public static final SqlColumn<Long> definitionElementHashId = referenceRelation.definitionElementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_relation")
    public static final class ReferenceRelation extends SqlTable {
        public final SqlColumn<Long> referenceElementHashId = column("reference_element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> definitionElementHashId = column("definition_element_hash_id", JDBCType.BIGINT);

        public ReferenceRelation() {
            super("reference_relation");
        }
    }
}