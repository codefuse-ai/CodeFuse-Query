# Import

Primary key: `element_hash_id: int`

```rust
schema Import {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  reference_hash_id: int,
  parent_hash_id: int,
  is_foreign_import: int,
}
```
## Import::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: Import) -> int;
```
## Import::getReferenceHashId

```java
/**
* @brief gets the reference hash id of this element.
* @return int
*/
```
```rust
pub fn getReferenceHashId(self: Import) -> int;
```
## Import::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: Import) -> string;
```
## Import::getTargetName

```java
/**
* @brief gets the target name of the statement.
* @return string 
*/
```
```rust
pub fn getTargetName(self: Import) -> string;
```
## Import::getIsForeignImport

```java
/**
* @brief gets the is foreign import of this element.
* @return int
*/
```
```rust
pub fn getIsForeignImport(self: Import) -> int;
```
## Import::getName

```java
/**
* @brief gets the name of the import statement.
* @return string 
*/
```
```rust
pub fn getName(self: Import) -> string;
```
## Import::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Import;
```
## Import::getReferenceElement

```java
/**
* @brief gets the reference element of the statement
* @return ReferenceElement 
*/
```
```rust
pub fn getReferenceElement(self: Import) -> ReferenceElement;
```
## Import::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Import) -> Location;
```
## Import::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: Import) -> int;
```
## Import::getIdentifier

```java
/**
* @brief description
* @return string 
*/
```
```rust
pub fn getIdentifier(self: Import) -> Identifier;
```
## Import::getContainingFile

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getContainingFile(self: Import) -> File;
```
