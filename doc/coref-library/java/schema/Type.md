# Type

Primary key: `id: int`

```rust
schema Type {
  @primary id: int
}
```
## Type::getQualifiedName

```java
/**
* @brief gets the name of the type.
* @return string 
*/
```
```rust
pub fn getQualifiedName(self: Type) -> string;
```
## Type::getName

```java
/**
* @brief gets the name of the type.
* @return string 
*/
```
```rust
pub fn getName(self: Type) -> string;
```
## Type::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Type;
```
