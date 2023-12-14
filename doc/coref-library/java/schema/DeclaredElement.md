# DeclaredElement

Primary key: `element_hash_id: int`

```rust
schema DeclaredElement {
  @primary element_hash_id: int,
  index_order: int,
  declaration_statement_hash_id: int,
}
```
## DeclaredElement::getIndex

```java
/**
* @brief gets the index order of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: DeclaredElement) -> int;
```
## DeclaredElement::getParent

```java
/**
* @brief gets the declaration statement of the element
* @return Statement 
*/
```
```rust
pub fn getParent(self: DeclaredElement) -> ElementParent;
```
## DeclaredElement::getDeclarationStatementHashId

```java
/**
* @brief gets the declaration statement hash id of this element.
* @return int
*/
```
```rust
pub fn getDeclarationStatementHashId(self: DeclaredElement) -> int;
```
## DeclaredElement::getStatement

```java
/**
* @brief gets the declaration statement of the element
* @return Statement 
*/
```
```rust
pub fn getStatement(self: DeclaredElement) -> Statement;
```
## DeclaredElement::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: DeclaredElement) -> *ElementParent;
```
## DeclaredElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *DeclaredElement;
```
