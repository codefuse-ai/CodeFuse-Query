# InitFunction

Primary key: `element_oid: int`

```rust
schema InitFunction {
  @primary element_oid: int,
  element_index: int,
  parent_oid: int,
  type: string,
  location_oid: int,
  printable_text: string,
}
```
## InitFunction::getName

```rust
/**
     * @brief gets the name of the function.
     * @return string 
     */
```
```rust
pub fn getName(self: InitFunction) -> string;
```
## InitFunction::getEnclosingStatement

```rust
/**
     * @brief gets the statement containing this statement.
     * @return Statement 
     */
```
```rust
pub fn getEnclosingStatement(self: InitFunction) -> Statement;
```
## InitFunction::getQualifiedName

```rust
/**
     * @brief gets the qualified name of the function.
     * @return string 
     */
```
```rust
pub fn getQualifiedName(self: InitFunction) -> string;
```
## InitFunction::getArgumentByIndex

```rust
/**
     * @brief gets the arg by index of the function.
     * @return Arg 
     */
```
```rust
pub fn getArgumentByIndex(self: InitFunction, i: int) -> Arg;
```
## InitFunction::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: InitFunction) -> string;
```
## InitFunction::getAChild

```rust
/**
     * @brief gets a child of this statement.
     * @return Statement 
     */
```
```rust
pub fn getAChild(self: InitFunction) -> *Statement;
```
## InitFunction::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: InitFunction) -> *CombineElement;
```
## InitFunction::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: InitFunction) -> int;
```
## InitFunction::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: InitFunction) -> string;
```
## InitFunction::getEnclosingScope

```rust
/**
     * @brief gets the immediately enclosing scope (module, function or class) whose body contains this statement.
     * @return Scope 
     */
```
```rust
pub fn getEnclosingScope(self: InitFunction) -> Scope;
```
## InitFunction::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: InitFunction) -> int;
```
## InitFunction::getParent

```rust
/**
     * @brief gets the parent element of the statement
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: InitFunction) -> CombineElement;
```
## InitFunction::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: InitFunction) -> int;
```
## InitFunction::getSize

```rust
/**
     * @brief gets the size information for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: InitFunction) -> NumberOfLines;
```
## InitFunction::getArguments

```rust
/**
     * @brief gets the arguments of the function.
     * @return Arguments 
     */
```
```rust
pub fn getArguments(self: InitFunction) -> Arguments;
```
## InitFunction::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: InitFunction) -> Location;
```
## InitFunction::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *InitFunction;
```
## InitFunction::is\<T\>

```rust
pub fn is<T>(self: InitFunction) -> bool;
```
## InitFunction::to\<T\>

```rust
pub fn to<T>(self: InitFunction) -> <any>;
```
## InitFunction::key\_neq

```rust
pub fn key_neq(self: InitFunction, object: <any>) -> bool;
```
## InitFunction::key\_eq

```rust
pub fn key_eq(self: InitFunction, object: <any>) -> bool;
```
## InitFunction::to\_set

```rust
pub fn to_set(self: InitFunction) -> *InitFunction;
```
