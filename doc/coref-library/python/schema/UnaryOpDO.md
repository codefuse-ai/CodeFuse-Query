# UnaryOpDO

Primary key: `element_oid: int`

```rust
schema UnaryOpDO {
  parent_oid: int,
  location_oid: int,
  type: string,
  @primary element_oid: int,
}
```
## UnaryOpDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: UnaryOpDO) -> int;
```
## UnaryOpDO::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: UnaryOpDO) -> int;
```
## UnaryOpDO::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: UnaryOpDO) -> string;
```
## UnaryOpDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *UnaryOpDO;
```
## UnaryOpDO::is\<T\>

```rust
pub fn is<T>(self: UnaryOpDO) -> bool;
```
## UnaryOpDO::to\<T\>

```rust
pub fn to<T>(self: UnaryOpDO) -> <any>;
```
## UnaryOpDO::key\_neq

```rust
pub fn key_neq(self: UnaryOpDO, object: <any>) -> bool;
```
## UnaryOpDO::key\_eq

```rust
pub fn key_eq(self: UnaryOpDO, object: <any>) -> bool;
```
## UnaryOpDO::to\_set

```rust
pub fn to_set(self: UnaryOpDO) -> *UnaryOpDO;
```
