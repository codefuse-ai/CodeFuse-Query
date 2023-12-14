# NeverKeyword

Primary key: `id: int`

```rust
schema NeverKeyword {
  @primary id: int,
}
```
## NeverKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NeverKeyword) -> Location;
```
## NeverKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NeverKeyword) -> Symbol;
```
## NeverKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NeverKeyword) -> *Decorator;
```
## NeverKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NeverKeyword) -> string;
```
## NeverKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NeverKeyword, i: int) -> Modifier;
```
## NeverKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NeverKeyword) -> *Comment;
```
## NeverKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NeverKeyword) -> *Node;
```
## NeverKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NeverKeyword) -> *Node;
```
## NeverKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NeverKeyword) -> Node;
```
## NeverKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NeverKeyword) -> int;
```
## NeverKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NeverKeyword) -> TopLevelDO;
```
## NeverKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NeverKeyword, i: int) -> Decorator;
```
## NeverKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NeverKeyword) -> int;
```
## NeverKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NeverKeyword) -> *Modifier;
```
## NeverKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NeverKeyword) -> int;
```
## NeverKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NeverKeyword, i: int) -> Node;
```
## NeverKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NeverKeyword) -> int;
```
## NeverKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NeverKeyword) -> *FunctionLikeDeclaration;
```
## NeverKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NeverKeyword, level: int) -> *Node;
```
## NeverKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NeverKeyword) -> int;
```
## NeverKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NeverKeyword) -> string;
```
## NeverKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NeverKeyword, level: int) -> Node;
```
## NeverKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NeverKeyword) -> File;
```
## NeverKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NeverKeyword) -> *Comment;
```
## NeverKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NeverKeyword) -> *Comment;
```
## NeverKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NeverKeyword) -> Node;
```
## NeverKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NeverKeyword) -> FunctionLikeDeclaration;
```
## NeverKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NeverKeyword) -> int;
```
## NeverKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NeverKeyword) -> int;
```
## NeverKeyword::getIndex

```rust
pub fn getIndex(self: NeverKeyword) -> int;
```
## NeverKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NeverKeyword) -> *Node;
```
## NeverKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NeverKeyword;
```
## NeverKeyword::is\<T\>

```rust
pub fn is<T>(self: NeverKeyword) -> bool;
```
## NeverKeyword::to\<T\>

```rust
pub fn to<T>(self: NeverKeyword) -> <any>;
```
## NeverKeyword::key\_neq

```rust
pub fn key_neq(self: NeverKeyword, object: <any>) -> bool;
```
## NeverKeyword::key\_eq

```rust
pub fn key_eq(self: NeverKeyword, object: <any>) -> bool;
```
## NeverKeyword::to\_set

```rust
pub fn to_set(self: NeverKeyword) -> *NeverKeyword;
```
