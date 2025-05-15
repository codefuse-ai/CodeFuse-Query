实验步骤：

1. 运行gitdiff脚本，识别出两个commit之间的所有变更文件名和行号
2. 运行rule1.gdl，将变更文件名和行号转换为对应的java ecg node id。
3. 运行rule5.gdl，将变更文件名和行号转换为对应的xml ecg node id。
4. 运行rule4.gdl，输入为rule1找到的java ecg node，输出为这些ecg node影响到的发布的http request函数。
4. 运行rule2.gdl，输入为rule1找到的java ecg node，输出为这些ecg node影响到的http response函数。
5. 运行rule6.gdl，输入为rule1和rule5找到的所有ecg node，输出为这些ecg node是否为发布的tr接口。
6. 运行rule7.gdl，输入为rule5找到的xml ecg node，输出为这些node对应的mybatis 框架下的java源码，字段或函数。
7. 运行rule8.gdl，输入为rule1和rule7找到的所有ecg node，输出为这些ecg node 影响到的发布的tr接口。
8. 运行rule13.gdl，输入为变更行和行号，输出为本次变更的变更影响调用链路的调用根节点的函数签名（默认为baseline）。
9. 比较rule13与rule4，rule6的结果。
10. rule17 仓库地址：{unknown}
11. 运行rule17, 输入为rule1找到的java ecg node，输出为本次变更影响到的tr接口和函数名。
12. BFF为私仓，本地下好。
13. 运行rule18, 输入为rule17找到的tr接口全名和函数名，输出为BFF应用使用到的appname配置，tr接口和函数名。
14. 运行rule19，输入为rule18找到的appname配置，tr接口和函数名，输出为使用到这些tr接口的rpc接口和函数

update 版本
1. 运行gitdiff脚本，识别出两个commit之间的所有变更文件名和行号
2. 运行rule_ecg.gdl，输入为变更行和行号，输出为本次变更的tr接口和http接口信息。
3. 运行rule_1_5.gdl，输入为变更行和行号，输出为本次变更的ecg node。
4. 运行rule_6_8.gdl，输入为变更行和行号，输出为本次变更的tr接口。
5. 运行rule_1_4.gdl，输入为变更行和行号，输出为本次变更的http接口。
3. 运行rule13.gdl，输入为变更行和行号，输出为本次变更的变更影响调用链路的调用根节点的函数签名（默认为baseline）。
4. 运行rule9 输出为查询到该应用发布的所有http request接口，用于与rule_1_4的结果进行比较。
5. 运行rule12.gdl，输出为该应用发布的所有tr接口、实现类和对应的具体函数信息，用于与rule6_8结果进行比较。
