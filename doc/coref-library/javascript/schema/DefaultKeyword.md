# DefaultKeyword

Primary key: `id: int`

```rust
schema DefaultKeyword {
  @primary id: int,
}
```
## DefaultKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: DefaultKeyword) -> *Node;
```
## DefaultKeyword::getIndex

```rust
pub fn getIndex(self: DefaultKeyword) -> int;
```
## DefaultKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: DefaultKeyword) -> int;
```
## DefaultKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DefaultKeyword) -> int;
```
## DefaultKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: DefaultKeyword) -> FunctionLikeDeclaration;
```
## DefaultKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: DefaultKeyword) -> Node;
```
## DefaultKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: DefaultKeyword) -> *Comment;
```
## DefaultKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: DefaultKeyword) -> *Comment;
```
## DefaultKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: DefaultKeyword) -> File;
```
## DefaultKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: DefaultKeyword, level: int) -> Node;
```
## DefaultKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DefaultKeyword) -> int;
```
## DefaultKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: DefaultKeyword) -> string;
```
## DefaultKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DefaultKeyword) -> *FunctionLikeDeclaration;
```
## DefaultKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: DefaultKeyword, level: int) -> *Node;
```
## DefaultKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: DefaultKeyword) -> int;
```
## DefaultKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: DefaultKeyword) -> *Modifier;
```
## DefaultKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DefaultKeyword) -> int;
```
## DefaultKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DefaultKeyword) -> int;
```
## DefaultKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: DefaultKeyword, i: int) -> Node;
```
## DefaultKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: DefaultKeyword, i: int) -> Decorator;
```
## DefaultKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: DefaultKeyword) -> TopLevelDO;
```
## DefaultKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: DefaultKeyword) -> int;
```
## DefaultKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: DefaultKeyword) -> Node;
```
## DefaultKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: DefaultKeyword) -> *Node;
```
## DefaultKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: DefaultKeyword) -> *Node;
```
## DefaultKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: DefaultKeyword) -> *Comment;
```
## DefaultKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: DefaultKeyword) -> Symbol;
```
## DefaultKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: DefaultKeyword) -> *Decorator;
```
## DefaultKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: DefaultKeyword, i: int) -> Modifier;
```
## DefaultKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: DefaultKeyword) -> string;
```
## DefaultKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *DefaultKeyword;
```
## DefaultKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: DefaultKeyword) -> Location;
```
## DefaultKeyword::is\<T\>

```rust
pub fn is<T>(self: DefaultKeyword) -> bool;
```
## DefaultKeyword::to\<T\>

```rust
pub fn to<T>(self: DefaultKeyword) -> <any>;
```
## DefaultKeyword::key\_neq

```rust
pub fn key_neq(self: DefaultKeyword, object: <any>) -> bool;
```
## DefaultKeyword::key\_eq

```rust
pub fn key_eq(self: DefaultKeyword, object: <any>) -> bool;
```
## DefaultKeyword::to\_set

```rust
pub fn to_set(self: DefaultKeyword) -> *DefaultKeyword;
```
