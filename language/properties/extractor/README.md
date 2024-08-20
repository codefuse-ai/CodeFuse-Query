# Introduction
The codefuse-query properties extractor transforms the source code of xml file into standardized coref-properties data, which is utilized for further analysis by codefuse-query.

# Quick Start
1. Set `JAVA_HOME`. Execute `echo $JAVA_HOME` to display its current setting. If it displays as empty, then it has not been configured yet.
2. Build. Execute `mvn clean install`.
3. Run. Execute `java -jar target/properties-extractor-1.0-SNAPSHOT-jar-with-dependencies.jar ${YOUR_REPO} ./db`.

After execution, a file named coref_properties_src.db will be generated in the ./db directory.
