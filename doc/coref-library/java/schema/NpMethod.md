# NpMethod

Primary key: `element_hash_id: int`

```rust
schema NpMethod {
  @primary element_hash_id: int,
  name: string,
  signature: string,
  type_hash_id: int,
  parent_hash_id: int,
}
```
## NpMethod::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: NpMethod) -> string;
```
## NpMethod::getSignature

```java
/**
* @brief gets the signature of this element.
* @return string
*/
```
```rust
pub fn getSignature(self: NpMethod) -> string;
```
## NpMethod::getParent

```java
/**
* @brief gets the parent of this element.
* @return ElementParent
*/
```
```rust
pub fn getParent(self: NpMethod) -> ElementParent;
```
## NpMethod::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: NpMethod) -> int;
```
## NpMethod::getType

```java
/**
* @brief gets the type for this element.
* @return Type
*/
```
```rust
pub fn getType(self: NpMethod) -> ReferenceType;
```
## NpMethod::getTypeHashId

```java
/**
* @brief gets the return type hash id of this element.
* @return int
*/
```
```rust
pub fn getTypeHashId(self: NpMethod) -> int;
```
## NpMethod::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NpMethod;
```
