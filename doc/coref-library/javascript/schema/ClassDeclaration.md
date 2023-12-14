# ClassDeclaration

Primary key: `id: int`

```rust
schema ClassDeclaration {
  @primary id: int,
}
```
## ClassDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ClassDeclaration) -> Location;
```
## ClassDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ClassDeclaration) -> Symbol;
```
## ClassDeclaration::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ClassDeclaration) -> *Decorator;
```
## ClassDeclaration::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ClassDeclaration) -> string;
```
## ClassDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ClassDeclaration, i: int) -> Modifier;
```
## ClassDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ClassDeclaration) -> *Comment;
```
## ClassDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ClassDeclaration) -> *Node;
```
## ClassDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ClassDeclaration) -> *Node;
```
## ClassDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ClassDeclaration) -> Node;
```
## ClassDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ClassDeclaration) -> int;
```
## ClassDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ClassDeclaration) -> TopLevelDO;
```
## ClassDeclaration::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ClassDeclaration, i: int) -> Decorator;
```
## ClassDeclaration::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ClassDeclaration) -> int;
```
## ClassDeclaration::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ClassDeclaration) -> *Modifier;
```
## ClassDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ClassDeclaration) -> int;
```
## ClassDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ClassDeclaration, i: int) -> Node;
```
## ClassDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ClassDeclaration) -> int;
```
## ClassDeclaration::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ClassDeclaration) -> *FunctionLikeDeclaration;
```
## ClassDeclaration::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ClassDeclaration, level: int) -> *Node;
```
## ClassDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ClassDeclaration) -> int;
```
## ClassDeclaration::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ClassDeclaration) -> string;
```
## ClassDeclaration::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ClassDeclaration, level: int) -> Node;
```
## ClassDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ClassDeclaration) -> File;
```
## ClassDeclaration::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ClassDeclaration) -> *Comment;
```
## ClassDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ClassDeclaration) -> *Comment;
```
## ClassDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ClassDeclaration) -> Node;
```
## ClassDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ClassDeclaration) -> FunctionLikeDeclaration;
```
## ClassDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ClassDeclaration) -> int;
```
## ClassDeclaration::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ClassDeclaration) -> int;
```
## ClassDeclaration::getIndex

```rust
pub fn getIndex(self: ClassDeclaration) -> int;
```
## ClassDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ClassDeclaration) -> *Node;
```
## ClassDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ClassDeclaration;
```
## ClassDeclaration::is\<T\>

```rust
pub fn is<T>(self: ClassDeclaration) -> bool;
```
## ClassDeclaration::to\<T\>

```rust
pub fn to<T>(self: ClassDeclaration) -> <any>;
```
## ClassDeclaration::key\_neq

```rust
pub fn key_neq(self: ClassDeclaration, object: <any>) -> bool;
```
## ClassDeclaration::key\_eq

```rust
pub fn key_eq(self: ClassDeclaration, object: <any>) -> bool;
```
## ClassDeclaration::to\_set

```rust
pub fn to_set(self: ClassDeclaration) -> *ClassDeclaration;
```
