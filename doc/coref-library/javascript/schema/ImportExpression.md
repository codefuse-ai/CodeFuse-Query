# ImportExpression

Primary key: `id: int`

```rust
schema ImportExpression {
  @primary id: int,
}
```
## ImportExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ImportExpression) -> *Node;
```
## ImportExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ImportExpression) -> int;
```
## ImportExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ImportExpression) -> string;
```
## ImportExpression::getExpression

```rust
pub fn getExpression(self: ImportExpression) -> Expression;
```
## ImportExpression::getIndex

```rust
pub fn getIndex(self: ImportExpression) -> int;
```
## ImportExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ImportExpression) -> int;
```
## ImportExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ImportExpression, level: int) -> Node;
```
## ImportExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ImportExpression) -> File;
```
## ImportExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ImportExpression) -> int;
```
## ImportExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ImportExpression) -> FunctionLikeDeclaration;
```
## ImportExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ImportExpression) -> *Comment;
```
## ImportExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ImportExpression) -> *Comment;
```
## ImportExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ImportExpression) -> *FunctionLikeDeclaration;
```
## ImportExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ImportExpression, level: int) -> *Node;
```
## ImportExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ImportExpression) -> int;
```
## ImportExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ImportExpression) -> *Modifier;
```
## ImportExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ImportExpression) -> int;
```
## ImportExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ImportExpression) -> int;
```
## ImportExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ImportExpression, i: int) -> Node;
```
## ImportExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ImportExpression, i: int) -> Decorator;
```
## ImportExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ImportExpression) -> TopLevelDO;
```
## ImportExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ImportExpression) -> int;
```
## ImportExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ImportExpression) -> Node;
```
## ImportExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ImportExpression) -> Node;
```
## ImportExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ImportExpression) -> *Node;
```
## ImportExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ImportExpression) -> *Node;
```
## ImportExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ImportExpression) -> *Comment;
```
## ImportExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ImportExpression;
```
## ImportExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ImportExpression) -> Location;
```
## ImportExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ImportExpression) -> Symbol;
```
## ImportExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ImportExpression) -> *Decorator;
```
## ImportExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ImportExpression, i: int) -> Modifier;
```
## ImportExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ImportExpression) -> string;
```
## ImportExpression::is\<T\>

```rust
pub fn is<T>(self: ImportExpression) -> bool;
```
## ImportExpression::to\<T\>

```rust
pub fn to<T>(self: ImportExpression) -> <any>;
```
## ImportExpression::key\_neq

```rust
pub fn key_neq(self: ImportExpression, object: <any>) -> bool;
```
## ImportExpression::key\_eq

```rust
pub fn key_eq(self: ImportExpression, object: <any>) -> bool;
```
## ImportExpression::to\_set

```rust
pub fn to_set(self: ImportExpression) -> *ImportExpression;
```
