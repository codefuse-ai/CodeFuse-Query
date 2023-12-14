# DefaultClause

Primary key: `id: int`

```rust
schema DefaultClause {
  @primary id: int,
}
```
## DefaultClause::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: DefaultClause) -> Location;
```
## DefaultClause::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: DefaultClause) -> Symbol;
```
## DefaultClause::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: DefaultClause) -> *Decorator;
```
## DefaultClause::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: DefaultClause) -> string;
```
## DefaultClause::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: DefaultClause, i: int) -> Modifier;
```
## DefaultClause::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: DefaultClause) -> *Comment;
```
## DefaultClause::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: DefaultClause) -> *Node;
```
## DefaultClause::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: DefaultClause) -> Node;
```
## DefaultClause::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: DefaultClause) -> *Comment;
```
## DefaultClause::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: DefaultClause) -> *Comment;
```
## DefaultClause::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: DefaultClause) -> int;
```
## DefaultClause::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: DefaultClause) -> TopLevelDO;
```
## DefaultClause::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: DefaultClause, i: int) -> Decorator;
```
## DefaultClause::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: DefaultClause, i: int) -> Node;
```
## DefaultClause::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DefaultClause) -> int;
```
## DefaultClause::getStatementCount

```rust
/**
     * Gets the statement count of this DefaultClause.
     */
```
```rust
pub fn getStatementCount(self: DefaultClause) -> int;
```
## DefaultClause::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DefaultClause) -> int;
```
## DefaultClause::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: DefaultClause) -> int;
```
## DefaultClause::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: DefaultClause) -> *Modifier;
```
## DefaultClause::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DefaultClause) -> *FunctionLikeDeclaration;
```
## DefaultClause::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: DefaultClause, level: int) -> *Node;
```
## DefaultClause::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DefaultClause) -> int;
```
## DefaultClause::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: DefaultClause) -> string;
```
## DefaultClause::getStatement

```rust
/**
     * Gets the statement of this DefaultClause with index,
     * starts from 0.
     */
```
```rust
pub fn getStatement(self: DefaultClause, index: int) -> Statement;
```
## DefaultClause::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: DefaultClause, level: int) -> Node;
```
## DefaultClause::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: DefaultClause) -> File;
```
## DefaultClause::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: DefaultClause) -> FunctionLikeDeclaration;
```
## DefaultClause::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: DefaultClause) -> Node;
```
## DefaultClause::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DefaultClause) -> int;
```
## DefaultClause::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: DefaultClause) -> int;
```
## DefaultClause::getIndex

```rust
pub fn getIndex(self: DefaultClause) -> int;
```
## DefaultClause::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *DefaultClause;
```
## DefaultClause::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: DefaultClause) -> *Node;
```
## DefaultClause::getAStatement

```rust
/**
     * Gets a statement of this DefaultClause.
     */
```
```rust
pub fn getAStatement(self: DefaultClause) -> *Statement;
```
## DefaultClause::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: DefaultClause) -> *Node;
```
## DefaultClause::is\<T\>

```rust
pub fn is<T>(self: DefaultClause) -> bool;
```
## DefaultClause::to\<T\>

```rust
pub fn to<T>(self: DefaultClause) -> <any>;
```
## DefaultClause::key\_neq

```rust
pub fn key_neq(self: DefaultClause, object: <any>) -> bool;
```
## DefaultClause::key\_eq

```rust
pub fn key_eq(self: DefaultClause, object: <any>) -> bool;
```
## DefaultClause::to\_set

```rust
pub fn to_set(self: DefaultClause) -> *DefaultClause;
```
