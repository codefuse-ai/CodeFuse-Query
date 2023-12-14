# PrivateIdentifier

Primary key: `id: int`

```rust
schema PrivateIdentifier {
  @primary id: int,
}
```
## PrivateIdentifier::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PrivateIdentifier) -> *Node;
```
## PrivateIdentifier::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PrivateIdentifier) -> int;
```
## PrivateIdentifier::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PrivateIdentifier) -> string;
```
## PrivateIdentifier::getExpression

```rust
pub fn getExpression(self: PrivateIdentifier) -> Expression;
```
## PrivateIdentifier::getIndex

```rust
pub fn getIndex(self: PrivateIdentifier) -> int;
```
## PrivateIdentifier::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PrivateIdentifier) -> int;
```
## PrivateIdentifier::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PrivateIdentifier, level: int) -> Node;
```
## PrivateIdentifier::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PrivateIdentifier) -> File;
```
## PrivateIdentifier::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PrivateIdentifier) -> int;
```
## PrivateIdentifier::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PrivateIdentifier) -> FunctionLikeDeclaration;
```
## PrivateIdentifier::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PrivateIdentifier) -> *Comment;
```
## PrivateIdentifier::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PrivateIdentifier) -> *Comment;
```
## PrivateIdentifier::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PrivateIdentifier) -> *FunctionLikeDeclaration;
```
## PrivateIdentifier::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PrivateIdentifier, level: int) -> *Node;
```
## PrivateIdentifier::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PrivateIdentifier) -> int;
```
## PrivateIdentifier::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PrivateIdentifier) -> *Modifier;
```
## PrivateIdentifier::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PrivateIdentifier) -> int;
```
## PrivateIdentifier::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PrivateIdentifier) -> int;
```
## PrivateIdentifier::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PrivateIdentifier, i: int) -> Node;
```
## PrivateIdentifier::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PrivateIdentifier, i: int) -> Decorator;
```
## PrivateIdentifier::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PrivateIdentifier) -> TopLevelDO;
```
## PrivateIdentifier::getName

```rust
pub fn getName(self: PrivateIdentifier) -> string;
```
## PrivateIdentifier::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PrivateIdentifier) -> int;
```
## PrivateIdentifier::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PrivateIdentifier) -> Node;
```
## PrivateIdentifier::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PrivateIdentifier) -> *Node;
```
## PrivateIdentifier::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PrivateIdentifier) -> Node;
```
## PrivateIdentifier::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PrivateIdentifier) -> *Comment;
```
## PrivateIdentifier::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PrivateIdentifier) -> *Node;
```
## PrivateIdentifier::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PrivateIdentifier) -> Symbol;
```
## PrivateIdentifier::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PrivateIdentifier) -> *Decorator;
```
## PrivateIdentifier::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PrivateIdentifier) -> Location;
```
## PrivateIdentifier::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PrivateIdentifier;
```
## PrivateIdentifier::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PrivateIdentifier, i: int) -> Modifier;
```
## PrivateIdentifier::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PrivateIdentifier) -> string;
```
## PrivateIdentifier::is\<T\>

```rust
pub fn is<T>(self: PrivateIdentifier) -> bool;
```
## PrivateIdentifier::to\<T\>

```rust
pub fn to<T>(self: PrivateIdentifier) -> <any>;
```
## PrivateIdentifier::key\_neq

```rust
pub fn key_neq(self: PrivateIdentifier, object: <any>) -> bool;
```
## PrivateIdentifier::key\_eq

```rust
pub fn key_eq(self: PrivateIdentifier, object: <any>) -> bool;
```
## PrivateIdentifier::to\_set

```rust
pub fn to_set(self: PrivateIdentifier) -> *PrivateIdentifier;
```
