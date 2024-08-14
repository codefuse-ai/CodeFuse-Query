
package com.alipay.codequery.model;

import com.alipay.codequery.dal.mybatis.domain.XmlComment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;


@Data
@AllArgsConstructor
@ToString
public class XmlCommentModel extends XmlLocatable {
    private int              id;
    private String           text;
    private int              parentId;
    private int              fileId;
    private XmlLocationModel location;

    public XmlComment extractXmlComment() {
        return new XmlComment(this.id, this.text, this.parentId, getLocation().getId());
    }

}