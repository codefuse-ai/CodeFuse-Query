# GödelScript Query

Back to [README.md](../../README.md#documents)

## Query Name

After keyword `query`, there requires a query name:

```rust
query this_is_example_query
```

## From

GödelScript query uses keyword `from` for variable definition.
Declared variables must be initialized, the way of initializing variables is the same
as in `for` statement.
But we do not need to consider whether the variable is a collection or not.

Initialization is executed by order, so using variables before when initializing
other variables is allowed.

```rust
from
    anno in Annotation(db()),
    class in Class(db()),
    loc in class.getLocation()
```

## Where

GödelScript query uses `where` with conditional expression for filtering data.

```rust
where
    anno = class.getAnnotation() &&
    loc.getFile().getRelativePath().contains(".java")
```

## Select

GödelScript query uses `select` to generate the final result.
Each select data has an expression and it's corresponding column name after keyword `as`. If column name is not given, GödelScript will generate a random column name automatically.

```rust
select
    anno.getName() as annotationName,
    loc.getFile() as fileName,
    class.getName() // random column name: column_543771021
```

The total query declaration is as follows:

```rust
query this_is_example_query from
    anno in Annotation(db()),
    class in Class(db()),
    loc in class.getLocation()
where
    anno = class.getAnnotation() &&
    loc.getFile().getRelativePath().contains(".java")
select
    anno.getName() as annotationName,
    loc.getFile() as fileName,
    class.getName()
```

And it is equivalent to:

```rust
@output
fn this_is_example_query(
    annotationName: string,
    fileName: string,
    column_543771021: string
) -> bool {
    for(anno in Annotation(db()), class in Class(db())) {
        let (loc in c.getLocation()) {
            if (anno = c.getAnnotation() &&
                loc.getFile().getRelativePath().contains(".java")) {
                if (annotationName = anno.getName() &&
                    fileName = loc.getFile() &&
                    column_543771021 = class.getName()) {
                    return true
                }
            }
        }
    }
}

```

Back to [README.md](../../README.md#documents)
