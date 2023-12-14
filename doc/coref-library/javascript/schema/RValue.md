# RValue

Primary key: `id: int`

```rust
schema RValue {
  @primary id: int,
}
```
## RValue::getRefName

```rust
/**
     * Get the name of this RefExpr.
     */
```
```rust
pub fn getRefName(self: RValue) -> string;
```
## RValue::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: RValue, level: int) -> Node;
```
## RValue::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: RValue) -> string;
```
## RValue::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: RValue, i: int) -> Modifier;
```
## RValue::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: RValue) -> *Decorator;
```
## RValue::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: RValue) -> Symbol;
```
## RValue::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: RValue) -> *Comment;
```
## RValue::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: RValue) -> *Node;
```
## RValue::hasSymbol

```rust
/**
     * Determine whether this RefExpr has symbol.
     */
```
```rust
pub fn hasSymbol(self: RValue) -> bool;
```
## RValue::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: RValue) -> File;
```
## RValue::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: RValue) -> Node;
```
## RValue::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: RValue) -> *Node;
```
## RValue::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: RValue, i: int) -> Decorator;
```
## RValue::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: RValue) -> TopLevelDO;
```
## RValue::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: RValue) -> int;
```
## RValue::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: RValue) -> int;
```
## RValue::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: RValue) -> *Modifier;
```
## RValue::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RValue) -> int;
```
## RValue::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: RValue, i: int) -> Node;
```
## RValue::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RValue) -> int;
```
## RValue::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: RValue, level: int) -> *Node;
```
## RValue::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RValue) -> *FunctionLikeDeclaration;
```
## RValue::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *RValue;
```
## RValue::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: RValue) -> Location;
```
## RValue::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RValue) -> int;
```
## RValue::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: RValue) -> string;
```
## RValue::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: RValue) -> *Comment;
```
## RValue::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: RValue) -> *Comment;
```
## RValue::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: RValue) -> Node;
```
## RValue::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: RValue) -> FunctionLikeDeclaration;
```
## RValue::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RValue) -> int;
```
## RValue::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: RValue) -> int;
```
## RValue::getIndex

```rust
pub fn getIndex(self: RValue) -> int;
```
## RValue::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: RValue) -> *Node;
```
## RValue::is\<T\>

```rust
pub fn is<T>(self: RValue) -> bool;
```
## RValue::to\<T\>

```rust
pub fn to<T>(self: RValue) -> <any>;
```
## RValue::key\_neq

```rust
pub fn key_neq(self: RValue, object: <any>) -> bool;
```
## RValue::key\_eq

```rust
pub fn key_eq(self: RValue, object: <any>) -> bool;
```
## RValue::to\_set

```rust
pub fn to_set(self: RValue) -> *RValue;
```
