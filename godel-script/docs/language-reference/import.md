# GödelScript Import/Use

Back to [README.md](../../README.md#documents)

## Content

* [Import All Symbol](#import-all-symbol)
* [Partial Import](#partial-import)
* [Package Management](#package-management)

## Import All Symbol

```rust
use coref::java::*
```

## Partial Import

```rust
use coref::java::{Annotation, Class, Method, JavaDB}
use coref::xml::XmlElement
```

## Package Management

GödelScript package manager is enabled when command line arguments including
`-p {package dir path}`.

### Path Mapping

Package manager will scan the structure of given directory, finding all the files
with `.gdl` or `.gs`. Then mapping the relative path to package path.

If illegal characters exist in relative path, for example `-`, or only numbers for
the file name, this path will not be accepted by package manager. But package
manager may not report error, instead, it will ignore them.

If want to get the ignored relative paths, try using `-v` for verbose info.
Package manager will report these paths by using warning info.

But if package path confliction occurs after scan, package manager will report
error and terminate the compilation process.

### Example

```
Library
|-- coref.java.gdl
|-- coref.xml.gdl
|-- coref.python.gdl
+-- coref
    |-- go.gdl
    +-- a
        +-- b.gdl

=>

coref::java
coref::xml
coref::python
coref::go
coref::a::b
```

Path confliction occurs in the example below:

```
Library
|-- coref
|   |-- java.gdl
|   +-- python.gdl
+-- coref.python.gdl

=>

coref::java
coref::python -- \
                  > confliction occurs
coref::python -- /
```

Illegal characters detected in this example:

```
Library
|-- 0123.gdl
|-- my-godel-lib
|   +-- js.gdl
+-- lib-file.123.gdl

=>
0123
^^^^ number

my-godel-lib::js
  ^     ^ character `-` included

lib-file::123
   ^      ^^^ path segment including number and `-`
```

Back to [README.md](../../README.md#documents)
