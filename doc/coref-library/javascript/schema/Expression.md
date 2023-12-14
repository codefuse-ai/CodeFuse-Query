# Expression

Primary key: `id: int`

```rust
schema Expression {
  @primary id: int,
}
```
## Expression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: Expression) -> *Node;
```
## Expression::getIndex

```rust
pub fn getIndex(self: Expression) -> int;
```
## Expression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: Expression) -> int;
```
## Expression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: Expression) -> int;
```
## Expression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: Expression) -> Node;
```
## Expression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: Expression) -> FunctionLikeDeclaration;
```
## Expression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: Expression) -> File;
```
## Expression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: Expression, level: int) -> Node;
```
## Expression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: Expression) -> string;
```
## Expression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: Expression) -> int;
```
## Expression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: Expression) -> *FunctionLikeDeclaration;
```
## Expression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: Expression, level: int) -> *Node;
```
## Expression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: Expression) -> int;
```
## Expression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: Expression) -> *Modifier;
```
## Expression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: Expression) -> int;
```
## Expression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: Expression) -> int;
```
## Expression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: Expression, i: int) -> Node;
```
## Expression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: Expression, i: int) -> Decorator;
```
## Expression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: Expression) -> TopLevelDO;
```
## Expression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: Expression) -> int;
```
## Expression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: Expression) -> *Comment;
```
## Expression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: Expression) -> *Comment;
```
## Expression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: Expression) -> Node;
```
## Expression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: Expression) -> *Node;
```
## Expression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: Expression) -> *Node;
```
## Expression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: Expression) -> *Comment;
```
## Expression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: Expression, i: int) -> Modifier;
```
## Expression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: Expression) -> string;
```
## Expression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: Expression) -> *Decorator;
```
## Expression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: Expression) -> Symbol;
```
## Expression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: Expression) -> Location;
```
## Expression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *Expression;
```
## Expression::is\<T\>

```rust
pub fn is<T>(self: Expression) -> bool;
```
## Expression::to\<T\>

```rust
pub fn to<T>(self: Expression) -> <any>;
```
## Expression::key\_neq

```rust
pub fn key_neq(self: Expression, object: <any>) -> bool;
```
## Expression::key\_eq

```rust
pub fn key_eq(self: Expression, object: <any>) -> bool;
```
## Expression::to\_set

```rust
pub fn to_set(self: Expression) -> *Expression;
```
