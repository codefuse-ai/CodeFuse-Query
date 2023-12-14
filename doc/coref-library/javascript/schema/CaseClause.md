# CaseClause

Primary key: `id: int`

```rust
schema CaseClause {
  @primary id: int,
}
```
## CaseClause::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: CaseClause) -> Location;
```
## CaseClause::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: CaseClause) -> Symbol;
```
## CaseClause::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: CaseClause) -> *Decorator;
```
## CaseClause::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: CaseClause) -> string;
```
## CaseClause::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: CaseClause, i: int) -> Modifier;
```
## CaseClause::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: CaseClause) -> *Comment;
```
## CaseClause::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: CaseClause) -> *Node;
```
## CaseClause::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: CaseClause) -> Node;
```
## CaseClause::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: CaseClause) -> *Comment;
```
## CaseClause::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: CaseClause) -> *Comment;
```
## CaseClause::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: CaseClause) -> int;
```
## CaseClause::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: CaseClause) -> TopLevelDO;
```
## CaseClause::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: CaseClause, i: int) -> Decorator;
```
## CaseClause::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: CaseClause, i: int) -> Node;
```
## CaseClause::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CaseClause) -> int;
```
## CaseClause::getStatementCount

```rust
/**
     * Gets the statement count of this CaseClause.
     */
```
```rust
pub fn getStatementCount(self: CaseClause) -> int;
```
## CaseClause::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CaseClause) -> int;
```
## CaseClause::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: CaseClause) -> int;
```
## CaseClause::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: CaseClause) -> *Modifier;
```
## CaseClause::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CaseClause) -> *FunctionLikeDeclaration;
```
## CaseClause::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: CaseClause, level: int) -> *Node;
```
## CaseClause::getExpression

```rust
/**
     * Gets the expression of this CaseClause.
     */
```
```rust
pub fn getExpression(self: CaseClause) -> Expression;
```
## CaseClause::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CaseClause) -> int;
```
## CaseClause::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: CaseClause) -> string;
```
## CaseClause::getStatement

```rust
/**
     * Gets the statement of this CaseClause with index,
     * starts from 0.
     */
```
```rust
pub fn getStatement(self: CaseClause, index: int) -> Statement;
```
## CaseClause::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: CaseClause, level: int) -> Node;
```
## CaseClause::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: CaseClause) -> File;
```
## CaseClause::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: CaseClause) -> FunctionLikeDeclaration;
```
## CaseClause::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: CaseClause) -> Node;
```
## CaseClause::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CaseClause) -> int;
```
## CaseClause::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: CaseClause) -> int;
```
## CaseClause::getIndex

```rust
pub fn getIndex(self: CaseClause) -> int;
```
## CaseClause::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: CaseClause) -> *Node;
```
## CaseClause::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *CaseClause;
```
## CaseClause::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: CaseClause) -> *Node;
```
## CaseClause::getAStatement

```rust
/**
     * Gets a statement of this CaseClause.
     */
```
```rust
pub fn getAStatement(self: CaseClause) -> *Statement;
```
## CaseClause::is\<T\>

```rust
pub fn is<T>(self: CaseClause) -> bool;
```
## CaseClause::to\<T\>

```rust
pub fn to<T>(self: CaseClause) -> <any>;
```
## CaseClause::key\_neq

```rust
pub fn key_neq(self: CaseClause, object: <any>) -> bool;
```
## CaseClause::key\_eq

```rust
pub fn key_eq(self: CaseClause, object: <any>) -> bool;
```
## CaseClause::to\_set

```rust
pub fn to_set(self: CaseClause) -> *CaseClause;
```
