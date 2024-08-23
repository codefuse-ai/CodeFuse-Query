# CodeFuse-Query SQL 抽取器
CodeFuse-Query SQL 提取器将 SQL 文件的源代码转换为标准化的 coref-sql 数据，这些数据用于 codefuse-query 进行进一步分析。

# 快速开始
1. 设置 JAVA_HOME。执行 `echo $JAVA_HOME` 来显示当前的设置。如果显示为空，则表示尚未配置。
2. 构建。执行 `mvn clean install`。
3. 运行。执行如下命令
   ```bash
   java -jar target/coref-sql-src-extractor-0.0.1-jar-with-dependencies.jar ${YOUR_REPO} ./db
   ```
执行后，一个名为 coref_sql_src.db 的文件将生成在 ./db 目录下。


# 如何开发
`coref-sql-src-extractor` 采用Sparrow来分析Druid源码并分析SQL AST信息，再通过jinja2模版生成工具来生成所需代码和配置，
包括Java代码、PlantUML图、Mybatis XML配置文件、COREF建表SQL语句、Godel库。

因此开发流程需要修改相应jinja2模版然后再通过以下方法进行对应的修改：
1. 提取Druid AST节点信息。（如果Druid AST节点信息无需修改，此步骤可跳过）通过Sparrow查询出所有Druid SQL AST节点信息以及它们的所有可用于抽取的方法（例如Getter，isXXX等方法）
   ```bash
   # 假设Druid的COREF信息已抽取到 <path-to-druid-repo>/db 
   # 输出路径必须为 language/sql/extractor/utils/code_generator/FindDruidSqlAstAllPublicGetterMethods.json，步骤2会默认使用该位置
   sparrow query run <path-to-sparrow-cli-repo>/language/sql/extractor/utils/code_generator/FindDruidSqlAstAllPublicGetterMethods.gdl -f json -o <path-to-sparrow-cli-repo>/language/sql/extractor/utils/code_generator -d <path-to-druid-repo>/db
   ```
   TODO: `FindDruidSqlAstAllPublicGetterMethods.gdl` 已缺失，待补充。

2. 按提取的Druid AST信息生成SQL抽取器的代码。 
   ```bash 
   # 会依据步骤1生成的json文件 `language/sql/extractor/utils/code_generator/FindDruidSqlAstAllPublicGetterMethods.json` 来生成一系列文件。
    bash <path-to-sparrow-cli-repo>/language/sql/extractor/utils/generate_all_code.sh
    ```

# 如何生成SQL AST节点类图
```bash
# Clone Druid仓库并切换对应release版本
git clone https://github.com/alibaba/druid
# <druid-release-version>看pom.xm指定的版本
git checkout tags/<druid-release-version>
cd druid
# 抽取Druid的Java源码信息
sparrow database create -lang java -s . ./db
# 输出Druid SQL AST 节点关系
sparrow query run <path-to-sparrow-cli-repo>/language/sql/extractor/utils/druid_sql_ast_nodes/FindDruidSqlAstNodes.gdl -f json -o <path-to-sparrow-cli-repo>/language/sql/extractor/utils/druid_sql_ast_nodes -d ./db
# 分析Sparrow输出数据并生成Dot格式的类图
python3 <path-to-sparrow-cli-repo>/language/sql/extractor/utils/druid_sql_ast_nodes/generate_dot_diagram.py 
```

TODO: `FindDruidSqlAstNodes.gdl` 已缺失，待补充。
