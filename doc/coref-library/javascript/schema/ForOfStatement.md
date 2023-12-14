# ForOfStatement

Primary key: `id: int`

```rust
schema ForOfStatement {
  @primary id: int,
}
```
## ForOfStatement::getInitializerIndex

```rust
/**
     * Gets the iterator index of this loop.
     *
     * In a `for`-`in` loop, the index is always 0.
     * In a `for`-`of` loop, the index is 1 if it is a `for`-`await`-`of`, otherwise, the index is 0.
     */
```
```rust
pub fn getInitializerIndex(self: ForOfStatement) -> int;
```
## ForOfStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ForOfStatement) -> int;
```
## ForOfStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ForOfStatement) -> *Node;
```
## ForOfStatement::getIndex

```rust
pub fn getIndex(self: ForOfStatement) -> int;
```
## ForOfStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ForOfStatement) -> Node;
```
## ForOfStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ForOfStatement) -> FunctionLikeDeclaration;
```
## ForOfStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ForOfStatement) -> int;
```
## ForOfStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ForOfStatement) -> File;
```
## ForOfStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ForOfStatement, level: int) -> Node;
```
## ForOfStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ForOfStatement) -> string;
```
## ForOfStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ForOfStatement) -> int;
```
## ForOfStatement::getInitializer

```rust
/**
     * Gets the iterator of this `for`-`in` or `for`-`of` loop.
     */
```
```rust
pub fn getInitializer(self: ForOfStatement) -> ForInitializer;
```
## ForOfStatement::getExpression

```rust
/**
     * Gets the expression over which this `for`-`in` or `for`-`of` loop iterates.
     */
```
```rust
pub fn getExpression(self: ForOfStatement) -> Expression;
```
## ForOfStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ForOfStatement) -> int;
```
## ForOfStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ForOfStatement) -> *Modifier;
```
## ForOfStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ForOfStatement) -> int;
```
## ForOfStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ForOfStatement, level: int) -> *Node;
```
## ForOfStatement::getBody

```rust
/**
     * Gets the body of this `for`-`in` or `for`-`of` loop.
     */
```
```rust
pub fn getBody(self: ForOfStatement) -> Statement;
```
## ForOfStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ForOfStatement) -> *FunctionLikeDeclaration;
```
## ForOfStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ForOfStatement) -> int;
```
## ForOfStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ForOfStatement, i: int) -> Node;
```
## ForOfStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ForOfStatement, i: int) -> Decorator;
```
## ForOfStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ForOfStatement) -> TopLevelDO;
```
## ForOfStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ForOfStatement) -> int;
```
## ForOfStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ForOfStatement) -> *Comment;
```
## ForOfStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ForOfStatement) -> *Comment;
```
## ForOfStatement::isAwait

```rust
/**
     * Determines whether the `for`-`of` loop is a `for`-`await`-`of` loop
     */
```
```rust
pub fn isAwait(self: ForOfStatement) -> bool;
```
## ForOfStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ForOfStatement) -> Node;
```
## ForOfStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ForOfStatement) -> *Node;
```
## ForOfStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ForOfStatement) -> *Node;
```
## ForOfStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ForOfStatement) -> *Comment;
```
## ForOfStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ForOfStatement) -> Symbol;
```
## ForOfStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ForOfStatement) -> *Decorator;
```
## ForOfStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ForOfStatement;
```
## ForOfStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ForOfStatement) -> Location;
```
## ForOfStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ForOfStatement) -> string;
```
## ForOfStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ForOfStatement, i: int) -> Modifier;
```
## ForOfStatement::is\<T\>

```rust
pub fn is<T>(self: ForOfStatement) -> bool;
```
## ForOfStatement::to\<T\>

```rust
pub fn to<T>(self: ForOfStatement) -> <any>;
```
## ForOfStatement::key\_neq

```rust
pub fn key_neq(self: ForOfStatement, object: <any>) -> bool;
```
## ForOfStatement::key\_eq

```rust
pub fn key_eq(self: ForOfStatement, object: <any>) -> bool;
```
## ForOfStatement::to\_set

```rust
pub fn to_set(self: ForOfStatement) -> *ForOfStatement;
```
