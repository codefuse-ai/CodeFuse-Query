# IterationStatement

Primary key: `id: int`

```rust
schema IterationStatement {
  @primary id: int,
}
```
## IterationStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: IterationStatement) -> Location;
```
## IterationStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: IterationStatement) -> Symbol;
```
## IterationStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: IterationStatement) -> *Decorator;
```
## IterationStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: IterationStatement) -> string;
```
## IterationStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: IterationStatement, i: int) -> Modifier;
```
## IterationStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: IterationStatement) -> *Comment;
```
## IterationStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: IterationStatement) -> *Node;
```
## IterationStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: IterationStatement) -> *Node;
```
## IterationStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: IterationStatement) -> Node;
```
## IterationStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: IterationStatement) -> *Comment;
```
## IterationStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: IterationStatement) -> *Comment;
```
## IterationStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: IterationStatement) -> int;
```
## IterationStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: IterationStatement) -> TopLevelDO;
```
## IterationStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: IterationStatement, i: int) -> Decorator;
```
## IterationStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: IterationStatement) -> int;
```
## IterationStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: IterationStatement) -> *Modifier;
```
## IterationStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: IterationStatement) -> int;
```
## IterationStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: IterationStatement, i: int) -> Node;
```
## IterationStatement::getCondition

```rust
/**
     * Gets the condition expression of this iteration statement.
     * Only a `while`, `do`-`while` and `for` statement has a condition.
     */
```
```rust
pub fn getCondition(self: IterationStatement) -> Expression;
```
## IterationStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: IterationStatement) -> int;
```
## IterationStatement::getBody

```rust
/**
     * Gets the body statement of this iteration statement.
     */
```
```rust
pub fn getBody(self: IterationStatement) -> Statement;
```
## IterationStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: IterationStatement) -> *FunctionLikeDeclaration;
```
## IterationStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: IterationStatement, level: int) -> *Node;
```
## IterationStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: IterationStatement) -> int;
```
## IterationStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: IterationStatement) -> string;
```
## IterationStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: IterationStatement, level: int) -> Node;
```
## IterationStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: IterationStatement) -> File;
```
## IterationStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: IterationStatement) -> int;
```
## IterationStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: IterationStatement) -> FunctionLikeDeclaration;
```
## IterationStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: IterationStatement) -> Node;
```
## IterationStatement::getIndex

```rust
pub fn getIndex(self: IterationStatement) -> int;
```
## IterationStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: IterationStatement) -> int;
```
## IterationStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: IterationStatement) -> *Node;
```
## IterationStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *IterationStatement;
```
## IterationStatement::is\<T\>

```rust
pub fn is<T>(self: IterationStatement) -> bool;
```
## IterationStatement::to\<T\>

```rust
pub fn to<T>(self: IterationStatement) -> <any>;
```
## IterationStatement::key\_neq

```rust
pub fn key_neq(self: IterationStatement, object: <any>) -> bool;
```
## IterationStatement::key\_eq

```rust
pub fn key_eq(self: IterationStatement, object: <any>) -> bool;
```
## IterationStatement::to\_set

```rust
pub fn to_set(self: IterationStatement) -> *IterationStatement;
```
