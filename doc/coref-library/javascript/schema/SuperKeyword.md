# SuperKeyword

Primary key: `id: int`

```rust
schema SuperKeyword {
  @primary id: int,
}
```
## SuperKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: SuperKeyword) -> Location;
```
## SuperKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: SuperKeyword) -> Symbol;
```
## SuperKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: SuperKeyword) -> *Decorator;
```
## SuperKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: SuperKeyword) -> string;
```
## SuperKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: SuperKeyword, i: int) -> Modifier;
```
## SuperKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: SuperKeyword) -> *Comment;
```
## SuperKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: SuperKeyword) -> *Node;
```
## SuperKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: SuperKeyword) -> *Node;
```
## SuperKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: SuperKeyword) -> Node;
```
## SuperKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: SuperKeyword) -> int;
```
## SuperKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: SuperKeyword) -> TopLevelDO;
```
## SuperKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: SuperKeyword, i: int) -> Decorator;
```
## SuperKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: SuperKeyword) -> int;
```
## SuperKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: SuperKeyword) -> *Modifier;
```
## SuperKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SuperKeyword) -> int;
```
## SuperKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: SuperKeyword, i: int) -> Node;
```
## SuperKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SuperKeyword) -> int;
```
## SuperKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SuperKeyword) -> *FunctionLikeDeclaration;
```
## SuperKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: SuperKeyword, level: int) -> *Node;
```
## SuperKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SuperKeyword) -> int;
```
## SuperKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: SuperKeyword) -> string;
```
## SuperKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: SuperKeyword, level: int) -> Node;
```
## SuperKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: SuperKeyword) -> File;
```
## SuperKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: SuperKeyword) -> *Comment;
```
## SuperKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: SuperKeyword) -> *Comment;
```
## SuperKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: SuperKeyword) -> Node;
```
## SuperKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: SuperKeyword) -> FunctionLikeDeclaration;
```
## SuperKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SuperKeyword) -> int;
```
## SuperKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: SuperKeyword) -> int;
```
## SuperKeyword::getIndex

```rust
pub fn getIndex(self: SuperKeyword) -> int;
```
## SuperKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: SuperKeyword) -> *Node;
```
## SuperKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *SuperKeyword;
```
## SuperKeyword::is\<T\>

```rust
pub fn is<T>(self: SuperKeyword) -> bool;
```
## SuperKeyword::to\<T\>

```rust
pub fn to<T>(self: SuperKeyword) -> <any>;
```
## SuperKeyword::key\_neq

```rust
pub fn key_neq(self: SuperKeyword, object: <any>) -> bool;
```
## SuperKeyword::key\_eq

```rust
pub fn key_eq(self: SuperKeyword, object: <any>) -> bool;
```
## SuperKeyword::to\_set

```rust
pub fn to_set(self: SuperKeyword) -> *SuperKeyword;
```
