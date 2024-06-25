# GödelScript Types

Back to [README.md](../../README.md#documents)

GödelScript reserved some symbols for basic types,
other types defined by users could also be used:

* [Enum](./enums.md)
* [Schema](./schemas.md)
* [Database](./databases.md)

Some type definitions like this below may also exists:

```rust
*int
*string
*Annotation
```

Type with `*` means it is a __set__ type:

```rust
*int        // int set
*string     // string set
*Annotation // schema Annotation set
```

## GödelScript Basic Types

### Bool

`bool` literal should be `true` or `false`.

### String

`string` includes these native methods:

```rust
fn to_int(self: string) -> int;
fn substr(self: string, begin: int, length: int) -> string;
fn len(self: string) -> int;
fn get_regex_match_result(self: string, str: string, num: int) -> string;
fn matches(self: string, str: string) -> bool;
fn contains(self: string, str: string) -> bool;
fn ne(self: string, str: string) -> string;
fn eq(self: string, str: string) -> string;
fn add(self: string, str: string) -> string;
fn to_set(self) -> *string;
fn to_upper(self) -> string;
fn to_lower(self) -> string;
fn replace_all(self, pattern: string, replacement: string) -> string;
fn replace_once(self, pattern: string, replacement: string, index: int) -> string;
```

### Float

`float` includes these native methods:

```rust
fn rem(self: float, num: float) -> float;
fn pow(self: float, num: float) -> float;
fn le(self: float, num: float) -> float;
fn gt(self: float, num: float) -> float;
fn ne(self: float, num: float) -> float;
fn ge(self: float, num: float) -> float;
fn eq(self: float, num: float) -> float;
fn div(self: float, num: float) -> float;
fn sub(self: float, num: float) -> float;
fn mul(self: float, num: float) -> float;
fn lt(self: float, num: float) -> float;
fn add(self: float, num: float) -> float;
fn neg(self: float) -> float;
```

### Int

`int` includes these native methods:

```rust
fn bitxor(self: int, num: int) -> int;
fn bitor(self: int, num: int) -> int;
fn bitand(self: int, num: int) -> int;
fn rem(self: int, num: int) -> int;
fn pow(self: int, num: int) -> int;
fn le(self: int, num: int) -> int;
fn lt(self: int, num: int) -> int;
fn gt(self: int, num: int) -> int;
fn ne(self: int, num: int) -> int;
fn ge(self: int, num: int) -> int;
fn eq(self: int, num: int) -> int;
fn div(self: int, num: int) -> int;
fn mul(self: int, num: int) -> int;
fn sub(self: int, num: int) -> int;
fn add(self: int, num: int) -> int;
fn bitnot(self: int) -> int;
fn neg(self: int) -> int;
fn to_string(self: int) -> string;
fn range(begin: int, end: int) -> *int;
fn to_set(self) -> *int;
```

### Aggregator for Set Types

```rust
fn len(self: *T) -> int;
fn sum(self: *int) -> int;
fn min(self: *int) -> int;
fn max(self: *int) -> int;
fn find(self: *T0, instance: T1) -> T0;
```

Back to [README.md](../../README.md#documents)