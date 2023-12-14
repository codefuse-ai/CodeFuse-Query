# MissingDeclaration

Primary key: `id: int`

```rust
schema MissingDeclaration {
  @primary id: int,
}
```
## MissingDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: MissingDeclaration) -> *Node;
```
## MissingDeclaration::getIndex

```rust
pub fn getIndex(self: MissingDeclaration) -> int;
```
## MissingDeclaration::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: MissingDeclaration) -> int;
```
## MissingDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MissingDeclaration) -> int;
```
## MissingDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: MissingDeclaration) -> FunctionLikeDeclaration;
```
## MissingDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: MissingDeclaration) -> Node;
```
## MissingDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: MissingDeclaration) -> *Comment;
```
## MissingDeclaration::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: MissingDeclaration) -> *Comment;
```
## MissingDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: MissingDeclaration) -> File;
```
## MissingDeclaration::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: MissingDeclaration, level: int) -> Node;
```
## MissingDeclaration::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MissingDeclaration) -> *FunctionLikeDeclaration;
```
## MissingDeclaration::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: MissingDeclaration, level: int) -> *Node;
```
## MissingDeclaration::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: MissingDeclaration) -> int;
```
## MissingDeclaration::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: MissingDeclaration) -> *Modifier;
```
## MissingDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MissingDeclaration) -> int;
```
## MissingDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MissingDeclaration) -> int;
```
## MissingDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: MissingDeclaration, i: int) -> Node;
```
## MissingDeclaration::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: MissingDeclaration, i: int) -> Decorator;
```
## MissingDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: MissingDeclaration) -> TopLevelDO;
```
## MissingDeclaration::getName

```rust
pub fn getName(self: MissingDeclaration) -> Identifier;
```
## MissingDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: MissingDeclaration) -> int;
```
## MissingDeclaration::haveName

```rust
pub fn haveName(self: MissingDeclaration) -> bool;
```
## MissingDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: MissingDeclaration) -> *Node;
```
## MissingDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: MissingDeclaration) -> Node;
```
## MissingDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: MissingDeclaration) -> *Comment;
```
## MissingDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: MissingDeclaration) -> *Node;
```
## MissingDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: MissingDeclaration) -> Symbol;
```
## MissingDeclaration::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: MissingDeclaration) -> *Decorator;
```
## MissingDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: MissingDeclaration, i: int) -> Modifier;
```
## MissingDeclaration::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: MissingDeclaration) -> string;
```
## MissingDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MissingDeclaration;
```
## MissingDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: MissingDeclaration) -> Location;
```
## MissingDeclaration::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: MissingDeclaration) -> string;
```
## MissingDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MissingDeclaration) -> int;
```
## MissingDeclaration::is\<T\>

```rust
pub fn is<T>(self: MissingDeclaration) -> bool;
```
## MissingDeclaration::to\<T\>

```rust
pub fn to<T>(self: MissingDeclaration) -> <any>;
```
## MissingDeclaration::key\_neq

```rust
pub fn key_neq(self: MissingDeclaration, object: <any>) -> bool;
```
## MissingDeclaration::key\_eq

```rust
pub fn key_eq(self: MissingDeclaration, object: <any>) -> bool;
```
## MissingDeclaration::to\_set

```rust
pub fn to_set(self: MissingDeclaration) -> *MissingDeclaration;
```
