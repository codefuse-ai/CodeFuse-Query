# ArrowFunctionExpression

Primary key: `id: int`

```rust
schema ArrowFunctionExpression {
  @primary id: int,
}
```
## ArrowFunctionExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ArrowFunctionExpression) -> Location;
```
## ArrowFunctionExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ArrowFunctionExpression) -> Symbol;
```
## ArrowFunctionExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ArrowFunctionExpression) -> *Decorator;
```
## ArrowFunctionExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ArrowFunctionExpression) -> string;
```
## ArrowFunctionExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ArrowFunctionExpression, i: int) -> Modifier;
```
## ArrowFunctionExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ArrowFunctionExpression) -> *Comment;
```
## ArrowFunctionExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ArrowFunctionExpression) -> *Node;
```
## ArrowFunctionExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ArrowFunctionExpression) -> *Node;
```
## ArrowFunctionExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ArrowFunctionExpression) -> Node;
```
## ArrowFunctionExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ArrowFunctionExpression) -> int;
```
## ArrowFunctionExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ArrowFunctionExpression) -> TopLevelDO;
```
## ArrowFunctionExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ArrowFunctionExpression, i: int) -> Decorator;
```
## ArrowFunctionExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ArrowFunctionExpression) -> int;
```
## ArrowFunctionExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ArrowFunctionExpression) -> *Modifier;
```
## ArrowFunctionExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ArrowFunctionExpression) -> int;
```
## ArrowFunctionExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ArrowFunctionExpression, i: int) -> Node;
```
## ArrowFunctionExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ArrowFunctionExpression) -> int;
```
## ArrowFunctionExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ArrowFunctionExpression) -> *FunctionLikeDeclaration;
```
## ArrowFunctionExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ArrowFunctionExpression, level: int) -> *Node;
```
## ArrowFunctionExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ArrowFunctionExpression) -> int;
```
## ArrowFunctionExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ArrowFunctionExpression) -> string;
```
## ArrowFunctionExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ArrowFunctionExpression, level: int) -> Node;
```
## ArrowFunctionExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ArrowFunctionExpression) -> File;
```
## ArrowFunctionExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ArrowFunctionExpression) -> *Comment;
```
## ArrowFunctionExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ArrowFunctionExpression) -> *Comment;
```
## ArrowFunctionExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ArrowFunctionExpression) -> Node;
```
## ArrowFunctionExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ArrowFunctionExpression) -> FunctionLikeDeclaration;
```
## ArrowFunctionExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ArrowFunctionExpression) -> int;
```
## ArrowFunctionExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ArrowFunctionExpression) -> int;
```
## ArrowFunctionExpression::getIndex

```rust
pub fn getIndex(self: ArrowFunctionExpression) -> int;
```
## ArrowFunctionExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ArrowFunctionExpression) -> *Node;
```
## ArrowFunctionExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ArrowFunctionExpression;
```
## ArrowFunctionExpression::is\<T\>

```rust
pub fn is<T>(self: ArrowFunctionExpression) -> bool;
```
## ArrowFunctionExpression::to\<T\>

```rust
pub fn to<T>(self: ArrowFunctionExpression) -> <any>;
```
## ArrowFunctionExpression::key\_neq

```rust
pub fn key_neq(self: ArrowFunctionExpression, object: <any>) -> bool;
```
## ArrowFunctionExpression::key\_eq

```rust
pub fn key_eq(self: ArrowFunctionExpression, object: <any>) -> bool;
```
## ArrowFunctionExpression::to\_set

```rust
pub fn to_set(self: ArrowFunctionExpression) -> *ArrowFunctionExpression;
```
