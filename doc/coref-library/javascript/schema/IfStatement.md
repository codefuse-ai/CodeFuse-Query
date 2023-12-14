# IfStatement

Primary key: `id: int`

```rust
schema IfStatement {
  @primary id: int,
}
```
## IfStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: IfStatement) -> Location;
```
## IfStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: IfStatement) -> Symbol;
```
## IfStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: IfStatement) -> *Decorator;
```
## IfStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: IfStatement) -> string;
```
## IfStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: IfStatement, i: int) -> Modifier;
```
## IfStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: IfStatement) -> *Comment;
```
## IfStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: IfStatement) -> *Node;
```
## IfStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: IfStatement) -> *Node;
```
## IfStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: IfStatement) -> Node;
```
## IfStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: IfStatement) -> *Comment;
```
## IfStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: IfStatement) -> *Comment;
```
## IfStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: IfStatement) -> int;
```
## IfStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: IfStatement) -> TopLevelDO;
```
## IfStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: IfStatement, i: int) -> Decorator;
```
## IfStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: IfStatement) -> int;
```
## IfStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: IfStatement) -> *Modifier;
```
## IfStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: IfStatement) -> int;
```
## IfStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: IfStatement, i: int) -> Node;
```
## IfStatement::getCondition

```rust
/**
     * Gets the condition of this `if` statement.
     */
```
```rust
pub fn getCondition(self: IfStatement) -> Expression;
```
## IfStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: IfStatement) -> int;
```
## IfStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: IfStatement) -> *FunctionLikeDeclaration;
```
## IfStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: IfStatement, level: int) -> *Node;
```
## IfStatement::getElse

```rust
/**
     * Gets the "else" branch of this `if` statement, if any.
     */
```
```rust
pub fn getElse(self: IfStatement) -> Statement;
```
## IfStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: IfStatement) -> int;
```
## IfStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: IfStatement) -> string;
```
## IfStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: IfStatement) -> int;
```
## IfStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: IfStatement) -> FunctionLikeDeclaration;
```
## IfStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: IfStatement) -> Node;
```
## IfStatement::getIndex

```rust
pub fn getIndex(self: IfStatement) -> int;
```
## IfStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: IfStatement) -> *Node;
```
## IfStatement::hasElse

```rust
/**
     * Determine this IfStatement has else expr.
     */
```
```rust
pub fn hasElse(self: IfStatement) -> bool;
```
## IfStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: IfStatement, level: int) -> Node;
```
## IfStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: IfStatement) -> File;
```
## IfStatement::getThen

```rust
/**
     * Gets the "then" branch of this `if` statement.
     */
```
```rust
pub fn getThen(self: IfStatement) -> Statement;
```
## IfStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: IfStatement) -> int;
```
## IfStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *IfStatement;
```
## IfStatement::is\<T\>

```rust
pub fn is<T>(self: IfStatement) -> bool;
```
## IfStatement::to\<T\>

```rust
pub fn to<T>(self: IfStatement) -> <any>;
```
## IfStatement::key\_neq

```rust
pub fn key_neq(self: IfStatement, object: <any>) -> bool;
```
## IfStatement::key\_eq

```rust
pub fn key_eq(self: IfStatement, object: <any>) -> bool;
```
## IfStatement::to\_set

```rust
pub fn to_set(self: IfStatement) -> *IfStatement;
```
