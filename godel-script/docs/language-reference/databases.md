# GödelScript Database

Back to [README.md](../../README.md#documents)

## Declaration

```rust
database School {
    student: *Student,
    classes: *Class as "class"
    ...
}
```

Tables in databases should be set type, which uses `*` before the type name.
And the table type must be `schema`.
And for table name `student`, when running soufflé directly, we read sqlite database
using the same table name.

If the table name conflicts with a keyword, try using `as "real_table"`, and
GödelScript will find the data from sqlite table `real_table`.

## Initializing

Database has a native method `fn load(dbname: string) -> Self`.
The argument string must be a string literal.

```rust
fn default_db() -> School {
    return School::load("example_db_school.db") // must use string literal
}
```

Then GödelScript will give you the input database.

## Get Schema From Database

It's quite easy to fetch schema data from database.
For example in `Student::__all__(db: School) -> *School`,
we could fetch the data by directly using `db.student`.

```rust
impl Student {
    pub fn __all__(db: School) -> *Student {
        return db.student
    }
}
```

Back to [README.md](../../README.md#documents)