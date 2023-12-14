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

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: UnExtractedDO) -> string;
```
## UnExtractedDO::getType

```rust
/**
     * @brief gets the type of this element.
     * @return int
     */
```
```rust
pub fn getType(self: UnExtractedDO) -> int;
```
## UnExtractedDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *UnExtractedDO;
```
## UnExtractedDO::is\<T\>

```rust
pub fn is<T>(self: UnExtractedDO) -> bool;
```
## UnExtractedDO::to\<T\>

```rust
pub fn to<T>(self: UnExtractedDO) -> <any>;
```
## UnExtractedDO::key\_neq

```rust
pub fn key_neq(self: UnExtractedDO, object: <any>) -> bool;
```
## UnExtractedDO::key\_eq

```rust
pub fn key_eq(self: UnExtractedDO, object: <any>) -> bool;
```
## UnExtractedDO::to\_set

```rust
pub fn to_set(self: UnExtractedDO) -> *UnExtractedDO;
```
