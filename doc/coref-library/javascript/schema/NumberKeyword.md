# NumberKeyword

Primary key: `id: int`

```rust
schema NumberKeyword {
  @primary id: int,
}
```
## NumberKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NumberKeyword) -> Location;
```
## NumberKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NumberKeyword) -> Symbol;
```
## NumberKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NumberKeyword) -> *Decorator;
```
## NumberKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NumberKeyword) -> string;
```
## NumberKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NumberKeyword, i: int) -> Modifier;
```
## NumberKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NumberKeyword) -> *Comment;
```
## NumberKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NumberKeyword) -> *Node;
```
## NumberKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NumberKeyword) -> *Node;
```
## NumberKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NumberKeyword) -> Node;
```
## NumberKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NumberKeyword) -> int;
```
## NumberKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NumberKeyword) -> TopLevelDO;
```
## NumberKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NumberKeyword, i: int) -> Decorator;
```
## NumberKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NumberKeyword) -> int;
```
## NumberKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NumberKeyword) -> *Modifier;
```
## NumberKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NumberKeyword) -> int;
```
## NumberKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NumberKeyword, i: int) -> Node;
```
## NumberKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NumberKeyword) -> int;
```
## NumberKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NumberKeyword) -> *FunctionLikeDeclaration;
```
## NumberKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NumberKeyword, level: int) -> *Node;
```
## NumberKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NumberKeyword) -> int;
```
## NumberKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NumberKeyword) -> string;
```
## NumberKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NumberKeyword, level: int) -> Node;
```
## NumberKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NumberKeyword) -> File;
```
## NumberKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NumberKeyword) -> *Comment;
```
## NumberKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NumberKeyword) -> *Comment;
```
## NumberKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NumberKeyword) -> Node;
```
## NumberKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NumberKeyword) -> FunctionLikeDeclaration;
```
## NumberKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NumberKeyword) -> int;
```
## NumberKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NumberKeyword) -> int;
```
## NumberKeyword::getIndex

```rust
pub fn getIndex(self: NumberKeyword) -> int;
```
## NumberKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NumberKeyword) -> *Node;
```
## NumberKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NumberKeyword;
```
## NumberKeyword::is\<T\>

```rust
pub fn is<T>(self: NumberKeyword) -> bool;
```
## NumberKeyword::to\<T\>

```rust
pub fn to<T>(self: NumberKeyword) -> <any>;
```
## NumberKeyword::key\_neq

```rust
pub fn key_neq(self: NumberKeyword, object: <any>) -> bool;
```
## NumberKeyword::key\_eq

```rust
pub fn key_eq(self: NumberKeyword, object: <any>) -> bool;
```
## NumberKeyword::to\_set

```rust
pub fn to_set(self: NumberKeyword) -> *NumberKeyword;
```
