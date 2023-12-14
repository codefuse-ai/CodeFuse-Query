# CallSignatureDeclaration

Primary key: `id: int`

```rust
schema CallSignatureDeclaration {
  @primary id: int,
}
```
## CallSignatureDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: CallSignatureDeclaration) -> Location;
```
## CallSignatureDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: CallSignatureDeclaration) -> Symbol;
```
## CallSignatureDeclaration::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: CallSignatureDeclaration) -> *Decorator;
```
## CallSignatureDeclaration::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: CallSignatureDeclaration) -> string;
```
## CallSignatureDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: CallSignatureDeclaration, i: int) -> Modifier;
```
## CallSignatureDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: CallSignatureDeclaration) -> *Comment;
```
## CallSignatureDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: CallSignatureDeclaration) -> *Node;
```
## CallSignatureDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: CallSignatureDeclaration) -> *Node;
```
## CallSignatureDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: CallSignatureDeclaration) -> Node;
```
## CallSignatureDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: CallSignatureDeclaration) -> int;
```
## CallSignatureDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: CallSignatureDeclaration) -> TopLevelDO;
```
## CallSignatureDeclaration::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: CallSignatureDeclaration, i: int) -> Decorator;
```
## CallSignatureDeclaration::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: CallSignatureDeclaration) -> int;
```
## CallSignatureDeclaration::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: CallSignatureDeclaration) -> *Modifier;
```
## CallSignatureDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CallSignatureDeclaration) -> int;
```
## CallSignatureDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: CallSignatureDeclaration, i: int) -> Node;
```
## CallSignatureDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CallSignatureDeclaration) -> int;
```
## CallSignatureDeclaration::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CallSignatureDeclaration) -> *FunctionLikeDeclaration;
```
## CallSignatureDeclaration::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: CallSignatureDeclaration, level: int) -> *Node;
```
## CallSignatureDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CallSignatureDeclaration) -> int;
```
## CallSignatureDeclaration::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: CallSignatureDeclaration) -> string;
```
## CallSignatureDeclaration::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: CallSignatureDeclaration, level: int) -> Node;
```
## CallSignatureDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: CallSignatureDeclaration) -> File;
```
## CallSignatureDeclaration::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: CallSignatureDeclaration) -> *Comment;
```
## CallSignatureDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: CallSignatureDeclaration) -> *Comment;
```
## CallSignatureDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: CallSignatureDeclaration) -> Node;
```
## CallSignatureDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: CallSignatureDeclaration) -> FunctionLikeDeclaration;
```
## CallSignatureDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CallSignatureDeclaration) -> int;
```
## CallSignatureDeclaration::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: CallSignatureDeclaration) -> int;
```
## CallSignatureDeclaration::getIndex

```rust
pub fn getIndex(self: CallSignatureDeclaration) -> int;
```
## CallSignatureDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: CallSignatureDeclaration) -> *Node;
```
## CallSignatureDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *CallSignatureDeclaration;
```
## CallSignatureDeclaration::is\<T\>

```rust
pub fn is<T>(self: CallSignatureDeclaration) -> bool;
```
## CallSignatureDeclaration::to\<T\>

```rust
pub fn to<T>(self: CallSignatureDeclaration) -> <any>;
```
## CallSignatureDeclaration::key\_neq

```rust
pub fn key_neq(self: CallSignatureDeclaration, object: <any>) -> bool;
```
## CallSignatureDeclaration::key\_eq

```rust
pub fn key_eq(self: CallSignatureDeclaration, object: <any>) -> bool;
```
## CallSignatureDeclaration::to\_set

```rust
pub fn to_set(self: CallSignatureDeclaration) -> *CallSignatureDeclaration;
```
