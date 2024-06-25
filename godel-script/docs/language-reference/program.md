# GödelScript Program

Back to [README.md](../../README.md#documents)

## Content
* 程序组成 | [Program Component](#program-component)
* 程序注释 | [Notes](#notes)
* 程序入口 | [Main](#main)

## Program Component

GödelScript programs may include:

1. [package/symbol import](./import.md)
2. [enum declaration](./enums.md)
3. [schema declaration](./schemas.md)
4. [database declaration](./databases.md)
6. [schema method implementation](./impl.md)
7. [function declaration and implementation](./functions.md)
8. [query declaration](./queries.md)

Here is an example including all the components mentioned above:

```rust
// package import
use coref::java::{Annotation, JavaDB}

// function declaration
fn default_db() -> JavaDB {
    return JavaDB::load("example.db")
}

// enum declaration
Enum status {
    killed,
    running,
    suspend
}

// schema declaration
Schema File {
    @primary id: int
}

// database declaration
database NewDB {
    file: *File
}

impl File {
    pub fn __all__() -> *File {
        yield File {id: 1}
        yield File {id: 2}
    }

    pub fn getId(self) -> int {
        return self.id
    }
}

// query declaration
query get_all_anno from
    anno in Annotation(default_db())
select
    anno.id as id
```

## Notes

GödelScript uses C-like notes/comments。

```c
// single line comment

/*
 * multi line comment
*/
```

## Main

__[Warning] Deprecated: Better use `@output`__

Query output of GödelScript will output by main function.
Main function is the only one that does not need return value in GödelScript.

Query output uses native function `output`.
This function only needs functions that you want to output the result as the argument.
And the argument function __does not need arguments__.
`output` can only be called in `main`.

```rust
fn query_0(a: int, b: int) -> bool {
    ...
}

fn query_1(a: int, b: string) -> bool {
    ...
}

fn main() {
    // output table structure: a (int) b (int)
    output(query_0())

    // output table structure: a (int) b (string)
    output(query_1())
    ...
}
```

Back to [README.md](../../README.md#documents)