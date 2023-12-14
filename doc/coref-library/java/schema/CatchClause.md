# CatchClause

Primary key: `element_hash_id: int`

```rust
schema CatchClause {
  @primary element_hash_id: int,
  location_hash_id: int,
  printable_text: string,
  parameter_hash_id: int,
  type_hash_id: int,
  try_statement_hash_id: int,
  index_order: int,
}
```
## CatchClause::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: CatchClause) -> string;
```
## CatchClause::getParameterHashId

```rust
/**
     * @brief gets the parameter hash id of this element.
     * @return int
     */
```
```rust
pub fn getParameterHashId(self: CatchClause) -> int;
```
## CatchClause::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *CatchClause;
```
## CatchClause::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: CatchClause) -> Location;
```
## CatchClause::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: CatchClause) -> int;
```
## CatchClause::getTryStatementHashId

```rust
/**
     * @brief gets the try statement hash id of this element.
     * @return int
     */
```
```rust
pub fn getTryStatementHashId(self: CatchClause) -> int;
```
## CatchClause::getIndex

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: CatchClause) -> int;
```
## CatchClause::getTypeHashId

```rust
/**
     * @brief gets the type hash id of this element.
     * @return int
     */
```
```rust
pub fn getTypeHashId(self: CatchClause) -> int;
```
## CatchClause::getBlock

```rust
/**
     * @brief gets the block of this catch clause
     * @return CodeBlock 
     */
```
```rust
pub fn getBlock(self: CatchClause) -> CodeBlock;
```
## CatchClause::getType

```rust
/**
     * @brief gets the type for the element.
     * @return Type
     */
```
```rust
pub fn getType(self: CatchClause) -> Type;
```
## CatchClause::getParameter

```rust
/**
     * @brief gets the parameter of this catch clause.
     * @return Parameter 
     */
```
```rust
pub fn getParameter(self: CatchClause) -> Parameter;
```
## CatchClause::getTryStatement

```rust
/**
     * @brief get the try statement in which this catch clause occurs.
     * @return TryStatement 
     */
```
```rust
pub fn getTryStatement(self: CatchClause) -> TryStatement;
```
## CatchClause::getParent

```rust
/**
     * @brief gets the ast element parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: CatchClause) -> ElementParent;
```
## CatchClause::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: CatchClause) -> *ElementParent;
```
## CatchClause::is\<T\>

```rust
pub fn is<T>(self: CatchClause) -> bool;
```
## CatchClause::to\<T\>

```rust
pub fn to<T>(self: CatchClause) -> <any>;
```
## CatchClause::key\_neq

```rust
pub fn key_neq(self: CatchClause, object: <any>) -> bool;
```
## CatchClause::key\_eq

```rust
pub fn key_eq(self: CatchClause, object: <any>) -> bool;
```
## CatchClause::to\_set

```rust
pub fn to_set(self: CatchClause) -> *CatchClause;
```
