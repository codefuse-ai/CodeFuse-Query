# IndexSignatureDeclaration

Primary key: `id: int`

```rust
schema IndexSignatureDeclaration {
  @primary id: int,
}
```
## IndexSignatureDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: IndexSignatureDeclaration) -> Location;
```
## IndexSignatureDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: IndexSignatureDeclaration) -> Symbol;
```
## IndexSignatureDeclaration::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: IndexSignatureDeclaration) -> *Decorator;
```
## IndexSignatureDeclaration::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: IndexSignatureDeclaration) -> string;
```
## IndexSignatureDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: IndexSignatureDeclaration, i: int) -> Modifier;
```
## IndexSignatureDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: IndexSignatureDeclaration) -> *Comment;
```
## IndexSignatureDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: IndexSignatureDeclaration) -> *Node;
```
## IndexSignatureDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: IndexSignatureDeclaration) -> *Node;
```
## IndexSignatureDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: IndexSignatureDeclaration) -> Node;
```
## IndexSignatureDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: IndexSignatureDeclaration) -> int;
```
## IndexSignatureDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: IndexSignatureDeclaration) -> TopLevelDO;
```
## IndexSignatureDeclaration::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: IndexSignatureDeclaration, i: int) -> Decorator;
```
## IndexSignatureDeclaration::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: IndexSignatureDeclaration) -> int;
```
## IndexSignatureDeclaration::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: IndexSignatureDeclaration) -> *Modifier;
```
## IndexSignatureDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: IndexSignatureDeclaration) -> int;
```
## IndexSignatureDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: IndexSignatureDeclaration, i: int) -> Node;
```
## IndexSignatureDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: IndexSignatureDeclaration) -> int;
```
## IndexSignatureDeclaration::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: IndexSignatureDeclaration) -> *FunctionLikeDeclaration;
```
## IndexSignatureDeclaration::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: IndexSignatureDeclaration, level: int) -> *Node;
```
## IndexSignatureDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: IndexSignatureDeclaration) -> int;
```
## IndexSignatureDeclaration::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: IndexSignatureDeclaration) -> string;
```
## IndexSignatureDeclaration::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: IndexSignatureDeclaration, level: int) -> Node;
```
## IndexSignatureDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: IndexSignatureDeclaration) -> File;
```
## IndexSignatureDeclaration::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: IndexSignatureDeclaration) -> *Comment;
```
## IndexSignatureDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: IndexSignatureDeclaration) -> *Comment;
```
## IndexSignatureDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: IndexSignatureDeclaration) -> Node;
```
## IndexSignatureDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: IndexSignatureDeclaration) -> FunctionLikeDeclaration;
```
## IndexSignatureDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: IndexSignatureDeclaration) -> int;
```
## IndexSignatureDeclaration::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: IndexSignatureDeclaration) -> int;
```
## IndexSignatureDeclaration::getIndex

```rust
pub fn getIndex(self: IndexSignatureDeclaration) -> int;
```
## IndexSignatureDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: IndexSignatureDeclaration) -> *Node;
```
## IndexSignatureDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *IndexSignatureDeclaration;
```
## IndexSignatureDeclaration::is\<T\>

```rust
pub fn is<T>(self: IndexSignatureDeclaration) -> bool;
```
## IndexSignatureDeclaration::to\<T\>

```rust
pub fn to<T>(self: IndexSignatureDeclaration) -> <any>;
```
## IndexSignatureDeclaration::key\_neq

```rust
pub fn key_neq(self: IndexSignatureDeclaration, object: <any>) -> bool;
```
## IndexSignatureDeclaration::key\_eq

```rust
pub fn key_eq(self: IndexSignatureDeclaration, object: <any>) -> bool;
```
## IndexSignatureDeclaration::to\_set

```rust
pub fn to_set(self: IndexSignatureDeclaration) -> *IndexSignatureDeclaration;
```
