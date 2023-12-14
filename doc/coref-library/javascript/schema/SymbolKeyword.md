# SymbolKeyword

Primary key: `id: int`

```rust
schema SymbolKeyword {
  @primary id: int,
}
```
## SymbolKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: SymbolKeyword) -> Location;
```
## SymbolKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: SymbolKeyword) -> Symbol;
```
## SymbolKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: SymbolKeyword) -> *Decorator;
```
## SymbolKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: SymbolKeyword) -> string;
```
## SymbolKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: SymbolKeyword, i: int) -> Modifier;
```
## SymbolKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: SymbolKeyword) -> *Comment;
```
## SymbolKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: SymbolKeyword) -> *Node;
```
## SymbolKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: SymbolKeyword) -> *Node;
```
## SymbolKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: SymbolKeyword) -> Node;
```
## SymbolKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: SymbolKeyword) -> int;
```
## SymbolKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: SymbolKeyword) -> TopLevelDO;
```
## SymbolKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: SymbolKeyword, i: int) -> Decorator;
```
## SymbolKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: SymbolKeyword) -> int;
```
## SymbolKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: SymbolKeyword) -> *Modifier;
```
## SymbolKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SymbolKeyword) -> int;
```
## SymbolKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: SymbolKeyword, i: int) -> Node;
```
## SymbolKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SymbolKeyword) -> int;
```
## SymbolKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SymbolKeyword) -> *FunctionLikeDeclaration;
```
## SymbolKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: SymbolKeyword, level: int) -> *Node;
```
## SymbolKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SymbolKeyword) -> int;
```
## SymbolKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: SymbolKeyword) -> string;
```
## SymbolKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: SymbolKeyword, level: int) -> Node;
```
## SymbolKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: SymbolKeyword) -> File;
```
## SymbolKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: SymbolKeyword) -> *Comment;
```
## SymbolKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: SymbolKeyword) -> *Comment;
```
## SymbolKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: SymbolKeyword) -> Node;
```
## SymbolKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: SymbolKeyword) -> FunctionLikeDeclaration;
```
## SymbolKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SymbolKeyword) -> int;
```
## SymbolKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: SymbolKeyword) -> int;
```
## SymbolKeyword::getIndex

```rust
pub fn getIndex(self: SymbolKeyword) -> int;
```
## SymbolKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: SymbolKeyword) -> *Node;
```
## SymbolKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *SymbolKeyword;
```
## SymbolKeyword::is\<T\>

```rust
pub fn is<T>(self: SymbolKeyword) -> bool;
```
## SymbolKeyword::to\<T\>

```rust
pub fn to<T>(self: SymbolKeyword) -> <any>;
```
## SymbolKeyword::key\_neq

```rust
pub fn key_neq(self: SymbolKeyword, object: <any>) -> bool;
```
## SymbolKeyword::key\_eq

```rust
pub fn key_eq(self: SymbolKeyword, object: <any>) -> bool;
```
## SymbolKeyword::to\_set

```rust
pub fn to_set(self: SymbolKeyword) -> *SymbolKeyword;
```
