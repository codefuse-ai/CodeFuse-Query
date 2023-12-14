# JsxSpreadAttribute

Primary key: `id: int`

```rust
schema JsxSpreadAttribute {
  @primary id: int,
}
```
## JsxSpreadAttribute::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: JsxSpreadAttribute) -> *Node;
```
## JsxSpreadAttribute::getIndex

```rust
pub fn getIndex(self: JsxSpreadAttribute) -> int;
```
## JsxSpreadAttribute::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: JsxSpreadAttribute) -> int;
```
## JsxSpreadAttribute::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: JsxSpreadAttribute) -> int;
```
## JsxSpreadAttribute::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: JsxSpreadAttribute) -> Node;
```
## JsxSpreadAttribute::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: JsxSpreadAttribute) -> FunctionLikeDeclaration;
```
## JsxSpreadAttribute::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: JsxSpreadAttribute) -> File;
```
## JsxSpreadAttribute::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: JsxSpreadAttribute, level: int) -> Node;
```
## JsxSpreadAttribute::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxSpreadAttribute) -> *FunctionLikeDeclaration;
```
## JsxSpreadAttribute::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: JsxSpreadAttribute, level: int) -> *Node;
```
## JsxSpreadAttribute::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: JsxSpreadAttribute) -> int;
```
## JsxSpreadAttribute::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: JsxSpreadAttribute) -> *Modifier;
```
## JsxSpreadAttribute::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: JsxSpreadAttribute) -> int;
```
## JsxSpreadAttribute::getStartLineNumber

```rust
pub fn getStartLineNumber(self: JsxSpreadAttribute) -> int;
```
## JsxSpreadAttribute::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: JsxSpreadAttribute, i: int) -> Node;
```
## JsxSpreadAttribute::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: JsxSpreadAttribute) -> int;
```
## JsxSpreadAttribute::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: JsxSpreadAttribute) -> TopLevelDO;
```
## JsxSpreadAttribute::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: JsxSpreadAttribute, i: int) -> Decorator;
```
## JsxSpreadAttribute::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: JsxSpreadAttribute) -> *Comment;
```
## JsxSpreadAttribute::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: JsxSpreadAttribute) -> *Comment;
```
## JsxSpreadAttribute::getParent

```rust
pub fn getParent(self: JsxSpreadAttribute) -> JsxAttributes;
```
## JsxSpreadAttribute::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: JsxSpreadAttribute) -> *Node;
```
## JsxSpreadAttribute::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: JsxSpreadAttribute) -> *Node;
```
## JsxSpreadAttribute::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: JsxSpreadAttribute) -> *Comment;
```
## JsxSpreadAttribute::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: JsxSpreadAttribute, i: int) -> Modifier;
```
## JsxSpreadAttribute::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: JsxSpreadAttribute) -> string;
```
## JsxSpreadAttribute::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: JsxSpreadAttribute) -> Symbol;
```
## JsxSpreadAttribute::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: JsxSpreadAttribute) -> *Decorator;
```
## JsxSpreadAttribute::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: JsxSpreadAttribute) -> Location;
```
## JsxSpreadAttribute::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *JsxSpreadAttribute;
```
## JsxSpreadAttribute::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: JsxSpreadAttribute) -> string;
```
## JsxSpreadAttribute::getEndLineNumber

```rust
pub fn getEndLineNumber(self: JsxSpreadAttribute) -> int;
```
## JsxSpreadAttribute::getExpression

```rust
pub fn getExpression(self: JsxSpreadAttribute) -> Expression;
```
## JsxSpreadAttribute::is\<T\>

```rust
pub fn is<T>(self: JsxSpreadAttribute) -> bool;
```
## JsxSpreadAttribute::to\<T\>

```rust
pub fn to<T>(self: JsxSpreadAttribute) -> <any>;
```
## JsxSpreadAttribute::key\_neq

```rust
pub fn key_neq(self: JsxSpreadAttribute, object: <any>) -> bool;
```
## JsxSpreadAttribute::key\_eq

```rust
pub fn key_eq(self: JsxSpreadAttribute, object: <any>) -> bool;
```
## JsxSpreadAttribute::to\_set

```rust
pub fn to_set(self: JsxSpreadAttribute) -> *JsxSpreadAttribute;
```
