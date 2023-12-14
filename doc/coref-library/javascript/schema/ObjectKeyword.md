# ObjectKeyword

Primary key: `id: int`

```rust
schema ObjectKeyword {
  @primary id: int,
}
```
## ObjectKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ObjectKeyword) -> Location;
```
## ObjectKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ObjectKeyword) -> Symbol;
```
## ObjectKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ObjectKeyword) -> *Decorator;
```
## ObjectKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ObjectKeyword) -> string;
```
## ObjectKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ObjectKeyword, i: int) -> Modifier;
```
## ObjectKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ObjectKeyword) -> *Comment;
```
## ObjectKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ObjectKeyword) -> *Node;
```
## ObjectKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ObjectKeyword) -> *Node;
```
## ObjectKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ObjectKeyword) -> Node;
```
## ObjectKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ObjectKeyword) -> int;
```
## ObjectKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ObjectKeyword) -> TopLevelDO;
```
## ObjectKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ObjectKeyword, i: int) -> Decorator;
```
## ObjectKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ObjectKeyword) -> int;
```
## ObjectKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ObjectKeyword) -> *Modifier;
```
## ObjectKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ObjectKeyword) -> int;
```
## ObjectKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ObjectKeyword, i: int) -> Node;
```
## ObjectKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ObjectKeyword) -> int;
```
## ObjectKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ObjectKeyword) -> *FunctionLikeDeclaration;
```
## ObjectKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ObjectKeyword, level: int) -> *Node;
```
## ObjectKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ObjectKeyword) -> int;
```
## ObjectKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ObjectKeyword) -> string;
```
## ObjectKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ObjectKeyword, level: int) -> Node;
```
## ObjectKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ObjectKeyword) -> File;
```
## ObjectKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ObjectKeyword) -> *Comment;
```
## ObjectKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ObjectKeyword) -> *Comment;
```
## ObjectKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ObjectKeyword) -> Node;
```
## ObjectKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ObjectKeyword) -> FunctionLikeDeclaration;
```
## ObjectKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ObjectKeyword) -> int;
```
## ObjectKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ObjectKeyword) -> int;
```
## ObjectKeyword::getIndex

```rust
pub fn getIndex(self: ObjectKeyword) -> int;
```
## ObjectKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ObjectKeyword) -> *Node;
```
## ObjectKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ObjectKeyword;
```
## ObjectKeyword::is\<T\>

```rust
pub fn is<T>(self: ObjectKeyword) -> bool;
```
## ObjectKeyword::to\<T\>

```rust
pub fn to<T>(self: ObjectKeyword) -> <any>;
```
## ObjectKeyword::key\_neq

```rust
pub fn key_neq(self: ObjectKeyword, object: <any>) -> bool;
```
## ObjectKeyword::key\_eq

```rust
pub fn key_eq(self: ObjectKeyword, object: <any>) -> bool;
```
## ObjectKeyword::to\_set

```rust
pub fn to_set(self: ObjectKeyword) -> *ObjectKeyword;
```
