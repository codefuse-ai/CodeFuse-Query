# InterfaceDeclaration

Primary key: `id: int`

```rust
schema InterfaceDeclaration {
  @primary id: int,
}
```
## InterfaceDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: InterfaceDeclaration) -> *Node;
```
## InterfaceDeclaration::getIndex

```rust
pub fn getIndex(self: InterfaceDeclaration) -> int;
```
## InterfaceDeclaration::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: InterfaceDeclaration) -> int;
```
## InterfaceDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: InterfaceDeclaration) -> int;
```
## InterfaceDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: InterfaceDeclaration) -> FunctionLikeDeclaration;
```
## InterfaceDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: InterfaceDeclaration) -> Node;
```
## InterfaceDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: InterfaceDeclaration) -> *Comment;
```
## InterfaceDeclaration::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: InterfaceDeclaration) -> *Comment;
```
## InterfaceDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: InterfaceDeclaration) -> File;
```
## InterfaceDeclaration::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: InterfaceDeclaration, level: int) -> Node;
```
## InterfaceDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: InterfaceDeclaration) -> int;
```
## InterfaceDeclaration::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: InterfaceDeclaration) -> string;
```
## InterfaceDeclaration::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: InterfaceDeclaration) -> *FunctionLikeDeclaration;
```
## InterfaceDeclaration::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: InterfaceDeclaration, level: int) -> *Node;
```
## InterfaceDeclaration::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: InterfaceDeclaration) -> int;
```
## InterfaceDeclaration::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: InterfaceDeclaration) -> *Modifier;
```
## InterfaceDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: InterfaceDeclaration) -> int;
```
## InterfaceDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: InterfaceDeclaration) -> int;
```
## InterfaceDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: InterfaceDeclaration, i: int) -> Node;
```
## InterfaceDeclaration::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: InterfaceDeclaration, i: int) -> Decorator;
```
## InterfaceDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: InterfaceDeclaration) -> TopLevelDO;
```
## InterfaceDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: InterfaceDeclaration) -> int;
```
## InterfaceDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: InterfaceDeclaration) -> Node;
```
## InterfaceDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: InterfaceDeclaration) -> *Node;
```
## InterfaceDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: InterfaceDeclaration) -> *Node;
```
## InterfaceDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: InterfaceDeclaration) -> *Comment;
```
## InterfaceDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: InterfaceDeclaration) -> Symbol;
```
## InterfaceDeclaration::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: InterfaceDeclaration) -> *Decorator;
```
## InterfaceDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: InterfaceDeclaration, i: int) -> Modifier;
```
## InterfaceDeclaration::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: InterfaceDeclaration) -> string;
```
## InterfaceDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *InterfaceDeclaration;
```
## InterfaceDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: InterfaceDeclaration) -> Location;
```
## InterfaceDeclaration::is\<T\>

```rust
pub fn is<T>(self: InterfaceDeclaration) -> bool;
```
## InterfaceDeclaration::to\<T\>

```rust
pub fn to<T>(self: InterfaceDeclaration) -> <any>;
```
## InterfaceDeclaration::key\_neq

```rust
pub fn key_neq(self: InterfaceDeclaration, object: <any>) -> bool;
```
## InterfaceDeclaration::key\_eq

```rust
pub fn key_eq(self: InterfaceDeclaration, object: <any>) -> bool;
```
## InterfaceDeclaration::to\_set

```rust
pub fn to_set(self: InterfaceDeclaration) -> *InterfaceDeclaration;
```
