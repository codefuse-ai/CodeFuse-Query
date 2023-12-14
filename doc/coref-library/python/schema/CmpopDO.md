# CmpopDO

Primary key: `element_oid: int`

```rust
schema CmpopDO {
  location_oid: int,
  parent_oid: int,
  value: int,
  @primary element_oid: int,
}
```
## CmpopDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: CmpopDO) -> int;
```
## CmpopDO::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: CmpopDO) -> int;
```
## CmpopDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return int
     */
```
```rust
pub fn getValue(self: CmpopDO) -> int;
```
## CmpopDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *CmpopDO;
```
## CmpopDO::is\<T\>

```rust
pub fn is<T>(self: CmpopDO) -> bool;
```
## CmpopDO::to\<T\>

```rust
pub fn to<T>(self: CmpopDO) -> <any>;
```
## CmpopDO::key\_neq

```rust
pub fn key_neq(self: CmpopDO, object: <any>) -> bool;
```
## CmpopDO::key\_eq

```rust
pub fn key_eq(self: CmpopDO, object: <any>) -> bool;
```
## CmpopDO::to\_set

```rust
pub fn to_set(self: CmpopDO) -> *CmpopDO;
```
