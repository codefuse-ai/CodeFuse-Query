# Unknown

Primary key: `id: int`

```rust
schema Unknown {
  @primary id: int,
}
```
## Unknown::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: Unknown) -> Location;
```
## Unknown::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: Unknown) -> Symbol;
```
## Unknown::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: Unknown) -> *Decorator;
```
## Unknown::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: Unknown) -> string;
```
## Unknown::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: Unknown, i: int) -> Modifier;
```
## Unknown::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: Unknown) -> *Comment;
```
## Unknown::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: Unknown) -> *Node;
```
## Unknown::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: Unknown) -> *Node;
```
## Unknown::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: Unknown) -> Node;
```
## Unknown::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: Unknown) -> int;
```
## Unknown::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: Unknown) -> TopLevelDO;
```
## Unknown::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: Unknown, i: int) -> Decorator;
```
## Unknown::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: Unknown) -> int;
```
## Unknown::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: Unknown) -> *Modifier;
```
## Unknown::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: Unknown) -> int;
```
## Unknown::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: Unknown, i: int) -> Node;
```
## Unknown::getStartLineNumber

```rust
pub fn getStartLineNumber(self: Unknown) -> int;
```
## Unknown::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: Unknown) -> *FunctionLikeDeclaration;
```
## Unknown::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: Unknown, level: int) -> *Node;
```
## Unknown::getEndLineNumber

```rust
pub fn getEndLineNumber(self: Unknown) -> int;
```
## Unknown::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: Unknown) -> string;
```
## Unknown::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: Unknown, level: int) -> Node;
```
## Unknown::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: Unknown) -> File;
```
## Unknown::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: Unknown) -> *Comment;
```
## Unknown::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: Unknown) -> *Comment;
```
## Unknown::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: Unknown) -> Node;
```
## Unknown::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: Unknown) -> FunctionLikeDeclaration;
```
## Unknown::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: Unknown) -> int;
```
## Unknown::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: Unknown) -> int;
```
## Unknown::getIndex

```rust
pub fn getIndex(self: Unknown) -> int;
```
## Unknown::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: Unknown) -> *Node;
```
## Unknown::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *Unknown;
```
## Unknown::is\<T\>

```rust
pub fn is<T>(self: Unknown) -> bool;
```
## Unknown::to\<T\>

```rust
pub fn to<T>(self: Unknown) -> <any>;
```
## Unknown::key\_neq

```rust
pub fn key_neq(self: Unknown, object: <any>) -> bool;
```
## Unknown::key\_eq

```rust
pub fn key_eq(self: Unknown, object: <any>) -> bool;
```
## Unknown::to\_set

```rust
pub fn to_set(self: Unknown) -> *Unknown;
```
