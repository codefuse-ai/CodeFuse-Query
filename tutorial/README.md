## CodeFuse-Query使用教程

### 使用Github Codespaces 来体验CodeFuse-Query分析能力
我们编写了Jupyter Notebook形式的教程，你可以在 CodeFuse-Query 预置好的 Github Codespace 中打开，在阅读的同时执行代码，观察执行结果，也可以修改代码观察反馈，亲手体验 CodeFuse-Query 强大的自定义分析能力。

#### 扩展阅读
- [Github Codespaces](https://github.com/features/codespaces)
- [Jupyter Notebook](https://jupyter.org/)

#### 体验步骤
1. 创建 Codespaces。依次点击项目首页的 Code -> Codespaces，在当前分支创建一个 Codespaces。
2. 创建后，打开该 Codespaces，加载完成后，切换至项目 tutorial/notebook 目录下。
3. 选择示例下的 Jupyter Notebook 分析教程，即ipynb文件。
4. 在右上角的 "选择内核" 弹出框中，依次选择 "Jupyter Kernel..." -> "Godel Kernel"。
5. 开始体验。

### Jupyter kernel for CodeFuse-Query 介绍
Jupyter kernel for CodeFuse-Query(以下称 Godel Kernel) 是 Jupyter 的一个特定内核，它为 Jupyter 环境提供了与 CodeFuse-Query 相关的交互式功能。该内核提供以下能力：
- 支持在 Jupyter Notebook 中编写和执行 Godel 脚本。
- 支持 `%%python` 命令编写并执行 Python 代码，以便对查询到的数据进行更深入的数据可视化和数据后处理操作。
- 支持自定义COREF db路径。
- 转储Jupyter cell的输出结果到特定文件。

关于这些功能的详细介绍请看下一章节《Godel Kernel 用法介绍》。

#### Godel Kernel 用法介绍
##### 设置要查询的 COREF database

使用 `%db /path/to/db` 魔法命令来设置COREF db路径，内核会读取这个值来进行查询，比如：

```bash
%db ./db
```

> tips: 还可以用`!`来运行一些有用的bash命令，比如查看 CodeFuse-Query CLI(sparrow)是否存在：

```rust
!which sparrow
```

##### 运行 Godel 查询

设置好db路径后可以直接写Godel脚本，Godel kernel会创建临时文件来保存当前运行的Godel脚本并调用`sparrow query run`命令来进行查询，结果返回以HTML格式显示：


```rust
// Write your query and run in the notebook
// ...
```


`%db` 魔法命令可以写在 Godel 脚本的第一行：


```rust
%db ./db
// Write your query and run in the notebook
// ...
```


可以通过 `%%save_to` cell魔法命令保存**上一次运行成功**的 query 结果到一个JSON文件，具体用法：
```bash
%%save_to ./query.json
```

##### 运行 Python 代码

可以通过 `%%python` 或者 `%python` 来运行 Python 代码，比如：

```python
%%python
import pandas as pd
data = pd.read_json('./query.json')
data.sort_values('cmplx', ascending=False, inplace=True)
top_10 = data.head(10)
print(top_10)
```

```python
%python print('hello')
```
