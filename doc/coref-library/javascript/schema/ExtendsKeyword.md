# ExtendsKeyword

Primary key: `id: int`

```rust
schema ExtendsKeyword {
  @primary id: int,
}
```
## ExtendsKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ExtendsKeyword) -> Location;
```
## ExtendsKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ExtendsKeyword) -> Symbol;
```
## ExtendsKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ExtendsKeyword) -> *Decorator;
```
## ExtendsKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ExtendsKeyword) -> string;
```
## ExtendsKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ExtendsKeyword, i: int) -> Modifier;
```
## ExtendsKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ExtendsKeyword) -> *Comment;
```
## ExtendsKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ExtendsKeyword) -> *Node;
```
## ExtendsKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ExtendsKeyword) -> *Node;
```
## ExtendsKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ExtendsKeyword) -> Node;
```
## ExtendsKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ExtendsKeyword) -> int;
```
## ExtendsKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ExtendsKeyword) -> TopLevelDO;
```
## ExtendsKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ExtendsKeyword, i: int) -> Decorator;
```
## ExtendsKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ExtendsKeyword) -> int;
```
## ExtendsKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ExtendsKeyword) -> *Modifier;
```
## ExtendsKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExtendsKeyword) -> int;
```
## ExtendsKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ExtendsKeyword, i: int) -> Node;
```
## ExtendsKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExtendsKeyword) -> int;
```
## ExtendsKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExtendsKeyword) -> *FunctionLikeDeclaration;
```
## ExtendsKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ExtendsKeyword, level: int) -> *Node;
```
## ExtendsKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExtendsKeyword) -> int;
```
## ExtendsKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ExtendsKeyword) -> string;
```
## ExtendsKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ExtendsKeyword, level: int) -> Node;
```
## ExtendsKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ExtendsKeyword) -> File;
```
## ExtendsKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ExtendsKeyword) -> *Comment;
```
## ExtendsKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ExtendsKeyword) -> *Comment;
```
## ExtendsKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ExtendsKeyword) -> Node;
```
## ExtendsKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ExtendsKeyword) -> FunctionLikeDeclaration;
```
## ExtendsKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExtendsKeyword) -> int;
```
## ExtendsKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ExtendsKeyword) -> int;
```
## ExtendsKeyword::getIndex

```rust
pub fn getIndex(self: ExtendsKeyword) -> int;
```
## ExtendsKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ExtendsKeyword) -> *Node;
```
## ExtendsKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ExtendsKeyword;
```
## ExtendsKeyword::is\<T\>

```rust
pub fn is<T>(self: ExtendsKeyword) -> bool;
```
## ExtendsKeyword::to\<T\>

```rust
pub fn to<T>(self: ExtendsKeyword) -> <any>;
```
## ExtendsKeyword::key\_neq

```rust
pub fn key_neq(self: ExtendsKeyword, object: <any>) -> bool;
```
## ExtendsKeyword::key\_eq

```rust
pub fn key_eq(self: ExtendsKeyword, object: <any>) -> bool;
```
## ExtendsKeyword::to\_set

```rust
pub fn to_set(self: ExtendsKeyword) -> *ExtendsKeyword;
```
