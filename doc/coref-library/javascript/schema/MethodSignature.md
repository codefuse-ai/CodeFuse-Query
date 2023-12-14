# MethodSignature

Primary key: `id: int`

```rust
schema MethodSignature {
  @primary id: int,
}
```
## MethodSignature::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: MethodSignature) -> Location;
```
## MethodSignature::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: MethodSignature) -> Symbol;
```
## MethodSignature::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: MethodSignature) -> *Decorator;
```
## MethodSignature::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: MethodSignature) -> string;
```
## MethodSignature::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: MethodSignature, i: int) -> Modifier;
```
## MethodSignature::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: MethodSignature) -> *Comment;
```
## MethodSignature::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: MethodSignature) -> *Node;
```
## MethodSignature::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: MethodSignature) -> *Node;
```
## MethodSignature::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: MethodSignature) -> Node;
```
## MethodSignature::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: MethodSignature) -> int;
```
## MethodSignature::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: MethodSignature) -> TopLevelDO;
```
## MethodSignature::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: MethodSignature, i: int) -> Decorator;
```
## MethodSignature::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: MethodSignature) -> int;
```
## MethodSignature::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: MethodSignature) -> *Modifier;
```
## MethodSignature::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MethodSignature) -> int;
```
## MethodSignature::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: MethodSignature, i: int) -> Node;
```
## MethodSignature::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MethodSignature) -> int;
```
## MethodSignature::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MethodSignature) -> *FunctionLikeDeclaration;
```
## MethodSignature::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: MethodSignature, level: int) -> *Node;
```
## MethodSignature::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MethodSignature) -> int;
```
## MethodSignature::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: MethodSignature) -> string;
```
## MethodSignature::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: MethodSignature, level: int) -> Node;
```
## MethodSignature::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: MethodSignature) -> File;
```
## MethodSignature::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: MethodSignature) -> *Comment;
```
## MethodSignature::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: MethodSignature) -> *Comment;
```
## MethodSignature::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: MethodSignature) -> Node;
```
## MethodSignature::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: MethodSignature) -> FunctionLikeDeclaration;
```
## MethodSignature::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MethodSignature) -> int;
```
## MethodSignature::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: MethodSignature) -> int;
```
## MethodSignature::getIndex

```rust
pub fn getIndex(self: MethodSignature) -> int;
```
## MethodSignature::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: MethodSignature) -> *Node;
```
## MethodSignature::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MethodSignature;
```
## MethodSignature::is\<T\>

```rust
pub fn is<T>(self: MethodSignature) -> bool;
```
## MethodSignature::to\<T\>

```rust
pub fn to<T>(self: MethodSignature) -> <any>;
```
## MethodSignature::key\_neq

```rust
pub fn key_neq(self: MethodSignature, object: <any>) -> bool;
```
## MethodSignature::key\_eq

```rust
pub fn key_eq(self: MethodSignature, object: <any>) -> bool;
```
## MethodSignature::to\_set

```rust
pub fn to_set(self: MethodSignature) -> *MethodSignature;
```
