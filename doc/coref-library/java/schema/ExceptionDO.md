# ExceptionDO

Primary key: `element_hash_id: int`

```rust
schema ExceptionDO {
  type_hash_id: int,
  name: string,
  callable_hash_id: int,
  @primary element_hash_id: int,
}
```
## ExceptionDO::getCallableHashId

```rust
/**
     * @brief gets the callable hash id of this element.
     * @return int
     */
```
```rust
pub fn getCallableHashId(self: ExceptionDO) -> int;
```
## ExceptionDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: ExceptionDO) -> string;
```
## ExceptionDO::getTypeHashId

```rust
/**
     * @brief gets the type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: ExceptionDO) -> int;
```
## ExceptionDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ExceptionDO;
```
## ExceptionDO::is\<T\>

```rust
pub fn is<T>(self: ExceptionDO) -> bool;
```
## ExceptionDO::to\<T\>

```rust
pub fn to<T>(self: ExceptionDO) -> <any>;
```
## ExceptionDO::key\_neq

```rust
pub fn key_neq(self: ExceptionDO, object: <any>) -> bool;
```
## ExceptionDO::key\_eq

```rust
pub fn key_eq(self: ExceptionDO, object: <any>) -> bool;
```
## ExceptionDO::to\_set

```rust
pub fn to_set(self: ExceptionDO) -> *ExceptionDO;
```
