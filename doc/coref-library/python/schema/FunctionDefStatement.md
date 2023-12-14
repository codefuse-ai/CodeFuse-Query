# FunctionDefStatement

Primary key: `element_oid: int`

```rust
schema FunctionDefStatement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## FunctionDefStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: FunctionDefStatement) -> NumberOfLines;
```
## FunctionDefStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: FunctionDefStatement) -> CombineElement;
```
## FunctionDefStatement::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: FunctionDefStatement) -> int;
```
## FunctionDefStatement::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: FunctionDefStatement) -> Scope;
```
## FunctionDefStatement::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: FunctionDefStatement) -> string;
```
## FunctionDefStatement::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: FunctionDefStatement) -> int;
```
## FunctionDefStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: FunctionDefStatement) -> *Statement;
```
## FunctionDefStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: FunctionDefStatement) -> *CombineElement;
```
## FunctionDefStatement::getName

```rust
/**
     * @brief gets the name of the function.
     * @return string 
     */
```
```rust
pub fn getName(self: FunctionDefStatement) -> string;
```
## FunctionDefStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: FunctionDefStatement) -> Statement;
```
## FunctionDefStatement::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: FunctionDefStatement) -> int;
```
## FunctionDefStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: FunctionDefStatement) -> string;
```
## FunctionDefStatement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: FunctionDefStatement) -> Location;
```
## FunctionDefStatement::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *FunctionDefStatement;
```
## FunctionDefStatement::is\<T\>

```rust
pub fn is<T>(self: FunctionDefStatement) -> bool;
```
## FunctionDefStatement::to\<T\>

```rust
pub fn to<T>(self: FunctionDefStatement) -> <any>;
```
## FunctionDefStatement::key\_neq

```rust
pub fn key_neq(self: FunctionDefStatement, object: <any>) -> bool;
```
## FunctionDefStatement::key\_eq

```rust
pub fn key_eq(self: FunctionDefStatement, object: <any>) -> bool;
```
## FunctionDefStatement::to\_set

```rust
pub fn to_set(self: FunctionDefStatement) -> *FunctionDefStatement;
```
