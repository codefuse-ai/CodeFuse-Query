# AsyncKeyword

Primary key: `id: int`

```rust
schema AsyncKeyword {
  @primary id: int,
}
```
## AsyncKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AsyncKeyword) -> *Node;
```
## AsyncKeyword::getIndex

```rust
pub fn getIndex(self: AsyncKeyword) -> int;
```
## AsyncKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AsyncKeyword) -> int;
```
## AsyncKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AsyncKeyword) -> int;
```
## AsyncKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AsyncKeyword) -> FunctionLikeDeclaration;
```
## AsyncKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AsyncKeyword) -> Node;
```
## AsyncKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AsyncKeyword) -> *Comment;
```
## AsyncKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AsyncKeyword) -> *Comment;
```
## AsyncKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AsyncKeyword) -> File;
```
## AsyncKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AsyncKeyword, level: int) -> Node;
```
## AsyncKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AsyncKeyword) -> int;
```
## AsyncKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AsyncKeyword) -> string;
```
## AsyncKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AsyncKeyword) -> *FunctionLikeDeclaration;
```
## AsyncKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AsyncKeyword, level: int) -> *Node;
```
## AsyncKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AsyncKeyword) -> int;
```
## AsyncKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AsyncKeyword) -> *Modifier;
```
## AsyncKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AsyncKeyword) -> int;
```
## AsyncKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AsyncKeyword) -> int;
```
## AsyncKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AsyncKeyword, i: int) -> Node;
```
## AsyncKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AsyncKeyword, i: int) -> Decorator;
```
## AsyncKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AsyncKeyword) -> TopLevelDO;
```
## AsyncKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AsyncKeyword) -> int;
```
## AsyncKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AsyncKeyword) -> Node;
```
## AsyncKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AsyncKeyword) -> *Node;
```
## AsyncKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AsyncKeyword) -> *Node;
```
## AsyncKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AsyncKeyword) -> *Comment;
```
## AsyncKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AsyncKeyword) -> Symbol;
```
## AsyncKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AsyncKeyword) -> *Decorator;
```
## AsyncKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AsyncKeyword, i: int) -> Modifier;
```
## AsyncKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AsyncKeyword) -> string;
```
## AsyncKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AsyncKeyword;
```
## AsyncKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AsyncKeyword) -> Location;
```
## AsyncKeyword::is\<T\>

```rust
pub fn is<T>(self: AsyncKeyword) -> bool;
```
## AsyncKeyword::to\<T\>

```rust
pub fn to<T>(self: AsyncKeyword) -> <any>;
```
## AsyncKeyword::key\_neq

```rust
pub fn key_neq(self: AsyncKeyword, object: <any>) -> bool;
```
## AsyncKeyword::key\_eq

```rust
pub fn key_eq(self: AsyncKeyword, object: <any>) -> bool;
```
## AsyncKeyword::to\_set

```rust
pub fn to_set(self: AsyncKeyword) -> *AsyncKeyword;
```
