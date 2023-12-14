# ImportEqualsDeclaration

Primary key: `id: int`

```rust
schema ImportEqualsDeclaration {
  @primary id: int,
}
```
## ImportEqualsDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ImportEqualsDeclaration) -> *Node;
```
## ImportEqualsDeclaration::getIndex

```rust
pub fn getIndex(self: ImportEqualsDeclaration) -> int;
```
## ImportEqualsDeclaration::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ImportEqualsDeclaration) -> int;
```
## ImportEqualsDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ImportEqualsDeclaration) -> int;
```
## ImportEqualsDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ImportEqualsDeclaration) -> FunctionLikeDeclaration;
```
## ImportEqualsDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ImportEqualsDeclaration) -> Node;
```
## ImportEqualsDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ImportEqualsDeclaration) -> *Comment;
```
## ImportEqualsDeclaration::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ImportEqualsDeclaration) -> *Comment;
```
## ImportEqualsDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ImportEqualsDeclaration) -> File;
```
## ImportEqualsDeclaration::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ImportEqualsDeclaration, level: int) -> Node;
```
## ImportEqualsDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ImportEqualsDeclaration) -> int;
```
## ImportEqualsDeclaration::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ImportEqualsDeclaration) -> string;
```
## ImportEqualsDeclaration::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ImportEqualsDeclaration) -> *FunctionLikeDeclaration;
```
## ImportEqualsDeclaration::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ImportEqualsDeclaration, level: int) -> *Node;
```
## ImportEqualsDeclaration::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ImportEqualsDeclaration) -> int;
```
## ImportEqualsDeclaration::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ImportEqualsDeclaration) -> *Modifier;
```
## ImportEqualsDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ImportEqualsDeclaration) -> int;
```
## ImportEqualsDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ImportEqualsDeclaration) -> int;
```
## ImportEqualsDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ImportEqualsDeclaration, i: int) -> Node;
```
## ImportEqualsDeclaration::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ImportEqualsDeclaration, i: int) -> Decorator;
```
## ImportEqualsDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ImportEqualsDeclaration) -> TopLevelDO;
```
## ImportEqualsDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ImportEqualsDeclaration) -> int;
```
## ImportEqualsDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ImportEqualsDeclaration) -> Node;
```
## ImportEqualsDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ImportEqualsDeclaration) -> *Node;
```
## ImportEqualsDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ImportEqualsDeclaration) -> *Node;
```
## ImportEqualsDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ImportEqualsDeclaration) -> *Comment;
```
## ImportEqualsDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ImportEqualsDeclaration) -> Symbol;
```
## ImportEqualsDeclaration::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ImportEqualsDeclaration) -> *Decorator;
```
## ImportEqualsDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ImportEqualsDeclaration, i: int) -> Modifier;
```
## ImportEqualsDeclaration::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ImportEqualsDeclaration) -> string;
```
## ImportEqualsDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ImportEqualsDeclaration;
```
## ImportEqualsDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ImportEqualsDeclaration) -> Location;
```
## ImportEqualsDeclaration::is\<T\>

```rust
pub fn is<T>(self: ImportEqualsDeclaration) -> bool;
```
## ImportEqualsDeclaration::to\<T\>

```rust
pub fn to<T>(self: ImportEqualsDeclaration) -> <any>;
```
## ImportEqualsDeclaration::key\_neq

```rust
pub fn key_neq(self: ImportEqualsDeclaration, object: <any>) -> bool;
```
## ImportEqualsDeclaration::key\_eq

```rust
pub fn key_eq(self: ImportEqualsDeclaration, object: <any>) -> bool;
```
## ImportEqualsDeclaration::to\_set

```rust
pub fn to_set(self: ImportEqualsDeclaration) -> *ImportEqualsDeclaration;
```
