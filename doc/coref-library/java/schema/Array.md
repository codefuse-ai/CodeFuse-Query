# Array

Inherit from [ArrayDO](./ArrayDO.md)

Primary key: `element_hash_id: int`

```rust
schema Array extends ArrayDO {
  @primary element_hash_id: int,
  name: string,
}
```
## Array::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: Array) -> string;
```
## Array::getTypeElement

```java
/**
* @brief gets the type for the element.
* @return TypeElement
*/
```
```rust
pub fn getTypeElement(self: Array) -> TypeElement;
```
## Array::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Array;
```
