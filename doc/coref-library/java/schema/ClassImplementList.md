# ClassImplementList

Primary key: `element_hash_id: int`

```rust
schema ClassImplementList {
  @primary element_hash_id: int,
  implemented_element_hash_id: int,
}
```
## ClassImplementList::getImplementedElementHashId

```rust
/**
     * @brief gets the implemented element hash id of this element.
     * @return int
     */
```
```rust
pub fn getImplementedElementHashId(self: ClassImplementList) -> int;
```
## ClassImplementList::getInterface

```rust
/**
     * @brief gets the interface type from the implement list
     * @return Interface 
     */
```
```rust
pub fn getInterface(self: ClassImplementList) -> *Type;
```
## ClassImplementList::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ClassImplementList;
```
## ClassImplementList::is\<T\>

```rust
pub fn is<T>(self: ClassImplementList) -> bool;
```
## ClassImplementList::to\<T\>

```rust
pub fn to<T>(self: ClassImplementList) -> <any>;
```
## ClassImplementList::key\_neq

```rust
pub fn key_neq(self: ClassImplementList, object: <any>) -> bool;
```
## ClassImplementList::key\_eq

```rust
pub fn key_eq(self: ClassImplementList, object: <any>) -> bool;
```
## ClassImplementList::to\_set

```rust
pub fn to_set(self: ClassImplementList) -> *ClassImplementList;
```
