# ComponentTypeDO

Primary key: `oid: int`

```rust
schema ComponentTypeDO {
  tp: int,
  name: string,
  index: int,
  parent: int,
  @primary oid: int,
}
```
## ComponentTypeDO::getIndex

```rust
/**
     * @brief gets the index of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: ComponentTypeDO) -> int;
```
## ComponentTypeDO::getTp

```rust
/**
     * @brief gets the tp of this element.
     * @return int
     */
```
```rust
pub fn getTp(self: ComponentTypeDO) -> int;
```
## ComponentTypeDO::getParent

```rust
/**
     * @brief gets the parent of this element.
     * @return int
     */
```
```rust
pub fn getParent(self: ComponentTypeDO) -> int;
```
## ComponentTypeDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: ComponentTypeDO) -> string;
```
## ComponentTypeDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ComponentTypeDO;
```
## ComponentTypeDO::is\<T\>

```rust
pub fn is<T>(self: ComponentTypeDO) -> bool;
```
## ComponentTypeDO::to\<T\>

```rust
pub fn to<T>(self: ComponentTypeDO) -> <any>;
```
## ComponentTypeDO::key\_neq

```rust
pub fn key_neq(self: ComponentTypeDO, object: <any>) -> bool;
```
## ComponentTypeDO::key\_eq

```rust
pub fn key_eq(self: ComponentTypeDO, object: <any>) -> bool;
```
## ComponentTypeDO::to\_set

```rust
pub fn to_set(self: ComponentTypeDO) -> *ComponentTypeDO;
```
