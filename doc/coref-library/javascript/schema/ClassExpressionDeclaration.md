# ClassExpressionDeclaration

Primary key: `id: int`

```rust
schema ClassExpressionDeclaration {
  @primary id: int,
}
```
## ClassExpressionDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ClassExpressionDeclaration) -> Location;
```
## ClassExpressionDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ClassExpressionDeclaration) -> Symbol;
```
## ClassExpressionDeclaration::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ClassExpressionDeclaration) -> *Decorator;
```
## ClassExpressionDeclaration::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ClassExpressionDeclaration) -> string;
```
## ClassExpressionDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ClassExpressionDeclaration, i: int) -> Modifier;
```
## ClassExpressionDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ClassExpressionDeclaration) -> *Comment;
```
## ClassExpressionDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ClassExpressionDeclaration) -> *Node;
```
## ClassExpressionDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ClassExpressionDeclaration) -> *Node;
```
## ClassExpressionDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ClassExpressionDeclaration) -> Node;
```
## ClassExpressionDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ClassExpressionDeclaration) -> int;
```
## ClassExpressionDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ClassExpressionDeclaration) -> TopLevelDO;
```
## ClassExpressionDeclaration::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ClassExpressionDeclaration, i: int) -> Decorator;
```
## ClassExpressionDeclaration::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ClassExpressionDeclaration) -> int;
```
## ClassExpressionDeclaration::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ClassExpressionDeclaration) -> *Modifier;
```
## ClassExpressionDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ClassExpressionDeclaration) -> int;
```
## ClassExpressionDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ClassExpressionDeclaration, i: int) -> Node;
```
## ClassExpressionDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ClassExpressionDeclaration) -> int;
```
## ClassExpressionDeclaration::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ClassExpressionDeclaration) -> *FunctionLikeDeclaration;
```
## ClassExpressionDeclaration::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ClassExpressionDeclaration, level: int) -> *Node;
```
## ClassExpressionDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ClassExpressionDeclaration) -> int;
```
## ClassExpressionDeclaration::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ClassExpressionDeclaration) -> string;
```
## ClassExpressionDeclaration::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ClassExpressionDeclaration, level: int) -> Node;
```
## ClassExpressionDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ClassExpressionDeclaration) -> File;
```
## ClassExpressionDeclaration::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ClassExpressionDeclaration) -> *Comment;
```
## ClassExpressionDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ClassExpressionDeclaration) -> *Comment;
```
## ClassExpressionDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ClassExpressionDeclaration) -> Node;
```
## ClassExpressionDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ClassExpressionDeclaration) -> FunctionLikeDeclaration;
```
## ClassExpressionDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ClassExpressionDeclaration) -> int;
```
## ClassExpressionDeclaration::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ClassExpressionDeclaration) -> int;
```
## ClassExpressionDeclaration::getIndex

```rust
pub fn getIndex(self: ClassExpressionDeclaration) -> int;
```
## ClassExpressionDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ClassExpressionDeclaration) -> *Node;
```
## ClassExpressionDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ClassExpressionDeclaration;
```
## ClassExpressionDeclaration::is\<T\>

```rust
pub fn is<T>(self: ClassExpressionDeclaration) -> bool;
```
## ClassExpressionDeclaration::to\<T\>

```rust
pub fn to<T>(self: ClassExpressionDeclaration) -> <any>;
```
## ClassExpressionDeclaration::key\_neq

```rust
pub fn key_neq(self: ClassExpressionDeclaration, object: <any>) -> bool;
```
## ClassExpressionDeclaration::key\_eq

```rust
pub fn key_eq(self: ClassExpressionDeclaration, object: <any>) -> bool;
```
## ClassExpressionDeclaration::to\_set

```rust
pub fn to_set(self: ClassExpressionDeclaration) -> *ClassExpressionDeclaration;
```
