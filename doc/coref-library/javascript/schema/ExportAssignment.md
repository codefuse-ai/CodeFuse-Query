# ExportAssignment

Primary key: `id: int`

```rust
schema ExportAssignment {
  @primary id: int,
}
```
## ExportAssignment::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ExportAssignment) -> *Node;
```
## ExportAssignment::getIndex

```rust
pub fn getIndex(self: ExportAssignment) -> int;
```
## ExportAssignment::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ExportAssignment) -> int;
```
## ExportAssignment::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExportAssignment) -> int;
```
## ExportAssignment::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ExportAssignment) -> FunctionLikeDeclaration;
```
## ExportAssignment::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ExportAssignment) -> Node;
```
## ExportAssignment::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ExportAssignment) -> *Comment;
```
## ExportAssignment::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ExportAssignment) -> *Comment;
```
## ExportAssignment::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ExportAssignment) -> File;
```
## ExportAssignment::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ExportAssignment, level: int) -> Node;
```
## ExportAssignment::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExportAssignment) -> int;
```
## ExportAssignment::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ExportAssignment) -> string;
```
## ExportAssignment::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExportAssignment) -> *FunctionLikeDeclaration;
```
## ExportAssignment::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ExportAssignment, level: int) -> *Node;
```
## ExportAssignment::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ExportAssignment) -> int;
```
## ExportAssignment::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ExportAssignment) -> *Modifier;
```
## ExportAssignment::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExportAssignment) -> int;
```
## ExportAssignment::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExportAssignment) -> int;
```
## ExportAssignment::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ExportAssignment, i: int) -> Node;
```
## ExportAssignment::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ExportAssignment, i: int) -> Decorator;
```
## ExportAssignment::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ExportAssignment) -> TopLevelDO;
```
## ExportAssignment::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ExportAssignment) -> int;
```
## ExportAssignment::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ExportAssignment) -> Node;
```
## ExportAssignment::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ExportAssignment) -> *Node;
```
## ExportAssignment::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ExportAssignment) -> *Node;
```
## ExportAssignment::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ExportAssignment) -> *Comment;
```
## ExportAssignment::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ExportAssignment) -> Symbol;
```
## ExportAssignment::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ExportAssignment) -> *Decorator;
```
## ExportAssignment::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ExportAssignment, i: int) -> Modifier;
```
## ExportAssignment::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ExportAssignment) -> string;
```
## ExportAssignment::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ExportAssignment;
```
## ExportAssignment::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ExportAssignment) -> Location;
```
## ExportAssignment::is\<T\>

```rust
pub fn is<T>(self: ExportAssignment) -> bool;
```
## ExportAssignment::to\<T\>

```rust
pub fn to<T>(self: ExportAssignment) -> <any>;
```
## ExportAssignment::key\_neq

```rust
pub fn key_neq(self: ExportAssignment, object: <any>) -> bool;
```
## ExportAssignment::key\_eq

```rust
pub fn key_eq(self: ExportAssignment, object: <any>) -> bool;
```
## ExportAssignment::to\_set

```rust
pub fn to_set(self: ExportAssignment) -> *ExportAssignment;
```
