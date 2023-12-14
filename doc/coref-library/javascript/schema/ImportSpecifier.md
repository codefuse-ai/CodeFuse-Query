# ImportSpecifier

Primary key: `id: int`

```rust
schema ImportSpecifier {
  @primary id: int,
}
```
## ImportSpecifier::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ImportSpecifier) -> *Node;
```
## ImportSpecifier::getIndex

```rust
pub fn getIndex(self: ImportSpecifier) -> int;
```
## ImportSpecifier::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ImportSpecifier) -> int;
```
## ImportSpecifier::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ImportSpecifier) -> int;
```
## ImportSpecifier::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ImportSpecifier) -> Node;
```
## ImportSpecifier::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ImportSpecifier) -> FunctionLikeDeclaration;
```
## ImportSpecifier::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ImportSpecifier) -> File;
```
## ImportSpecifier::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ImportSpecifier, level: int) -> Node;
```
## ImportSpecifier::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ImportSpecifier) -> string;
```
## ImportSpecifier::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ImportSpecifier) -> int;
```
## ImportSpecifier::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ImportSpecifier) -> *FunctionLikeDeclaration;
```
## ImportSpecifier::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ImportSpecifier, level: int) -> *Node;
```
## ImportSpecifier::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ImportSpecifier) -> int;
```
## ImportSpecifier::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ImportSpecifier) -> *Modifier;
```
## ImportSpecifier::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ImportSpecifier) -> int;
```
## ImportSpecifier::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ImportSpecifier) -> int;
```
## ImportSpecifier::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ImportSpecifier, i: int) -> Node;
```
## ImportSpecifier::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ImportSpecifier, i: int) -> Decorator;
```
## ImportSpecifier::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ImportSpecifier) -> TopLevelDO;
```
## ImportSpecifier::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ImportSpecifier) -> int;
```
## ImportSpecifier::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ImportSpecifier) -> *Comment;
```
## ImportSpecifier::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ImportSpecifier) -> *Comment;
```
## ImportSpecifier::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ImportSpecifier) -> Node;
```
## ImportSpecifier::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ImportSpecifier) -> *Node;
```
## ImportSpecifier::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ImportSpecifier) -> *Node;
```
## ImportSpecifier::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ImportSpecifier) -> *Comment;
```
## ImportSpecifier::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ImportSpecifier, i: int) -> Modifier;
```
## ImportSpecifier::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ImportSpecifier) -> string;
```
## ImportSpecifier::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ImportSpecifier) -> *Decorator;
```
## ImportSpecifier::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ImportSpecifier) -> Symbol;
```
## ImportSpecifier::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ImportSpecifier) -> Location;
```
## ImportSpecifier::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ImportSpecifier;
```
## ImportSpecifier::is\<T\>

```rust
pub fn is<T>(self: ImportSpecifier) -> bool;
```
## ImportSpecifier::to\<T\>

```rust
pub fn to<T>(self: ImportSpecifier) -> <any>;
```
## ImportSpecifier::key\_neq

```rust
pub fn key_neq(self: ImportSpecifier, object: <any>) -> bool;
```
## ImportSpecifier::key\_eq

```rust
pub fn key_eq(self: ImportSpecifier, object: <any>) -> bool;
```
## ImportSpecifier::to\_set

```rust
pub fn to_set(self: ImportSpecifier) -> *ImportSpecifier;
```
