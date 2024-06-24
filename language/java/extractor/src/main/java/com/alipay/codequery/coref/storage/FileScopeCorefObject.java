package com.alipay.codequery.coref.storage;

import lombok.Data;

import java.io.File;

@Data
public class FileScopeCorefObject {
    File sourceFile;
    String hashId;
    File cacheFile;
}
