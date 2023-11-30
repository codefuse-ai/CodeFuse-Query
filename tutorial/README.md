## CodeFuse-Query使用教程

### 使用Github Codespaces 来体验CodeFuse-Query分析能力

### Jupyter kernel for CodeFuse-query 介绍

Jupyter kernel for CodeFuse-query 是 Jupyter 的一个特定内核，它为 Jupyter 环境提供了与 CodeFuse-query 相关的交互式功能。该内核允许用户在 Jupyter Notebook 中编写和执行 Godel 脚本，用于抽取、查询代码数据。此外，它还支持编写 Python 代码，以便对查询到的数据进行更深入的数据可视化和数据后处理操作。这里我们使用这个内核编写 Jupyter Notebook，用来进行 CodeFuse-Query 教程的学习和实践。

#### 步骤

- 创建 Codespaces，依次点击 Code -> Codespaces，在当前分支创建一个 Codespaces
- 创建后，打开该 Codespaces，加载完成后，切换至项目 tutorial/notebook 目录下
- 选择示例下的 Jupyter Notebook 分析教程，即可开始体验

#### 注意

在打开 Jupyter 页面之后，如果是第一次加载容器，你还需要配置教程所使用的 `Jupyter kernel for CodeFuse-query`。在右上角的 "选择内核" 弹出框中，依次选择 "Jupyter Kernel..." -> "Godel Kernel"。

#### Kernel 用法
##### 设置要查询的 COREF database

使用 `%db /path/to/db` 魔法命令来设置COREF db路径，内核会读取这个值来进行query查询，比如：

```bash
%db ./db
```

> tips: 还可以用`!`来运行一些有用的bash命令，比如查看Sparrow CLI是否存在：

```rust
!which sparrow
```

##### Godel 查询

设置好db路径后可以直接写Godel脚本，Jupyter kernel会创建临时文件来保存当前运行的Godel脚本并调用`sparrow query run`命令来进行查询，结果返回以HTML格式显示：


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
%%save_to PATH - save the query result to a JSON file.

This cell magic will save the Sparrow query result to a file.

Example:
    %%save_to /path/to/file.json
```

比如：
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
