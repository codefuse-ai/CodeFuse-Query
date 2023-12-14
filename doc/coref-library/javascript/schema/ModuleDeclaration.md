# ModuleDeclaration

Primary key: `id: int`

```rust
schema ModuleDeclaration {
  @primary id: int,
}
```
## ModuleDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ModuleDeclaration) -> *Node;
```
## ModuleDeclaration::getIndex

```rust
pub fn getIndex(self: ModuleDeclaration) -> int;
```
## ModuleDeclaration::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ModuleDeclaration) -> int;
```
## ModuleDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ModuleDeclaration) -> int;
```
## ModuleDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ModuleDeclaration) -> FunctionLikeDeclaration;
```
## ModuleDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ModuleDeclaration) -> Node;
```
## ModuleDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ModuleDeclaration) -> *Comment;
```
## ModuleDeclaration::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ModuleDeclaration) -> *Comment;
```
## ModuleDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ModuleDeclaration) -> File;
```
## ModuleDeclaration::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ModuleDeclaration, level: int) -> Node;
```
## ModuleDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ModuleDeclaration) -> int;
```
## ModuleDeclaration::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ModuleDeclaration) -> string;
```
## ModuleDeclaration::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ModuleDeclaration) -> *FunctionLikeDeclaration;
```
## ModuleDeclaration::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ModuleDeclaration, level: int) -> *Node;
```
## ModuleDeclaration::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ModuleDeclaration) -> int;
```
## ModuleDeclaration::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ModuleDeclaration) -> *Modifier;
```
## ModuleDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ModuleDeclaration) -> int;
```
## ModuleDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ModuleDeclaration) -> int;
```
## ModuleDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ModuleDeclaration, i: int) -> Node;
```
## ModuleDeclaration::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ModuleDeclaration, i: int) -> Decorator;
```
## ModuleDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ModuleDeclaration) -> TopLevelDO;
```
## ModuleDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ModuleDeclaration) -> int;
```
## ModuleDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ModuleDeclaration) -> Node;
```
## ModuleDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ModuleDeclaration) -> *Node;
```
## ModuleDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ModuleDeclaration) -> *Node;
```
## ModuleDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ModuleDeclaration) -> *Comment;
```
## ModuleDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ModuleDeclaration) -> Symbol;
```
## ModuleDeclaration::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ModuleDeclaration) -> *Decorator;
```
## ModuleDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ModuleDeclaration, i: int) -> Modifier;
```
## ModuleDeclaration::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ModuleDeclaration) -> string;
```
## ModuleDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ModuleDeclaration;
```
## ModuleDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ModuleDeclaration) -> Location;
```
## ModuleDeclaration::is\<T\>

```rust
pub fn is<T>(self: ModuleDeclaration) -> bool;
```
## ModuleDeclaration::to\<T\>

```rust
pub fn to<T>(self: ModuleDeclaration) -> <any>;
```
## ModuleDeclaration::key\_neq

```rust
pub fn key_neq(self: ModuleDeclaration, object: <any>) -> bool;
```
## ModuleDeclaration::key\_eq

```rust
pub fn key_eq(self: ModuleDeclaration, object: <any>) -> bool;
```
## ModuleDeclaration::to\_set

```rust
pub fn to_set(self: ModuleDeclaration) -> *ModuleDeclaration;
```
