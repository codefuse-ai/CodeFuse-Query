# PropertyName

Primary key: `id: int`

```rust
schema PropertyName {
  @primary id: int,
}
```
## PropertyName::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PropertyName) -> *Node;
```
## PropertyName::getIndex

```rust
pub fn getIndex(self: PropertyName) -> int;
```
## PropertyName::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PropertyName) -> int;
```
## PropertyName::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PropertyName) -> int;
```
## PropertyName::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PropertyName) -> Node;
```
## PropertyName::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PropertyName) -> FunctionLikeDeclaration;
```
## PropertyName::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PropertyName) -> File;
```
## PropertyName::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PropertyName, level: int) -> Node;
```
## PropertyName::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PropertyName) -> string;
```
## PropertyName::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PropertyName) -> int;
```
## PropertyName::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PropertyName) -> *FunctionLikeDeclaration;
```
## PropertyName::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PropertyName, level: int) -> *Node;
```
## PropertyName::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PropertyName) -> int;
```
## PropertyName::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PropertyName) -> *Modifier;
```
## PropertyName::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PropertyName) -> int;
```
## PropertyName::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PropertyName) -> int;
```
## PropertyName::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PropertyName, i: int) -> Node;
```
## PropertyName::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PropertyName) -> TopLevelDO;
```
## PropertyName::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PropertyName, i: int) -> Decorator;
```
## PropertyName::getName

```rust
/**
     * Gets the name of this PropertyName.
     *
     * If this PropertyName is a ComputedPropertyName, it doesn't have a name
     */
```
```rust
pub fn getName(self: PropertyName) -> string;
```
## PropertyName::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PropertyName) -> int;
```
## PropertyName::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PropertyName) -> *Comment;
```
## PropertyName::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PropertyName) -> *Comment;
```
## PropertyName::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PropertyName) -> *Node;
```
## PropertyName::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PropertyName) -> Node;
```
## PropertyName::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PropertyName, i: int) -> Modifier;
```
## PropertyName::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PropertyName) -> string;
```
## PropertyName::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PropertyName) -> *Decorator;
```
## PropertyName::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PropertyName) -> Symbol;
```
## PropertyName::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PropertyName) -> Location;
```
## PropertyName::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PropertyName;
```
## PropertyName::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PropertyName) -> *Node;
```
## PropertyName::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PropertyName) -> *Comment;
```
## PropertyName::is\<T\>

```rust
pub fn is<T>(self: PropertyName) -> bool;
```
## PropertyName::to\<T\>

```rust
pub fn to<T>(self: PropertyName) -> <any>;
```
## PropertyName::key\_neq

```rust
pub fn key_neq(self: PropertyName, object: <any>) -> bool;
```
## PropertyName::key\_eq

```rust
pub fn key_eq(self: PropertyName, object: <any>) -> bool;
```
## PropertyName::to\_set

```rust
pub fn to_set(self: PropertyName) -> *PropertyName;
```
