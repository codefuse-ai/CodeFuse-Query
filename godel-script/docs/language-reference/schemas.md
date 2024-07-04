# GödelScript Schema

Back to [README.md](../../README.md#documents)

## Declaration

Here's a schema declaration example,
the field declaration format is `field : type`,
primary key is annotated by `@primary`.

```rust
schema Student {
    @primary id: int,
    name: string,
    phone: string
}
```

## Initializing

GödelScript requires universal set for schema.
We could simply think it as the constructor of schema.
The constructor is declared in `impl` block, and should be public.
GödelScript only accept `__all__` as the constructor.

### From Database

Schema's universal set could be fetched from a database:

```rust
database DB {
    students: *Student 
}

impl Student {
    pub fn __all__(db: DB) -> *Student {
        return db.students
    }
}

fn getStudents() -> *Student {
    let (db = DB::load("example.db")) {
        for (student in Student(db)) {
            if (student.name.contains("von")) {
                yield student
            }
        }
    }
}
```

Inherited schema could use [this](#initializing-inherited-schema) to initialize.

### From Initializer

Schema's universal set could be initialized from initializers:

```rust
impl Student {
    pub fn __all__() -> *Student {
        yield Student {id: 1, name: "zxj", phone: "11451419"}
        yield Student {id: 2, name: "fxj", phone: "11451419"}
        yield Student {id: 3, name: "lyn", phone: "11451419"}
    }
}
```

This example also shows the feature of `initializer`,
by this way we could create a schema instance.
Although it's an instance created temporarily, this instance also should be
included in the universal set. Otherwise the creation is failed.

In this example, the `initializer` is used in constructor, so all the created
instance must be included in universal set.

## Inheritance

### Inherit Fields

Schema could be inherited, after inheritance, parent schema's fields will be
add at the front of the child schema structure.
All the inheritable methods will also be inherited from parent schema, except
`__all__`.

```rust
schema Lee extends Student {
    // parent fields added here.

    // @primary id: int,
    // name: string,
    // phone: string,
    for_example: int
}
```

### Inherit Methods

If parent schema has these two methods, child schema will inherit them.

```rust
impl Student {
    // method, first parameter is self, do not need type declaration.
    fn getName(self) -> string {
        return self.name
    }
    // static method, without self parameter
    fn getType() -> string {
        return "Student"
    }
}
```

### Method Override

GödelScript allows child schema implements methods that
having the same names of parent methods.
Methods of parent schema will be overridden.
Overridden methods share the same name,
but there's no need to share the same parameters and return type.

```rust
impl Lee {
    fn getType() -> string {
        return "Lee Student"
    }
}
```

### Initializing Inherited Schema

We often initialize child schema by universal set of parent schema:

```rust
schema Lee extends Student {
    // @primary id: int,
    // name: string,
    // phone: string,
    for_example: int
}

impl Lee {
    pub fn __all__(db: DB) -> *Lee {
        // schema(db) will call schema::__all__(db), this is a syntactic sugar
        // also it is correct to directly use schema::__all__(db)
        for (parent in Student(db)) {
            // ..parent here is a spread syntax
            yield Lee { ..parent, for_example: 114 }
        }
    }
}
```

And from the example above, we use another initializer feature `spread`,
this syntax will expand the input schema instance. GödelScript only do duck-type
check for the schema instance, so if the structure is correct, the program is
correct. It is not a must to use parent schema to initialize...

```rust
yield Lee { ..parent, for_example: 114 }
// this is equivalent to
// yield Lee { id: parent.id, name: parent.name, phone: parent.phone, for_example: 114 }
```

Here is an example, get `Class` in a specified file from universal set of `Class`,
by using inheritance:

```rust
schema ClassInIDKFile extends Class {}

impl ClassInIDKFile {
    fn __all__(db: JavaDB) -> *ClassInIDKFile {
        for(c in Class(db)) {
            if (c.getLocation().getFile().getRelativePath() = "./com/xxx/xxx.java") {
                yield ClassInIDKFile { ..c }
            }
        }
    }
}
```

### Comparison and Type Casting

#### `fn key_eq(self, T) -> bool` | `fn key_neq(self, T) -> bool`

For primary key comparisons, require schemas having `int` type primary key.

```rust
method.key_eq(function)
method.key_neq(function)
```

#### `fn to<T>(self) -> T`

Convert schema instance to another schema instance, duck type check.

```rust
stmt.to<ElementParent>()
```

#### `fn is<T>(self) -> bool`

Judge if this schema instance in universal set of another schema, duck type check.

```rust
stmt.is<ElementParent>()
```

Back to [README.md](../../README.md#documents)
