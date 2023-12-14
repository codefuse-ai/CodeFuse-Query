# ElementDO

Primary key: `element_hash_id: int`

```rust
schema ElementDO {
  parent_type: string,
  parent_id: int,
  type: string,
  @primary element_hash_id: int,
}
```
## ElementDO::getParentType

```rust
/**
     * @brief gets the parent type of this element.
     * @return string
     */
```
```rust
pub fn getParentType(self: ElementDO) -> string;
```
## ElementDO::getParentId

```rust
/**
     * @brief gets the parent id of this element.
     * @return int
     */
```
```rust
pub fn getParentId(self: ElementDO) -> int;
```
## ElementDO::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ElementDO) -> string;
```
## ElementDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ElementDO;
```
## ElementDO::is\<T\>

```rust
pub fn is<T>(self: ElementDO) -> bool;
```
## ElementDO::to\<T\>

```rust
pub fn to<T>(self: ElementDO) -> <any>;
```
## ElementDO::key\_neq

```rust
pub fn key_neq(self: ElementDO, object: <any>) -> bool;
```
## ElementDO::key\_eq

```rust
pub fn key_eq(self: ElementDO, object: <any>) -> bool;
```
## ElementDO::to\_set

```rust
pub fn to_set(self: ElementDO) -> *ElementDO;
```
