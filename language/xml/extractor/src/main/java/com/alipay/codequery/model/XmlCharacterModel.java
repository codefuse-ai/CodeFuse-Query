
package com.alipay.codequery.model;

import com.alipay.codequery.dal.mybatis.domain.XmlCharacter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
@AllArgsConstructor
public class XmlCharacterModel extends XmlLocatable {
    private int              id;
    private String           text;
    private int              parentId;
    private int              index;
    private int              isCDATA;
    private int              fileId;
    private XmlLocationModel location;

    public XmlCharacter extractCharacter() {
        return new XmlCharacter(this.id, this.text, this.parentId, this.index, this.isCDATA, getLocation().getId());

    }

}