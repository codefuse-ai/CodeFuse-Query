# StatementButNotDeclaration

Primary key: `id: int`

```rust
schema StatementButNotDeclaration {
  @primary id: int,
}
```
## StatementButNotDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: StatementButNotDeclaration) -> Location;
```
## StatementButNotDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: StatementButNotDeclaration) -> Symbol;
```
## StatementButNotDeclaration::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: StatementButNotDeclaration) -> *Decorator;
```
## StatementButNotDeclaration::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: StatementButNotDeclaration) -> string;
```
## StatementButNotDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: StatementButNotDeclaration, i: int) -> Modifier;
```
## StatementButNotDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: StatementButNotDeclaration) -> *Comment;
```
## StatementButNotDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: StatementButNotDeclaration) -> *Node;
```
## StatementButNotDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: StatementButNotDeclaration) -> *Node;
```
## StatementButNotDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: StatementButNotDeclaration) -> Node;
```
## StatementButNotDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: StatementButNotDeclaration) -> int;
```
## StatementButNotDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: StatementButNotDeclaration) -> TopLevelDO;
```
## StatementButNotDeclaration::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: StatementButNotDeclaration, i: int) -> Decorator;
```
## StatementButNotDeclaration::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: StatementButNotDeclaration) -> int;
```
## StatementButNotDeclaration::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: StatementButNotDeclaration) -> *Modifier;
```
## StatementButNotDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: StatementButNotDeclaration) -> int;
```
## StatementButNotDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: StatementButNotDeclaration, i: int) -> Node;
```
## StatementButNotDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: StatementButNotDeclaration) -> int;
```
## StatementButNotDeclaration::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: StatementButNotDeclaration) -> *FunctionLikeDeclaration;
```
## StatementButNotDeclaration::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: StatementButNotDeclaration, level: int) -> *Node;
```
## StatementButNotDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: StatementButNotDeclaration) -> int;
```
## StatementButNotDeclaration::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: StatementButNotDeclaration) -> string;
```
## StatementButNotDeclaration::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: StatementButNotDeclaration, level: int) -> Node;
```
## StatementButNotDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: StatementButNotDeclaration) -> File;
```
## StatementButNotDeclaration::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: StatementButNotDeclaration) -> *Comment;
```
## StatementButNotDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: StatementButNotDeclaration) -> *Comment;
```
## StatementButNotDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: StatementButNotDeclaration) -> Node;
```
## StatementButNotDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: StatementButNotDeclaration) -> FunctionLikeDeclaration;
```
## StatementButNotDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: StatementButNotDeclaration) -> int;
```
## StatementButNotDeclaration::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: StatementButNotDeclaration) -> int;
```
## StatementButNotDeclaration::getIndex

```rust
pub fn getIndex(self: StatementButNotDeclaration) -> int;
```
## StatementButNotDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: StatementButNotDeclaration) -> *Node;
```
## StatementButNotDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *StatementButNotDeclaration;
```
## StatementButNotDeclaration::is\<T\>

```rust
pub fn is<T>(self: StatementButNotDeclaration) -> bool;
```
## StatementButNotDeclaration::to\<T\>

```rust
pub fn to<T>(self: StatementButNotDeclaration) -> <any>;
```
## StatementButNotDeclaration::key\_neq

```rust
pub fn key_neq(self: StatementButNotDeclaration, object: <any>) -> bool;
```
## StatementButNotDeclaration::key\_eq

```rust
pub fn key_eq(self: StatementButNotDeclaration, object: <any>) -> bool;
```
## StatementButNotDeclaration::to\_set

```rust
pub fn to_set(self: StatementButNotDeclaration) -> *StatementButNotDeclaration;
```
