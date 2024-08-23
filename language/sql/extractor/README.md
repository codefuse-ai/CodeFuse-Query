# CodeFuse-Query SQL Extractor

The CodeFuse-Query SQL Extractor converts the source code of SQL files into standardized coref-sql data, which is then used for further analysis by codefuse-query. 

## Quick Start

1. Set up JAVA_HOME. Run `echo $JAVA_HOME` to display the current setting. If it shows nothing, it means it hasn't been configured yet.
2. Build. Run `mvn clean install`.
3. Run. Execute the following command:
   ```bash
   java -jar target/coref-sql-src-extractor-0.0.1-jar-with-dependencies.jar ${YOUR_REPO} ./db
   ```
   After execution, a file named coref_sql_src.db will be generated in the ./db directory.

## How to Develop

`coref-sql-src-extractor` uses Sparrow to analyze Druid source code and extract SQL AST information. It then uses jinja2 template generation tools to produce the required code and configurations, including Java code, PlantUML diagrams, Mybatis XML configuration files, COREF table creation SQL statements, and the Godel library.

Therefore, the development process requires modifying the relevant jinja2 templates and then applying the corresponding changes as follows:

1. Extract Druid AST node information. (If there are no changes needed for the Druid AST node information, this step can be skipped). Use Sparrow to query all Druid SQL AST node information and their available methods for extraction (e.g., Getter, isXXX methods).
   ```bash
   # Assuming Druid's COREF information has been extracted to <path-to-druid-repo>/db
   # The output path must be language/sql/extractor/utils/code_generator/FindDruidSqlAstAllPublicGetterMethods.json, as step 2 will use this location by default
   sparrow query run <path-to-sparrow-cli-repo>/language/sql/extractor/utils/code_generator/FindDruidSqlAstAllPublicGetterMethods.gdl -f json -o <path-to-sparrow-cli-repo>/language/sql/extractor/utils/code_generator -d <path-to-druid-repo>/db
   ```
   TODO: `FindDruidSqlAstAllPublicGetterMethods.gdl` is missing, to be added.

2. Generate the SQL Extractor's code based on the extracted Druid AST information.
   ```bash 
   # This will generate a series of files based on the json file `language/sql/extractor/utils/code_generator/FindDruidSqlAstAllPublicGetterMethods.json` from step 1.
   bash <path-to-sparrow-cli-repo>/language/sql/extractor/utils/generate_all_code.sh
   ```

## How to Generate SQL AST Nodes Class Diagram

```bash
# Clone the Druid repository and switch to the corresponding release version
git clone https://github.com/alibaba/druid
# <druid-release-version> refers to the version specified in pom.xml
git checkout tags/<druid-release-version>
cd druid
# Extract Java source information from Druid
sparrow database create -lang java -s . ./db
# Output the Druid SQL AST node relationships
sparrow query run <path-to-sparrow-cli-repo>/language/sql/extractor/utils/druid_sql_ast_nodes/FindDruidSqlAstNodes.gdl -f json -o <path-to-sparrow-cli-repo>/language/sql/extractor/utils/druid_sql_ast_nodes -d ./db
# Analyze the Sparrow output data and generate a class diagram in Dot format
python3 <path-to-sparrow-cli-repo>/language/sql/extractor/utils/druid_sql_ast_nodes/generate_dot_diagram.py 
```

TODO: `FindDruidSqlAstNodes.gdl` is missing, to be added.
