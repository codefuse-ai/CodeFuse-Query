# EnhancedForStatement

Primary key: `id: int`

```rust
schema EnhancedForStatement {
  @primary id: int,
}
```
## EnhancedForStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: EnhancedForStatement) -> Location;
```
## EnhancedForStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: EnhancedForStatement) -> Symbol;
```
## EnhancedForStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: EnhancedForStatement) -> *Decorator;
```
## EnhancedForStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: EnhancedForStatement) -> string;
```
## EnhancedForStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: EnhancedForStatement, i: int) -> Modifier;
```
## EnhancedForStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: EnhancedForStatement) -> *Comment;
```
## EnhancedForStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: EnhancedForStatement) -> *Node;
```
## EnhancedForStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: EnhancedForStatement) -> *Node;
```
## EnhancedForStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: EnhancedForStatement) -> Node;
```
## EnhancedForStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: EnhancedForStatement) -> *Comment;
```
## EnhancedForStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: EnhancedForStatement) -> *Comment;
```
## EnhancedForStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: EnhancedForStatement) -> int;
```
## EnhancedForStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: EnhancedForStatement) -> TopLevelDO;
```
## EnhancedForStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: EnhancedForStatement, i: int) -> Decorator;
```
## EnhancedForStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: EnhancedForStatement) -> int;
```
## EnhancedForStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: EnhancedForStatement) -> *Modifier;
```
## EnhancedForStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EnhancedForStatement) -> int;
```
## EnhancedForStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: EnhancedForStatement, i: int) -> Node;
```
## EnhancedForStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EnhancedForStatement) -> int;
```
## EnhancedForStatement::getBody

```rust
/**
     * Gets the body of this `for`-`in` or `for`-`of` loop.
     */
```
```rust
pub fn getBody(self: EnhancedForStatement) -> Statement;
```
## EnhancedForStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EnhancedForStatement) -> *FunctionLikeDeclaration;
```
## EnhancedForStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: EnhancedForStatement, level: int) -> *Node;
```
## EnhancedForStatement::getExpression

```rust
/**
     * Gets the expression over which this `for`-`in` or `for`-`of` loop iterates.
     */
```
```rust
pub fn getExpression(self: EnhancedForStatement) -> Expression;
```
## EnhancedForStatement::getInitializer

```rust
/**
     * Gets the iterator of this `for`-`in` or `for`-`of` loop.
     */
```
```rust
pub fn getInitializer(self: EnhancedForStatement) -> ForInitializer;
```
## EnhancedForStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EnhancedForStatement) -> int;
```
## EnhancedForStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: EnhancedForStatement) -> string;
```
## EnhancedForStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: EnhancedForStatement, level: int) -> Node;
```
## EnhancedForStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: EnhancedForStatement) -> File;
```
## EnhancedForStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EnhancedForStatement) -> int;
```
## EnhancedForStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: EnhancedForStatement) -> FunctionLikeDeclaration;
```
## EnhancedForStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: EnhancedForStatement) -> Node;
```
## EnhancedForStatement::getIndex

```rust
pub fn getIndex(self: EnhancedForStatement) -> int;
```
## EnhancedForStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: EnhancedForStatement) -> *Node;
```
## EnhancedForStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: EnhancedForStatement) -> int;
```
## EnhancedForStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *EnhancedForStatement;
```
## EnhancedForStatement::getInitializerIndex

```rust
/**
     * Gets the iterator index of this loop.
     *
     * In a `for`-`in` loop, the index is always 0.
     * In a `for`-`of` loop, the index is 1 if it is a `for`-`await`-`of`, otherwise, the index is 0.
     */
```
```rust
pub fn getInitializerIndex(self: EnhancedForStatement) -> int;
```
## EnhancedForStatement::is\<T\>

```rust
pub fn is<T>(self: EnhancedForStatement) -> bool;
```
## EnhancedForStatement::to\<T\>

```rust
pub fn to<T>(self: EnhancedForStatement) -> <any>;
```
## EnhancedForStatement::key\_neq

```rust
pub fn key_neq(self: EnhancedForStatement, object: <any>) -> bool;
```
## EnhancedForStatement::key\_eq

```rust
pub fn key_eq(self: EnhancedForStatement, object: <any>) -> bool;
```
## EnhancedForStatement::to\_set

```rust
pub fn to_set(self: EnhancedForStatement) -> *EnhancedForStatement;
```
