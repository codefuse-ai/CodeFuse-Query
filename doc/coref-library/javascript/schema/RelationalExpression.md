# RelationalExpression

Primary key: `id: int`

```rust
schema RelationalExpression {
  @primary id: int,
}
```
## RelationalExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: RelationalExpression) -> int;
```
## RelationalExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RelationalExpression) -> int;
```
## RelationalExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: RelationalExpression) -> Node;
```
## RelationalExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: RelationalExpression) -> FunctionLikeDeclaration;
```
## RelationalExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: RelationalExpression) -> Expression;
```
## RelationalExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: RelationalExpression) -> *Node;
```
## RelationalExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: RelationalExpression) -> BinaryOperator;
```
## RelationalExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: RelationalExpression) -> Location;
```
## RelationalExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: RelationalExpression) -> Expression;
```
## RelationalExpression::getIndex

```rust
pub fn getIndex(self: RelationalExpression) -> int;
```
## RelationalExpression::getAnOperand

```rust
pub fn getAnOperand(self: RelationalExpression) -> *Expression;
```
## RelationalExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: RelationalExpression) -> Expression;
```
## RelationalExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: RelationalExpression, i: int) -> Modifier;
```
## RelationalExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: RelationalExpression) -> string;
```
## RelationalExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: RelationalExpression) -> string;
```
## RelationalExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RelationalExpression) -> int;
```
## RelationalExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: RelationalExpression) -> File;
```
## RelationalExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: RelationalExpression, level: int) -> Node;
```
## RelationalExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: RelationalExpression) -> Expression;
```
## RelationalExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RelationalExpression) -> *FunctionLikeDeclaration;
```
## RelationalExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: RelationalExpression, level: int) -> *Node;
```
## RelationalExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: RelationalExpression) -> int;
```
## RelationalExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: RelationalExpression) -> *Modifier;
```
## RelationalExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RelationalExpression) -> int;
```
## RelationalExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RelationalExpression) -> int;
```
## RelationalExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: RelationalExpression, i: int) -> Node;
```
## RelationalExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: RelationalExpression) -> TopLevelDO;
```
## RelationalExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: RelationalExpression, i: int) -> Decorator;
```
## RelationalExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: RelationalExpression) -> *Node;
```
## RelationalExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: RelationalExpression) -> Node;
```
## RelationalExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: RelationalExpression) -> *Comment;
```
## RelationalExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: RelationalExpression) -> *Comment;
```
## RelationalExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: RelationalExpression) -> int;
```
## RelationalExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: RelationalExpression) -> *Node;
```
## RelationalExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: RelationalExpression) -> *Comment;
```
## RelationalExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: RelationalExpression) -> *Decorator;
```
## RelationalExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: RelationalExpression) -> Symbol;
```
## RelationalExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *RelationalExpression;
```
## RelationalExpression::is\<T\>

```rust
pub fn is<T>(self: RelationalExpression) -> bool;
```
## RelationalExpression::to\<T\>

```rust
pub fn to<T>(self: RelationalExpression) -> <any>;
```
## RelationalExpression::key\_neq

```rust
pub fn key_neq(self: RelationalExpression, object: <any>) -> bool;
```
## RelationalExpression::key\_eq

```rust
pub fn key_eq(self: RelationalExpression, object: <any>) -> bool;
```
## RelationalExpression::to\_set

```rust
pub fn to_set(self: RelationalExpression) -> *RelationalExpression;
```
