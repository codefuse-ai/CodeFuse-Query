# ElementDO

Primary key: `element_hash_id: int`

```rust
schema ElementDO {
  parent_type: string,
  parent_id: int,
  type: string,
  @primary element_hash_id: int
}
```
## ElementDO::getParentType

```java
/**
* @brief gets the parent type of this element.
* @return string
*/
```
```rust
pub fn getParentType(self: ElementDO) -> string;
```
## ElementDO::getParentId

```java
/**
* @brief gets the parent id of this element.
* @return int
*/
```
```rust
pub fn getParentId(self: ElementDO) -> int;
```
## ElementDO::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ElementDO) -> string;
```
## ElementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ElementDO;
```
