# MetaProperty

Primary key: `id: int`

```rust
schema MetaProperty {
  @primary id: int,
}
```
## MetaProperty::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: MetaProperty) -> *Node;
```
## MetaProperty::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MetaProperty) -> int;
```
## MetaProperty::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: MetaProperty) -> string;
```
## MetaProperty::getExpression

```rust
pub fn getExpression(self: MetaProperty) -> Expression;
```
## MetaProperty::getIndex

```rust
pub fn getIndex(self: MetaProperty) -> int;
```
## MetaProperty::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: MetaProperty) -> int;
```
## MetaProperty::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: MetaProperty, level: int) -> Node;
```
## MetaProperty::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: MetaProperty) -> File;
```
## MetaProperty::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MetaProperty) -> int;
```
## MetaProperty::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: MetaProperty) -> FunctionLikeDeclaration;
```
## MetaProperty::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: MetaProperty) -> *Comment;
```
## MetaProperty::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: MetaProperty) -> *Comment;
```
## MetaProperty::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MetaProperty) -> *FunctionLikeDeclaration;
```
## MetaProperty::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: MetaProperty, level: int) -> *Node;
```
## MetaProperty::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: MetaProperty) -> int;
```
## MetaProperty::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: MetaProperty) -> *Modifier;
```
## MetaProperty::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MetaProperty) -> int;
```
## MetaProperty::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MetaProperty) -> int;
```
## MetaProperty::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: MetaProperty, i: int) -> Node;
```
## MetaProperty::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: MetaProperty) -> TopLevelDO;
```
## MetaProperty::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: MetaProperty, i: int) -> Decorator;
```
## MetaProperty::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: MetaProperty) -> Node;
```
## MetaProperty::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: MetaProperty) -> *Node;
```
## MetaProperty::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: MetaProperty) -> Node;
```
## MetaProperty::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: MetaProperty) -> *Comment;
```
## MetaProperty::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: MetaProperty) -> *Node;
```
## MetaProperty::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: MetaProperty) -> Symbol;
```
## MetaProperty::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: MetaProperty) -> *Decorator;
```
## MetaProperty::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: MetaProperty) -> Location;
```
## MetaProperty::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MetaProperty;
```
## MetaProperty::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: MetaProperty, i: int) -> Modifier;
```
## MetaProperty::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: MetaProperty) -> string;
```
## MetaProperty::getName

```rust
pub fn getName(self: MetaProperty) -> Identifier;
```
## MetaProperty::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: MetaProperty) -> int;
```
## MetaProperty::getKeywordToken

```rust
pub fn getKeywordToken(self: MetaProperty) -> KeywordToken;
```
## MetaProperty::is\<T\>

```rust
pub fn is<T>(self: MetaProperty) -> bool;
```
## MetaProperty::to\<T\>

```rust
pub fn to<T>(self: MetaProperty) -> <any>;
```
## MetaProperty::key\_neq

```rust
pub fn key_neq(self: MetaProperty, object: <any>) -> bool;
```
## MetaProperty::key\_eq

```rust
pub fn key_eq(self: MetaProperty, object: <any>) -> bool;
```
## MetaProperty::to\_set

```rust
pub fn to_set(self: MetaProperty) -> *MetaProperty;
```
