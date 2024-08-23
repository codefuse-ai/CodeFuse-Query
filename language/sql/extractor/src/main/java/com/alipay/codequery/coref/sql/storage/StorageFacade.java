
package com.alipay.codequery.coref.sql.storage;

import java.io.Serializable;


public interface StorageFacade {
    void commit();

    <T extends Serializable> void store(T object);
}