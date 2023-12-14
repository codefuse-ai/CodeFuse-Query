# LocalClass

Primary key: `element_hash_id: int`

```rust
schema LocalClass {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  printable_text: string,
  parent_hash_id: int,
}
```
## LocalClass::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: LocalClass) -> string;
```
## LocalClass::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: LocalClass) -> string;
```
## LocalClass::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: LocalClass) -> int;
```
## LocalClass::getParent

```java
/**
* @brief gets the declaration statement of the element
* @return Statement 
*/
```
```rust
pub fn getParent(self: LocalClass) -> ElementParent;
```
## LocalClass::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: LocalClass) -> int;
```
## LocalClass::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: LocalClass) -> Location;
```
## LocalClass::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: LocalClass) -> *ElementParent;
```
## LocalClass::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *LocalClass;
```
