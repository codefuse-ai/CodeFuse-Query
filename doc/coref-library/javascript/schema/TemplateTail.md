# TemplateTail

Primary key: `id: int`

```rust
schema TemplateTail {
  @primary id: int,
}
```
## TemplateTail::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TemplateTail) -> Location;
```
## TemplateTail::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TemplateTail) -> Symbol;
```
## TemplateTail::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TemplateTail) -> *Decorator;
```
## TemplateTail::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TemplateTail) -> string;
```
## TemplateTail::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TemplateTail, i: int) -> Modifier;
```
## TemplateTail::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TemplateTail) -> *Comment;
```
## TemplateTail::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TemplateTail) -> *Node;
```
## TemplateTail::getValue

```rust
/**
     * Gets the value of this literal-like node, as a string.
     */
```
```rust
pub fn getValue(self: TemplateTail) -> string;
```
## TemplateTail::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TemplateTail) -> *Node;
```
## TemplateTail::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TemplateTail) -> Node;
```
## TemplateTail::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TemplateTail) -> TopLevelDO;
```
## TemplateTail::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TemplateTail, i: int) -> Decorator;
```
## TemplateTail::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TemplateTail) -> int;
```
## TemplateTail::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TemplateTail) -> int;
```
## TemplateTail::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateTail) -> int;
```
## TemplateTail::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TemplateTail) -> *Modifier;
```
## TemplateTail::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TemplateTail, i: int) -> Node;
```
## TemplateTail::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateTail) -> int;
```
## TemplateTail::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateTail) -> *FunctionLikeDeclaration;
```
## TemplateTail::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TemplateTail, level: int) -> *Node;
```
## TemplateTail::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateTail) -> int;
```
## TemplateTail::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TemplateTail) -> string;
```
## TemplateTail::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TemplateTail, level: int) -> Node;
```
## TemplateTail::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TemplateTail) -> File;
```
## TemplateTail::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TemplateTail) -> *Comment;
```
## TemplateTail::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TemplateTail) -> *Comment;
```
## TemplateTail::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TemplateTail) -> Node;
```
## TemplateTail::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TemplateTail) -> FunctionLikeDeclaration;
```
## TemplateTail::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateTail) -> int;
```
## TemplateTail::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TemplateTail) -> int;
```
## TemplateTail::getIndex

```rust
pub fn getIndex(self: TemplateTail) -> int;
```
## TemplateTail::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TemplateTail) -> *Node;
```
## TemplateTail::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateTail;
```
## TemplateTail::is\<T\>

```rust
pub fn is<T>(self: TemplateTail) -> bool;
```
## TemplateTail::to\<T\>

```rust
pub fn to<T>(self: TemplateTail) -> <any>;
```
## TemplateTail::key\_neq

```rust
pub fn key_neq(self: TemplateTail, object: <any>) -> bool;
```
## TemplateTail::key\_eq

```rust
pub fn key_eq(self: TemplateTail, object: <any>) -> bool;
```
## TemplateTail::to\_set

```rust
pub fn to_set(self: TemplateTail) -> *TemplateTail;
```
