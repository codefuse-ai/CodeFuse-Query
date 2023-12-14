# UnaryPlusExpression

Primary key: `id: int`

```rust
schema UnaryPlusExpression {
  @primary id: int,
}
```
## UnaryPlusExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: UnaryPlusExpression) -> int;
```
## UnaryPlusExpression::getOperand

```rust
pub fn getOperand(self: UnaryPlusExpression) -> UnaryExpression;
```
## UnaryPlusExpression::getIndex

```rust
pub fn getIndex(self: UnaryPlusExpression) -> int;
```
## UnaryPlusExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: UnaryPlusExpression) -> *Node;
```
## UnaryPlusExpression::getOperator

```rust
pub fn getOperator(self: UnaryPlusExpression) -> PrefixUnaryOperator;
```
## UnaryPlusExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: UnaryPlusExpression) -> Location;
```
## UnaryPlusExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: UnaryPlusExpression) -> string;
```
## UnaryPlusExpression::getExpression

```rust
pub fn getExpression(self: UnaryPlusExpression) -> Expression;
```
## UnaryPlusExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UnaryPlusExpression) -> int;
```
## UnaryPlusExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: UnaryPlusExpression) -> File;
```
## UnaryPlusExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: UnaryPlusExpression, level: int) -> Node;
```
## UnaryPlusExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: UnaryPlusExpression) -> FunctionLikeDeclaration;
```
## UnaryPlusExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: UnaryPlusExpression) -> *Comment;
```
## UnaryPlusExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: UnaryPlusExpression) -> *Comment;
```
## UnaryPlusExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UnaryPlusExpression) -> *FunctionLikeDeclaration;
```
## UnaryPlusExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: UnaryPlusExpression, level: int) -> *Node;
```
## UnaryPlusExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: UnaryPlusExpression) -> int;
```
## UnaryPlusExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: UnaryPlusExpression) -> *Modifier;
```
## UnaryPlusExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UnaryPlusExpression) -> int;
```
## UnaryPlusExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UnaryPlusExpression) -> int;
```
## UnaryPlusExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: UnaryPlusExpression, i: int) -> Node;
```
## UnaryPlusExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: UnaryPlusExpression) -> TopLevelDO;
```
## UnaryPlusExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: UnaryPlusExpression, i: int) -> Decorator;
```
## UnaryPlusExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UnaryPlusExpression) -> int;
```
## UnaryPlusExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: UnaryPlusExpression) -> *Node;
```
## UnaryPlusExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: UnaryPlusExpression) -> Node;
```
## UnaryPlusExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: UnaryPlusExpression) -> Node;
```
## UnaryPlusExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: UnaryPlusExpression) -> int;
```
## UnaryPlusExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: UnaryPlusExpression) -> *Node;
```
## UnaryPlusExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: UnaryPlusExpression) -> *Comment;
```
## UnaryPlusExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: UnaryPlusExpression) -> Symbol;
```
## UnaryPlusExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: UnaryPlusExpression) -> *Decorator;
```
## UnaryPlusExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *UnaryPlusExpression;
```
## UnaryPlusExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: UnaryPlusExpression, i: int) -> Modifier;
```
## UnaryPlusExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: UnaryPlusExpression) -> string;
```
## UnaryPlusExpression::is\<T\>

```rust
pub fn is<T>(self: UnaryPlusExpression) -> bool;
```
## UnaryPlusExpression::to\<T\>

```rust
pub fn to<T>(self: UnaryPlusExpression) -> <any>;
```
## UnaryPlusExpression::key\_neq

```rust
pub fn key_neq(self: UnaryPlusExpression, object: <any>) -> bool;
```
## UnaryPlusExpression::key\_eq

```rust
pub fn key_eq(self: UnaryPlusExpression, object: <any>) -> bool;
```
## UnaryPlusExpression::to\_set

```rust
pub fn to_set(self: UnaryPlusExpression) -> *UnaryPlusExpression;
```
