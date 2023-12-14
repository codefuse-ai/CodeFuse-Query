# Exception

Inherit from [ExceptionDO](./ExceptionDO.md)

Primary key: `element_hash_id: int`

```rust
schema Exception extends ExceptionDO {
  @primary element_hash_id: int,
  callable_hash_id: int,
  name: string,
  type_hash_id: int,
}
```
## Exception::getType

```java
/**
* @brief gets the type for the element.
* @return Type
*/
```
```rust
pub fn getType(self: Exception) -> ReferenceType;
```
## Exception::getCallableHashId

```java
/**
* @brief gets the callable hash id of this element.
* @return int
*/
```
```rust
pub fn getCallableHashId(self: Exception) -> int;
```
## Exception::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: Exception) -> string;
```
## Exception::getClass

```java
/**
* @brief gets the Class of the exception element.
* @return Class 
*/
```
```rust
pub fn getClass(self: Exception) -> Class;
```
## Exception::getCallable

```java
/**
* @brief gets the method of the exception element.
* @return Method 
*/
```
```rust
pub fn getCallable(self: Exception) -> Method;
```
## Exception::getTypeHashId

```java
/**
* @brief gets the type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: Exception) -> int;
```
## Exception::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Exception;
```
