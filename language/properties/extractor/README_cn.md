# 简介
Codefuse-query Properties 提取器将 Properties 文件的源代码转换为标准化的 coref-properties 数据，这些数据用于 codefuse-query 进行进一步分析。

# 快速开始
1. 设置 JAVA_HOME。执行 echo $JAVA_HOME 来显示当前的设置。如果显示为空，则表示尚未配置。
2. 构建。执行 mvn clean install。
3. 运行。执行 java -jar target/properties-extractor-1.0-SNAPSHOT-jar-with-dependencies.jar ${YOUR_REPO} ./db。

执行后，一个名为 coref_properties_src.db 的文件将生成在 ./db 目录下。