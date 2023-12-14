# PropertyAssignment

Primary key: `id: int`

```rust
schema PropertyAssignment {
  @primary id: int,
}
```
## PropertyAssignment::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PropertyAssignment) -> *Comment;
```
## PropertyAssignment::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PropertyAssignment) -> *Node;
```
## PropertyAssignment::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PropertyAssignment) -> Location;
```
## PropertyAssignment::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PropertyAssignment) -> Symbol;
```
## PropertyAssignment::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PropertyAssignment) -> *Decorator;
```
## PropertyAssignment::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PropertyAssignment) -> string;
```
## PropertyAssignment::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PropertyAssignment, i: int) -> Modifier;
```
## PropertyAssignment::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PropertyAssignment) -> *Comment;
```
## PropertyAssignment::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PropertyAssignment) -> *Comment;
```
## PropertyAssignment::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PropertyAssignment, i: int) -> Decorator;
```
## PropertyAssignment::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PropertyAssignment) -> TopLevelDO;
```
## PropertyAssignment::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PropertyAssignment, i: int) -> Node;
```
## PropertyAssignment::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PropertyAssignment) -> int;
```
## PropertyAssignment::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PropertyAssignment) -> int;
```
## PropertyAssignment::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PropertyAssignment) -> int;
```
## PropertyAssignment::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PropertyAssignment) -> *Modifier;
```
## PropertyAssignment::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PropertyAssignment) -> *FunctionLikeDeclaration;
```
## PropertyAssignment::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PropertyAssignment, level: int) -> *Node;
```
## PropertyAssignment::getInitializer

```rust
pub fn getInitializer(self: PropertyAssignment) -> Expression;
```
## PropertyAssignment::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PropertyAssignment) -> int;
```
## PropertyAssignment::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PropertyAssignment) -> string;
```
## PropertyAssignment::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PropertyAssignment, level: int) -> Node;
```
## PropertyAssignment::getNameNode

```rust
pub fn getNameNode(self: PropertyAssignment) -> PropertyName;
```
## PropertyAssignment::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PropertyAssignment) -> File;
```
## PropertyAssignment::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PropertyAssignment) -> FunctionLikeDeclaration;
```
## PropertyAssignment::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PropertyAssignment) -> *Node;
```
## PropertyAssignment::getParent

```rust
pub fn getParent(self: PropertyAssignment) -> ObjectLiteralExpression;
```
## PropertyAssignment::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PropertyAssignment) -> int;
```
## PropertyAssignment::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PropertyAssignment) -> Node;
```
## PropertyAssignment::getIndex

```rust
pub fn getIndex(self: PropertyAssignment) -> int;
```
## PropertyAssignment::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PropertyAssignment) -> int;
```
## PropertyAssignment::getName

```rust
pub fn getName(self: PropertyAssignment) -> string;
```
## PropertyAssignment::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PropertyAssignment) -> *Node;
```
## PropertyAssignment::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PropertyAssignment) -> int;
```
## PropertyAssignment::getPropertyName

```rust
pub fn getPropertyName(self: PropertyAssignment) -> PropertyName;
```
## PropertyAssignment::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PropertyAssignment;
```
## PropertyAssignment::is\<T\>

```rust
pub fn is<T>(self: PropertyAssignment) -> bool;
```
## PropertyAssignment::to\<T\>

```rust
pub fn to<T>(self: PropertyAssignment) -> <any>;
```
## PropertyAssignment::key\_neq

```rust
pub fn key_neq(self: PropertyAssignment, object: <any>) -> bool;
```
## PropertyAssignment::key\_eq

```rust
pub fn key_eq(self: PropertyAssignment, object: <any>) -> bool;
```
## PropertyAssignment::to\_set

```rust
pub fn to_set(self: PropertyAssignment) -> *PropertyAssignment;
```
