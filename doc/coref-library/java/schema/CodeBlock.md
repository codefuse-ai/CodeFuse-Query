# CodeBlock

Primary key: `element_hash_id: int`

```rust
schema CodeBlock {
  @primary element_hash_id: int,
  location_hash_id: int,
  number_of_statement: int,
  parent_hash_id: int,
  is_empty: int,
  printable_text: string,
}
```
## CodeBlock::getNumberOfStatement

```rust
/**
     * @brief gets the number of statement of this element.
     * @return int
     */
```
```rust
pub fn getNumberOfStatement(self: CodeBlock) -> int;
```
## CodeBlock::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: CodeBlock) -> string;
```
## CodeBlock::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: CodeBlock) -> int;
```
## CodeBlock::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: CodeBlock) -> int;
```
## CodeBlock::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: CodeBlock) -> Location;
```
## CodeBlock::getStatement

```rust
/**
     * @brief gets the i-th child statement of this code block that occurs at the specified (zero-based) position.
     * @return Statement 
     */
```
```rust
pub fn getStatement(self: CodeBlock, idx: int) -> Statement;
```
## CodeBlock::getIsEmpty

```rust
/**
     * @brief gets the is empty of this element.
     * @return int
     */
```
```rust
pub fn getIsEmpty(self: CodeBlock) -> int;
```
## CodeBlock::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *CodeBlock;
```
## CodeBlock::getAStatement

```rust
/**
     * @brief gets the immediate child statement of this code block that occurs at the specified (zero-based) position.
     * @return Statement 
     */
```
```rust
pub fn getAStatement(self: CodeBlock) -> *Statement;
```
## CodeBlock::getParent

```rust
/**
     * @brief gets the parent code block of the try statement
     * @return CodeBlock 
     */
```
```rust
pub fn getParent(self: CodeBlock) -> ElementParent;
```
## CodeBlock::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: CodeBlock) -> *ElementParent;
```
## CodeBlock::is\<T\>

```rust
pub fn is<T>(self: CodeBlock) -> bool;
```
## CodeBlock::to\<T\>

```rust
pub fn to<T>(self: CodeBlock) -> <any>;
```
## CodeBlock::key\_neq

```rust
pub fn key_neq(self: CodeBlock, object: <any>) -> bool;
```
## CodeBlock::key\_eq

```rust
pub fn key_eq(self: CodeBlock, object: <any>) -> bool;
```
## CodeBlock::to\_set

```rust
pub fn to_set(self: CodeBlock) -> *CodeBlock;
```
