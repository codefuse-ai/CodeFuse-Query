# ModTokenDO

Primary key: `oid: int`

```rust
schema ModTokenDO {
  token: string,
  idx: int,
  parent: int,
  @primary oid: int
}
```
## ModTokenDO::getIdx

```java
/**
* @brief gets the idx of this element.
* @return int
*/
```
```rust
pub fn getIdx(self: ModTokenDO) -> int;
```
## ModTokenDO::getParent

```java
/**
* @brief gets the parent of this element.
* @return int
*/
```
```rust
pub fn getParent(self: ModTokenDO) -> int;
```
## ModTokenDO::getToken

```java
/**
* @brief gets the token of this element.
* @return string
*/
```
```rust
pub fn getToken(self: ModTokenDO) -> string;
```
## ModTokenDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ModTokenDO;
```
