# 介绍
coref-js-src-extractor 是一个数据生成工具，该工具将 JavaScript / TypeScript 源码抽取为COREF格式的数据。

# 快速开始
1. 环境要求 Node>=18。
2. 安装 yarn。 `npm install --global yarn` 并安装依赖 `yarn`。
3. 构建 && 打包。  `npm run pkg`. 当前目录下会生成 `coref-javascript-src-extractor` 可执行文件。
4. 运行抽取器。`./coref-javascript-src-extractor extract -s {source_root}`。
5. 查看更多帮助。`./coref-javascript-src-extractor -h` 或 `./coref-javascript-src-extractor extract -h`。
