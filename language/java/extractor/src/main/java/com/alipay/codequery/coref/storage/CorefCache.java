package com.alipay.codequery.coref.storage;

import java.io.File;
import java.util.Set;

public interface CorefCache {

    Set<String> getAllObjectIds();

    void putObjects(Set<FileScopeCorefObject> objectList);

    Set<FileScopeCorefObject> getObjectByIds(Set<String> objectIds);

    File getLocalObjectDir();

    void putCommit(Commit commit);

    Commit getCommit(String commitId);
}
