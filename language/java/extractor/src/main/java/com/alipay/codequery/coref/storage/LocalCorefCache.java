package com.alipay.codequery.coref.storage;

import com.google.common.collect.Sets;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class LocalCorefCache implements CorefCache {

    private final File fileObjectDir;
    private final File refDir;

    /**
     * 本地缓存可以选择关联远程缓存，对本地缓存的操作同时映射到远程缓存上。
     */
    private CorefCache remoteCorefCache;

    public LocalCorefCache(File dir, CorefCache remoteCorefCache) {
        this.fileObjectDir = new File(dir.getAbsolutePath() + File.separator + "objects");
        this.fileObjectDir.mkdirs();
        this.refDir = new File(dir.getAbsolutePath() + File.separator + "refs");
        this.refDir.mkdirs();
        this.remoteCorefCache = remoteCorefCache;
    }

    @Override
    public Set<String> getAllObjectIds() {
        Set<String> localObjectIds = getLocalObjectIds();
        if (remoteCorefCache == null) {
            return localObjectIds;
        }

        // 若关联着远端存储，则需要统计远端和本地，合并结果
        Set<String> remoteObjectIds = remoteCorefCache.getAllObjectIds();
        localObjectIds.addAll(remoteObjectIds);
        return localObjectIds;
    }

    @Override
    public void putObjects(Set<FileScopeCorefObject> objectList) {
        // 本地存储，storage已经写入过了，可以不管
        if (remoteCorefCache == null) {
            return;
        }

        remoteCorefCache.putObjects(objectList);
    }

    @Override
    public Set<FileScopeCorefObject> getObjectByIds(Set<String> objectIds) {
        if (remoteCorefCache == null) {
            return new HashSet<>();
        }

        // 只下载本地不存在，且远程存在的
        Set<String> localObjectIds = getLocalObjectIds();
        Set<String> shouldFetchIds = Sets.difference(objectIds, localObjectIds).immutableCopy();
        return remoteCorefCache.getObjectByIds(shouldFetchIds);
    }

    @Override
    public File getLocalObjectDir() {
        return this.fileObjectDir;
    }

    @Override
    public void putCommit(Commit commit) {
        File commitJsonFile = new File(refDir + File.separator + commit.getId() + ".json");
        commit.writeToJsonFile(commitJsonFile);

        if (remoteCorefCache != null) {
            remoteCorefCache.putCommit(commit);
        }
    }

    @Override
    public Commit getCommit(String commitId) {
        File commitJsonFile =  new File(refDir + File.separator + commitId);
        if (!commitJsonFile.exists()) {
            // 若本地没有则尝试从远程获取
            return remoteCorefCache.getCommit(commitId);
        }
        return Commit.readFromFile(commitJsonFile);
    }

    private Set<String> getLocalObjectIds() {
        Set<String> cachedFileObjectIds = new HashSet<>();
        File[] childFiles = fileObjectDir.listFiles();
        if (childFiles == null || childFiles.length == 0) {
            return cachedFileObjectIds;
        }

        for (File childFile : childFiles) {
            cachedFileObjectIds.add(childFile.getName());
        }

        return cachedFileObjectIds;
    }
}
