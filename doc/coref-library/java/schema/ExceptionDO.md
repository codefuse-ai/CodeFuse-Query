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

```java
/**
* @brief gets the callable hash id of this element.
* @return int
*/
```
```rust
pub fn getCallableHashId(self: ExceptionDO) -> int;
```
## ExceptionDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: ExceptionDO) -> string;
```
## ExceptionDO::getTypeHashId

```java
/**
* @brief gets the type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: ExceptionDO) -> int;
```
## ExceptionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ExceptionDO;
```
