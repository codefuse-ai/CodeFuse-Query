# ExportSpecifier

Primary key: `id: int`

```rust
schema ExportSpecifier {
  @primary id: int,
}
```
## ExportSpecifier::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ExportSpecifier) -> *Node;
```
## ExportSpecifier::getIndex

```rust
pub fn getIndex(self: ExportSpecifier) -> int;
```
## ExportSpecifier::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ExportSpecifier) -> int;
```
## ExportSpecifier::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExportSpecifier) -> int;
```
## ExportSpecifier::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ExportSpecifier) -> Node;
```
## ExportSpecifier::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ExportSpecifier) -> FunctionLikeDeclaration;
```
## ExportSpecifier::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ExportSpecifier) -> File;
```
## ExportSpecifier::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ExportSpecifier, level: int) -> Node;
```
## ExportSpecifier::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ExportSpecifier) -> string;
```
## ExportSpecifier::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExportSpecifier) -> int;
```
## ExportSpecifier::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExportSpecifier) -> *FunctionLikeDeclaration;
```
## ExportSpecifier::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ExportSpecifier, level: int) -> *Node;
```
## ExportSpecifier::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ExportSpecifier) -> int;
```
## ExportSpecifier::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ExportSpecifier) -> *Modifier;
```
## ExportSpecifier::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExportSpecifier) -> int;
```
## ExportSpecifier::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExportSpecifier) -> int;
```
## ExportSpecifier::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ExportSpecifier, i: int) -> Node;
```
## ExportSpecifier::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ExportSpecifier, i: int) -> Decorator;
```
## ExportSpecifier::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ExportSpecifier) -> TopLevelDO;
```
## ExportSpecifier::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ExportSpecifier) -> int;
```
## ExportSpecifier::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ExportSpecifier) -> *Comment;
```
## ExportSpecifier::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ExportSpecifier) -> *Comment;
```
## ExportSpecifier::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ExportSpecifier) -> Node;
```
## ExportSpecifier::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ExportSpecifier) -> *Node;
```
## ExportSpecifier::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ExportSpecifier) -> *Node;
```
## ExportSpecifier::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ExportSpecifier) -> *Comment;
```
## ExportSpecifier::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ExportSpecifier, i: int) -> Modifier;
```
## ExportSpecifier::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ExportSpecifier) -> string;
```
## ExportSpecifier::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ExportSpecifier) -> *Decorator;
```
## ExportSpecifier::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ExportSpecifier) -> Symbol;
```
## ExportSpecifier::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ExportSpecifier) -> Location;
```
## ExportSpecifier::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ExportSpecifier;
```
## ExportSpecifier::is\<T\>

```rust
pub fn is<T>(self: ExportSpecifier) -> bool;
```
## ExportSpecifier::to\<T\>

```rust
pub fn to<T>(self: ExportSpecifier) -> <any>;
```
## ExportSpecifier::key\_neq

```rust
pub fn key_neq(self: ExportSpecifier, object: <any>) -> bool;
```
## ExportSpecifier::key\_eq

```rust
pub fn key_eq(self: ExportSpecifier, object: <any>) -> bool;
```
## ExportSpecifier::to\_set

```rust
pub fn to_set(self: ExportSpecifier) -> *ExportSpecifier;
```
