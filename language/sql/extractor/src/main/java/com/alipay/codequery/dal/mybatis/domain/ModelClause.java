package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class ModelClause implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.cell_reference_options")
    private String cellReferenceOptions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.main_model")
    private String mainModel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.reference_model_clauses")
    private String referenceModelClauses;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.return_rows_clause")
    private String returnRowsClause;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    public ModelClause(Long oid, String cellReferenceOptions, String mainModel, String referenceModelClauses, String returnRowsClause) {
        this.oid = oid;
        this.cellReferenceOptions = cellReferenceOptions;
        this.mainModel = mainModel;
        this.referenceModelClauses = referenceModelClauses;
        this.returnRowsClause = returnRowsClause;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    public ModelClause() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.cell_reference_options")
    public String getCellReferenceOptions() {
        return cellReferenceOptions;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.cell_reference_options")
    public void setCellReferenceOptions(String cellReferenceOptions) {
        this.cellReferenceOptions = cellReferenceOptions == null ? null : cellReferenceOptions.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.main_model")
    public String getMainModel() {
        return mainModel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.main_model")
    public void setMainModel(String mainModel) {
        this.mainModel = mainModel == null ? null : mainModel.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.reference_model_clauses")
    public String getReferenceModelClauses() {
        return referenceModelClauses;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.reference_model_clauses")
    public void setReferenceModelClauses(String referenceModelClauses) {
        this.referenceModelClauses = referenceModelClauses == null ? null : referenceModelClauses.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.return_rows_clause")
    public String getReturnRowsClause() {
        return returnRowsClause;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: model_clause.return_rows_clause")
    public void setReturnRowsClause(String returnRowsClause) {
        this.returnRowsClause = returnRowsClause == null ? null : returnRowsClause.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ModelClause other = (ModelClause) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCellReferenceOptions() == null ? other.getCellReferenceOptions() == null : this.getCellReferenceOptions().equals(other.getCellReferenceOptions()))
            && (this.getMainModel() == null ? other.getMainModel() == null : this.getMainModel().equals(other.getMainModel()))
            && (this.getReferenceModelClauses() == null ? other.getReferenceModelClauses() == null : this.getReferenceModelClauses().equals(other.getReferenceModelClauses()))
            && (this.getReturnRowsClause() == null ? other.getReturnRowsClause() == null : this.getReturnRowsClause().equals(other.getReturnRowsClause()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCellReferenceOptions() == null) ? 0 : getCellReferenceOptions().hashCode());
        result = prime * result + ((getMainModel() == null) ? 0 : getMainModel().hashCode());
        result = prime * result + ((getReferenceModelClauses() == null) ? 0 : getReferenceModelClauses().hashCode());
        result = prime * result + ((getReturnRowsClause() == null) ? 0 : getReturnRowsClause().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: model_clause")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", cellReferenceOptions=").append(cellReferenceOptions);
        sb.append(", mainModel=").append(mainModel);
        sb.append(", referenceModelClauses=").append(referenceModelClauses);
        sb.append(", returnRowsClause=").append(returnRowsClause);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}