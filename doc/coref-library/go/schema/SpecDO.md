# SpecDO

Primary key: `oid: int`

```rust
schema SpecDO {
  debug_info: string,
  parent_id: int,
  kind: int,
  idx: int,
  @primary oid: int,
}
```
## SpecDO::getIdx

```rust
/**
     * @brief gets the idx of this element.
     * @return int
     */
```
```rust
pub fn getIdx(self: SpecDO) -> int;
```
## SpecDO::getParentId

```rust
/**
     * @brief gets the parent id of this element.
     * @return int
     */
```
```rust
pub fn getParentId(self: SpecDO) -> int;
```
## SpecDO::getDebugInfo

```rust
/**
     * @brief gets the debug info of this element.
     * @return string
     */
```
```rust
pub fn getDebugInfo(self: SpecDO) -> string;
```
## SpecDO::getKind

```rust
/**
     * @brief gets the kind of this element.
     * @return int
     */
```
```rust
pub fn getKind(self: SpecDO) -> int;
```
## SpecDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *SpecDO;
```
## SpecDO::is\<T\>

```rust
pub fn is<T>(self: SpecDO) -> bool;
```
## SpecDO::to\<T\>

```rust
pub fn to<T>(self: SpecDO) -> <any>;
```
## SpecDO::key\_neq

```rust
pub fn key_neq(self: SpecDO, object: <any>) -> bool;
```
## SpecDO::key\_eq

```rust
pub fn key_eq(self: SpecDO, object: <any>) -> bool;
```
## SpecDO::to\_set

```rust
pub fn to_set(self: SpecDO) -> *SpecDO;
```
