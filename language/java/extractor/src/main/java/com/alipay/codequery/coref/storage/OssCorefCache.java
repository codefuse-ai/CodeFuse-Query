package com.alipay.codequery.coref.storage;

import com.alibaba.fastjson.JSON;
import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.ini4j.Wini;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

@Slf4j
public class OssCorefCache implements CorefCache {

    private final String endpoint;
    private final String bucket;
    private final String objectPathPrefix;
    private final String refPathPrefix;

    private final String accessKeyId;
    private final String accessKeySecret;

    private final File localFileObjectDir;
    private final File localRefDir;

    private static final String compressedFileSuffix = ".gz";
    private static final String jsonFileSuffix = ".json";

    public OssCorefCache(String pathPrefix, File localCacheDir, String bucket, File ossConfigFile) {
        this.objectPathPrefix = pathPrefix + "objects/";
        this.refPathPrefix = pathPrefix + "refs/";
        this.localFileObjectDir = new File(localCacheDir.getAbsolutePath() + File.separator + "objects");
        this.localFileObjectDir.mkdirs();
        this.localRefDir = new File(localCacheDir.getAbsolutePath() + File.separator + "refs");
        this.localRefDir.mkdirs();
        if (StringUtils.isBlank(bucket)) {
            throw new IllegalArgumentException("bucket cannot be blank!");
        }
        this.bucket = bucket;

        if (ossConfigFile == null) {
            throw new IllegalArgumentException("please specify oss config file!");
        }
        if (!ossConfigFile.exists()) {
            throw new RuntimeException("oss config file not exists!");
        }
        try {
            Wini ini = new Wini(ossConfigFile);
            String endpoint = ini.get("Credentials", "endpoint");
            String accessKeyId = ini.get("Credentials", "accessKeyID");
            String accessKeySecret = ini.get("Credentials", "accessKeySecret");

            if (endpoint == null || accessKeyId == null || accessKeySecret == null) {
                throw new IllegalArgumentException("missing value: endpoint or accessKeyID or accessKeySecret.");
            }
            this.endpoint = endpoint;
            this.accessKeyId = accessKeyId;
            this.accessKeySecret = accessKeySecret;
        } catch (IOException iffe) {
            throw new RuntimeException("parse config file get exception.", iffe);
        }

    }

    @Override
    public Set<String> getAllObjectIds() {
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        Set<String> idSet = new HashSet<>();
        try {
            // 分页获取
            int maxKeys = 200;
            ListObjectsV2Result listObjectsV2Result;
            String nextContinuationToken = null;
            do {
                ListObjectsV2Request listObjectsV2Request = new ListObjectsV2Request(bucket, objectPathPrefix);
                listObjectsV2Request.setMaxKeys(maxKeys);
                listObjectsV2Request.setContinuationToken(nextContinuationToken);

                listObjectsV2Result = ossClient.listObjectsV2(listObjectsV2Request);

                for (OSSObjectSummary summary : listObjectsV2Result.getObjectSummaries()) {
                    String key = summary.getKey();
                    if (key.endsWith(compressedFileSuffix)) {
                        key = key.substring(0, key.lastIndexOf('.'));
                    }
                    String hashId = StringUtils.removeStart(key, objectPathPrefix);
                    idSet.add(hashId);
                }
                nextContinuationToken = listObjectsV2Result.getNextContinuationToken();
            } while (listObjectsV2Result.isTruncated());
        } catch (OSSException oe) {
            log.error("List object get OSSException. Error Message: {}, Error Code: {}, Request ID: {}, Host ID: {}",
                oe.getErrorMessage(), oe.getErrorCode(), oe.getRequestId(), oe.getHostId());
        } catch (ClientException ce) {
            log.error("List object get ClientException. Error Message:" + ce.getMessage());
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }

        return idSet;
    }

