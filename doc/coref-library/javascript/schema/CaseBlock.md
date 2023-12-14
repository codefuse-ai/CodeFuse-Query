# CaseBlock

Primary key: `id: int`

```rust
schema CaseBlock {
  @primary id: int,
}
```
## CaseBlock::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: CaseBlock) -> Location;
```
## CaseBlock::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: CaseBlock) -> Symbol;
```
## CaseBlock::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: CaseBlock) -> *Decorator;
```
## CaseBlock::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: CaseBlock) -> string;
```
## CaseBlock::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: CaseBlock, i: int) -> Modifier;
```
## CaseBlock::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: CaseBlock) -> *Comment;
```
## CaseBlock::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: CaseBlock) -> *Node;
```
## CaseBlock::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: CaseBlock) -> *Comment;
```
## CaseBlock::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: CaseBlock) -> *Comment;
```
## CaseBlock::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: CaseBlock) -> int;
```
## CaseBlock::getChild

```rust
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

```rust
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

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: CaseBlock) -> *Modifier;
```
## CaseBlock::getADescendantByLevel

```rust
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

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CaseBlock) -> *FunctionLikeDeclaration;
```
## CaseBlock::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: CaseBlock) -> TopLevelDO;
```
## CaseBlock::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: CaseBlock, i: int) -> Decorator;
```
## CaseBlock::getCaseClause

```rust
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

```rust
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

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: CaseBlock) -> *Node;
```
## CaseBlock::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: CaseBlock) -> *Node;
```
## CaseBlock::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: CaseBlock) -> Node;
```
## CaseBlock::getCaseClauseCount

```rust
/**
     * Gets the CaseClause count of this CaseBlock.
     */
```
```rust
pub fn getCaseClauseCount(self: CaseBlock) -> int;
```
## CaseBlock::getACaseOrDefault

```rust
/**
     * Gets a CaseClause or DefaultClause of this CaseBlock.
     */
```
```rust
pub fn getACaseOrDefault(self: CaseBlock) -> *Statement;
```
## CaseBlock::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: CaseBlock) -> FunctionLikeDeclaration;
```
## CaseBlock::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: CaseBlock) -> Node;
```
## CaseBlock::getDefaultClause

```rust
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

```rust
/**
     * Determine whether this CaseBlock has a DefaultClause.
     */
```
```rust
pub fn haveDefaultClause(self: CaseBlock) -> bool;
```
## CaseBlock::getAnAncestorByLevel

```rust
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

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: CaseBlock) -> File;
```
## CaseBlock::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: CaseBlock) -> int;
```
## CaseBlock::getACaseClause

```rust
/**
     * Gets a `case` clause of this `switch`-`case` block.
     */
```
```rust
pub fn getACaseClause(self: CaseBlock) -> *CaseClause;
```
## CaseBlock::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *CaseBlock;
```
## CaseBlock::is\<T\>

```rust
pub fn is<T>(self: CaseBlock) -> bool;
```
## CaseBlock::to\<T\>

```rust
pub fn to<T>(self: CaseBlock) -> <any>;
```
## CaseBlock::key\_neq

```rust
pub fn key_neq(self: CaseBlock, object: <any>) -> bool;
```
## CaseBlock::key\_eq

```rust
pub fn key_eq(self: CaseBlock, object: <any>) -> bool;
```
## CaseBlock::to\_set

```rust
pub fn to_set(self: CaseBlock) -> *CaseBlock;
```
