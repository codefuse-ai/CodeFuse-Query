# WhileStatement

Primary key: `id: int`

```rust
schema WhileStatement {
  @primary id: int,
}
```
## WhileStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: WhileStatement) -> Location;
```
## WhileStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: WhileStatement) -> Symbol;
```
## WhileStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: WhileStatement) -> *Decorator;
```
## WhileStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: WhileStatement) -> string;
```
## WhileStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: WhileStatement, i: int) -> Modifier;
```
## WhileStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: WhileStatement) -> *Comment;
```
## WhileStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: WhileStatement) -> *Node;
```
## WhileStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: WhileStatement) -> *Node;
```
## WhileStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: WhileStatement) -> Node;
```
## WhileStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: WhileStatement) -> *Comment;
```
## WhileStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: WhileStatement) -> *Comment;
```
## WhileStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: WhileStatement) -> int;
```
## WhileStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: WhileStatement) -> TopLevelDO;
```
## WhileStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: WhileStatement, i: int) -> Decorator;
```
## WhileStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: WhileStatement) -> int;
```
## WhileStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: WhileStatement) -> *Modifier;
```
## WhileStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: WhileStatement) -> int;
```
## WhileStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: WhileStatement, i: int) -> Node;
```
## WhileStatement::getCondition

```rust
/** 
     * Gets the loop condition of this `while` loop. 
     */
```
```rust
pub fn getCondition(self: WhileStatement) -> Expression;
```
## WhileStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: WhileStatement) -> int;
```
## WhileStatement::getBody

```rust
/** 
     * Gets the body of this `while` loop. 
     */
```
```rust
pub fn getBody(self: WhileStatement) -> Statement;
```
## WhileStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: WhileStatement) -> *FunctionLikeDeclaration;
```
## WhileStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: WhileStatement, level: int) -> *Node;
```
## WhileStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: WhileStatement) -> int;
```
## WhileStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: WhileStatement) -> string;
```
## WhileStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: WhileStatement, level: int) -> Node;
```
## WhileStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: WhileStatement) -> File;
```
## WhileStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: WhileStatement) -> int;
```
## WhileStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: WhileStatement) -> Node;
```
## WhileStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: WhileStatement) -> FunctionLikeDeclaration;
```
## WhileStatement::getIndex

```rust
pub fn getIndex(self: WhileStatement) -> int;
```
## WhileStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: WhileStatement) -> int;
```
## WhileStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: WhileStatement) -> *Node;
```
## WhileStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *WhileStatement;
```
## WhileStatement::is\<T\>

```rust
pub fn is<T>(self: WhileStatement) -> bool;
```
## WhileStatement::to\<T\>

```rust
pub fn to<T>(self: WhileStatement) -> <any>;
```
## WhileStatement::key\_neq

```rust
pub fn key_neq(self: WhileStatement, object: <any>) -> bool;
```
## WhileStatement::key\_eq

```rust
pub fn key_eq(self: WhileStatement, object: <any>) -> bool;
```
## WhileStatement::to\_set

```rust
pub fn to_set(self: WhileStatement) -> *WhileStatement;
```
