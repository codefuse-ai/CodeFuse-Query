package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ForeachStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    public static final ForeachStatement foreachStatement = new ForeachStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: foreach_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = foreachStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: foreach_statement.iterated_value_hash_id")
    public static final SqlColumn<Long> iteratedValueHashId = foreachStatement.iteratedValueHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: foreach_statement.iteration_parameter_hash_id")
    public static final SqlColumn<Long> iterationParameterHashId = foreachStatement.iterationParameterHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: foreach_statement.body_hash_id")
    public static final SqlColumn<Long> bodyHashId = foreachStatement.bodyHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: foreach_statement")
    public static final class ForeachStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> iteratedValueHashId = column("iterated_value_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> iterationParameterHashId = column("iteration_parameter_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> bodyHashId = column("body_hash_id", JDBCType.BIGINT);

        public ForeachStatement() {
            super("foreach_statement");
        }
    }
}