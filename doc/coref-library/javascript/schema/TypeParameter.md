# TypeParameter

Primary key: `id: int`

```rust
schema TypeParameter {
  @primary id: int,
}
```
## TypeParameter::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TypeParameter) -> *Node;
```
## TypeParameter::getIndex

```rust
pub fn getIndex(self: TypeParameter) -> int;
```
## TypeParameter::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TypeParameter) -> int;
```
## TypeParameter::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeParameter) -> int;
```
## TypeParameter::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TypeParameter) -> Node;
```
## TypeParameter::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TypeParameter) -> FunctionLikeDeclaration;
```
## TypeParameter::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TypeParameter) -> File;
```
## TypeParameter::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TypeParameter, level: int) -> Node;
```
## TypeParameter::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TypeParameter) -> string;
```
## TypeParameter::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeParameter) -> int;
```
## TypeParameter::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeParameter) -> *FunctionLikeDeclaration;
```
## TypeParameter::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TypeParameter, level: int) -> *Node;
```
## TypeParameter::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TypeParameter) -> int;
```
## TypeParameter::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TypeParameter) -> *Modifier;
```
## TypeParameter::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeParameter) -> int;
```
## TypeParameter::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeParameter) -> int;
```
## TypeParameter::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TypeParameter, i: int) -> Node;
```
## TypeParameter::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TypeParameter, i: int) -> Decorator;
```
## TypeParameter::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TypeParameter) -> TopLevelDO;
```
## TypeParameter::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TypeParameter) -> int;
```
## TypeParameter::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TypeParameter) -> *Comment;
```
## TypeParameter::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TypeParameter) -> *Comment;
```
## TypeParameter::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TypeParameter) -> Node;
```
## TypeParameter::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TypeParameter) -> *Node;
```
## TypeParameter::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TypeParameter) -> *Node;
```
## TypeParameter::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TypeParameter) -> *Comment;
```
## TypeParameter::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TypeParameter, i: int) -> Modifier;
```
## TypeParameter::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TypeParameter) -> string;
```
## TypeParameter::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TypeParameter) -> *Decorator;
```
## TypeParameter::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TypeParameter) -> Symbol;
```
## TypeParameter::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TypeParameter) -> Location;
```
## TypeParameter::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TypeParameter;
```
## TypeParameter::is\<T\>

```rust
pub fn is<T>(self: TypeParameter) -> bool;
```
## TypeParameter::to\<T\>

```rust
pub fn to<T>(self: TypeParameter) -> <any>;
```
## TypeParameter::key\_neq

```rust
pub fn key_neq(self: TypeParameter, object: <any>) -> bool;
```
## TypeParameter::key\_eq

```rust
pub fn key_eq(self: TypeParameter, object: <any>) -> bool;
```
## TypeParameter::to\_set

```rust
pub fn to_set(self: TypeParameter) -> *TypeParameter;
```
