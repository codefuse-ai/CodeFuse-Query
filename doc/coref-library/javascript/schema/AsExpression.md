# AsExpression

Primary key: `id: int`

```rust
schema AsExpression {
  @primary id: int,
}
```
## AsExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AsExpression) -> Location;
```
## AsExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AsExpression) -> Symbol;
```
## AsExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AsExpression) -> *Decorator;
```
## AsExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AsExpression) -> string;
```
## AsExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AsExpression, i: int) -> Modifier;
```
## AsExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AsExpression) -> *Comment;
```
## AsExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AsExpression) -> *Node;
```
## AsExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AsExpression) -> *Node;
```
## AsExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AsExpression) -> Node;
```
## AsExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AsExpression) -> *Comment;
```
## AsExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AsExpression) -> *Comment;
```
## AsExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AsExpression) -> int;
```
## AsExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AsExpression) -> TopLevelDO;
```
## AsExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AsExpression, i: int) -> Decorator;
```
## AsExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AsExpression) -> int;
```
## AsExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AsExpression) -> *Modifier;
```
## AsExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AsExpression) -> int;
```
## AsExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AsExpression, i: int) -> Node;
```
## AsExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AsExpression) -> int;
```
## AsExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AsExpression) -> *FunctionLikeDeclaration;
```
## AsExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AsExpression, level: int) -> *Node;
```
## AsExpression::getExpression

```rust
pub fn getExpression(self: AsExpression) -> Expression;
```
## AsExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AsExpression) -> int;
```
## AsExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AsExpression) -> string;
```
## AsExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AsExpression) -> File;
```
## AsExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AsExpression, level: int) -> Node;
```
## AsExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AsExpression) -> FunctionLikeDeclaration;
```
## AsExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AsExpression) -> Node;
```
## AsExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AsExpression) -> int;
```
## AsExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AsExpression) -> int;
```
## AsExpression::getIndex

```rust
pub fn getIndex(self: AsExpression) -> int;
```
## AsExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AsExpression) -> *Node;
```
## AsExpression::getType

```rust
pub fn getType(self: AsExpression) -> TypeNode;
```
## AsExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AsExpression;
```
## AsExpression::is\<T\>

```rust
pub fn is<T>(self: AsExpression) -> bool;
```
## AsExpression::to\<T\>

```rust
pub fn to<T>(self: AsExpression) -> <any>;
```
## AsExpression::key\_neq

```rust
pub fn key_neq(self: AsExpression, object: <any>) -> bool;
```
## AsExpression::key\_eq

```rust
pub fn key_eq(self: AsExpression, object: <any>) -> bool;
```
## AsExpression::to\_set

```rust
pub fn to_set(self: AsExpression) -> *AsExpression;
```
