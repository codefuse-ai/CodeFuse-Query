# ModTokenDO

Primary key: `oid: int`

```rust
schema ModTokenDO {
  token: string,
  idx: int,
  parent: int,
  @primary oid: int,
}
```
## ModTokenDO::getIdx

```rust
/**
     * @brief gets the idx of this element.
     * @return int
     */
```
```rust
pub fn getIdx(self: ModTokenDO) -> int;
```
## ModTokenDO::getParent

```rust
/**
     * @brief gets the parent of this element.
     * @return int
     */
```
```rust
pub fn getParent(self: ModTokenDO) -> int;
```
## ModTokenDO::getToken

```rust
/**
     * @brief gets the token of this element.
     * @return string
     */
```
```rust
pub fn getToken(self: ModTokenDO) -> string;
```
## ModTokenDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ModTokenDO;
```
## ModTokenDO::is\<T\>

```rust
pub fn is<T>(self: ModTokenDO) -> bool;
```
## ModTokenDO::to\<T\>

```rust
pub fn to<T>(self: ModTokenDO) -> <any>;
```
## ModTokenDO::key\_neq

```rust
pub fn key_neq(self: ModTokenDO, object: <any>) -> bool;
```
## ModTokenDO::key\_eq

```rust
pub fn key_eq(self: ModTokenDO, object: <any>) -> bool;
```
## ModTokenDO::to\_set

```rust
pub fn to_set(self: ModTokenDO) -> *ModTokenDO;
```
