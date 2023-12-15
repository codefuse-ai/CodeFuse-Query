# NpInterfaceDO

Primary key: `element_hash_id: int`

```rust
schema NpInterfaceDO {
  parent_hash_id: int,
  qualified_name: string,
  name: string,
  @primary element_hash_id: int
}
```
## NpInterfaceDO::getQualifiedName

```java
/**
* @brief gets the qualified name of this element.
* @return string
*/
```
```rust
pub fn getQualifiedName(self: NpInterfaceDO) -> string;
```
## NpInterfaceDO::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: NpInterfaceDO) -> int;
```
## NpInterfaceDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: NpInterfaceDO) -> string;
```
## NpInterfaceDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NpInterfaceDO;
```
