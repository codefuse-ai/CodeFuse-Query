# OmittedExpression

Primary key: `id: int`

```rust
schema OmittedExpression {
  @primary id: int,
}
```
## OmittedExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: OmittedExpression) -> Location;
```
## OmittedExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: OmittedExpression) -> Symbol;
```
## OmittedExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: OmittedExpression) -> *Decorator;
```
## OmittedExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: OmittedExpression) -> string;
```
## OmittedExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: OmittedExpression, i: int) -> Modifier;
```
## OmittedExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: OmittedExpression) -> *Comment;
```
## OmittedExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: OmittedExpression) -> *Node;
```
## OmittedExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: OmittedExpression) -> *Node;
```
## OmittedExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: OmittedExpression) -> Node;
```
## OmittedExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: OmittedExpression) -> int;
```
## OmittedExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: OmittedExpression) -> TopLevelDO;
```
## OmittedExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: OmittedExpression, i: int) -> Decorator;
```
## OmittedExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: OmittedExpression) -> int;
```
## OmittedExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: OmittedExpression) -> *Modifier;
```
## OmittedExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: OmittedExpression) -> int;
```
## OmittedExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: OmittedExpression, i: int) -> Node;
```
## OmittedExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: OmittedExpression) -> int;
```
## OmittedExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: OmittedExpression) -> *FunctionLikeDeclaration;
```
## OmittedExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: OmittedExpression, level: int) -> *Node;
```
## OmittedExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: OmittedExpression) -> int;
```
## OmittedExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: OmittedExpression) -> string;
```
## OmittedExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: OmittedExpression, level: int) -> Node;
```
## OmittedExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: OmittedExpression) -> File;
```
## OmittedExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: OmittedExpression) -> *Comment;
```
## OmittedExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: OmittedExpression) -> *Comment;
```
## OmittedExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: OmittedExpression) -> Node;
```
## OmittedExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: OmittedExpression) -> FunctionLikeDeclaration;
```
## OmittedExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: OmittedExpression) -> int;
```
## OmittedExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: OmittedExpression) -> int;
```
## OmittedExpression::getIndex

```rust
pub fn getIndex(self: OmittedExpression) -> int;
```
## OmittedExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: OmittedExpression) -> *Node;
```
## OmittedExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *OmittedExpression;
```
## OmittedExpression::is\<T\>

```rust
pub fn is<T>(self: OmittedExpression) -> bool;
```
## OmittedExpression::to\<T\>

```rust
pub fn to<T>(self: OmittedExpression) -> <any>;
```
## OmittedExpression::key\_neq

```rust
pub fn key_neq(self: OmittedExpression, object: <any>) -> bool;
```
## OmittedExpression::key\_eq

```rust
pub fn key_eq(self: OmittedExpression, object: <any>) -> bool;
```
## OmittedExpression::to\_set

```rust
pub fn to_set(self: OmittedExpression) -> *OmittedExpression;
```
