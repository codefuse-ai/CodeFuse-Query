# IndexSignature

Primary key: `id: int`

```rust
schema IndexSignature {
  @primary id: int,
}
```
## IndexSignature::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: IndexSignature) -> Location;
```
## IndexSignature::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: IndexSignature) -> Symbol;
```
## IndexSignature::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: IndexSignature) -> *Decorator;
```
## IndexSignature::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: IndexSignature) -> string;
```
## IndexSignature::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: IndexSignature, i: int) -> Modifier;
```
## IndexSignature::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: IndexSignature) -> *Comment;
```
## IndexSignature::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: IndexSignature) -> *Node;
```
## IndexSignature::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: IndexSignature) -> *Node;
```
## IndexSignature::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: IndexSignature) -> Node;
```
## IndexSignature::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: IndexSignature) -> int;
```
## IndexSignature::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: IndexSignature) -> TopLevelDO;
```
## IndexSignature::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: IndexSignature, i: int) -> Decorator;
```
## IndexSignature::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: IndexSignature) -> int;
```
## IndexSignature::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: IndexSignature) -> *Modifier;
```
## IndexSignature::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: IndexSignature) -> int;
```
## IndexSignature::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: IndexSignature, i: int) -> Node;
```
## IndexSignature::getStartLineNumber

```rust
pub fn getStartLineNumber(self: IndexSignature) -> int;
```
## IndexSignature::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: IndexSignature) -> *FunctionLikeDeclaration;
```
## IndexSignature::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: IndexSignature, level: int) -> *Node;
```
## IndexSignature::getEndLineNumber

```rust
pub fn getEndLineNumber(self: IndexSignature) -> int;
```
## IndexSignature::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: IndexSignature) -> string;
```
## IndexSignature::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: IndexSignature, level: int) -> Node;
```
## IndexSignature::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: IndexSignature) -> File;
```
## IndexSignature::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: IndexSignature) -> *Comment;
```
## IndexSignature::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: IndexSignature) -> *Comment;
```
## IndexSignature::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: IndexSignature) -> Node;
```
## IndexSignature::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: IndexSignature) -> FunctionLikeDeclaration;
```
## IndexSignature::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: IndexSignature) -> int;
```
## IndexSignature::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: IndexSignature) -> int;
```
## IndexSignature::getIndex

```rust
pub fn getIndex(self: IndexSignature) -> int;
```
## IndexSignature::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: IndexSignature) -> *Node;
```
## IndexSignature::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *IndexSignature;
```
## IndexSignature::is\<T\>

```rust
pub fn is<T>(self: IndexSignature) -> bool;
```
## IndexSignature::to\<T\>

```rust
pub fn to<T>(self: IndexSignature) -> <any>;
```
## IndexSignature::key\_neq

```rust
pub fn key_neq(self: IndexSignature, object: <any>) -> bool;
```
## IndexSignature::key\_eq

```rust
pub fn key_eq(self: IndexSignature, object: <any>) -> bool;
```
## IndexSignature::to\_set

```rust
pub fn to_set(self: IndexSignature) -> *IndexSignature;
```
