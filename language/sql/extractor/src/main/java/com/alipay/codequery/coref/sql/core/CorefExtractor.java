
package com.alipay.codequery.coref.sql.core;

import com.alipay.codequery.coref.sql.DbTypeEnum;
import com.alipay.codequery.coref.sql.storage.StorageFacade;

import java.io.File;


public class CorefExtractor {
    public static void extract(File file, DbTypeEnum dbType, StorageFacade corefStorage, File srcRootDir, String corpus) throws Throwable {
        CorefVisitor corefVisitor = new CorefVisitor(file, dbType, corefStorage, srcRootDir, corpus);
        corefVisitor.parse();
    }
}