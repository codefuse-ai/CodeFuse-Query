# CodeFuse-Query 代码大数据分析平台
<p align="center">
  <img src="https://github.com/codefuse-ai/MFTCoder/blob/main/assets/github-codefuse-logo-update.jpg" width="50%" />
</p>

<p align="center">
    <a href="https://github.com/codefuse-ai/CodeFuse-Query">
        <img alt="stars" src="https://img.shields.io/github/stars/codefuse-ai/CodeFuse-Query?style=social" />
    </a>
    <a href="https://github.com/codefuse-ai/CodeFuse-Query">
        <img alt="forks" src="https://img.shields.io/github/forks/codefuse-ai/CodeFuse-Query?style=social" />
    </a>
    <a href="https://github.com/codefuse-ai/CodeFuse-Query/LICENCE">
      <img alt="License: MIT" src="https://badgen.net/badge/license/apache2.0/blue" />
    </a>
    <a href="https://github.com/codefuse-ai/CodeFuse-Query/issues">
      <img alt="Open Issues" src="https://img.shields.io/github/issues-raw/codefuse-ai/CodeFuse-Query" />
    </a>
    <a href="https://github.com/codefuse-ai/CodeFuse-Query/releases">
      <img alt="Release Download" src="https://img.shields.io/github/downloads/codefuse-ai/CodeFuse-Query/total" />
    </a>
    <a href="https://marketplace.visualstudio.com/items?itemName=CodeFuse-Query.codefuse-query-extension">
      <img alt="VSCode Plugin" src="https://img.shields.io/visual-studio-marketplace/i/CodeFuse-Query.codefuse-query-extension?style=social&logo=visualstudiocode&logoColor=%23007ACC" />
    </a>
</p>

[English Documentation](./README.md)

## 什么是CodeFuse-Query？
CodeFuse-Query 是一种强大的静态代码分析平台，适合大规模、复杂的代码库分析场景。它的以数据为中心的方法和高度的可扩展性使得它在现代软件开发环境中具有独特的优势。未来，随着静态代码分析技术的不断发展，CodeFuse-Query 有望在这个领域中扮演更加重要的角色。

从整体上来说，CodeFuse-Query代码数据平台分为三大部分：代码数据模型、代码查询DSL、平台产品化服务。
### 代码数据模型：COREF
我们定义了一种代码数据化和标准化的模型：COREF，要求所有代码都要能通过各种语言抽取器转化到该模型。 
COREF主要包含以下几种信息：
**COREF** = AST （抽象语法树） + ASG（抽象语义图） + CFG（控制流图） + PDG（程序依赖图）+ Call Graph（函数调用图） + Class Hierarchy （类继承关系）+ Documentation（文档/注释信息）
注：由于每种信息的计算难度不一，所以并不是所有语言的COREF信息均包含以上全部信息，基础信息主要有AST、ASG、Call Graph、Class Hierarchy和Documentation，其他信息（ CFG 和 PDG ）仍在建设中，后续会逐步支持。
### 代码查询DSL
基于生成的COREF代码数据，CodeFuse-Query 使用一种自定义的DSL语言 **Gödel** 来进行查询，从而完成代码分析需求。
Gödel是一种逻辑推理语言，它的底层实现是基于逻辑推理语言Datalog，通过描述“事实”和“规则”， 程序可以不断地推导出新的事实。Gödel也是一个声明式语言，相较于命令式编程，声明式编程更加着重描述“要什么”，而把如何实现交给计算引擎。
既然代码已经转化为关系型数据（COREF数据以关系型数据表的形式存储），相信大家会有疑问，为什么不直接用SQL，或者是直接使用SDK，而是又要专门去学习一个新的DSL语言呢？因为Datalog的计算具备单调性和终止性，简单理解就是，Datalog是在牺牲了表达能力的前提下获得了更高的性能，而Gödel继承了这个特点。 

