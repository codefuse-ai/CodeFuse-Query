# RefExpr

Primary key: `id: int`

```rust
schema RefExpr {
  @primary id: int,
}
```
## RefExpr::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: RefExpr) -> *Node;
```
## RefExpr::getIndex

```rust
pub fn getIndex(self: RefExpr) -> int;
```
## RefExpr::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: RefExpr) -> int;
```
## RefExpr::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RefExpr) -> int;
```
## RefExpr::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: RefExpr) -> Node;
```
## RefExpr::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: RefExpr) -> FunctionLikeDeclaration;
```
## RefExpr::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: RefExpr) -> string;
```
## RefExpr::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RefExpr) -> int;
```
## RefExpr::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: RefExpr) -> Location;
```
## RefExpr::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RefExpr) -> *FunctionLikeDeclaration;
```
## RefExpr::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: RefExpr, level: int) -> *Node;
```
## RefExpr::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: RefExpr) -> int;
```
## RefExpr::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: RefExpr) -> *Modifier;
```
## RefExpr::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RefExpr) -> int;
```
## RefExpr::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RefExpr) -> int;
```
## RefExpr::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: RefExpr, i: int) -> Node;
```
## RefExpr::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: RefExpr) -> int;
```
## RefExpr::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: RefExpr) -> TopLevelDO;
```
## RefExpr::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: RefExpr, i: int) -> Decorator;
```
## RefExpr::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: RefExpr) -> *Comment;
```
## RefExpr::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: RefExpr) -> *Comment;
```
## RefExpr::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: RefExpr) -> *Node;
```
## RefExpr::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: RefExpr) -> Node;
```
## RefExpr::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: RefExpr) -> File;
```
## RefExpr::hasSymbol

```rust
/**
     * Determine whether this RefExpr has symbol.
     */
```
```rust
pub fn hasSymbol(self: RefExpr) -> bool;
```
## RefExpr::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: RefExpr) -> *Node;
```
## RefExpr::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: RefExpr) -> *Comment;
```
## RefExpr::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: RefExpr) -> Symbol;
```
## RefExpr::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: RefExpr) -> *Decorator;
```
## RefExpr::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: RefExpr, i: int) -> Modifier;
```
## RefExpr::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: RefExpr) -> string;
```
## RefExpr::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: RefExpr, level: int) -> Node;
```
## RefExpr::getRefName

```rust
/**
     * Get the name of this RefExpr.
     */
```
```rust
pub fn getRefName(self: RefExpr) -> string;
```
## RefExpr::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *RefExpr;
```
## RefExpr::is\<T\>

```rust
pub fn is<T>(self: RefExpr) -> bool;
```
## RefExpr::to\<T\>

```rust
pub fn to<T>(self: RefExpr) -> <any>;
```
## RefExpr::key\_neq

```rust
pub fn key_neq(self: RefExpr, object: <any>) -> bool;
```
## RefExpr::key\_eq

```rust
pub fn key_eq(self: RefExpr, object: <any>) -> bool;
```
## RefExpr::to\_set

```rust
pub fn to_set(self: RefExpr) -> *RefExpr;
```
