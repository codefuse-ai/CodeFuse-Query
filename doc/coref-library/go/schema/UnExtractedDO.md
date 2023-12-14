# UnExtractedDO

Primary key: `oid: int`

```rust
schema UnExtractedDO {
  name: string,
  type: int,
  @primary oid: int,
}
```
## UnExtractedDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: UnExtractedDO) -> string;
```
## UnExtractedDO::getType

```java
/**
* @brief gets the type of this element.
* @return int
*/
```
```rust
pub fn getType(self: UnExtractedDO) -> int;
```
## UnExtractedDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *UnExtractedDO;
```
