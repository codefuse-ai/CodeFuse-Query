## CodeFuse-Query Tutorial Guide

We have created a tutorial in the form of a Jupyter Notebook, which you can experience using the development container (devcontainer) configured by the project. While reading, you can execute the code, observe the results, and modify the code to see feedback, thereby experiencing the powerful custom analysis capabilities of CodeFuse-Query firsthand.

Regarding the development container used for running the tutorial, you can use the GitHub Codespaces feature for a remote loading experience without any additional configuration of the development environment. Access it through a browser and enjoy the convenience of remote access. Alternatively, you can use VS Code with a local development container (dev container) to experience the CodeFuse-Query tutorial (local installation of VS Code and Docker is required).

#### Further Reading
- [Github Codespaces](https://github.com/features/codespaces)
- [Jupyter Notebook](https://jupyter.org/)
- [VS Code devcontainer](https://code.visualstudio.com/docs/devcontainers/containers)

### 1. Experience CodeFuse-Query's Analytical Capabilities Using Github Codespaces

#### Steps to Experience
1. Create a Codespace. Click on Code -> Codespaces on the project home page, then create a Codespace in the current branch.
2. After creation, open the Codespace. Once it has loaded, navigate to the tutorial/notebook directory of the project.
3. Select the Jupyter Notebook tutorial under examples, which is the ipynb file.
4. In the "Select Kernel" popup in the upper right corner, select "Jupyter Kernel..." followed by "Godel Kernel".
5. Start your experience.

### 2. Experience CodeFuse-Query's Analytical Capabilities Using a Local VS Code Development Container

#### Steps to Experience
1. Clone the code to your local machine and open the project in VS Code.
2. VS Code will automatically detect the devcontainer configuration file (.devcontainer/devcontainer.json). It will prompt you whether to reopen the repository with the devcontainer configuration applied. Click the 'Reopen' button to proceed.
3. After loading, switch to the tutorial/notebook directory of the project.
4. Select the Jupyter Notebook tutorial under examples to begin your experience.

**Note**: Before executing step 2, ensure that Dev Containers extension (extension ID: `ms-vscode-remote.remote-containers`) or Remote Development extension pack (extension ID: `ms-vscode-remote.vscode-remote-extensionpack`, which includes Dev Containers extension) is installed in your VS Code. If not installed, you can search for and install it through the extension store using the extension ID.

## Introduction to Jupyter kernel for CodeFuse-Query
The Jupyter kernel for CodeFuse-Query (referred to as Godel Kernel) is a specific kernel for Jupyter that provides interactive functionalities related to CodeFuse-Query within the Jupyter environment. This kernel offers the following capabilities:
- Supports writing and executing Godel scripts within Jupyter Notebooks.
- Supports the `%%python` command to write and execute Python code, facilitating deeper data visualization and post-processing operations on the queried data.
- Supports customizing the COREF db path.
- Dumps the output of a Jupyter cell to a specific file.

Please refer to the next section for a detailed introduction to these features "Introduction to Godel Kernel Usage".

#### Introduction to Godel Kernel Usage
##### Setting the COREF database to query

Use the `%db /path/to/db` command to set the COREF db path. The kernel will read this value for querying, for example:

```bash
%db ./db
```

> tips: You can also use `!` to execute some useful bash commands, such as checking if the CodeFuse-Query CLI (sparrow) exists:

```rust
!which sparrow
```

##### Running Godel queries

After setting the db path, you can write Godel scripts directly. The Godel kernel will create temporary files to save the currently running Godel script and call the `sparrow query run` command to perform the query. The results are displayed in HTML format:


```rust
// Write your query and run in the notebook
// ...
```


The `%db` command can be written on the first line of the Godel script:


```rust
%db ./db
// Write your query and run in the notebook
// ...
```


You can use the `%%save_to` cell command to save the results of the **last successful run** of a query to a JSON file. Here's how to use it:
```bash
%%save_to ./query.json
```

##### Running Python code

Python code can be run using either `%%python` or `%python`, for example:

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