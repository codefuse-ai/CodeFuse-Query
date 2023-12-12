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
## 使用场景
### 查询代码特征
小开发同学想知道 Repo A 里面使用了哪些 String 型的变量，所以他写了一个 Gödel 如下，交给 CodeFuse-Query 系统给他返回了结果。
```rust
// script
use coref::java::*

fn out(var: string) -> bool {
  for(v in Variable(JavaDB::load("coref_java_src.db"))) {
    if (v.getType().getName() = "String" && var = v.getName()) {
      return true
    }
  }
}

fn main() {
  output(out())
}
```
类似需求：查询：类，函数，变量，返回值，调用图，类继承等等。
### 代码规则检查器
小 TL 同学发现团队总是写出很多类似的 Bug A，**他想针对 Bug A 制定一个代码规则和其检查器**，并在 CodeReview 阶段做个卡点。小 TL 通过在 CodeFuse-Query 平台上面编写了一段分析 Query，在平台上面测试符合要求，把这段分析 Query 固化下来作为一个代码规则，并上线到了 CodeReview/CI 阶段。从此这个 Bug 再也没发生过了。
类似需求：编写静态缺陷扫描规则进行代码风险拦截。
### 获取统计数据
小研究发现传统的代码复杂度指标很难准确地衡量代码的复杂情况，通过学习国际先进经验加上自我灵光一闪，设计了一套复杂度指标和算法。通过 Gödel 实现出来以后，**发现不怎么优化就已经性能非常高了**，很快就应用到了 10 几种语言，11+万个仓库当中去了。马上就对代码仓库整体的复杂度有了深入的了解。相比较以前需要自己解析代码，分析语法树，对接系统，**不知道方便了多少。**
类似需求：代码统计，代码度量，算法设计，学术研究。

## 应用领域 
目前，CodeFuse-Query在蚂蚁集团已经支持 **CodeFuse大语言模型数据清洗**、**代码度量评估**、**研发风险控制**、**隐私安全分析**、**代码智能**、**终端包大小治理 **等多个场景的落地应用，服务月均调用量超过百万。
### 高质量代码数据清洗 - CodeFuse代码大模型
CodeFuse代码大模型是蚂蚁集团对外开源的处理代码相关问题的模型，对于CodeFuse大语言模型而言，训练的数据质量直接影响模型的推理结果。低质量的代码数据会直接污染语言模型的输出，例如：模型可能会学习到错误的代码模式，从而生成错误的代码；数据中只包含某种编程语言的代码，模型可能无法很好地适应其他编程语言的代码。
为了把控进入模型的代码数据质量，进而提升模型的推理能力。我们基于蚂蚁程序分析团队多年的实践积累结合业界共识，梳理了高质量代码的定义方式，并利用已有程序分析技术实现了自动化、大规模的代码数据清洗。
CodeFuse-Query为CodeFuse代码大模型提供了以下数据清洗能力：

- 高质量代码数据清洗：对代码数据进行清洗，包括对 Python，Java，JavaScript，TypeScript，Go，C，C++ 7 种语言进行漏洞扫描，对语言种类 / star 数进行筛选，过滤有效代码行数为 0 的数据等。目前已沉淀清洗后的 GitHub 和蚂蚁内部代码数据总共约 **2TB**。
- 代码画像：实现对大规模代码进行高性能多维度的自动标注，支持 Java, Scala, Kotlin, JavaScript, JSX, TypeScript, TSX, Vue, Python, Go 等 **10** 种语言，**77** 种通用标签，**40** 种蚂蚁特有标签，共 **117** 种标签。目前自动标注性能能够达到 **40MB/s**。
- 其他原子能力
   - 高级代码特征提取，包括提取 AST（抽象语法树），DFG（数据流图）数据等。目前 AST 信息已用于 SFT 训练，准确率 97% 左右。
   - 代码片段识别，用于针对文本数据中的代码进行提取，方便进行代码格式化或加上 Markdown 格式：
      - 文本提取代码：从文本中提取代码块信息，支持主流语言的解析，函数及类定义，仅验证二分类问题，就是说仅验证文本是否含有代码块准确率 83% 左右。
      - 识别代码片段的编程语言种类：识别任意代码片段的编程语言种类，支持 30+ 种语言，准确率80%左右。
   - 代码注释对提取：支持提取方法级别的注释-代码对信息，覆盖 **15 种** GitHub 最流行的语言，用于 Text To Code/Code To Text 的 SFT 训练。
### 变更分析-优酷服务端研发效能
优酷质量保障团队从2023年开始针对服务端精准测试的探索，经过半年的技术沉淀和体系搭建，形成了具备**变更内容识别、变更影响分析、测试能力推荐、测试覆盖评估**的精准测试体系。
在此过程中，CodeFuse-Query能提供的能力主要有：

- 根据代码变更内容（文件+行号），分析出影响的对象：方法、入口（http入口、hsf入口）、调用链路（从入口到变更方法的所有调用链路）、数据库操作（表、操作类型）
- 结合线上动态调用链路（方法链路）、CodeFuse-Query静态分析调用链路的影响面精准分析能力，提升变更分析影响面的有效性、准备率

到目前为止，优酷已通过CodeFuse-Query接入所有核心应用，并基于静态分析采集数据，构建了服务端完整的代码知识库和流量知识库。

## 快速使用（QuickStart）
[安装、配置、运行](./doc/3_install_and_run.md)

## 文档 (Documentation)
- [引言](./doc/1_abstract.md)
- [概述](./doc/2_introduction.md)
- [安装、配置、运行](./doc/3_install_and_run.md)
- [Gödel查询语言介绍](./doc/4_godelscript_language.md)
- [VSCode开发插件](./doc/5_toolchain.md)

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
![微信用户群图片](./assets/wechat_qrcode_1214.JPG)
## Star History

[![Star History Chart](https://api.star-history.com/svg?repos=codefuse-ai/CodeFuse-Query&type=Date)](https://star-history.com/#codefuse-ai/CodeFuse-Query&Date)
