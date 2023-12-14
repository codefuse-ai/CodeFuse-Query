# JsxAttribute

Primary key: `id: int`

```rust
schema JsxAttribute {
  @primary id: int,
}
```
## JsxAttribute::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: JsxAttribute) -> *Node;
```
## JsxAttribute::getIndex

```rust
pub fn getIndex(self: JsxAttribute) -> int;
```
## JsxAttribute::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: JsxAttribute) -> int;
```
## JsxAttribute::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: JsxAttribute) -> int;
```
## JsxAttribute::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: JsxAttribute) -> Node;
```
## JsxAttribute::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: JsxAttribute) -> FunctionLikeDeclaration;
```
## JsxAttribute::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: JsxAttribute) -> File;
```
## JsxAttribute::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: JsxAttribute, level: int) -> Node;
```
## JsxAttribute::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: JsxAttribute) -> Location;
```
## JsxAttribute::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxAttribute) -> *FunctionLikeDeclaration;
```
## JsxAttribute::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: JsxAttribute, level: int) -> *Node;
```
## JsxAttribute::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: JsxAttribute) -> int;
```
## JsxAttribute::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: JsxAttribute) -> *Modifier;
```
## JsxAttribute::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: JsxAttribute) -> int;
```
## JsxAttribute::getStartLineNumber

```rust
pub fn getStartLineNumber(self: JsxAttribute) -> int;
```
## JsxAttribute::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: JsxAttribute, i: int) -> Node;
```
## JsxAttribute::getName

```rust
pub fn getName(self: JsxAttribute) -> Identifier;
```
## JsxAttribute::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: JsxAttribute) -> int;
```
## JsxAttribute::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: JsxAttribute) -> TopLevelDO;
```
## JsxAttribute::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: JsxAttribute, i: int) -> Decorator;
```
## JsxAttribute::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: JsxAttribute) -> *Comment;
```
## JsxAttribute::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: JsxAttribute) -> *Comment;
```
## JsxAttribute::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: JsxAttribute) -> *Node;
```
## JsxAttribute::getParent

```rust
pub fn getParent(self: JsxAttribute) -> JsxAttributes;
```
## JsxAttribute::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: JsxAttribute) -> string;
```
## JsxAttribute::getEndLineNumber

```rust
pub fn getEndLineNumber(self: JsxAttribute) -> int;
```
## JsxAttribute::getInitializer

```rust
pub fn getInitializer(self: JsxAttribute) -> JsxAttributeInitializer;
```
## JsxAttribute::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: JsxAttribute, i: int) -> Modifier;
```
## JsxAttribute::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: JsxAttribute) -> string;
```
## JsxAttribute::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: JsxAttribute) -> Symbol;
```
## JsxAttribute::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: JsxAttribute) -> *Decorator;
```
## JsxAttribute::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: JsxAttribute) -> *Node;
```
## JsxAttribute::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: JsxAttribute) -> *Comment;
```
## JsxAttribute::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *JsxAttribute;
```
## JsxAttribute::is\<T\>

```rust
pub fn is<T>(self: JsxAttribute) -> bool;
```
## JsxAttribute::to\<T\>

```rust
pub fn to<T>(self: JsxAttribute) -> <any>;
```
## JsxAttribute::key\_neq

```rust
pub fn key_neq(self: JsxAttribute, object: <any>) -> bool;
```
## JsxAttribute::key\_eq

```rust
pub fn key_eq(self: JsxAttribute, object: <any>) -> bool;
```
## JsxAttribute::to\_set

```rust
pub fn to_set(self: JsxAttribute) -> *JsxAttribute;
```
