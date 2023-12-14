# ImportStaticStatement

Primary key: `element_hash_id: int`

```rust
schema ImportStaticStatement {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  reference_hash_id: int,
  parent_hash_id: int,
}
```
## ImportStaticStatement::getReferenceHashId

```rust
/**
     * @brief gets the reference hash id of this element.
     * @return int
     */
```
```rust
pub fn getReferenceHashId(self: ImportStaticStatement) -> int;
```
## ImportStaticStatement::getPrintableText

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: ImportStaticStatement) -> string;
```
## ImportStaticStatement::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: ImportStaticStatement) -> int;
```
## ImportStaticStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: ImportStaticStatement) -> *ElementParent;
```
## ImportStaticStatement::getParent

```rust
/**
     * @brief gets the parent of the element.
     * @return File 
     */
```
```rust
pub fn getParent(self: ImportStaticStatement) -> File;
```
## ImportStaticStatement::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: ImportStaticStatement) -> int;
```
## ImportStaticStatement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ImportStaticStatement) -> Location;
```
## ImportStaticStatement::getReference

```rust
/**
     * @brief gets the reference id of the element.
     * @return ImportStaticReferenceElement
     */
```
```rust
pub fn getReference(self: ImportStaticStatement) -> ImportStaticReferenceElement;
```
## ImportStaticStatement::getName

```rust
/**
     * @brief gets the name of the import static statement.
     * @return string 
     */
```
```rust
pub fn getName(self: ImportStaticStatement) -> string;
```
## ImportStaticStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *ImportStaticStatement;
```
## ImportStaticStatement::is\<T\>

```rust
pub fn is<T>(self: ImportStaticStatement) -> bool;
```
## ImportStaticStatement::to\<T\>

```rust
pub fn to<T>(self: ImportStaticStatement) -> <any>;
```
## ImportStaticStatement::key\_neq

```rust
pub fn key_neq(self: ImportStaticStatement, object: <any>) -> bool;
```
## ImportStaticStatement::key\_eq

```rust
pub fn key_eq(self: ImportStaticStatement, object: <any>) -> bool;
```
## ImportStaticStatement::to\_set

```rust
pub fn to_set(self: ImportStaticStatement) -> *ImportStaticStatement;
```
