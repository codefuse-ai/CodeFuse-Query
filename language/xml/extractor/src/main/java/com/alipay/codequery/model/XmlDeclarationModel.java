
package com.alipay.codequery.model;

import com.alipay.codequery.dal.mybatis.domain.XmlEncoding;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;


@ToString
@AllArgsConstructor
@Data
public class XmlDeclarationModel extends XmlLocatable {

    private int              id;
    private String           version;
    private String           encoding;
    private XmlLocationModel location;

    public XmlEncoding extraceXmlEncoding() {
        return new XmlEncoding(this.id, this.encoding);
    }

}