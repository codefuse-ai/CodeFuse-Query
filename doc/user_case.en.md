# Use Cases
## Querying Code Features
A developer wants to know which String type variables are used in Repo A, so he writes a Gödel script as follows and submits it to the CodeFuse-Query system for results.
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
Similar needs: querying for classes, functions, variables, return values, call graphs, class inheritance, etc.
## Code Rule Checker
A team leader found that the team always wrote many bugs similar to Bug A. **He wanted to establish a code rule for Bug A and its checker** and do a check at the CodeReview stage. Through writing a query analysis on the CodeFuse-Query platform, and after testing it on the platform to meet the requirements, he solidified this analysis query as a code rule and launched it to the CodeReview/CI stage. Since then, this bug has never happened again.
Similar needs: writing static defect scanning rules for code risk interception.
## Obtaining Statistical Data
A researcher found that traditional code complexity metrics are difficult to accurately measure code complexity. By learning from international advanced experience and a stroke of genius, he designed a set of complexity metrics and algorithms. After implementing it with Gödel, **he found that without much optimization, the performance was already very high**, and it was quickly applied to more than 10 languages and over 110,000 repositories. He immediately had an in-depth understanding of the overall complexity of code repositories. Compared to the past, when he had to parse code and analyze syntax trees himself, and interface with systems, **it's hard to know how much more convenient it has become**.
Similar needs: code statistics, code metrics, algorithm design, academic research.

# Application Fields
Currently, CodeFuse-Query at Ant Group has already supported the implementation of multiple scenarios such as **CodeFuse large language model data cleaning**, **code metric assessment**, **R&D risk control**, **privacy security analysis**, **code intelligence**, **end-package size governance**, etc., with a monthly service call volume exceeding one million.
## High-Quality Code Data Cleaning - CodeFuse Code Large Model
The CodeFuse code large model is a model for dealing with code-related issues open-sourced by Ant Group. For the CodeFuse large language model, the quality of the training data directly affects the inference results of the model. Low-quality code data will directly pollute the output of the language model. For example, the model may learn incorrect code patterns, thereby generating incorrect code. If the data only contains code in a certain programming language, the model may not adapt well to the code of other programming languages.
To control the quality of code data entering the model and thereby improve the inferential capability of the model, we have sorted out the definition of high-quality code based on years of practical experience of the Ant code analysis team combined with industry consensus, and implemented automated, large-scale code data cleaning using existing program analysis technology.
CodeFuse-Query provides the following data cleaning capabilities for the CodeFuse code large model:

- High-quality code data cleaning: clean code data, including vulnerability scanning for Python, Java, JavaScript, TypeScript, Go, C, C++ 7 languages, filtering by language type/star count, filtering out data with 0 effective code lines, etc. Currently, about **2TB** of cleaned GitHub and Ant internal code data has been accumulated.
- Code Portrait: Implement high-performance, multi-dimensional automatic annotation of large-scale code, supporting Java, Scala, Kotlin, JavaScript, JSX, TypeScript, TSX, Vue, Python, Go, and other **10** languages, **77** common tags, **40** Ant-specific tags, a total of **117** tags. Current auto-annotation performance can reach **40MB/s**.
- Other atomic capabilities
   - Advanced code feature extraction, including AST (Abstract Syntax Tree), DFG (Data Flow Graph) data extraction, etc. Currently, AST information has been used for SFT training, with an accuracy of about 97%.
   - Code snippet identification, used for extracting code from text data, convenient for code formatting or adding Markdown format:
      - Text extraction code: extract code block information from the text, support parsing of mainstream languages, function and class definitions, only validate binary classification, which is to verify whether the text contains code blocks, accuracy is about 83%.
      - Identify the programming language type of code snippets: identify the programming language type of any code snippet, support 30+ languages, accuracy is about 80%.
   - Code comment pair extraction: support extraction of method-level comment-code pair information, cover **15 kinds** of GitHub's most popular languages, used for Text To Code/Code To Text SFT training.
## Change Analysis - Youku Server-side R&D Efficiency
From 2023, the Youku quality assurance team started exploring precise testing for the server-side. After half a year of technical accumulation and system building, a precise testing system with **change content identification, change impact analysis, testing capability recommendation, testing coverage assessment** was formed.
In this process, the capabilities that CodeFuse-Query can provide mainly include:

- Analyze the affected objects based on the code changes (file + line number): methods, entry points (http entry, hsf entry), call routes (all call routes from entry to changed method), database operations (table, operation type)
- Combined with the online dynamic call route (method route), CodeFuse-Query static analysis call route impact surface precise analysis capability, improve the effectiveness and preparation rate of change analysis impact surface

Up to now, Youku has integrated all core applications through CodeFuse-Query and has built a comprehensive server-side code knowledge base and network traffic knowledge base based on static analysis.