- 相比较SDK，Gödel的主要优点是易学易用，声明式的描述，用户不需要关注中间的运算过程，只需要像SQL一样简单描述清楚需求即可。
- 相比较SQL，Gödel的优点主要是描述能力更强、计算速度更快，例如描述递归算法和多表联合查询，而这些对于SQL来说都是比较困难的。
### 平台化、产品化
CodeFuse-Query 包括**Sparrow CLI **和CodeFuse-Query**在线服务Query中心**。Sparrow CLI包含了所有组件和依赖，例如抽取器，数据模型，编译器等，用户完全可以通过使用Sparrow CLI在本地进行代码数据生成和查询（Sparrow CLI的使用方式请见 第3节 安装、配置、运行）。如果用户有在线查询的需求，可以使用Query中心进行实验。
## 支持分析的编程语言 
截止目前，CodeFuse-Query支持对11种编程语言进行数据分析。其中对5种编程语言（ Java、JavaScript、TypeScript、XML、Go ）的支持度非常成熟，对剩余6种编程语言（Object-C、C++、Python3、Swift、SQL、Properties ）的支持度处于beta阶段，还有进一步提升和完善的空间，具体的支持情况见下表：

| 语言 | 状态 | COREF模型节点数 |
| --- | --- | --- |
| Java | 成熟 | 162 |
| XML | 成熟 | 12 |
| TS/JS | 成熟 | 392 |
| Go | 成熟 | 40 |
| OC/C++ | beta | 53/397 |
| Python3 | beta | 93 |
| Swift | beta | 248 |
| SQL | beta | 750 |
| Properties | beta | 9 |

注：以上语言状态的成熟程度判断标准是根据COREF包含的信息种类和实际落地情况来进行判定，除了OC/C++外，所有语言均支持了完整的AST信息和Documentation信息，以Java为例，COREF for Java还支持了ASG、Call Graph、Class Hierarchy、以及部分CFG信息。

## 快速使用（QuickStart）
[安装、配置、运行](./doc/3_install_and_run.md)

## 文档 (Documentation)
- [引言](./doc/1_abstract.md)
- [概述](./doc/2_introduction.md)
- [使用场景](./doc/user_case.md)
- [安装、配置、运行](./doc/3_install_and_run.md)
- [Gödel查询语言介绍](./doc/4_godelscript_language.md)
- [VSCode开发插件](./doc/5_toolchain.md)
- [COREF API](https://codefuse-ai.github.io/CodeFuse-Query/godel-api/coref_library_reference.html)

## 教程 (tutorial)
- [在线教程](./tutorial/README.md)

## 目录结构说明
- `cli`：命令行工具的入口，提供统一的命令行接口，调用其他模块完成具体功能
- `language`：各语言的数据化核心（extractor）和数据建模（lib）。关于开放度的问题，请参见《关于开源范围的一些说明》章节
- `doc`：参考文档
- `examples`：Gödel 查询语言示例
- `tutorial`：CodeFuse-Query 开发容器使用教程

## 关于开源范围的一些说明
截止目前，从源码**不能**构建出可执行的程序，原因在于本次开源并没有开放所有的模块，缺少的模块会在之后的一年陆续开源。尽管如此，为保障完整的体验，我们开放了**完整的安装包**下载，请见Release页面。
关于语言的开放程度，可以查看下表：

| 语言 | 数据建模开源 | 数据化核心开源 | 成熟度 |
| --- | --- | --- | --- |
| Python | Y | Y | RELEASE |
| Java | Y | N | RELEASE |
| JavaScript | Y | N | RELEASE |
| Go | Y | N | RELEASE |
| XML | Y | N | RELEASE |
| Cfamily | N | N | BETA |
| SQL | N | N | BETA |
| Swift | N | N | BETA |
| Properties | N | N | BETA |

## 联系我们
![微信用户群图片](./assets/wechat_qrcode.JPG)
## Star History

[![Star History Chart](https://api.star-history.com/svg?repos=codefuse-ai/CodeFuse-Query&type=Date)](https://star-history.com/#codefuse-ai/CodeFuse-Query&Date)
