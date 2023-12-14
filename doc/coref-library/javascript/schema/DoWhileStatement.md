# DoWhileStatement

Primary key: `id: int`

```rust
schema DoWhileStatement {
  @primary id: int,
}
```
## DoWhileStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: DoWhileStatement) -> Location;
```
## DoWhileStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: DoWhileStatement) -> Symbol;
```
## DoWhileStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: DoWhileStatement) -> *Decorator;
```
## DoWhileStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: DoWhileStatement) -> string;
```
## DoWhileStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: DoWhileStatement, i: int) -> Modifier;
```
## DoWhileStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: DoWhileStatement) -> *Comment;
```
## DoWhileStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: DoWhileStatement) -> *Node;
```
## DoWhileStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: DoWhileStatement) -> *Node;
```
## DoWhileStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: DoWhileStatement) -> Node;
```
## DoWhileStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: DoWhileStatement) -> *Comment;
```
## DoWhileStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: DoWhileStatement) -> *Comment;
```
## DoWhileStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: DoWhileStatement) -> TopLevelDO;
```
## DoWhileStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: DoWhileStatement, i: int) -> Decorator;
```
## DoWhileStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: DoWhileStatement) -> *Modifier;
```
## DoWhileStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: DoWhileStatement, i: int) -> Node;
```
## DoWhileStatement::getCondition

```rust
/** 
     * Gets the loop condition of this `do`-`while` loop. 
     */
```
```rust
pub fn getCondition(self: DoWhileStatement) -> Expression;
```
## DoWhileStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getBody

```rust
/** 
     * Gets the body of this `do`-`while` loop. 
     */
```
```rust
pub fn getBody(self: DoWhileStatement) -> Statement;
```
## DoWhileStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DoWhileStatement) -> *FunctionLikeDeclaration;
```
## DoWhileStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: DoWhileStatement, level: int) -> *Node;
```
## DoWhileStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: DoWhileStatement) -> string;
```
## DoWhileStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: DoWhileStatement, level: int) -> Node;
```
## DoWhileStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: DoWhileStatement) -> File;
```
## DoWhileStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: DoWhileStatement) -> Node;
```
## DoWhileStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: DoWhileStatement) -> FunctionLikeDeclaration;
```
## DoWhileStatement::getIndex

```rust
pub fn getIndex(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: DoWhileStatement) -> *Node;
```
## DoWhileStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *DoWhileStatement;
```
## DoWhileStatement::is\<T\>

```rust
pub fn is<T>(self: DoWhileStatement) -> bool;
```
## DoWhileStatement::to\<T\>

```rust
pub fn to<T>(self: DoWhileStatement) -> <any>;
```
## DoWhileStatement::key\_neq

```rust
pub fn key_neq(self: DoWhileStatement, object: <any>) -> bool;
```
## DoWhileStatement::key\_eq

```rust
pub fn key_eq(self: DoWhileStatement, object: <any>) -> bool;
```
## DoWhileStatement::to\_set

```rust
pub fn to_set(self: DoWhileStatement) -> *DoWhileStatement;
```
