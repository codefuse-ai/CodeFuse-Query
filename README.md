# CodeFuse-Query A Data-Centric Static Code Analysis System
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

[中文文档](./README_zh.md)

## What is CodeFuse-Query?
In the domain of large-scale software development, the demands for dynamic and multifaceted static code analysis exceed the capabilities of traditional tools. To bridge this gap, we present CodeFuse-Query, a system that redefines static code analysis through the fusion of Domain Optimized System Design and Logic Oriented Computation Design.
CodeFuse-Query reimagines code analysis as a data computation task, support scanning over 10 billion lines of code daily and more than 300 different tasks. It optimizes resource utilization, prioritizes data reusability, applies incremental code extraction, and introduces tasks types specially for Code Change, underscoring its domain-optimized design. The system's logic-oriented facet employs Datalog, utilizing a unique two-tiered schema, COREF, to convert source code into data facts. Through Godel, a distinctive language, CodeFuse-Query enables formulation of complex tasks as logical expressions, harnessing Datalog's declarative prowess.

Overall, the CodeFuse-Query platform is divided into three main parts: code data model, code query DSL, and platform productization services.
### Code Data Model: COREF
We have defined a code data and standardization model: COREF, which requires all code to be converted to this model through various language extractors.
COREF mainly contains the following information:
**COREF** = AST (Abstract Syntax Tree) + ASG (Abstract Semantic Graph) + CFG (Control Flow Graph) + PDG (Program Dependency Graph) + Call Graph + Class Hierarchy + Documentation (Documentation/Comments)
Note: Since the computation difficulty of each type of information varies, not all languages' COREF information includes all the above. The basic information mainly consists of AST, ASG, Call Graph, Class Hierarchy, and Documentation, while other information (CFG and PDG) is still under construction and will be gradually supported.
### Code Query DSL
Based on the generated COREF code data, CodeFuse-Query uses a custom DSL language called **Gödel** for queries to meet code analysis needs.
Gödel is a logical reasoning language based on the logical reasoning language Datalog, which derives new facts through "facts" and "rules". Gödel is also a declarative language, which, compared to imperative programming, focuses more on describing "what is needed" and leaves the implementation to the computation engine.
Since the code has been transformed into relational data (COREF data is stored in the form of relational data tables), one might wonder why not use SQL directly or use an SDK, but instead learn a new DSL language. The reason is that Datalog has monotonicity and termination properties, meaning that Datalog sacrifices some expressive power, and Gödel inherits this characteristic.

- Compared to SDKs, Gödel's main advantage is ease of learning and use; its declarative nature means users do not need to focus on intermediate computations but can describe their needs simply, like with SQL.
- Compared to SQL, Gödel's advantages are stronger descriptive ability and faster computation speed, for example, in describing recursive algorithms and multi-table joint queries, which are difficult for SQL.
### Platformization, Productization
CodeFuse-Query includes the **Sparrow CLI** and the online service **Query Center**. Sparrow CLI contains all components and dependencies, such as extractors, data model, compiler, etc., allowing users to generate code data and conduct queries locally (for Sparrow CLI usage, please see Section 3: Installation, Configuration, and Running). If users require online queries, they can experiment using the Query Center.
## Supported Programming Languages for Analysis
As of now, CodeFuse-Query supports data analysis for 11 programming languages. Among them, support for 5 languages (Java, JavaScript, TypeScript, XML, Go) is very mature, while the remaining 6 languages (Object-C, C++, Python3, Swift, SQL, Properties) are in beta stage and have room for further improvement and perfection. The specific support status is shown in the table below:

| Language | Status | COREF Model Node Count |
| --- | --- | --- |
| Java | Mature | 162 |
| XML | Mature | 12 |
| TS/JS | Mature | 392 |
| Go | Mature | 40 |
| OC/C++ | Beta | 53/397 |
| Python3 | Beta | 93 |
| Swift | Beta | 248 |
| SQL | Beta | 750 |
| Properties | Beta | 9 |

Note: The maturity level of the language status is determined based on the types of information contained in COREF and the actual implementation. Except for OC/C++, all languages support complete AST information and Documentation, and in the case of Java, COREF for Java also supports ASG, Call Graph, Class Hierarchy, and some CFG information.

## Quick Start
[Installation, Configuration, and Running](./doc/3_install_and_run.md)

## Documentation
- [Abstract](./doc/1_abstract.md)
- [Introduction](./doc/2_introduction.md)
- [User Case](./doc/user_case.en.md)
- [Installation, Configuration, and Running](./doc/3_install_and_run.md)
- [GödelScript Query Language](./doc/4_godelscript_language.md)
- [Developing Plugins (VSCode)](./doc/5_toolchain.md)
- [COREF API](https://codefuse-ai.github.io/CodeFuse-Query/godel-api/coref_library_reference.html)

## Tutorial
- [Online Tutorial](./tutorial/README.en.md)

## Directory Structure Description
- `cli`: The entry point for the command-line tool, providing a unified command-line interface, calling other modules to complete specific functions
- `language`: Core data and data modeling (lib) for various languages. Regarding the degree of openness, please refer to the section "Some Notes on the Scope of Open Source"
- `doc`: Reference documents
- `examples`: Gödel query language examples
- `tutorial`：CodeFuse-Query Development Container Usage Tutorial

## Some Notes on the Scope of Open Source
As of now, it is **not possible** to build an executable program from the source code because not all modules have been made open-source in this release, and missing modules will be released over the next year. Nevertheless, to ensure a complete experience, we have released **complete installation packages** for download, please see the Release page.
Regarding the openness of languages, you can refer to the table below:

| Language | Data Modeling Open Source | Data Core Open Source | Maturity |
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

## Contact Us
![WeChat User Group Image](./assets/wechat_qrcode.JPG)
## Star History

[![Star History Chart](https://api.star-history.com/svg?repos=codefuse-ai/CodeFuse-Query&type=Date)](https://star-history.com/#codefuse-ai/CodeFuse-Query&Date)