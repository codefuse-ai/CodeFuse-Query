# PropertySignature

Primary key: `id: int`

```rust
schema PropertySignature {
  @primary id: int,
}
```
## PropertySignature::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PropertySignature) -> Location;
```
## PropertySignature::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PropertySignature) -> Symbol;
```
## PropertySignature::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PropertySignature) -> *Decorator;
```
## PropertySignature::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PropertySignature) -> string;
```
## PropertySignature::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PropertySignature, i: int) -> Modifier;
```
## PropertySignature::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PropertySignature) -> *Comment;
```
## PropertySignature::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PropertySignature) -> *Node;
```
## PropertySignature::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PropertySignature) -> *Node;
```
## PropertySignature::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PropertySignature) -> Node;
```
## PropertySignature::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PropertySignature) -> int;
```
## PropertySignature::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PropertySignature) -> TopLevelDO;
```
## PropertySignature::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PropertySignature, i: int) -> Decorator;
```
## PropertySignature::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PropertySignature) -> int;
```
## PropertySignature::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PropertySignature) -> *Modifier;
```
## PropertySignature::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PropertySignature) -> int;
```
## PropertySignature::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PropertySignature, i: int) -> Node;
```
## PropertySignature::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PropertySignature) -> int;
```
## PropertySignature::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PropertySignature) -> *FunctionLikeDeclaration;
```
## PropertySignature::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PropertySignature, level: int) -> *Node;
```
## PropertySignature::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PropertySignature) -> int;
```
## PropertySignature::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PropertySignature) -> string;
```
## PropertySignature::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PropertySignature, level: int) -> Node;
```
## PropertySignature::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PropertySignature) -> File;
```
## PropertySignature::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PropertySignature) -> *Comment;
```
## PropertySignature::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PropertySignature) -> *Comment;
```
## PropertySignature::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PropertySignature) -> Node;
```
## PropertySignature::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PropertySignature) -> FunctionLikeDeclaration;
```
## PropertySignature::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PropertySignature) -> int;
```
## PropertySignature::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PropertySignature) -> int;
```
## PropertySignature::getIndex

```rust
pub fn getIndex(self: PropertySignature) -> int;
```
## PropertySignature::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PropertySignature) -> *Node;
```
## PropertySignature::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PropertySignature;
```
## PropertySignature::is\<T\>

```rust
pub fn is<T>(self: PropertySignature) -> bool;
```
## PropertySignature::to\<T\>

```rust
pub fn to<T>(self: PropertySignature) -> <any>;
```
## PropertySignature::key\_neq

```rust
pub fn key_neq(self: PropertySignature, object: <any>) -> bool;
```
## PropertySignature::key\_eq

```rust
pub fn key_eq(self: PropertySignature, object: <any>) -> bool;
```
## PropertySignature::to\_set

```rust
pub fn to_set(self: PropertySignature) -> *PropertySignature;
```
