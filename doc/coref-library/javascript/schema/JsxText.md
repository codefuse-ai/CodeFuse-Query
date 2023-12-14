# JsxText

Primary key: `id: int`

```rust
schema JsxText {
  @primary id: int,
}
```
## JsxText::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: JsxText) -> *Node;
```
## JsxText::getIndex

```rust
pub fn getIndex(self: JsxText) -> int;
```
## JsxText::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: JsxText) -> int;
```
## JsxText::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: JsxText) -> int;
```
## JsxText::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: JsxText) -> Node;
```
## JsxText::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: JsxText) -> FunctionLikeDeclaration;
```
## JsxText::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: JsxText) -> File;
```
## JsxText::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: JsxText, level: int) -> Node;
```
## JsxText::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: JsxText) -> string;
```
## JsxText::getEndLineNumber

```rust
pub fn getEndLineNumber(self: JsxText) -> int;
```
## JsxText::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxText) -> *FunctionLikeDeclaration;
```
## JsxText::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: JsxText, level: int) -> *Node;
```
## JsxText::getStartLineNumber

```rust
pub fn getStartLineNumber(self: JsxText) -> int;
```
## JsxText::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: JsxText, i: int) -> Node;
```
## JsxText::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: JsxText) -> int;
```
## JsxText::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: JsxText) -> int;
```
## JsxText::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: JsxText) -> *Modifier;
```
## JsxText::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: JsxText) -> TopLevelDO;
```
## JsxText::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: JsxText, i: int) -> Decorator;
```
## JsxText::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: JsxText) -> int;
```
## JsxText::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: JsxText) -> *Comment;
```
## JsxText::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: JsxText) -> *Comment;
```
## JsxText::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: JsxText) -> Node;
```
## JsxText::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: JsxText) -> *Node;
```
## JsxText::getValue

```rust
/**
     * Gets the value of this jsx text, as a string.
     */
```
```rust
pub fn getValue(self: JsxText) -> string;
```
## JsxText::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: JsxText) -> *Node;
```
## JsxText::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: JsxText) -> *Comment;
```
## JsxText::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: JsxText, i: int) -> Modifier;
```
## JsxText::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: JsxText) -> string;
```
## JsxText::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: JsxText) -> *Decorator;
```
## JsxText::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: JsxText) -> Symbol;
```
## JsxText::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: JsxText) -> Location;
```
## JsxText::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *JsxText;
```
## JsxText::is\<T\>

```rust
pub fn is<T>(self: JsxText) -> bool;
```
## JsxText::to\<T\>

```rust
pub fn to<T>(self: JsxText) -> <any>;
```
## JsxText::key\_neq

```rust
pub fn key_neq(self: JsxText, object: <any>) -> bool;
```
## JsxText::key\_eq

```rust
pub fn key_eq(self: JsxText, object: <any>) -> bool;
```
## JsxText::to\_set

```rust
pub fn to_set(self: JsxText) -> *JsxText;
```
