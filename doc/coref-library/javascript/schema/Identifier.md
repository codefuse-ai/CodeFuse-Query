# Identifier

Primary key: `id: int`

```rust
schema Identifier {
  @primary id: int,
}
```
## Identifier::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: Identifier) -> *Node;
```
## Identifier::getEndLineNumber

```rust
pub fn getEndLineNumber(self: Identifier) -> int;
```
## Identifier::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: Identifier) -> string;
```
## Identifier::getExpression

```rust
pub fn getExpression(self: Identifier) -> Expression;
```
## Identifier::getIndex

```rust
pub fn getIndex(self: Identifier) -> int;
```
## Identifier::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: Identifier) -> int;
```
## Identifier::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: Identifier, level: int) -> Node;
```
## Identifier::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: Identifier) -> File;
```
## Identifier::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: Identifier) -> int;
```
## Identifier::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: Identifier) -> FunctionLikeDeclaration;
```
## Identifier::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: Identifier) -> *Comment;
```
## Identifier::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: Identifier) -> *Comment;
```
## Identifier::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: Identifier) -> *FunctionLikeDeclaration;
```
## Identifier::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: Identifier, level: int) -> *Node;
```
## Identifier::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: Identifier) -> int;
```
## Identifier::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: Identifier) -> *Modifier;
```
## Identifier::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: Identifier) -> int;
```
## Identifier::getStartLineNumber

```rust
pub fn getStartLineNumber(self: Identifier) -> int;
```
## Identifier::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: Identifier, i: int) -> Node;
```
## Identifier::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: Identifier, i: int) -> Decorator;
```
## Identifier::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: Identifier) -> TopLevelDO;
```
## Identifier::getName

```rust
pub fn getName(self: Identifier) -> string;
```
## Identifier::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: Identifier) -> int;
```
## Identifier::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: Identifier) -> Node;
```
## Identifier::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: Identifier) -> *Node;
```
## Identifier::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: Identifier) -> Node;
```
## Identifier::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: Identifier) -> *Comment;
```
## Identifier::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: Identifier) -> *Node;
```
## Identifier::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: Identifier) -> Symbol;
```
## Identifier::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: Identifier) -> *Decorator;
```
## Identifier::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: Identifier) -> Location;
```
## Identifier::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *Identifier;
```
## Identifier::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: Identifier, i: int) -> Modifier;
```
## Identifier::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: Identifier) -> string;
```
## Identifier::is\<T\>

```rust
pub fn is<T>(self: Identifier) -> bool;
```
## Identifier::to\<T\>

```rust
pub fn to<T>(self: Identifier) -> <any>;
```
## Identifier::key\_neq

```rust
pub fn key_neq(self: Identifier, object: <any>) -> bool;
```
## Identifier::key\_eq

```rust
pub fn key_eq(self: Identifier, object: <any>) -> bool;
```
## Identifier::to\_set

```rust
pub fn to_set(self: Identifier) -> *Identifier;
```
