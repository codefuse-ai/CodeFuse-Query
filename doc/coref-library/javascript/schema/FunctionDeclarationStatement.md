# FunctionDeclarationStatement

Primary key: `id: int`

```rust
schema FunctionDeclarationStatement {
  @primary id: int,
}
```
## FunctionDeclarationStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: FunctionDeclarationStatement) -> *Node;
```
## FunctionDeclarationStatement::getIndex

```rust
pub fn getIndex(self: FunctionDeclarationStatement) -> int;
```
## FunctionDeclarationStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: FunctionDeclarationStatement) -> int;
```
## FunctionDeclarationStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: FunctionDeclarationStatement) -> int;
```
## FunctionDeclarationStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: FunctionDeclarationStatement) -> FunctionLikeDeclaration;
```
## FunctionDeclarationStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: FunctionDeclarationStatement) -> Node;
```
## FunctionDeclarationStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: FunctionDeclarationStatement) -> *Comment;
```
## FunctionDeclarationStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: FunctionDeclarationStatement) -> *Comment;
```
## FunctionDeclarationStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: FunctionDeclarationStatement) -> File;
```
## FunctionDeclarationStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: FunctionDeclarationStatement, level: int) -> Node;
```
## FunctionDeclarationStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: FunctionDeclarationStatement) -> int;
```
## FunctionDeclarationStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: FunctionDeclarationStatement) -> string;
```
## FunctionDeclarationStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: FunctionDeclarationStatement) -> *FunctionLikeDeclaration;
```
## FunctionDeclarationStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: FunctionDeclarationStatement, level: int) -> *Node;
```
## FunctionDeclarationStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: FunctionDeclarationStatement) -> int;
```
## FunctionDeclarationStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: FunctionDeclarationStatement) -> *Modifier;
```
## FunctionDeclarationStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: FunctionDeclarationStatement) -> int;
```
## FunctionDeclarationStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: FunctionDeclarationStatement) -> int;
```
## FunctionDeclarationStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: FunctionDeclarationStatement, i: int) -> Node;
```
## FunctionDeclarationStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: FunctionDeclarationStatement, i: int) -> Decorator;
```
## FunctionDeclarationStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: FunctionDeclarationStatement) -> TopLevelDO;
```
## FunctionDeclarationStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: FunctionDeclarationStatement) -> int;
```
## FunctionDeclarationStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: FunctionDeclarationStatement) -> Node;
```
## FunctionDeclarationStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: FunctionDeclarationStatement) -> *Node;
```
## FunctionDeclarationStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: FunctionDeclarationStatement) -> *Node;
```
## FunctionDeclarationStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: FunctionDeclarationStatement) -> *Comment;
```
## FunctionDeclarationStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: FunctionDeclarationStatement) -> Symbol;
```
## FunctionDeclarationStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: FunctionDeclarationStatement) -> *Decorator;
```
## FunctionDeclarationStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: FunctionDeclarationStatement, i: int) -> Modifier;
```
## FunctionDeclarationStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: FunctionDeclarationStatement) -> string;
```
## FunctionDeclarationStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *FunctionDeclarationStatement;
```
## FunctionDeclarationStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: FunctionDeclarationStatement) -> Location;
```
## FunctionDeclarationStatement::is\<T\>

```rust
pub fn is<T>(self: FunctionDeclarationStatement) -> bool;
```
## FunctionDeclarationStatement::to\<T\>

```rust
pub fn to<T>(self: FunctionDeclarationStatement) -> <any>;
```
## FunctionDeclarationStatement::key\_neq

```rust
pub fn key_neq(self: FunctionDeclarationStatement, object: <any>) -> bool;
```
## FunctionDeclarationStatement::key\_eq

```rust
pub fn key_eq(self: FunctionDeclarationStatement, object: <any>) -> bool;
```
## FunctionDeclarationStatement::to\_set

```rust
pub fn to_set(self: FunctionDeclarationStatement) -> *FunctionDeclarationStatement;
```
