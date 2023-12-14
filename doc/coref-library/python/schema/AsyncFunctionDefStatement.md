# AsyncFunctionDefStatement

Primary key: `element_oid: int`

```rust
schema AsyncFunctionDefStatement {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## AsyncFunctionDefStatement::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: AsyncFunctionDefStatement) -> NumberOfLines;
```
## AsyncFunctionDefStatement::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: AsyncFunctionDefStatement) -> CombineElement;
```
## AsyncFunctionDefStatement::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: AsyncFunctionDefStatement) -> int;
```
## AsyncFunctionDefStatement::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: AsyncFunctionDefStatement) -> Scope;
```
## AsyncFunctionDefStatement::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: AsyncFunctionDefStatement) -> string;
```
## AsyncFunctionDefStatement::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: AsyncFunctionDefStatement) -> int;
```
## AsyncFunctionDefStatement::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: AsyncFunctionDefStatement) -> *Statement;
```
## AsyncFunctionDefStatement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: AsyncFunctionDefStatement) -> *CombineElement;
```
## AsyncFunctionDefStatement::getName

```rust
/**
     * @brief gets the name of the function.
     * @return string 
     */
```
```rust
pub fn getName(self: AsyncFunctionDefStatement) -> string;
```
## AsyncFunctionDefStatement::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: AsyncFunctionDefStatement) -> Statement;
```
## AsyncFunctionDefStatement::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: AsyncFunctionDefStatement) -> int;
```
## AsyncFunctionDefStatement::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: AsyncFunctionDefStatement) -> string;
```
## AsyncFunctionDefStatement::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: AsyncFunctionDefStatement) -> Location;
```
## AsyncFunctionDefStatement::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *AsyncFunctionDefStatement;
```
## AsyncFunctionDefStatement::is\<T\>

```rust
pub fn is<T>(self: AsyncFunctionDefStatement) -> bool;
```
## AsyncFunctionDefStatement::to\<T\>

```rust
pub fn to<T>(self: AsyncFunctionDefStatement) -> <any>;
```
## AsyncFunctionDefStatement::key\_neq

```rust
pub fn key_neq(self: AsyncFunctionDefStatement, object: <any>) -> bool;
```
## AsyncFunctionDefStatement::key\_eq

```rust
pub fn key_eq(self: AsyncFunctionDefStatement, object: <any>) -> bool;
```
## AsyncFunctionDefStatement::to\_set

```rust
pub fn to_set(self: AsyncFunctionDefStatement) -> *AsyncFunctionDefStatement;
```
