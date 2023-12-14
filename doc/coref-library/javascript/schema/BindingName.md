# BindingName

Primary key: `id: int`

```rust
schema BindingName {
  @primary id: int,
}
```
## BindingName::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BindingName) -> *Node;
```
## BindingName::getIndex

```rust
pub fn getIndex(self: BindingName) -> int;
```
## BindingName::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BindingName) -> int;
```
## BindingName::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BindingName) -> int;
```
## BindingName::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BindingName) -> Node;
```
## BindingName::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BindingName) -> FunctionLikeDeclaration;
```
## BindingName::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BindingName) -> File;
```
## BindingName::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BindingName, level: int) -> Node;
```
## BindingName::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BindingName) -> string;
```
## BindingName::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BindingName) -> int;
```
## BindingName::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BindingName) -> *FunctionLikeDeclaration;
```
## BindingName::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BindingName, level: int) -> *Node;
```
## BindingName::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BindingName) -> int;
```
## BindingName::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BindingName) -> *Modifier;
```
## BindingName::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BindingName) -> int;
```
## BindingName::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BindingName) -> int;
```
## BindingName::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BindingName, i: int) -> Node;
```
## BindingName::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BindingName) -> TopLevelDO;
```
## BindingName::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BindingName, i: int) -> Decorator;
```
## BindingName::getName

```rust
pub fn getName(self: BindingName) -> string;
```
## BindingName::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BindingName) -> int;
```
## BindingName::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BindingName) -> *Comment;
```
## BindingName::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BindingName) -> *Comment;
```
## BindingName::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BindingName) -> *Node;
```
## BindingName::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BindingName) -> Node;
```
## BindingName::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BindingName, i: int) -> Modifier;
```
## BindingName::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BindingName) -> string;
```
## BindingName::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BindingName) -> *Decorator;
```
## BindingName::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BindingName) -> Symbol;
```
## BindingName::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BindingName) -> Location;
```
## BindingName::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BindingName;
```
## BindingName::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BindingName) -> *Node;
```
## BindingName::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BindingName) -> *Comment;
```
## BindingName::is\<T\>

```rust
pub fn is<T>(self: BindingName) -> bool;
```
## BindingName::to\<T\>

```rust
pub fn to<T>(self: BindingName) -> <any>;
```
## BindingName::key\_neq

```rust
pub fn key_neq(self: BindingName, object: <any>) -> bool;
```
## BindingName::key\_eq

```rust
pub fn key_eq(self: BindingName, object: <any>) -> bool;
```
## BindingName::to\_set

```rust
pub fn to_set(self: BindingName) -> *BindingName;
```
