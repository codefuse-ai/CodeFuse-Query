package com.alipay.codequery.coref.model;

import com.alipay.codequery.dal.mybatis.domain.EmptyReferenceParameterList;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
public class ParameterList extends Node{
    public ParameterList(Long hashId) {
        super(hashId);
    }

    public static class ReferenceParameterList extends ParameterList {

        public Type[] types;

        public ReferenceParameterList(Long hashId) {
            super(hashId);
        }

        public EmptyReferenceParameterList extractEmptyReferenceParameterList() {
            return new EmptyReferenceParameterList(this.hashId, this.parent.hashId, this.debug_message, this.location.hashId);
        }

        public com.alipay.codequery.dal.mybatis.domain.ReferenceParameterList extractReferenceParameterList(int index) {

            return new com.alipay.codequery.dal.mybatis.domain.ReferenceParameterList(types[index].hashId, this.hashId, index, this.parent.hashId, this.debug_message, this.location.hashId);

        }
    }
}

