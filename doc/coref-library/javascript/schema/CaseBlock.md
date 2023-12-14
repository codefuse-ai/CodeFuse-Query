# CaseBlock

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema CaseBlock extends Statement {
  @primary id: int,
}
```
## CaseBlock::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: CaseBlock) -> Location;
```
## CaseBlock::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: CaseBlock) -> Symbol;
```
## CaseBlock::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: CaseBlock) -> *Decorator;
```
## CaseBlock::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: CaseBlock) -> string;
```
## CaseBlock::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: CaseBlock, i: int) -> Modifier;
```
## CaseBlock::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: CaseBlock) -> *Comment;
```
## CaseBlock::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: CaseBlock) -> *Node;
```
## CaseBlock::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: CaseBlock) -> *Comment;
```
## CaseBlock::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: CaseBlock) -> *Comment;
```
## CaseBlock::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: CaseBlock) -> int;
```
## CaseBlock::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: CaseBlock, i: int) -> Node;
```
## CaseBlock::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CaseBlock) -> int;
```
## CaseBlock::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: CaseBlock) -> int;
```
## CaseBlock::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CaseBlock) -> int;
```
## CaseBlock::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: CaseBlock) -> *Modifier;
```
## CaseBlock::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: CaseBlock, level: int) -> *Node;
```
## CaseBlock::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CaseBlock) -> *FunctionLikeDeclaration;
```
## CaseBlock::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: CaseBlock) -> TopLevelDO;
```
## CaseBlock::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: CaseBlock, i: int) -> Decorator;
```
## CaseBlock::getCaseClause

```java
/**
* Gets the `i`th `case` clause of this `switch`-`case` block.
* index starts from 0.
*/
```
```rust
pub fn getCaseClause(self: CaseBlock, i: int) -> CaseClause;
```
## CaseBlock::getIndex

```rust
pub fn getIndex(self: CaseBlock) -> int;
```
## CaseBlock::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: CaseBlock) -> string;
```
## CaseBlock::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CaseBlock) -> int;
```
## CaseBlock::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: CaseBlock) -> *Node;
```
## CaseBlock::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: CaseBlock) -> *Node;
```
## CaseBlock::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: CaseBlock) -> Node;
```
## CaseBlock::getCaseClauseCount

```java
/**
* Gets the CaseClause count of this CaseBlock.
*/
```
```rust
pub fn getCaseClauseCount(self: CaseBlock) -> int;
```
## CaseBlock::getACaseOrDefault

```java
/**
* Gets a CaseClause or DefaultClause of this CaseBlock.
*/
```
```rust
pub fn getACaseOrDefault(self: CaseBlock) -> *Statement;
```
## CaseBlock::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: CaseBlock) -> FunctionLikeDeclaration;
```
## CaseBlock::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: CaseBlock) -> Node;
```
## CaseBlock::getDefaultClause

```java
/**
* Gets the `default` clause of this `switch`-`case` block.
*/
```
```rust
pub fn getDefaultClause(self: CaseBlock) -> DefaultClause;
```
## CaseBlock::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CaseBlock) -> int;
```
## CaseBlock::haveDefaultClause

```java
/**
* Determine whether this CaseBlock has a DefaultClause.
*/
```
```rust
pub fn haveDefaultClause(self: CaseBlock) -> bool;
```
## CaseBlock::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: CaseBlock, level: int) -> Node;
```
## CaseBlock::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: CaseBlock) -> File;
```
## CaseBlock::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: CaseBlock) -> int;
```
## CaseBlock::getACaseClause

```java
/**
* Gets a `case` clause of this `switch`-`case` block.
*/
```
```rust
pub fn getACaseClause(self: CaseBlock) -> *CaseClause;
```
## CaseBlock::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CaseBlock;
```
