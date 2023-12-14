# JsParseErrorDO

Primary key: `oid: int`

```rust
schema JsParseErrorDO {
  line: string,
  message: string,
  @primary oid: int,
}
```
## JsParseErrorDO::getLine

```rust
pub fn getLine(self: JsParseErrorDO) -> string;
```
## JsParseErrorDO::getMessage

```rust
pub fn getMessage(self: JsParseErrorDO) -> string;
```
## JsParseErrorDO::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *JsParseErrorDO;
```
## JsParseErrorDO::is\<T\>

```rust
pub fn is<T>(self: JsParseErrorDO) -> bool;
```
## JsParseErrorDO::to\<T\>

```rust
pub fn to<T>(self: JsParseErrorDO) -> <any>;
```
## JsParseErrorDO::key\_neq

```rust
pub fn key_neq(self: JsParseErrorDO, object: <any>) -> bool;
```
## JsParseErrorDO::key\_eq

```rust
pub fn key_eq(self: JsParseErrorDO, object: <any>) -> bool;
```
## JsParseErrorDO::to\_set

```rust
pub fn to_set(self: JsParseErrorDO) -> *JsParseErrorDO;
```
