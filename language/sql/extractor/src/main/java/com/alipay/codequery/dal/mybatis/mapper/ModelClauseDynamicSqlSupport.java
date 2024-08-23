package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ModelClauseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    public static final ModelClause modelClause = new ModelClause();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.oid")
    public static final SqlColumn<Long> oid = modelClause.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.cell_reference_options")
    public static final SqlColumn<String> cellReferenceOptions = modelClause.cellReferenceOptions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.main_model")
    public static final SqlColumn<String> mainModel = modelClause.mainModel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.reference_model_clauses")
    public static final SqlColumn<String> referenceModelClauses = modelClause.referenceModelClauses;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.return_rows_clause")
    public static final SqlColumn<String> returnRowsClause = modelClause.returnRowsClause;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    public static final class ModelClause extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> cellReferenceOptions = column("`cell_reference_options`", JDBCType.VARCHAR);

        public final SqlColumn<String> mainModel = column("`main_model`", JDBCType.VARCHAR);

        public final SqlColumn<String> referenceModelClauses = column("`reference_model_clauses`", JDBCType.VARCHAR);

        public final SqlColumn<String> returnRowsClause = column("`return_rows_clause`", JDBCType.VARCHAR);

        public ModelClause() {
            super("model_clause");
        }
    }
}