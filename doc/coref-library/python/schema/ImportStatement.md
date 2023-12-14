# ImportStatement

Primary key: `element_oid: int`

```rust
schema ImportStatement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## ImportStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: ImportStatement) -> NumberOfLines;
```
## ImportStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: ImportStatement) -> CombineElement;
```
## ImportStatement::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: ImportStatement) -> int;
```
## ImportStatement::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: ImportStatement) -> Scope;
```
## ImportStatement::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: ImportStatement) -> string;
```
## ImportStatement::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: ImportStatement) -> int;
```
## ImportStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: ImportStatement) -> *Statement;
```
## ImportStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: ImportStatement) -> *CombineElement;
```
## ImportStatement::getName

```rust
/**
     * @brief gets the name element of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getName(self: ImportStatement) -> CombineElement;
```
## ImportStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: ImportStatement) -> Statement;
```
## ImportStatement::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: ImportStatement) -> int;
```
## ImportStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ImportStatement) -> string;
```
## ImportStatement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: ImportStatement) -> Location;
```
## ImportStatement::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ImportStatement;
```
## ImportStatement::is\<T\>

```rust
pub fn is<T>(self: ImportStatement) -> bool;
```
## ImportStatement::to\<T\>

```rust
pub fn to<T>(self: ImportStatement) -> <any>;
```
## ImportStatement::key\_neq

```rust
pub fn key_neq(self: ImportStatement, object: <any>) -> bool;
```
## ImportStatement::key\_eq

```rust
pub fn key_eq(self: ImportStatement, object: <any>) -> bool;
```
## ImportStatement::to\_set

```rust
pub fn to_set(self: ImportStatement) -> *ImportStatement;
```
