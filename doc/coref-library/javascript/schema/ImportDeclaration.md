# ImportDeclaration

Primary key: `id: int`

```rust
schema ImportDeclaration {
  @primary id: int,
}
```
## ImportDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ImportDeclaration) -> *Node;
```
## ImportDeclaration::getIndex

```rust
pub fn getIndex(self: ImportDeclaration) -> int;
```
## ImportDeclaration::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ImportDeclaration) -> int;
```
## ImportDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ImportDeclaration) -> int;
```
## ImportDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ImportDeclaration) -> FunctionLikeDeclaration;
```
## ImportDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ImportDeclaration) -> Node;
```
## ImportDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ImportDeclaration) -> *Comment;
```
## ImportDeclaration::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ImportDeclaration) -> *Comment;
```
## ImportDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ImportDeclaration) -> File;
```
## ImportDeclaration::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ImportDeclaration, level: int) -> Node;
```
## ImportDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ImportDeclaration) -> int;
```
## ImportDeclaration::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ImportDeclaration) -> string;
```
## ImportDeclaration::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ImportDeclaration) -> *FunctionLikeDeclaration;
```
## ImportDeclaration::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ImportDeclaration, level: int) -> *Node;
```
## ImportDeclaration::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ImportDeclaration) -> int;
```
## ImportDeclaration::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ImportDeclaration) -> *Modifier;
```
## ImportDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ImportDeclaration) -> int;
```
## ImportDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ImportDeclaration) -> int;
```
## ImportDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ImportDeclaration, i: int) -> Node;
```
## ImportDeclaration::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ImportDeclaration, i: int) -> Decorator;
```
## ImportDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ImportDeclaration) -> TopLevelDO;
```
## ImportDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ImportDeclaration) -> int;
```
## ImportDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ImportDeclaration) -> Node;
```
## ImportDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ImportDeclaration) -> *Node;
```
## ImportDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ImportDeclaration) -> *Node;
```
## ImportDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ImportDeclaration) -> *Comment;
```
## ImportDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ImportDeclaration) -> Symbol;
```
## ImportDeclaration::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ImportDeclaration) -> *Decorator;
```
## ImportDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ImportDeclaration, i: int) -> Modifier;
```
## ImportDeclaration::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ImportDeclaration) -> string;
```
## ImportDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ImportDeclaration;
```
## ImportDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ImportDeclaration) -> Location;
```
## ImportDeclaration::is\<T\>

```rust
pub fn is<T>(self: ImportDeclaration) -> bool;
```
## ImportDeclaration::to\<T\>

```rust
pub fn to<T>(self: ImportDeclaration) -> <any>;
```
## ImportDeclaration::key\_neq

```rust
pub fn key_neq(self: ImportDeclaration, object: <any>) -> bool;
```
## ImportDeclaration::key\_eq

```rust
pub fn key_eq(self: ImportDeclaration, object: <any>) -> bool;
```
## ImportDeclaration::to\_set

```rust
pub fn to_set(self: ImportDeclaration) -> *ImportDeclaration;
```
