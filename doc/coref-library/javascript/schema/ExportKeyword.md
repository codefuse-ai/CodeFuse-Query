# ExportKeyword

Primary key: `id: int`

```rust
schema ExportKeyword {
  @primary id: int,
}
```
## ExportKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ExportKeyword) -> *Node;
```
## ExportKeyword::getIndex

```rust
pub fn getIndex(self: ExportKeyword) -> int;
```
## ExportKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ExportKeyword) -> int;
```
## ExportKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExportKeyword) -> int;
```
## ExportKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ExportKeyword) -> FunctionLikeDeclaration;
```
## ExportKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ExportKeyword) -> Node;
```
## ExportKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ExportKeyword) -> *Comment;
```
## ExportKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ExportKeyword) -> *Comment;
```
## ExportKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ExportKeyword) -> File;
```
## ExportKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ExportKeyword, level: int) -> Node;
```
## ExportKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExportKeyword) -> int;
```
## ExportKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ExportKeyword) -> string;
```
## ExportKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExportKeyword) -> *FunctionLikeDeclaration;
```
## ExportKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ExportKeyword, level: int) -> *Node;
```
## ExportKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ExportKeyword) -> int;
```
## ExportKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ExportKeyword) -> *Modifier;
```
## ExportKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExportKeyword) -> int;
```
## ExportKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExportKeyword) -> int;
```
## ExportKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ExportKeyword, i: int) -> Node;
```
## ExportKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ExportKeyword, i: int) -> Decorator;
```
## ExportKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ExportKeyword) -> TopLevelDO;
```
## ExportKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ExportKeyword) -> int;
```
## ExportKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ExportKeyword) -> Node;
```
## ExportKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ExportKeyword) -> *Node;
```
## ExportKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ExportKeyword) -> *Node;
```
## ExportKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ExportKeyword) -> *Comment;
```
## ExportKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ExportKeyword) -> Symbol;
```
## ExportKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ExportKeyword) -> *Decorator;
```
## ExportKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ExportKeyword, i: int) -> Modifier;
```
## ExportKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ExportKeyword) -> string;
```
## ExportKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ExportKeyword;
```
## ExportKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ExportKeyword) -> Location;
```
## ExportKeyword::is\<T\>

```rust
pub fn is<T>(self: ExportKeyword) -> bool;
```
## ExportKeyword::to\<T\>

```rust
pub fn to<T>(self: ExportKeyword) -> <any>;
```
## ExportKeyword::key\_neq

```rust
pub fn key_neq(self: ExportKeyword, object: <any>) -> bool;
```
## ExportKeyword::key\_eq

```rust
pub fn key_eq(self: ExportKeyword, object: <any>) -> bool;
```
## ExportKeyword::to\_set

```rust
pub fn to_set(self: ExportKeyword) -> *ExportKeyword;
```
