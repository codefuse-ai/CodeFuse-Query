# Exception

Primary key: `element_hash_id: int`

```rust
schema Exception {
  @primary element_hash_id: int,
  callable_hash_id: int,
  name: string,
  type_hash_id: int,
}
```
## Exception::getType

```rust
/**
     * @brief gets the type for the element.
     * @return Type
     */
```
```rust
pub fn getType(self: Exception) -> ReferenceType;
```
## Exception::getCallableHashId

```rust
/**
     * @brief gets the callable hash id of this element.
     * @return int
     */
```
```rust
pub fn getCallableHashId(self: Exception) -> int;
```
## Exception::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: Exception) -> string;
```
## Exception::getClass

```rust
/**
     * @brief gets the Class of the exception element.
     * @return Class 
     */
```
```rust
pub fn getClass(self: Exception) -> Class;
```
## Exception::getCallable

```rust
/**
     * @brief gets the method of the exception element.
     * @return Method 
     */
```
```rust
pub fn getCallable(self: Exception) -> Method;
```
## Exception::getTypeHashId

```rust
/**
     * @brief gets the type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: Exception) -> int;
```
## Exception::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Exception;
```
## Exception::is\<T\>

```rust
pub fn is<T>(self: Exception) -> bool;
```
## Exception::to\<T\>

```rust
pub fn to<T>(self: Exception) -> <any>;
```
## Exception::key\_neq

```rust
pub fn key_neq(self: Exception, object: <any>) -> bool;
```
## Exception::key\_eq

```rust
pub fn key_eq(self: Exception, object: <any>) -> bool;
```
## Exception::to\_set

```rust
pub fn to_set(self: Exception) -> *Exception;
```
