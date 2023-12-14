# Function

Primary key: `element_oid: int`

```rust
schema Function {
  printable_text: string,
  location_oid: int,
  type: string,
  parent_oid: int,
  element_index: int,
  @primary element_oid: int,
}
```
## Function::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: Function) -> NumberOfLines;
```
## Function::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: Function) -> CombineElement;
```
## Function::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: Function) -> int;
```
## Function::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: Function) -> Scope;
```
## Function::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: Function) -> string;
```
## Function::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: Function) -> int;
```
## Function::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: Function) -> *CombineElement;
```
## Function::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: Function) -> *Statement;
```
## Function::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: Function) -> int;
```
## Function::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: Function) -> string;
```
## Function::getArgumentByIndex

```rust
/**
     * @brief gets the arg by index of the function.
     * @return Arg 
     */
```
```rust
pub fn getArgumentByIndex(self: Function, i: int) -> Arg;
```
## Function::getQualifiedName

```rust
/**
     * @brief gets the qualified name of the function.
     * @return string 
     */
```
```rust
pub fn getQualifiedName(self: Function) -> string;
```
## Function::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Function) -> Location;
```
## Function::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Function;
```
## Function::getArguments

```rust
/**
     * @brief gets the arguments of the function.
     * @return Arguments 
     */
```
```rust
pub fn getArguments(self: Function) -> Arguments;
```
## Function::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: Function) -> Statement;
```
## Function::getName

```rust
/**
     * @brief gets the name of the function.
     * @return string 
     */
```
```rust
pub fn getName(self: Function) -> string;
```
## Function::is\<T\>

```rust
pub fn is<T>(self: Function) -> bool;
```
## Function::to\<T\>

```rust
pub fn to<T>(self: Function) -> <any>;
```
## Function::key\_neq

```rust
pub fn key_neq(self: Function, object: <any>) -> bool;
```
## Function::key\_eq

```rust
pub fn key_eq(self: Function, object: <any>) -> bool;
```
## Function::to\_set

```rust
pub fn to_set(self: Function) -> *Function;
```
