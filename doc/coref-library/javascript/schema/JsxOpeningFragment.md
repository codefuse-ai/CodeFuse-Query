# JsxOpeningFragment

Primary key: `id: int`

```rust
schema JsxOpeningFragment {
  @primary id: int,
}
```
## JsxOpeningFragment::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: JsxOpeningFragment) -> Location;
```
## JsxOpeningFragment::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: JsxOpeningFragment) -> Symbol;
```
## JsxOpeningFragment::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: JsxOpeningFragment) -> *Decorator;
```
## JsxOpeningFragment::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: JsxOpeningFragment) -> string;
```
## JsxOpeningFragment::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: JsxOpeningFragment, i: int) -> Modifier;
```
## JsxOpeningFragment::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: JsxOpeningFragment) -> *Comment;
```
## JsxOpeningFragment::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: JsxOpeningFragment) -> *Node;
```
## JsxOpeningFragment::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: JsxOpeningFragment) -> int;
```
## JsxOpeningFragment::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: JsxOpeningFragment) -> TopLevelDO;
```
## JsxOpeningFragment::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: JsxOpeningFragment, i: int) -> Decorator;
```
## JsxOpeningFragment::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: JsxOpeningFragment) -> int;
```
## JsxOpeningFragment::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: JsxOpeningFragment) -> *Modifier;
```
## JsxOpeningFragment::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: JsxOpeningFragment) -> int;
```
## JsxOpeningFragment::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: JsxOpeningFragment, i: int) -> Node;
```
## JsxOpeningFragment::getStartLineNumber

```rust
pub fn getStartLineNumber(self: JsxOpeningFragment) -> int;
```
## JsxOpeningFragment::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: JsxOpeningFragment, level: int) -> *Node;
```
## JsxOpeningFragment::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxOpeningFragment) -> *FunctionLikeDeclaration;
```
## JsxOpeningFragment::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: JsxOpeningFragment) -> *Comment;
```
## JsxOpeningFragment::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: JsxOpeningFragment) -> *Comment;
```
## JsxOpeningFragment::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: JsxOpeningFragment) -> *Node;
```
## JsxOpeningFragment::getParent

```rust
pub fn getParent(self: JsxOpeningFragment) -> JsxFragment;
```
## JsxOpeningFragment::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: JsxOpeningFragment) -> Node;
```
## JsxOpeningFragment::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: JsxOpeningFragment) -> int;
```
## JsxOpeningFragment::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: JsxOpeningFragment) -> FunctionLikeDeclaration;
```
## JsxOpeningFragment::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: JsxOpeningFragment) -> File;
```
## JsxOpeningFragment::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: JsxOpeningFragment, level: int) -> Node;
```
## JsxOpeningFragment::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: JsxOpeningFragment) -> int;
```
## JsxOpeningFragment::getIndex

```rust
pub fn getIndex(self: JsxOpeningFragment) -> int;
```
## JsxOpeningFragment::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: JsxOpeningFragment) -> string;
```
## JsxOpeningFragment::getEndLineNumber

```rust
pub fn getEndLineNumber(self: JsxOpeningFragment) -> int;
```
## JsxOpeningFragment::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: JsxOpeningFragment) -> *Node;
```
## JsxOpeningFragment::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *JsxOpeningFragment;
```
## JsxOpeningFragment::is\<T\>

```rust
pub fn is<T>(self: JsxOpeningFragment) -> bool;
```
## JsxOpeningFragment::to\<T\>

```rust
pub fn to<T>(self: JsxOpeningFragment) -> <any>;
```
## JsxOpeningFragment::key\_neq

```rust
pub fn key_neq(self: JsxOpeningFragment, object: <any>) -> bool;
```
## JsxOpeningFragment::key\_eq

```rust
pub fn key_eq(self: JsxOpeningFragment, object: <any>) -> bool;
```
## JsxOpeningFragment::to\_set

```rust
pub fn to_set(self: JsxOpeningFragment) -> *JsxOpeningFragment;
```