    @Override
    public void putObjects(Set<FileScopeCorefObject> objectList) {
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        ExecutorService es = Executors.newFixedThreadPool(8);
        CountDownLatch count = new CountDownLatch(objectList.size());
        for (FileScopeCorefObject fileObject : objectList) {
            es.submit(() -> {
                File cacheFile = fileObject.getCacheFile();
                File cacheZipFile = new File(cacheFile.getAbsolutePath() + compressedFileSuffix);
                try {
                    FileInputStream fis = new FileInputStream(cacheFile);
                    GZIPOutputStream gzipOutputStream = new GZIPOutputStream(new FileOutputStream(cacheZipFile));
                    IOUtils.copy(fis, gzipOutputStream);
                    gzipOutputStream.close();
                    fis.close();

                    // 上传到OSS
                    String objectName = objectPathPrefix + fileObject.getHashId() + compressedFileSuffix;
                    ossClient.putObject(new PutObjectRequest(bucket, objectName, cacheZipFile));
                } catch (IOException e) {
                    log.error("gzip compress get IOException. file objectId: {}", fileObject.getHashId(), e);
                } catch (OSSException oe) {
                    log.error("Put object get OSSException. Error Message: {}, Error Code: {}, Request ID: {}, Host ID: {}",
                        oe.getErrorMessage(), oe.getErrorCode(), oe.getRequestId(), oe.getHostId());
                } catch (ClientException ce) {
                    log.error("Put object get ClientException. Error Message:" + ce.getMessage());
                } finally {
                    count.countDown();
                }

                // 上传完gz文件后，删除本地的gz文件
                cacheZipFile.delete();
            });
        }

        try {
            count.await();
        } catch (InterruptedException e) {
            log.error("count down await get exception. ", e);
        } finally {
            es.shutdown();
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }
    }

    @Override
    public Set<FileScopeCorefObject> getObjectByIds(Set<String> objectIds) {
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        Set<FileScopeCorefObject> cacheFileSet = new HashSet<>();
        ExecutorService es = Executors.newFixedThreadPool(8);
        CountDownLatch count = new CountDownLatch(objectIds.size());
        for (String objectId : objectIds) {
            es.submit(() -> {
                try {
                    String path = objectPathPrefix + objectId + compressedFileSuffix;
                    File downloadedFile = new File(this.localFileObjectDir + "/" + objectId + compressedFileSuffix);
                    ossClient.getObject(new GetObjectRequest(bucket, path), downloadedFile);
                    File decompressedFile = new File(this.localFileObjectDir + "/" + objectId);

                    GZIPInputStream gzipInputStream = new GZIPInputStream(new FileInputStream(downloadedFile));
                    FileOutputStream fos = new FileOutputStream(decompressedFile);
                    IOUtils.copy(gzipInputStream, fos);
                    gzipInputStream.close();
                    fos.close();
                    // 删除下载的压缩文件
                    downloadedFile.delete();

                    FileScopeCorefObject fileScopeCorefObject = new FileScopeCorefObject();
                    fileScopeCorefObject.setCacheFile(decompressedFile);
                    fileScopeCorefObject.setHashId(objectId);
                    cacheFileSet.add(fileScopeCorefObject);
                } catch (IOException e) {
                    log.error("gzip decompress get IOException. file objectId: {}", objectId, e);
                } catch (OSSException oe) {
                    log.error("Get object get OSSException. Error Message: {}, Error Code: {}, Request ID: {}, Host ID: {}",
                        oe.getErrorMessage(), oe.getErrorCode(), oe.getRequestId(), oe.getHostId());
                } catch (ClientException ce) {
                    log.error("Get object get ClientException. Error Message:" + ce.getMessage());
                } finally {
                    count.countDown();
                }
            });
        }

        try {
            count.await();
        } catch (InterruptedException e) {
            log.error("count down await get exception. ", e);
        } finally {
            es.shutdown();
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }

        return cacheFileSet;
    }

    @Override
    public File getLocalObjectDir() {
        return this.localFileObjectDir;
    }

    @Override
    public void putCommit(Commit commit) {
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        String objectName = refPathPrefix + commit.getId() + jsonFileSuffix;
        String commitJsonString = JSON.toJSONString(commit);
        InputStream inputStream = new ByteArrayInputStream(commitJsonString.getBytes());
        try {
            ossClient.putObject(new PutObjectRequest(bucket, objectName, inputStream));
        } catch (OSSException oe) {
            log.error("Put object get OSSException. Error Message: {}, Error Code: {}, Request ID: {}, Host ID: {}",
                oe.getErrorMessage(), oe.getErrorCode(), oe.getRequestId(), oe.getHostId());
        } catch (ClientException ce) {
            log.error("Put object get ClientException. Error Message:" + ce.getMessage());
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }
    }

    @Override
    public Commit getCommit(String commitId) {
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        String objectName = refPathPrefix + commitId + jsonFileSuffix;
        boolean exists = ossClient.doesObjectExist(bucket, objectName);
        if (!exists) {
            return null;
        }
        // 若在oss存在，则拷贝到本地缓存，并读取内容返回
        File localCommitFile = new File(localRefDir.getAbsolutePath() + File.separator + commitId + jsonFileSuffix);
        ossClient.getObject(new GetObjectRequest(bucket, objectName), localCommitFile);
        return Commit.readFromFile(localCommitFile);
    }

}
