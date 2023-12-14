# ParentDO

Primary key: `parent_hash_id: int`

```rust
schema ParentDO {
  parent_type: string,
  @primary parent_hash_id: int,
}
```
## ParentDO::getParentType

```rust
/**
     * @brief gets the parent type of this element.
     * @return string
     */
```
```rust
pub fn getParentType(self: ParentDO) -> string;
```
## ParentDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ParentDO;
```
## ParentDO::is\<T\>

```rust
pub fn is<T>(self: ParentDO) -> bool;
```
## ParentDO::to\<T\>

```rust
pub fn to<T>(self: ParentDO) -> <any>;
```
## ParentDO::key\_neq

```rust
pub fn key_neq(self: ParentDO, object: <any>) -> bool;
```
## ParentDO::key\_eq

```rust
pub fn key_eq(self: ParentDO, object: <any>) -> bool;
```
## ParentDO::to\_set

```rust
pub fn to_set(self: ParentDO) -> *ParentDO;
```
