# DeclarationStatement

Primary key: `id: int`

```rust
schema DeclarationStatement {
  @primary id: int,
}
```
## DeclarationStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: DeclarationStatement) -> Location;
```
## DeclarationStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: DeclarationStatement) -> Symbol;
```
## DeclarationStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: DeclarationStatement) -> *Decorator;
```
## DeclarationStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: DeclarationStatement) -> string;
```
## DeclarationStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: DeclarationStatement, i: int) -> Modifier;
```
## DeclarationStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: DeclarationStatement) -> *Comment;
```
## DeclarationStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: DeclarationStatement) -> *Node;
```
## DeclarationStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: DeclarationStatement) -> *Node;
```
## DeclarationStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: DeclarationStatement) -> Node;
```
## DeclarationStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: DeclarationStatement) -> TopLevelDO;
```
## DeclarationStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: DeclarationStatement, i: int) -> Decorator;
```
## DeclarationStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: DeclarationStatement) -> *Modifier;
```
## DeclarationStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: DeclarationStatement, i: int) -> Node;
```
## DeclarationStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DeclarationStatement) -> *FunctionLikeDeclaration;
```
## DeclarationStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: DeclarationStatement, level: int) -> *Node;
```
## DeclarationStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: DeclarationStatement) -> string;
```
## DeclarationStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: DeclarationStatement, level: int) -> Node;
```
## DeclarationStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: DeclarationStatement) -> File;
```
## DeclarationStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: DeclarationStatement) -> *Comment;
```
## DeclarationStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: DeclarationStatement) -> *Comment;
```
## DeclarationStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: DeclarationStatement) -> Node;
```
## DeclarationStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: DeclarationStatement) -> FunctionLikeDeclaration;
```
## DeclarationStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getIndex

```rust
pub fn getIndex(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: DeclarationStatement) -> *Node;
```
## DeclarationStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *DeclarationStatement;
```
## DeclarationStatement::is\<T\>

```rust
pub fn is<T>(self: DeclarationStatement) -> bool;
```
## DeclarationStatement::to\<T\>

```rust
pub fn to<T>(self: DeclarationStatement) -> <any>;
```
## DeclarationStatement::key\_neq

```rust
pub fn key_neq(self: DeclarationStatement, object: <any>) -> bool;
```
## DeclarationStatement::key\_eq

```rust
pub fn key_eq(self: DeclarationStatement, object: <any>) -> bool;
```
## DeclarationStatement::to\_set

```rust
pub fn to_set(self: DeclarationStatement) -> *DeclarationStatement;
```
