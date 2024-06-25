# GödelScript Function

Back to [README.md](../../README.md#documents)

## Content

* Function [Declaration](#function-declaration)
* Function [Implement](#function-implement)
* [Statement](#statement)
* [Expression](#expression)

## Function Declaration

GödelScript function declaration should include parameters, type of parameters
and the return type.
Only `main` function does not need return type.

```rust
fn func_name(param0: int, param1: string) -> ReturnValueType {...}

// deprecated
fn main() {...}
```

All the functions muse be [implemented](#function-implement)。

## Function Implementation

Implement functions:

```rust
fn func_name(param0: int, param1: string) -> int {
    return param0 + param1.to_int()
}
```

Multiple statements in the same code block has the `or` condition.
They do not share variables and conditions through each other. And the execution
is not ordered (scheduled by soufflé).

## Statement

GödelScript supports the following statements:

* [For Statement](#for-statement)
* [Let Statement](#let-statement)
* [Condition Statement](#condition-statement)
* [Match Statement](#match-statement)
* [Fact Statement(Experimental Feature)](#fact-statement)
* [Return Statement](#return-statement)

Here's an example for nested statements
```rust
for(...) {
    let (...) {
        if (...) {
            return true
        }
    }
    let (...) {
        if (...) {
            return false
        }
    }
}
```

### For Statement

For statement is used to define a variable from a set/collection.
Initialization expression is used after keyword `in`, and the type must be a set.
Initialization order is from left to right.

```rust
for (a in Annotation(db), c in Class(db), m in Method(db)) {
    ...
}
```

### Let Statement

Let statement is used to define a variable initialized by single value.
initial value after `=` must not be a set type.
Initialization order is from left to right.

```rust
let (file = c.getLocation.getFile(), anno = a.getName(), line = 1004) {
    ...
}
```

### Condition Statement

Condition statement does not support `else`, for the reason that this branch
often causes `ungrounded error` in soufflé.

```rust
if (xxxxx) {
    ...
}
```

### Match Statement

Match statement requires the matched variable/value is type of `int` or `string`.
And must use literals for matching.

```rust
match(type) {
    0 => if (anno.contains("a")) {
            return true
        },
    1 => return false,
    2 => for(b: BinaryOperator in BinaryOperator(db)) {
            if (b.getOperatorType() = "+") {
                return true
            }
        }
}
```

### Fact Statement

Fact statement is used to generate a collection of temporary data.
Once it is used in the function, other statements are not allowed.
All the data inside the fact statement must be `int` or `string` literals.
And each record of data must satisfy the parameter list:

```rust
fn multi_input_test(a: int, b: string, c: int) -> bool {
    [{1, "1", 1},
    {2, "2", 2},
    {3, "3", 3},
    {4, "4" ,4}]
}

@output
fn out(a: int) -> bool {
    for(num in int::range(0, 100)) {
        if (multi_input_test(num, num.to_string(), num) && a = num) {
            return true
        }
    }
}
```

### Return Statement

Return statement uses two keywords, and values are required after them.

```rust
return 0 // for return of single return type
yield 0  // for return of set return type
```

`return` is often used for return single value:

```rust
fn get() -> int {
    return 0
}
```

`yield` is only allowed to return a set of value:

```rust
fn int_set() -> *int {
    yield 0
    yield 1
    yield 2
}

fn getm() -> *int {
    // fn int_set() -> *int;
    yield int_set()
    yield 3
    yield 4
}
```

## Expression

GödelScript supports the following expressions:

* [Call Expression](#call-expression)
* [Binary Operator](#binary-operator)
    * [Mathematic Operator](#mathematic-operator)
    * [Compare Operator](#compare-operator)
    * [Logic Operator](#logic-operator)
* [Unary Operator](#unary-operator)

### Call Expression

Main components of call expressions are as follows:

* First Expression
    * [Function Call](#function-call)
    * [Literal | Bracketed Expression](#literal-or-bracketed-expression)
    * [Initializer List(Struct Expression)](#initializer-list)
* [Field Call](#field-call)
* [Path Call](#path-call)

#### Function Call

GödelScript function call is the same as other programming languages:

```rust
global_function(arg0, arg1, arg2)
```

#### Literal or Bracketed Expression

GödelScript Literal includes `int` `string` `float` `bool` literals.
These literals could be used as the first expression in call chains:

```rust
fn example() -> *int {
    yield "hello".len()
    yield 1.add(2).sub(4)
    yield "123".to_int().add(0)
}
```

Also bracketed expressions are allowed to be the first expression:

```rust
fn example() -> *int {
    yield ("hello" + "world").len()
    yield (1 + 0).add(2).sub(4)
}
```

#### Initializer List

GödelScript allows initializer for creating schema instance,
but the precondition is that this instance should be in the universal set of
the schema.
Initialization order of fields is not required.

```rust
schema Student {
    @primary id: int,
    name: string
}

impl Student {
    pub fn __all__(db: DB) -> *Student {
        return db.students
    }
}

fn example() -> Student {
    return Student {id: 0, name: "xxx"}
}
```

#### Field Call

Field call using `.`:

1. get field from schema instance
```rust
fn example(stu: Student) -> string {
    return stu.name
    //        ^^^^^
}
```
2. get table from database instance
```rust
impl Student {
    @data_constraint
    fn __all__(db: DB) -> *Student {
        return db.students
        //       ^^^^^^^^^
    }
}
```
3. call method from basic type instance or schema instance
```rust
fn example() -> *int {
    yield 1.add(2)
    //     ^^^^^^^
    yield Student {id: 0, name: "xxx"}.getId()
    //                                ^^^^^^^^
}
```

#### Path Call

Path call using `::`:

1. call static method from schema
```rust
impl Student {
    fn type() -> string {
        return "Student"
    }
}

fn example() -> string {
    return Student::type()
    //            ^^^^^^^^
}
```
2. call load method from database: `load(str: string) -> database`
```rust
fn example() -> *int {
    let (db = DB::load("example_src.db")) {
    //          ^^^^^^^^^^^^^^^^^^^^^^^^
        for(stu in Student(db)) {
            yield stu.id
        }
    }
}
```
3. get member from enum
```rust
enum Status {
    running,
    suspend
}

fn example() -> int {
    Status::running
    //    ^^^^^^^^^
    Status::suspend
    //    ^^^^^^^^^
}
```

### Binary Operator

#### Mathematic Operator

|`+`|`-`|`*`|`/`|
|:--|:--|:--|:--|
|add|sub|mul|div|

#### Compare Operator

Result must be `bool`. `=` will do binding operation if the left-value is not grounded when doing this
comparison, and this expression returns `true`.

|`=`|`<`|`>`|`<=`|`>=`|`!=`|
|:--|:--|:--|:--|:--|:--|
|eq|lt|gt|le|ge|ne|

#### Logic Operator

|`&&`|`\|\|`|
|:--|:--|
|and|or|

### Unary Operator

|`!`|`-`|
|:--|:--|
|not|neg|

Back to [README.md](../../README.md#documents)
