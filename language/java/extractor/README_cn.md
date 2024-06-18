# 介绍
codefuse-query java extractor 将 java 项目的源码转化为 coref-java 标准化数据，用于codefuse-query的进一步分析。

# 快速开始
1. 设置 JAVA_HOME。`echo $JAVA_HOME` 如果显示为空，则还没有设置好。
2. 构建。 `mvn clean install`。
3. 运行。 `java -jar target/java-extractor-1.0-SNAPSHOT-jar-with-dependencies.jar ${YOUR_JAVA_REPO} ./db` 

执行完成后，会在 ./db 目录下生成 coref_java_src.db 文件。
