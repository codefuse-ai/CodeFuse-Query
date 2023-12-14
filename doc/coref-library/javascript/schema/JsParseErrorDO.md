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

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *JsParseErrorDO;
```
