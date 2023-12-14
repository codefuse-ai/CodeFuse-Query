# NameString

Inherit from [NameStringDO](./NameStringDO.md)

Primary key: `parent_hash_id: int`

```rust
schema NameString extends NameStringDO {
  @primary parent_hash_id: int,
  value_element_hash_id: int,
  name_element_hash_id: int,
}
```
## NameString::getNameElementHashId

```java
/**
* @brief gets the name element hash id of this element.
* @return int
*/
```
```rust
pub fn getNameElementHashId(self: NameString) -> int;
```
## NameString::getValueElementHashId

```java
/**
* @brief gets the value element hash id of this element.
* @return int
*/
```
```rust
pub fn getValueElementHashId(self: NameString) -> int;
```
## NameString::getValue

```java
/**
* @brief get the referenced statement.
* @return Statement 
*/
```
```rust
pub fn getValue(self: NameString) -> Statement;
```
## NameString::getName

```java
/**
* @brief get the identifier of the element.
* @return Identifier 
*/
```
```rust
pub fn getName(self: NameString) -> Identifier;
```
## NameString::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *NameString;
```
