# BigIntKeyword

Primary key: `id: int`

```rust
schema BigIntKeyword {
  @primary id: int,
}
```
## BigIntKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BigIntKeyword) -> Location;
```
## BigIntKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BigIntKeyword) -> Symbol;
```
## BigIntKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BigIntKeyword) -> *Decorator;
```
## BigIntKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BigIntKeyword) -> string;
```
## BigIntKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BigIntKeyword, i: int) -> Modifier;
```
## BigIntKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BigIntKeyword) -> *Comment;
```
## BigIntKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BigIntKeyword) -> *Node;
```
## BigIntKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BigIntKeyword) -> *Node;
```
## BigIntKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BigIntKeyword) -> Node;
```
## BigIntKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BigIntKeyword) -> int;
```
## BigIntKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BigIntKeyword) -> TopLevelDO;
```
## BigIntKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BigIntKeyword, i: int) -> Decorator;
```
## BigIntKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BigIntKeyword) -> int;
```
## BigIntKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BigIntKeyword) -> *Modifier;
```
## BigIntKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BigIntKeyword) -> int;
```
## BigIntKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BigIntKeyword, i: int) -> Node;
```
## BigIntKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BigIntKeyword) -> int;
```
## BigIntKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BigIntKeyword) -> *FunctionLikeDeclaration;
```
## BigIntKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BigIntKeyword, level: int) -> *Node;
```
## BigIntKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BigIntKeyword) -> int;
```
## BigIntKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BigIntKeyword) -> string;
```
## BigIntKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BigIntKeyword, level: int) -> Node;
```
## BigIntKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BigIntKeyword) -> File;
```
## BigIntKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BigIntKeyword) -> *Comment;
```
## BigIntKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BigIntKeyword) -> *Comment;
```
## BigIntKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BigIntKeyword) -> Node;
```
## BigIntKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BigIntKeyword) -> FunctionLikeDeclaration;
```
## BigIntKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BigIntKeyword) -> int;
```
## BigIntKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BigIntKeyword) -> int;
```
## BigIntKeyword::getIndex

```rust
pub fn getIndex(self: BigIntKeyword) -> int;
```
## BigIntKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BigIntKeyword) -> *Node;
```
## BigIntKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BigIntKeyword;
```
## BigIntKeyword::is\<T\>

```rust
pub fn is<T>(self: BigIntKeyword) -> bool;
```
## BigIntKeyword::to\<T\>

```rust
pub fn to<T>(self: BigIntKeyword) -> <any>;
```
## BigIntKeyword::key\_neq

```rust
pub fn key_neq(self: BigIntKeyword, object: <any>) -> bool;
```
## BigIntKeyword::key\_eq

```rust
pub fn key_eq(self: BigIntKeyword, object: <any>) -> bool;
```
## BigIntKeyword::to\_set

```rust
pub fn to_set(self: BigIntKeyword) -> *BigIntKeyword;
```
