## CodeFuse-Query使用教程

我们编写了Jupyter Notebook形式的教程，你可以使用项目配置的开发容器（devcontainer） 来体验 CodeFuse-Query，在阅读的同时执行代码，观察执行结果，也可以修改代码观察反馈，亲手体验 CodeFuse-Query 强大的自定义分析能力。

关于教程所运行的开发容器，你可以使用 GitHub Codespaces 功能进行远程加载体验，无需额外配置开发环境，通过浏览器访问，享受远程访问的便利性；也可以使用 VS Code在本地使用开发容器（dev container）功能体验 CodeFuse-Query 的使用教程（需要本地预装 VS Code和 Docker）。

#### 扩展阅读
- [Github Codespaces](https://github.com/features/codespaces)
- [Jupyter Notebook](https://jupyter.org/)
- [VS Code devcontainer](https://code.visualstudio.com/docs/devcontainers/containers)

### 1. 使用 Github Codespaces 来体验CodeFuse-Query分析能力

#### 体验步骤
1. 创建 Codespaces。依次点击项目首页的 Code -> Codespaces，在当前分支创建一个 Codespaces。
2. 创建后，打开该 Codespaces，加载完成后，切换至项目 tutorial/notebook 目录下。
3. 选择示例下的 Jupyter Notebook 分析教程，即ipynb文件。
4. 在右上角的 "选择内核" 弹出框中，依次选择 "Jupyter Kernel..." -> "Godel Kernel"。
5. 开始体验。

### 2. 使用 VS Code 本地开发容器来体验CodeFuse-Query分析能力

#### 体验步骤
1. 克隆代码到本地，然后使用VS Code 打开项目
2. VS Code 会自动检测到 devcontainer 配置文件（ .devcontainer/devcontainer.json）。它将会提示你是否要重新打开仓库以应用 devcontainer 配置。点击「重新打开」按钮即可。
3. 加载完成后，切换至项目 tutorial/notebook 目录下
4. 选择示例下的 Jupyter Notebook 分析教程，即可开始体验

**注意**：执行第2步前，需要确保你的 VS Code 预先安装了 Dev Containners 扩展插件（扩展ID：`ms-vscode-remote.remote-containers`）或者 Remote Development 扩展套件（扩展ID：`ms-vscode-remote.vscode-remote-extensionpack`，该套件包含 Dev Containners 扩展）。如何还未安装，你可以在扩展商店通过扩展 ID 进行搜索安装。

## Jupyter kernel for CodeFuse-Query 介绍
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
