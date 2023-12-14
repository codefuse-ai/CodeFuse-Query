# ConstKeyword

Primary key: `id: int`

```rust
schema ConstKeyword {
  @primary id: int,
}
```
## ConstKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ConstKeyword) -> *Node;
```
## ConstKeyword::getIndex

```rust
pub fn getIndex(self: ConstKeyword) -> int;
```
## ConstKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ConstKeyword) -> int;
```
## ConstKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ConstKeyword) -> int;
```
## ConstKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ConstKeyword) -> FunctionLikeDeclaration;
```
## ConstKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ConstKeyword) -> Node;
```
## ConstKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ConstKeyword) -> *Comment;
```
## ConstKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ConstKeyword) -> *Comment;
```
## ConstKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ConstKeyword) -> File;
```
## ConstKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ConstKeyword, level: int) -> Node;
```
## ConstKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ConstKeyword) -> int;
```
## ConstKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ConstKeyword) -> string;
```
## ConstKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ConstKeyword) -> *FunctionLikeDeclaration;
```
## ConstKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ConstKeyword, level: int) -> *Node;
```
## ConstKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ConstKeyword) -> int;
```
## ConstKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ConstKeyword) -> *Modifier;
```
## ConstKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ConstKeyword) -> int;
```
## ConstKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ConstKeyword) -> int;
```
## ConstKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ConstKeyword, i: int) -> Node;
```
## ConstKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ConstKeyword, i: int) -> Decorator;
```
## ConstKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ConstKeyword) -> TopLevelDO;
```
## ConstKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ConstKeyword) -> int;
```
## ConstKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ConstKeyword) -> Node;
```
## ConstKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ConstKeyword) -> *Node;
```
## ConstKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ConstKeyword) -> *Node;
```
## ConstKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ConstKeyword) -> *Comment;
```
## ConstKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ConstKeyword) -> Symbol;
```
## ConstKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ConstKeyword) -> *Decorator;
```
## ConstKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ConstKeyword, i: int) -> Modifier;
```
## ConstKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ConstKeyword) -> string;
```
## ConstKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ConstKeyword;
```
## ConstKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ConstKeyword) -> Location;
```
## ConstKeyword::is\<T\>

```rust
pub fn is<T>(self: ConstKeyword) -> bool;
```
## ConstKeyword::to\<T\>

```rust
pub fn to<T>(self: ConstKeyword) -> <any>;
```
## ConstKeyword::key\_neq

```rust
pub fn key_neq(self: ConstKeyword, object: <any>) -> bool;
```
## ConstKeyword::key\_eq

```rust
pub fn key_eq(self: ConstKeyword, object: <any>) -> bool;
```
## ConstKeyword::to\_set

```rust
pub fn to_set(self: ConstKeyword) -> *ConstKeyword;
```
