# Introduction
coref-js-src-extractor is a data generation tool that extracts JavaScript / TypeScript source code into COREF format data.

# Quick Start
1. Environment requirements Node>=18.
2. Install yarn. `npm install --global yarn` and then install dependencies with `yarn`.
3. Build && package. `npm run pkg`. A coref-javascript-src-extractor executable file will be generated in the current directory.
4. Run the extractor. `./coref-javascript-src-extractor extract -s {source_root}`.
5. For more help. `./coref-javascript-src-extractor -h` or `./coref-javascript-src-extractor extract -h`.