
package com.alipay.codequery.model;

import com.alipay.codequery.dal.mybatis.domain.XmlDtd;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;


@ToString
@Data
@AllArgsConstructor
public class XmlDTDModel extends XmlLocatable {
    private int    id;
    private String root;
    private String publicId;
    private String systemId;

    private XmlLocationModel location;

    public XmlDtd extractXmlDtd() {
        return new XmlDtd(this.id, this.root, this.publicId, this.systemId, getLocation().getId());
    }

}