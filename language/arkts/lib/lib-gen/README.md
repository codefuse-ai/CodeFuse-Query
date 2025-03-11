## 使用说明
- 通过lib_gen_uml.py 脚本生成 arkts lib库
- python3 ./lib_gen_uml.py -uml ./resources/er.puml  -o test.gdl
- er.puml 为类关系图 test.gdl为输出
## 生成说明
- lib库中DO类与uml中描述完全一致。实际使用上 继承类的schema为父类schema + 自己特有的schema
- astNode节点间关系与附加规则可见: https://yuque.antfin-inc.com/codeinsight/bigdata/rrkx8cwi6gzyqggx