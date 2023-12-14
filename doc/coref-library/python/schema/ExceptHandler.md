# ExceptHandler

Primary key: `element_oid: int`

```rust
schema ExceptHandler {
  @primary element_oid: int,
  element_index: int,
  parent_oid: int,
  location_oid: int,
  printable_text: string,
}
```
## ExceptHandler::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: ExceptHandler) -> int;
```
## ExceptHandler::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: ExceptHandler) -> string;
```
## ExceptHandler::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: ExceptHandler) -> int;
```
## ExceptHandler::getTryStatement

```rust
/**
     * @brief gets the try statement of the except clause
     * @return TryStatement 
     */
```
```rust
pub fn getTryStatement(self: ExceptHandler) -> TryStatement;
```
## ExceptHandler::getLocationOid

```rust
/**
     * @brief gets the location oid of this element.
     * @return int
     */
```
```rust
pub fn getLocationOid(self: ExceptHandler) -> int;
```
## ExceptHandler::getParent

```rust
/**
     * @brief gets the parent element of the element
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: ExceptHandler) -> CombineElement;
```
## ExceptHandler::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: ExceptHandler) -> *CombineElement;
```
## ExceptHandler::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ExceptHandler;
```
## ExceptHandler::is\<T\>

```rust
pub fn is<T>(self: ExceptHandler) -> bool;
```
## ExceptHandler::to\<T\>

```rust
pub fn to<T>(self: ExceptHandler) -> <any>;
```
## ExceptHandler::key\_neq

```rust
pub fn key_neq(self: ExceptHandler, object: <any>) -> bool;
```
## ExceptHandler::key\_eq

```rust
pub fn key_eq(self: ExceptHandler, object: <any>) -> bool;
```
## ExceptHandler::to\_set

```rust
pub fn to_set(self: ExceptHandler) -> *ExceptHandler;
```
