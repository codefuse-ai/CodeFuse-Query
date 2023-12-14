# ClassDeclarationStatement

Primary key: `id: int`

```rust
schema ClassDeclarationStatement {
  @primary id: int,
}
```
## ClassDeclarationStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ClassDeclarationStatement) -> *Node;
```
## ClassDeclarationStatement::getIndex

```rust
pub fn getIndex(self: ClassDeclarationStatement) -> int;
```
## ClassDeclarationStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ClassDeclarationStatement) -> int;
```
## ClassDeclarationStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ClassDeclarationStatement) -> int;
```
## ClassDeclarationStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ClassDeclarationStatement) -> FunctionLikeDeclaration;
```
## ClassDeclarationStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ClassDeclarationStatement) -> Node;
```
## ClassDeclarationStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ClassDeclarationStatement) -> *Comment;
```
## ClassDeclarationStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ClassDeclarationStatement) -> *Comment;
```
## ClassDeclarationStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ClassDeclarationStatement) -> File;
```
## ClassDeclarationStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ClassDeclarationStatement, level: int) -> Node;
```
## ClassDeclarationStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ClassDeclarationStatement) -> int;
```
## ClassDeclarationStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ClassDeclarationStatement) -> string;
```
## ClassDeclarationStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ClassDeclarationStatement) -> *FunctionLikeDeclaration;
```
## ClassDeclarationStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ClassDeclarationStatement, level: int) -> *Node;
```
## ClassDeclarationStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ClassDeclarationStatement) -> int;
```
## ClassDeclarationStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ClassDeclarationStatement) -> *Modifier;
```
## ClassDeclarationStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ClassDeclarationStatement) -> int;
```
## ClassDeclarationStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ClassDeclarationStatement) -> int;
```
## ClassDeclarationStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ClassDeclarationStatement, i: int) -> Node;
```
## ClassDeclarationStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ClassDeclarationStatement, i: int) -> Decorator;
```
## ClassDeclarationStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ClassDeclarationStatement) -> TopLevelDO;
```
## ClassDeclarationStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ClassDeclarationStatement) -> int;
```
## ClassDeclarationStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ClassDeclarationStatement) -> Node;
```
## ClassDeclarationStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ClassDeclarationStatement) -> *Node;
```
## ClassDeclarationStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ClassDeclarationStatement) -> *Node;
```
## ClassDeclarationStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ClassDeclarationStatement) -> *Comment;
```
## ClassDeclarationStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ClassDeclarationStatement) -> Symbol;
```
## ClassDeclarationStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ClassDeclarationStatement) -> *Decorator;
```
## ClassDeclarationStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ClassDeclarationStatement, i: int) -> Modifier;
```
## ClassDeclarationStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ClassDeclarationStatement) -> string;
```
## ClassDeclarationStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ClassDeclarationStatement;
```
## ClassDeclarationStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ClassDeclarationStatement) -> Location;
```
## ClassDeclarationStatement::is\<T\>

```rust
pub fn is<T>(self: ClassDeclarationStatement) -> bool;
```
## ClassDeclarationStatement::to\<T\>

```rust
pub fn to<T>(self: ClassDeclarationStatement) -> <any>;
```
## ClassDeclarationStatement::key\_neq

```rust
pub fn key_neq(self: ClassDeclarationStatement, object: <any>) -> bool;
```
## ClassDeclarationStatement::key\_eq

```rust
pub fn key_eq(self: ClassDeclarationStatement, object: <any>) -> bool;
```
## ClassDeclarationStatement::to\_set

```rust
pub fn to_set(self: ClassDeclarationStatement) -> *ClassDeclarationStatement;
```
