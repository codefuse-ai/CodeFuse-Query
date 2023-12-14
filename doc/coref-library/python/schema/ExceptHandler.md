# ExceptHandler

Inherit from [ExceptHandlerDO](./ExceptHandlerDO.md)

Primary key: `element_oid: int`

```rust
schema ExceptHandler extends ExceptHandlerDO {
  @primary element_oid: int,
  element_index: int,
  parent_oid: int,
  location_oid: int,
  printable_text: string,
}
```
## ExceptHandler::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: ExceptHandler) -> int;
```
## ExceptHandler::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: ExceptHandler) -> string;
```
## ExceptHandler::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: ExceptHandler) -> int;
```
## ExceptHandler::getTryStatement

```java
/**
* @brief gets the try statement of the except clause
* @return TryStatement 
*/
```
```rust
pub fn getTryStatement(self: ExceptHandler) -> TryStatement;
```
## ExceptHandler::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: ExceptHandler) -> int;
```
## ExceptHandler::getParent

```java
/**
* @brief gets the parent element of the element
* @return CombineElement 
*/
```
```rust
pub fn getParent(self: ExceptHandler) -> CombineElement;
```
## ExceptHandler::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return CombineElement 
*/
```
```rust
pub fn getAnAncestor(self: ExceptHandler) -> *CombineElement;
```
## ExceptHandler::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ExceptHandler;
```
