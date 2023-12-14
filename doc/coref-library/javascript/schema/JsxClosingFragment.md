# JsxClosingFragment

Primary key: `id: int`

```rust
schema JsxClosingFragment {
  @primary id: int,
}
```
## JsxClosingFragment::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: JsxClosingFragment) -> Location;
```
## JsxClosingFragment::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: JsxClosingFragment) -> Symbol;
```
## JsxClosingFragment::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: JsxClosingFragment) -> *Decorator;
```
## JsxClosingFragment::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: JsxClosingFragment) -> string;
```
## JsxClosingFragment::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: JsxClosingFragment, i: int) -> Modifier;
```
## JsxClosingFragment::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: JsxClosingFragment) -> *Comment;
```
## JsxClosingFragment::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: JsxClosingFragment) -> *Node;
```
## JsxClosingFragment::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: JsxClosingFragment) -> int;
```
## JsxClosingFragment::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: JsxClosingFragment) -> TopLevelDO;
```
## JsxClosingFragment::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: JsxClosingFragment, i: int) -> Decorator;
```
## JsxClosingFragment::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: JsxClosingFragment) -> int;
```
## JsxClosingFragment::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: JsxClosingFragment) -> *Modifier;
```
## JsxClosingFragment::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: JsxClosingFragment) -> int;
```
## JsxClosingFragment::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: JsxClosingFragment, i: int) -> Node;
```
## JsxClosingFragment::getStartLineNumber

```rust
pub fn getStartLineNumber(self: JsxClosingFragment) -> int;
```
## JsxClosingFragment::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: JsxClosingFragment, level: int) -> *Node;
```
## JsxClosingFragment::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxClosingFragment) -> *FunctionLikeDeclaration;
```
## JsxClosingFragment::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: JsxClosingFragment) -> *Comment;
```
## JsxClosingFragment::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: JsxClosingFragment) -> *Comment;
```
## JsxClosingFragment::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: JsxClosingFragment) -> *Node;
```
## JsxClosingFragment::getParent

```rust
pub fn getParent(self: JsxClosingFragment) -> JsxFragment;
```
## JsxClosingFragment::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: JsxClosingFragment) -> Node;
```
## JsxClosingFragment::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: JsxClosingFragment) -> int;
```
## JsxClosingFragment::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: JsxClosingFragment) -> FunctionLikeDeclaration;
```
## JsxClosingFragment::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: JsxClosingFragment) -> File;
```
## JsxClosingFragment::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: JsxClosingFragment, level: int) -> Node;
```
## JsxClosingFragment::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: JsxClosingFragment) -> int;
```
## JsxClosingFragment::getIndex

```rust
pub fn getIndex(self: JsxClosingFragment) -> int;
```
## JsxClosingFragment::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: JsxClosingFragment) -> string;
```
## JsxClosingFragment::getEndLineNumber

```rust
pub fn getEndLineNumber(self: JsxClosingFragment) -> int;
```
## JsxClosingFragment::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: JsxClosingFragment) -> *Node;
```
## JsxClosingFragment::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *JsxClosingFragment;
```
## JsxClosingFragment::is\<T\>

```rust
pub fn is<T>(self: JsxClosingFragment) -> bool;
```
## JsxClosingFragment::to\<T\>

```rust
pub fn to<T>(self: JsxClosingFragment) -> <any>;
```
## JsxClosingFragment::key\_neq

```rust
pub fn key_neq(self: JsxClosingFragment, object: <any>) -> bool;
```
## JsxClosingFragment::key\_eq

```rust
pub fn key_eq(self: JsxClosingFragment, object: <any>) -> bool;
```
## JsxClosingFragment::to\_set

```rust
pub fn to_set(self: JsxClosingFragment) -> *JsxClosingFragment;
```
