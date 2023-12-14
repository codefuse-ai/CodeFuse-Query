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

```rust
/**
     * @brief gets the index order of this element.
     * @return int
     */
```
```rust
pub fn getIndex(self: DeclaredElement) -> int;
```
## DeclaredElement::getParent

```rust
/**
     * @brief gets the declaration statement of the element
     * @return Statement 
     */
```
```rust
pub fn getParent(self: DeclaredElement) -> ElementParent;
```
## DeclaredElement::getDeclarationStatementHashId

```rust
/**
     * @brief gets the declaration statement hash id of this element.
     * @return int
     */
```
```rust
pub fn getDeclarationStatementHashId(self: DeclaredElement) -> int;
```
## DeclaredElement::getStatement

```rust
/**
     * @brief gets the declaration statement of the element
     * @return Statement 
     */
```
```rust
pub fn getStatement(self: DeclaredElement) -> Statement;
```
## DeclaredElement::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: DeclaredElement) -> *ElementParent;
```
## DeclaredElement::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *DeclaredElement;
```
## DeclaredElement::is\<T\>

```rust
pub fn is<T>(self: DeclaredElement) -> bool;
```
## DeclaredElement::to\<T\>

```rust
pub fn to<T>(self: DeclaredElement) -> <any>;
```
## DeclaredElement::key\_neq

```rust
pub fn key_neq(self: DeclaredElement, object: <any>) -> bool;
```
## DeclaredElement::key\_eq

```rust
pub fn key_eq(self: DeclaredElement, object: <any>) -> bool;
```
## DeclaredElement::to\_set

```rust
pub fn to_set(self: DeclaredElement) -> *DeclaredElement;
```
