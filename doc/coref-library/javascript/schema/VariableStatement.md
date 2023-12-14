# VariableStatement

Primary key: `id: int`

```rust
schema VariableStatement {
  @primary id: int,
}
```
## VariableStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: VariableStatement) -> Location;
```
## VariableStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: VariableStatement) -> Symbol;
```
## VariableStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: VariableStatement) -> *Decorator;
```
## VariableStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: VariableStatement) -> string;
```
## VariableStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: VariableStatement, i: int) -> Modifier;
```
## VariableStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: VariableStatement) -> *Comment;
```
## VariableStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: VariableStatement) -> *Node;
```
## VariableStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: VariableStatement) -> *Node;
```
## VariableStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: VariableStatement) -> Node;
```
## VariableStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: VariableStatement) -> int;
```
## VariableStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: VariableStatement) -> TopLevelDO;
```
## VariableStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: VariableStatement, i: int) -> Decorator;
```
## VariableStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: VariableStatement) -> int;
```
## VariableStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: VariableStatement) -> *Modifier;
```
## VariableStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: VariableStatement) -> int;
```
## VariableStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: VariableStatement, i: int) -> Node;
```
## VariableStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: VariableStatement) -> int;
```
## VariableStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: VariableStatement) -> *FunctionLikeDeclaration;
```
## VariableStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: VariableStatement, level: int) -> *Node;
```
## VariableStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: VariableStatement) -> int;
```
## VariableStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: VariableStatement) -> string;
```
## VariableStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: VariableStatement, level: int) -> Node;
```
## VariableStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: VariableStatement) -> File;
```
## VariableStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: VariableStatement) -> *Comment;
```
## VariableStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: VariableStatement) -> *Comment;
```
## VariableStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: VariableStatement) -> Node;
```
## VariableStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: VariableStatement) -> FunctionLikeDeclaration;
```
## VariableStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: VariableStatement) -> int;
```
## VariableStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: VariableStatement) -> int;
```
## VariableStatement::getIndex

```rust
pub fn getIndex(self: VariableStatement) -> int;
```
## VariableStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *VariableStatement;
```
## VariableStatement::getVariableDeclarationList

```rust
/**
     * VariableStatement contains a VariableDeclarationList, get that list
     */
```
```rust
pub fn getVariableDeclarationList(self: VariableStatement) -> VariableDeclarationList;
```
## VariableStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: VariableStatement) -> *Node;
```
## VariableStatement::is\<T\>

```rust
pub fn is<T>(self: VariableStatement) -> bool;
```
## VariableStatement::to\<T\>

```rust
pub fn to<T>(self: VariableStatement) -> <any>;
```
## VariableStatement::key\_neq

```rust
pub fn key_neq(self: VariableStatement, object: <any>) -> bool;
```
## VariableStatement::key\_eq

```rust
pub fn key_eq(self: VariableStatement, object: <any>) -> bool;
```
## VariableStatement::to\_set

```rust
pub fn to_set(self: VariableStatement) -> *VariableStatement;
```
