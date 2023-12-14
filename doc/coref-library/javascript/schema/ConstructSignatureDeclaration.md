# ConstructSignatureDeclaration

Primary key: `id: int`

```rust
schema ConstructSignatureDeclaration {
  @primary id: int,
}
```
## ConstructSignatureDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ConstructSignatureDeclaration) -> Location;
```
## ConstructSignatureDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ConstructSignatureDeclaration) -> Symbol;
```
## ConstructSignatureDeclaration::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ConstructSignatureDeclaration) -> *Decorator;
```
## ConstructSignatureDeclaration::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ConstructSignatureDeclaration) -> string;
```
## ConstructSignatureDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ConstructSignatureDeclaration, i: int) -> Modifier;
```
## ConstructSignatureDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ConstructSignatureDeclaration) -> *Comment;
```
## ConstructSignatureDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ConstructSignatureDeclaration) -> *Node;
```
## ConstructSignatureDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ConstructSignatureDeclaration) -> *Node;
```
## ConstructSignatureDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ConstructSignatureDeclaration) -> Node;
```
## ConstructSignatureDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ConstructSignatureDeclaration) -> int;
```
## ConstructSignatureDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ConstructSignatureDeclaration) -> TopLevelDO;
```
## ConstructSignatureDeclaration::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ConstructSignatureDeclaration, i: int) -> Decorator;
```
## ConstructSignatureDeclaration::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ConstructSignatureDeclaration) -> int;
```
## ConstructSignatureDeclaration::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ConstructSignatureDeclaration) -> *Modifier;
```
## ConstructSignatureDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ConstructSignatureDeclaration) -> int;
```
## ConstructSignatureDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ConstructSignatureDeclaration, i: int) -> Node;
```
## ConstructSignatureDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ConstructSignatureDeclaration) -> int;
```
## ConstructSignatureDeclaration::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ConstructSignatureDeclaration) -> *FunctionLikeDeclaration;
```
## ConstructSignatureDeclaration::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ConstructSignatureDeclaration, level: int) -> *Node;
```
## ConstructSignatureDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ConstructSignatureDeclaration) -> int;
```
## ConstructSignatureDeclaration::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ConstructSignatureDeclaration) -> string;
```
## ConstructSignatureDeclaration::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ConstructSignatureDeclaration, level: int) -> Node;
```
## ConstructSignatureDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ConstructSignatureDeclaration) -> File;
```
## ConstructSignatureDeclaration::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ConstructSignatureDeclaration) -> *Comment;
```
## ConstructSignatureDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ConstructSignatureDeclaration) -> *Comment;
```
## ConstructSignatureDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ConstructSignatureDeclaration) -> Node;
```
## ConstructSignatureDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ConstructSignatureDeclaration) -> FunctionLikeDeclaration;
```
## ConstructSignatureDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ConstructSignatureDeclaration) -> int;
```
## ConstructSignatureDeclaration::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ConstructSignatureDeclaration) -> int;
```
## ConstructSignatureDeclaration::getIndex

```rust
pub fn getIndex(self: ConstructSignatureDeclaration) -> int;
```
## ConstructSignatureDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ConstructSignatureDeclaration) -> *Node;
```
## ConstructSignatureDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ConstructSignatureDeclaration;
```
## ConstructSignatureDeclaration::is\<T\>

```rust
pub fn is<T>(self: ConstructSignatureDeclaration) -> bool;
```
## ConstructSignatureDeclaration::to\<T\>

```rust
pub fn to<T>(self: ConstructSignatureDeclaration) -> <any>;
```
## ConstructSignatureDeclaration::key\_neq

```rust
pub fn key_neq(self: ConstructSignatureDeclaration, object: <any>) -> bool;
```
## ConstructSignatureDeclaration::key\_eq

```rust
pub fn key_eq(self: ConstructSignatureDeclaration, object: <any>) -> bool;
```
## ConstructSignatureDeclaration::to\_set

```rust
pub fn to_set(self: ConstructSignatureDeclaration) -> *ConstructSignatureDeclaration;
```
