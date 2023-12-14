# SwitchStatement

Primary key: `id: int`

```rust
schema SwitchStatement {
  @primary id: int,
}
```
## SwitchStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: SwitchStatement) -> Location;
```
## SwitchStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: SwitchStatement) -> Symbol;
```
## SwitchStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: SwitchStatement) -> *Decorator;
```
## SwitchStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: SwitchStatement) -> string;
```
## SwitchStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: SwitchStatement, i: int) -> Modifier;
```
## SwitchStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: SwitchStatement) -> *Comment;
```
## SwitchStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: SwitchStatement) -> *Node;
```
## SwitchStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: SwitchStatement) -> *Node;
```
## SwitchStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: SwitchStatement) -> Node;
```
## SwitchStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: SwitchStatement) -> *Comment;
```
## SwitchStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: SwitchStatement) -> *Comment;
```
## SwitchStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: SwitchStatement) -> int;
```
## SwitchStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: SwitchStatement) -> TopLevelDO;
```
## SwitchStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: SwitchStatement, i: int) -> Decorator;
```
## SwitchStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: SwitchStatement, i: int) -> Node;
```
## SwitchStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SwitchStatement) -> int;
```
## SwitchStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SwitchStatement) -> int;
```
## SwitchStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: SwitchStatement) -> int;
```
## SwitchStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: SwitchStatement) -> *Modifier;
```
## SwitchStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SwitchStatement) -> *FunctionLikeDeclaration;
```
## SwitchStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: SwitchStatement, level: int) -> *Node;
```
## SwitchStatement::getExpression

```rust
pub fn getExpression(self: SwitchStatement) -> Expression;
```
## SwitchStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SwitchStatement) -> int;
```
## SwitchStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: SwitchStatement) -> string;
```
## SwitchStatement::getCaseBlock

```rust
pub fn getCaseBlock(self: SwitchStatement) -> CaseBlock;
```
## SwitchStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: SwitchStatement) -> File;
```
## SwitchStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: SwitchStatement, level: int) -> Node;
```
## SwitchStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: SwitchStatement) -> FunctionLikeDeclaration;
```
## SwitchStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: SwitchStatement) -> Node;
```
## SwitchStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SwitchStatement) -> int;
```
## SwitchStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: SwitchStatement) -> int;
```
## SwitchStatement::getIndex

```rust
pub fn getIndex(self: SwitchStatement) -> int;
```
## SwitchStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: SwitchStatement) -> *Node;
```
## SwitchStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *SwitchStatement;
```
## SwitchStatement::is\<T\>

```rust
pub fn is<T>(self: SwitchStatement) -> bool;
```
## SwitchStatement::to\<T\>

```rust
pub fn to<T>(self: SwitchStatement) -> <any>;
```
## SwitchStatement::key\_neq

```rust
pub fn key_neq(self: SwitchStatement, object: <any>) -> bool;
```
## SwitchStatement::key\_eq

```rust
pub fn key_eq(self: SwitchStatement, object: <any>) -> bool;
```
## SwitchStatement::to\_set

```rust
pub fn to_set(self: SwitchStatement) -> *SwitchStatement;
```
