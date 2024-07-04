

const shell = require('shelljs');
const path = require('path');

// Set a fake version for ".prisma/client/package.json"
const packageJsonPath = path.join(
  path.dirname(__dirname),
  '/node_modules/.prisma/client/package.json',
);
shell.sed('-i', /^\{$/, '{\n  "version": "0.0.1",', packageJsonPath);
