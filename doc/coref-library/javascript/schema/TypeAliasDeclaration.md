# TypeAliasDeclaration

Primary key: `id: int`

```rust
schema TypeAliasDeclaration {
  @primary id: int,
}
```
## TypeAliasDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TypeAliasDeclaration) -> *Node;
```
## TypeAliasDeclaration::getIndex

```rust
pub fn getIndex(self: TypeAliasDeclaration) -> int;
```
## TypeAliasDeclaration::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TypeAliasDeclaration) -> int;
```
## TypeAliasDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeAliasDeclaration) -> int;
```
## TypeAliasDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TypeAliasDeclaration) -> FunctionLikeDeclaration;
```
## TypeAliasDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TypeAliasDeclaration) -> Node;
```
## TypeAliasDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TypeAliasDeclaration) -> *Comment;
```
## TypeAliasDeclaration::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TypeAliasDeclaration) -> *Comment;
```
## TypeAliasDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TypeAliasDeclaration) -> File;
```
## TypeAliasDeclaration::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TypeAliasDeclaration, level: int) -> Node;
```
## TypeAliasDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeAliasDeclaration) -> int;
```
## TypeAliasDeclaration::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TypeAliasDeclaration) -> string;
```
## TypeAliasDeclaration::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeAliasDeclaration) -> *FunctionLikeDeclaration;
```
## TypeAliasDeclaration::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TypeAliasDeclaration, level: int) -> *Node;
```
## TypeAliasDeclaration::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TypeAliasDeclaration) -> int;
```
## TypeAliasDeclaration::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TypeAliasDeclaration) -> *Modifier;
```
## TypeAliasDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeAliasDeclaration) -> int;
```
## TypeAliasDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeAliasDeclaration) -> int;
```
## TypeAliasDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TypeAliasDeclaration, i: int) -> Node;
```
## TypeAliasDeclaration::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TypeAliasDeclaration, i: int) -> Decorator;
```
## TypeAliasDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TypeAliasDeclaration) -> TopLevelDO;
```
## TypeAliasDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TypeAliasDeclaration) -> int;
```
## TypeAliasDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TypeAliasDeclaration) -> Node;
```
## TypeAliasDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TypeAliasDeclaration) -> *Node;
```
## TypeAliasDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TypeAliasDeclaration) -> *Node;
```
## TypeAliasDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TypeAliasDeclaration) -> *Comment;
```
## TypeAliasDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TypeAliasDeclaration) -> Symbol;
```
## TypeAliasDeclaration::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TypeAliasDeclaration) -> *Decorator;
```
## TypeAliasDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TypeAliasDeclaration, i: int) -> Modifier;
```
## TypeAliasDeclaration::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TypeAliasDeclaration) -> string;
```
## TypeAliasDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TypeAliasDeclaration;
```
## TypeAliasDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TypeAliasDeclaration) -> Location;
```
## TypeAliasDeclaration::is\<T\>

```rust
pub fn is<T>(self: TypeAliasDeclaration) -> bool;
```
## TypeAliasDeclaration::to\<T\>

```rust
pub fn to<T>(self: TypeAliasDeclaration) -> <any>;
```
## TypeAliasDeclaration::key\_neq

```rust
pub fn key_neq(self: TypeAliasDeclaration, object: <any>) -> bool;
```
## TypeAliasDeclaration::key\_eq

```rust
pub fn key_eq(self: TypeAliasDeclaration, object: <any>) -> bool;
```
## TypeAliasDeclaration::to\_set

```rust
pub fn to_set(self: TypeAliasDeclaration) -> *TypeAliasDeclaration;
```
