# JsxAttributeInitializer

Primary key: `id: int`

```rust
schema JsxAttributeInitializer {
  @primary id: int,
}
```
## JsxAttributeInitializer::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: JsxAttributeInitializer) -> *Node;
```
## JsxAttributeInitializer::getIndex

```rust
pub fn getIndex(self: JsxAttributeInitializer) -> int;
```
## JsxAttributeInitializer::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: JsxAttributeInitializer) -> int;
```
## JsxAttributeInitializer::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: JsxAttributeInitializer) -> int;
```
## JsxAttributeInitializer::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: JsxAttributeInitializer) -> Node;
```
## JsxAttributeInitializer::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: JsxAttributeInitializer) -> FunctionLikeDeclaration;
```
## JsxAttributeInitializer::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: JsxAttributeInitializer) -> File;
```
## JsxAttributeInitializer::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: JsxAttributeInitializer, level: int) -> Node;
```
## JsxAttributeInitializer::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: JsxAttributeInitializer) -> string;
```
## JsxAttributeInitializer::getEndLineNumber

```rust
pub fn getEndLineNumber(self: JsxAttributeInitializer) -> int;
```
## JsxAttributeInitializer::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxAttributeInitializer) -> *FunctionLikeDeclaration;
```
## JsxAttributeInitializer::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: JsxAttributeInitializer, level: int) -> *Node;
```
## JsxAttributeInitializer::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: JsxAttributeInitializer) -> int;
```
## JsxAttributeInitializer::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: JsxAttributeInitializer) -> *Modifier;
```
## JsxAttributeInitializer::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: JsxAttributeInitializer) -> int;
```
## JsxAttributeInitializer::getStartLineNumber

```rust
pub fn getStartLineNumber(self: JsxAttributeInitializer) -> int;
```
## JsxAttributeInitializer::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: JsxAttributeInitializer, i: int) -> Node;
```
## JsxAttributeInitializer::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: JsxAttributeInitializer, i: int) -> Decorator;
```
## JsxAttributeInitializer::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: JsxAttributeInitializer) -> TopLevelDO;
```
## JsxAttributeInitializer::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: JsxAttributeInitializer) -> int;
```
## JsxAttributeInitializer::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: JsxAttributeInitializer) -> *Comment;
```
## JsxAttributeInitializer::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: JsxAttributeInitializer) -> *Comment;
```
## JsxAttributeInitializer::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: JsxAttributeInitializer) -> Node;
```
## JsxAttributeInitializer::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: JsxAttributeInitializer) -> *Node;
```
## JsxAttributeInitializer::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: JsxAttributeInitializer) -> *Node;
```
## JsxAttributeInitializer::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: JsxAttributeInitializer) -> *Comment;
```
## JsxAttributeInitializer::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: JsxAttributeInitializer, i: int) -> Modifier;
```
## JsxAttributeInitializer::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: JsxAttributeInitializer) -> string;
```
## JsxAttributeInitializer::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: JsxAttributeInitializer) -> *Decorator;
```
## JsxAttributeInitializer::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: JsxAttributeInitializer) -> Symbol;
```
## JsxAttributeInitializer::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: JsxAttributeInitializer) -> Location;
```
## JsxAttributeInitializer::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *JsxAttributeInitializer;
```
## JsxAttributeInitializer::is\<T\>

```rust
pub fn is<T>(self: JsxAttributeInitializer) -> bool;
```
## JsxAttributeInitializer::to\<T\>

```rust
pub fn to<T>(self: JsxAttributeInitializer) -> <any>;
```
## JsxAttributeInitializer::key\_neq

```rust
pub fn key_neq(self: JsxAttributeInitializer, object: <any>) -> bool;
```
## JsxAttributeInitializer::key\_eq

```rust
pub fn key_eq(self: JsxAttributeInitializer, object: <any>) -> bool;
```
## JsxAttributeInitializer::to\_set

```rust
pub fn to_set(self: JsxAttributeInitializer) -> *JsxAttributeInitializer;
```
