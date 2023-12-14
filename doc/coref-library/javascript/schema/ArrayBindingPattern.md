# ArrayBindingPattern

Primary key: `id: int`

```rust
schema ArrayBindingPattern {
  @primary id: int,
}
```
## ArrayBindingPattern::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ArrayBindingPattern) -> *Decorator;
```
## ArrayBindingPattern::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ArrayBindingPattern) -> Symbol;
```
## ArrayBindingPattern::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ArrayBindingPattern) -> string;
```
## ArrayBindingPattern::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ArrayBindingPattern, i: int) -> Modifier;
```
## ArrayBindingPattern::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ArrayBindingPattern) -> *Node;
```
## ArrayBindingPattern::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ArrayBindingPattern) -> *Node;
```
## ArrayBindingPattern::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ArrayBindingPattern) -> Node;
```
## ArrayBindingPattern::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ArrayBindingPattern) -> *Comment;
```
## ArrayBindingPattern::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ArrayBindingPattern) -> *Comment;
```
## ArrayBindingPattern::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ArrayBindingPattern) -> TopLevelDO;
```
## ArrayBindingPattern::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ArrayBindingPattern, i: int) -> Decorator;
```
## ArrayBindingPattern::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ArrayBindingPattern) -> int;
```
## ArrayBindingPattern::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ArrayBindingPattern) -> int;
```
## ArrayBindingPattern::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ArrayBindingPattern) -> *Modifier;
```
## ArrayBindingPattern::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ArrayBindingPattern) -> int;
```
## ArrayBindingPattern::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ArrayBindingPattern, i: int) -> Node;
```
## ArrayBindingPattern::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ArrayBindingPattern) -> int;
```
## ArrayBindingPattern::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ArrayBindingPattern) -> *FunctionLikeDeclaration;
```
## ArrayBindingPattern::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ArrayBindingPattern, level: int) -> *Node;
```
## ArrayBindingPattern::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ArrayBindingPattern) -> int;
```
## ArrayBindingPattern::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ArrayBindingPattern) -> string;
```
## ArrayBindingPattern::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ArrayBindingPattern, level: int) -> Node;
```
## ArrayBindingPattern::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ArrayBindingPattern) -> File;
```
## ArrayBindingPattern::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ArrayBindingPattern) -> int;
```
## ArrayBindingPattern::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ArrayBindingPattern) -> FunctionLikeDeclaration;
```
## ArrayBindingPattern::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ArrayBindingPattern) -> Node;
```
## ArrayBindingPattern::getAnElement

```rust
pub fn getAnElement(self: ArrayBindingPattern) -> *ArrayBindingElement;
```
## ArrayBindingPattern::getElement

```rust
pub fn getElement(self: ArrayBindingPattern, i: int) -> ArrayBindingElement;
```
## ArrayBindingPattern::getIndex

```rust
pub fn getIndex(self: ArrayBindingPattern) -> int;
```
## ArrayBindingPattern::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ArrayBindingPattern) -> int;
```
## ArrayBindingPattern::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ArrayBindingPattern) -> *Comment;
```
## ArrayBindingPattern::getAElement

```rust
/**
     * @todo: Delete this predicate with typos
     */
```
```rust
pub fn getAElement(self: ArrayBindingPattern) -> *ArrayBindingElement;
```
## ArrayBindingPattern::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ArrayBindingPattern) -> *Node;
```
## ArrayBindingPattern::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ArrayBindingPattern) -> Location;
```
## ArrayBindingPattern::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ArrayBindingPattern;
```
## ArrayBindingPattern::is\<T\>

```rust
pub fn is<T>(self: ArrayBindingPattern) -> bool;
```
## ArrayBindingPattern::to\<T\>

```rust
pub fn to<T>(self: ArrayBindingPattern) -> <any>;
```
## ArrayBindingPattern::key\_neq

```rust
pub fn key_neq(self: ArrayBindingPattern, object: <any>) -> bool;
```
## ArrayBindingPattern::key\_eq

```rust
pub fn key_eq(self: ArrayBindingPattern, object: <any>) -> bool;
```
## ArrayBindingPattern::to\_set

```rust
pub fn to_set(self: ArrayBindingPattern) -> *ArrayBindingPattern;
```
