# FunctionExpression

Primary key: `id: int`

```rust
schema FunctionExpression {
  @primary id: int,
}
```
## FunctionExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: FunctionExpression) -> *Node;
```
## FunctionExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: FunctionExpression) -> int;
```
## FunctionExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: FunctionExpression) -> string;
```
## FunctionExpression::getExpression

```rust
pub fn getExpression(self: FunctionExpression) -> Expression;
```
## FunctionExpression::getIndex

```rust
pub fn getIndex(self: FunctionExpression) -> int;
```
## FunctionExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: FunctionExpression) -> int;
```
## FunctionExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: FunctionExpression, level: int) -> Node;
```
## FunctionExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: FunctionExpression) -> int;
```
## FunctionExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: FunctionExpression) -> FunctionLikeDeclaration;
```
## FunctionExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: FunctionExpression) -> *Comment;
```
## FunctionExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: FunctionExpression) -> *Comment;
```
## FunctionExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: FunctionExpression) -> int;
```
## FunctionExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: FunctionExpression) -> *Modifier;
```
## FunctionExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: FunctionExpression) -> int;
```
## FunctionExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: FunctionExpression) -> int;
```
## FunctionExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: FunctionExpression, i: int) -> Node;
```
## FunctionExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: FunctionExpression, i: int) -> Decorator;
```
## FunctionExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: FunctionExpression) -> TopLevelDO;
```
## FunctionExpression::getName

```rust
pub fn getName(self: FunctionExpression) -> Identifier;
```
## FunctionExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: FunctionExpression) -> int;
```
## FunctionExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: FunctionExpression) -> Node;
```
## FunctionExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: FunctionExpression) -> Node;
```
## FunctionExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: FunctionExpression) -> *Node;
```
## FunctionExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: FunctionExpression) -> *Comment;
```
## FunctionExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: FunctionExpression) -> *Node;
```
## FunctionExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: FunctionExpression) -> *FunctionLikeDeclaration;
```
## FunctionExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: FunctionExpression, level: int) -> *Node;
```
## FunctionExpression::getBody

```rust
pub fn getBody(self: FunctionExpression) -> BlockStatement;
```
## FunctionExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: FunctionExpression) -> Symbol;
```
## FunctionExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: FunctionExpression) -> *Decorator;
```
## FunctionExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *FunctionExpression;
```
## FunctionExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: FunctionExpression) -> Location;
```
## FunctionExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: FunctionExpression, i: int) -> Modifier;
```
## FunctionExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: FunctionExpression) -> string;
```
## FunctionExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: FunctionExpression) -> File;
```
## FunctionExpression::getAParameter

```rust
pub fn getAParameter(self: FunctionExpression) -> *Parameter;
```
## FunctionExpression::is\<T\>

```rust
pub fn is<T>(self: FunctionExpression) -> bool;
```
## FunctionExpression::to\<T\>

```rust
pub fn to<T>(self: FunctionExpression) -> <any>;
```
## FunctionExpression::key\_neq

```rust
pub fn key_neq(self: FunctionExpression, object: <any>) -> bool;
```
## FunctionExpression::key\_eq

```rust
pub fn key_eq(self: FunctionExpression, object: <any>) -> bool;
```
## FunctionExpression::to\_set

```rust
pub fn to_set(self: FunctionExpression) -> *FunctionExpression;
```
