package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class AnnotationDeclarationParameter implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.element_hash_id")
    private Long elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.annotation_declaration_hash_id")
    private Long annotationDeclarationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.type_hash_id")
    private Long typeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.parameter_value_hash_id")
    private Long parameterValueHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.location_hash_id")
    private Long locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.debug_message")
    private String debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter")
    public AnnotationDeclarationParameter(Long elementHashId, Long annotationDeclarationHashId, Long typeHashId, Long parameterValueHashId, Long locationHashId, String debugMessage) {
        this.elementHashId = elementHashId;
        this.annotationDeclarationHashId = annotationDeclarationHashId;
        this.typeHashId = typeHashId;
        this.parameterValueHashId = parameterValueHashId;
        this.locationHashId = locationHashId;
        this.debugMessage = debugMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter")
    public AnnotationDeclarationParameter() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.element_hash_id")
    public Long getElementHashId() {
        return elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.element_hash_id")
    public void setElementHashId(Long elementHashId) {
        this.elementHashId = elementHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.annotation_declaration_hash_id")
    public Long getAnnotationDeclarationHashId() {
        return annotationDeclarationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.annotation_declaration_hash_id")
    public void setAnnotationDeclarationHashId(Long annotationDeclarationHashId) {
        this.annotationDeclarationHashId = annotationDeclarationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.type_hash_id")
    public Long getTypeHashId() {
        return typeHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.type_hash_id")
    public void setTypeHashId(Long typeHashId) {
        this.typeHashId = typeHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.parameter_value_hash_id")
    public Long getParameterValueHashId() {
        return parameterValueHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.parameter_value_hash_id")
    public void setParameterValueHashId(Long parameterValueHashId) {
        this.parameterValueHashId = parameterValueHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.location_hash_id")
    public Long getLocationHashId() {
        return locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.location_hash_id")
    public void setLocationHashId(Long locationHashId) {
        this.locationHashId = locationHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.debug_message")
    public String getDebugMessage() {
        return debugMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.debug_message")
    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage == null ? null : debugMessage.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter")
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
        AnnotationDeclarationParameter other = (AnnotationDeclarationParameter) that;
        return (this.getElementHashId() == null ? other.getElementHashId() == null : this.getElementHashId().equals(other.getElementHashId()))
            && (this.getAnnotationDeclarationHashId() == null ? other.getAnnotationDeclarationHashId() == null : this.getAnnotationDeclarationHashId().equals(other.getAnnotationDeclarationHashId()))
            && (this.getTypeHashId() == null ? other.getTypeHashId() == null : this.getTypeHashId().equals(other.getTypeHashId()))
            && (this.getParameterValueHashId() == null ? other.getParameterValueHashId() == null : this.getParameterValueHashId().equals(other.getParameterValueHashId()))
            && (this.getLocationHashId() == null ? other.getLocationHashId() == null : this.getLocationHashId().equals(other.getLocationHashId()))
            && (this.getDebugMessage() == null ? other.getDebugMessage() == null : this.getDebugMessage().equals(other.getDebugMessage()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElementHashId() == null) ? 0 : getElementHashId().hashCode());
        result = prime * result + ((getAnnotationDeclarationHashId() == null) ? 0 : getAnnotationDeclarationHashId().hashCode());
        result = prime * result + ((getTypeHashId() == null) ? 0 : getTypeHashId().hashCode());
        result = prime * result + ((getParameterValueHashId() == null) ? 0 : getParameterValueHashId().hashCode());
        result = prime * result + ((getLocationHashId() == null) ? 0 : getLocationHashId().hashCode());
        result = prime * result + ((getDebugMessage() == null) ? 0 : getDebugMessage().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementHashId=").append(elementHashId);
        sb.append(", annotationDeclarationHashId=").append(annotationDeclarationHashId);
        sb.append(", typeHashId=").append(typeHashId);
        sb.append(", parameterValueHashId=").append(parameterValueHashId);
        sb.append(", locationHashId=").append(locationHashId);
        sb.append(", debugMessage=").append(debugMessage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}