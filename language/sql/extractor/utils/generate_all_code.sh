#!/bin/bash

set -o xtrace
set -e

SCRIPT_DIR=$(dirname "$0")
PROJECT_DIR=${SCRIPT_DIR}/..

# Step 1
# 根据 language/sql/extractor/utils/code_generator/FindDruidSqlAstAllPublicGetterMethods.json 的数据
# 生成代码生成所需要的信息，此步骤输出：
# - Java代码文件，以完成抽取器抽取逻辑
# - language/sql/extractor/coref_er_diagram.puml，这里记录了COREF模型记录的表、表字段、表字段类型，供Step 2使用
# - Godel库：language/sql/lib/BaseNode.gdl 和 language/sql/lib/Node.gdl（不包括 language/sql/lib/config/DOClass.gdl
#   和 language/sql/lib/config/DOClass.gdl，因为它们记录的是COREF模型的input操作和表DO类，会由Step 4生成）
python3 ${PROJECT_DIR}/utils/code_generator/generate_extractor_and_godel_code.py

# Step 2
# 根据 language/sql/extractor/coref_er_diagram.puml 的COREF模型，
# 生成COREF模型相关存储文件，此步骤输出：
# - language/sql/extractor/src/main/resources/dbschema.sql，用于记录SQLite建表语句
# - language/sql/extractor/src/main/resources/generatorConfig.xml，Mybatis XML配置文件
#   用于给Mybatis自动生成mapper/domain class，Step 3需要
python3 ${PROJECT_DIR}/utils/generate_coref_model.py

# Step 3
# 根据 Step 2 的 dbschema.sql 和 generatorConfig.xml，自动生成Mybatis的mapper/domain class
rm -r ${PROJECT_DIR}/src/main/java/com/alipay/codequery/dal/mybatis || true
cd ${PROJECT_DIR} && mvn mybatis-generator:generate

# Step 4
# 根据Step 1 生成的 coref_er_diagram.puml，输出 language/sql/lib/config/DOClass.gdl
#   和 language/sql/lib/config/DOClass.gdl，它们记录的是COREF模型的input操作和表DO类
# python3 ${PROJECT_DIR}/../../../tool/schema_tool/dbSchemaToGodel.py -s ${PROJECT_DIR}/src/main/resources/dbschema.sql -t ${PROJECT_DIR}/../lib/config -p ${PROJECT_DIR}/coref_er_diagram.puml