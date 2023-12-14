# RelationalOperator

Primary key: `id: int`

```rust
schema RelationalOperator {
  @primary id: int,
}
```
## RelationalOperator::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: RelationalOperator) -> Location;
```
## RelationalOperator::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: RelationalOperator) -> Symbol;
```
## RelationalOperator::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: RelationalOperator) -> *Decorator;
```
## RelationalOperator::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: RelationalOperator) -> string;
```
## RelationalOperator::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: RelationalOperator, i: int) -> Modifier;
```
## RelationalOperator::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: RelationalOperator) -> *Comment;
```
## RelationalOperator::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: RelationalOperator) -> *Node;
```
## RelationalOperator::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: RelationalOperator) -> *Node;
```
## RelationalOperator::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: RelationalOperator) -> Node;
```
## RelationalOperator::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: RelationalOperator) -> int;
```
## RelationalOperator::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: RelationalOperator) -> TopLevelDO;
```
## RelationalOperator::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: RelationalOperator, i: int) -> Decorator;
```
## RelationalOperator::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: RelationalOperator) -> int;
```
## RelationalOperator::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: RelationalOperator) -> *Modifier;
```
## RelationalOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RelationalOperator) -> int;
```
## RelationalOperator::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: RelationalOperator, i: int) -> Node;
```
## RelationalOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RelationalOperator) -> int;
```
## RelationalOperator::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RelationalOperator) -> *FunctionLikeDeclaration;
```
## RelationalOperator::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: RelationalOperator, level: int) -> *Node;
```
## RelationalOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RelationalOperator) -> int;
```
## RelationalOperator::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: RelationalOperator) -> string;
```
## RelationalOperator::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: RelationalOperator, level: int) -> Node;
```
## RelationalOperator::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: RelationalOperator) -> File;
```
## RelationalOperator::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: RelationalOperator) -> *Comment;
```
## RelationalOperator::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: RelationalOperator) -> *Comment;
```
## RelationalOperator::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: RelationalOperator) -> Node;
```
## RelationalOperator::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: RelationalOperator) -> FunctionLikeDeclaration;
```
## RelationalOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RelationalOperator) -> int;
```
## RelationalOperator::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: RelationalOperator) -> int;
```
## RelationalOperator::getIndex

```rust
pub fn getIndex(self: RelationalOperator) -> int;
```
## RelationalOperator::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: RelationalOperator) -> *Node;
```
## RelationalOperator::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *RelationalOperator;
```
## RelationalOperator::is\<T\>

```rust
pub fn is<T>(self: RelationalOperator) -> bool;
```
## RelationalOperator::to\<T\>

```rust
pub fn to<T>(self: RelationalOperator) -> <any>;
```
## RelationalOperator::key\_neq

```rust
pub fn key_neq(self: RelationalOperator, object: <any>) -> bool;
```
## RelationalOperator::key\_eq

```rust
pub fn key_eq(self: RelationalOperator, object: <any>) -> bool;
```
## RelationalOperator::to\_set

```rust
pub fn to_set(self: RelationalOperator) -> *RelationalOperator;
```
