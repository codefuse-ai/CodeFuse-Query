# ComputedPropertyName

Primary key: `id: int`

```rust
schema ComputedPropertyName {
  @primary id: int,
}
```
## ComputedPropertyName::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ComputedPropertyName) -> *Node;
```
## ComputedPropertyName::getIndex

```rust
pub fn getIndex(self: ComputedPropertyName) -> int;
```
## ComputedPropertyName::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ComputedPropertyName) -> int;
```
## ComputedPropertyName::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ComputedPropertyName) -> int;
```
## ComputedPropertyName::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ComputedPropertyName) -> Node;
```
## ComputedPropertyName::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ComputedPropertyName) -> FunctionLikeDeclaration;
```
## ComputedPropertyName::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ComputedPropertyName) -> File;
```
## ComputedPropertyName::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ComputedPropertyName, level: int) -> Node;
```
## ComputedPropertyName::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ComputedPropertyName) -> *FunctionLikeDeclaration;
```
## ComputedPropertyName::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ComputedPropertyName, level: int) -> *Node;
```
## ComputedPropertyName::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ComputedPropertyName) -> int;
```
## ComputedPropertyName::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ComputedPropertyName) -> *Modifier;
```
## ComputedPropertyName::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ComputedPropertyName) -> int;
```
## ComputedPropertyName::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ComputedPropertyName) -> int;
```
## ComputedPropertyName::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ComputedPropertyName, i: int) -> Node;
```
## ComputedPropertyName::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ComputedPropertyName) -> TopLevelDO;
```
## ComputedPropertyName::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ComputedPropertyName, i: int) -> Decorator;
```
## ComputedPropertyName::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ComputedPropertyName) -> int;
```
## ComputedPropertyName::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ComputedPropertyName) -> *Comment;
```
## ComputedPropertyName::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ComputedPropertyName) -> *Comment;
```
## ComputedPropertyName::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ComputedPropertyName) -> Node;
```
## ComputedPropertyName::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ComputedPropertyName) -> *Node;
```
## ComputedPropertyName::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ComputedPropertyName) -> *Node;
```
## ComputedPropertyName::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ComputedPropertyName) -> *Comment;
```
## ComputedPropertyName::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ComputedPropertyName, i: int) -> Modifier;
```
## ComputedPropertyName::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ComputedPropertyName) -> string;
```
## ComputedPropertyName::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ComputedPropertyName) -> *Decorator;
```
## ComputedPropertyName::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ComputedPropertyName) -> Symbol;
```
## ComputedPropertyName::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ComputedPropertyName) -> Location;
```
## ComputedPropertyName::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ComputedPropertyName) -> string;
```
## ComputedPropertyName::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ComputedPropertyName) -> int;
```
## ComputedPropertyName::getExpression

```rust
pub fn getExpression(self: ComputedPropertyName) -> Expression;
```
## ComputedPropertyName::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ComputedPropertyName;
```
## ComputedPropertyName::is\<T\>

```rust
pub fn is<T>(self: ComputedPropertyName) -> bool;
```
## ComputedPropertyName::to\<T\>

```rust
pub fn to<T>(self: ComputedPropertyName) -> <any>;
```
## ComputedPropertyName::key\_neq

```rust
pub fn key_neq(self: ComputedPropertyName, object: <any>) -> bool;
```
## ComputedPropertyName::key\_eq

```rust
pub fn key_eq(self: ComputedPropertyName, object: <any>) -> bool;
```
## ComputedPropertyName::to\_set

```rust
pub fn to_set(self: ComputedPropertyName) -> *ComputedPropertyName;
```
