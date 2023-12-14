# ImportClause

Primary key: `id: int`

```rust
schema ImportClause {
  @primary id: int,
}
```
## ImportClause::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ImportClause) -> *Node;
```
## ImportClause::getIndex

```rust
pub fn getIndex(self: ImportClause) -> int;
```
## ImportClause::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ImportClause) -> int;
```
## ImportClause::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ImportClause) -> int;
```
## ImportClause::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ImportClause) -> Node;
```
## ImportClause::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ImportClause) -> FunctionLikeDeclaration;
```
## ImportClause::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ImportClause) -> File;
```
## ImportClause::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ImportClause, level: int) -> Node;
```
## ImportClause::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ImportClause) -> string;
```
## ImportClause::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ImportClause) -> int;
```
## ImportClause::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ImportClause) -> *FunctionLikeDeclaration;
```
## ImportClause::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ImportClause, level: int) -> *Node;
```
## ImportClause::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ImportClause) -> int;
```
## ImportClause::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ImportClause) -> *Modifier;
```
## ImportClause::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ImportClause) -> int;
```
## ImportClause::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ImportClause) -> int;
```
## ImportClause::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ImportClause, i: int) -> Node;
```
## ImportClause::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ImportClause, i: int) -> Decorator;
```
## ImportClause::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ImportClause) -> TopLevelDO;
```
## ImportClause::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ImportClause) -> int;
```
## ImportClause::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ImportClause) -> *Comment;
```
## ImportClause::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ImportClause) -> *Comment;
```
## ImportClause::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ImportClause) -> Node;
```
## ImportClause::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ImportClause) -> *Node;
```
## ImportClause::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ImportClause) -> *Node;
```
## ImportClause::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ImportClause) -> *Comment;
```
## ImportClause::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ImportClause, i: int) -> Modifier;
```
## ImportClause::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ImportClause) -> string;
```
## ImportClause::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ImportClause) -> *Decorator;
```
## ImportClause::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ImportClause) -> Symbol;
```
## ImportClause::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ImportClause) -> Location;
```
## ImportClause::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ImportClause;
```
## ImportClause::is\<T\>

```rust
pub fn is<T>(self: ImportClause) -> bool;
```
## ImportClause::to\<T\>

```rust
pub fn to<T>(self: ImportClause) -> <any>;
```
## ImportClause::key\_neq

```rust
pub fn key_neq(self: ImportClause, object: <any>) -> bool;
```
## ImportClause::key\_eq

```rust
pub fn key_eq(self: ImportClause, object: <any>) -> bool;
```
## ImportClause::to\_set

```rust
pub fn to_set(self: ImportClause) -> *ImportClause;
```
