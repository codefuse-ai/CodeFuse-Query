# ClassImplementList

Inherit from [ClassImplementListDO](./ClassImplementListDO.md)

Primary key: `element_hash_id: int`

```rust
schema ClassImplementList extends ClassImplementListDO {
  @primary element_hash_id: int,
  implemented_element_hash_id: int
}
```
## ClassImplementList::getImplementedElementHashId

```java
/**
* @brief gets the implemented element hash id of this element.
* @return int
*/
```
```rust
pub fn getImplementedElementHashId(self: ClassImplementList) -> int;
```
## ClassImplementList::getInterface

```java
/**
* @brief gets the interface type from the implement list
* @return Interface 
*/
```
```rust
pub fn getInterface(self: ClassImplementList) -> *Type;
```
## ClassImplementList::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *ClassImplementList;
```
