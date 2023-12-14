# ModDO

Primary key: `element_oid: int`

```rust
schema ModDO {
  location_oid: int,
  type: string,
  @primary element_oid: int,
}
```
## ModDO::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: ModDO) -> int;
```
## ModDO::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ModDO) -> string;
```
## ModDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ModDO;
```
## ModDO::is\<T\>

```rust
pub fn is<T>(self: ModDO) -> bool;
```
## ModDO::to\<T\>

```rust
pub fn to<T>(self: ModDO) -> <any>;
```
## ModDO::key\_neq

```rust
pub fn key_neq(self: ModDO, object: <any>) -> bool;
```
## ModDO::key\_eq

```rust
pub fn key_eq(self: ModDO, object: <any>) -> bool;
```
## ModDO::to\_set

```rust
pub fn to_set(self: ModDO) -> *ModDO;
```
