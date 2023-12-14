# TokenDO

Primary key: `element_oid: int`

```rust
schema TokenDO {
  location_oid: int,
  parent_oid: int,
  value: string,
  @primary element_oid: int,
}
```
## TokenDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: TokenDO) -> int;
```
## TokenDO::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: TokenDO) -> int;
```
## TokenDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: TokenDO) -> string;
```
## TokenDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *TokenDO;
```
## TokenDO::is\<T\>

```rust
pub fn is<T>(self: TokenDO) -> bool;
```
## TokenDO::to\<T\>

```rust
pub fn to<T>(self: TokenDO) -> <any>;
```
## TokenDO::key\_neq

```rust
pub fn key_neq(self: TokenDO, object: <any>) -> bool;
```
## TokenDO::key\_eq

```rust
pub fn key_eq(self: TokenDO, object: <any>) -> bool;
```
## TokenDO::to\_set

```rust
pub fn to_set(self: TokenDO) -> *TokenDO;
```
