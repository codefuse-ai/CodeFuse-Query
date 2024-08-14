
package com.alipay.codequery.model;
import com.alipay.codequery.dal.mybatis.domain.XmlLocation;


public abstract class XmlLocatable {
    public abstract XmlLocationModel getLocation();

    public XmlLocation extractLocation() {
        return getLocation().extractLocation();
    }

}