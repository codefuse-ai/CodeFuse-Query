# ShorthandPropertyAssignment

Primary key: `id: int`

```rust
schema ShorthandPropertyAssignment {
  @primary id: int,
}
```
## ShorthandPropertyAssignment::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ShorthandPropertyAssignment) -> *Comment;
```
## ShorthandPropertyAssignment::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ShorthandPropertyAssignment) -> *Node;
```
## ShorthandPropertyAssignment::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ShorthandPropertyAssignment) -> Location;
```
## ShorthandPropertyAssignment::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ShorthandPropertyAssignment) -> Symbol;
```
## ShorthandPropertyAssignment::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ShorthandPropertyAssignment) -> *Decorator;
```
## ShorthandPropertyAssignment::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ShorthandPropertyAssignment) -> string;
```
## ShorthandPropertyAssignment::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ShorthandPropertyAssignment, i: int) -> Modifier;
```
## ShorthandPropertyAssignment::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ShorthandPropertyAssignment) -> *Comment;
```
## ShorthandPropertyAssignment::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ShorthandPropertyAssignment) -> *Comment;
```
## ShorthandPropertyAssignment::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ShorthandPropertyAssignment, i: int) -> Decorator;
```
## ShorthandPropertyAssignment::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ShorthandPropertyAssignment) -> TopLevelDO;
```
## ShorthandPropertyAssignment::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ShorthandPropertyAssignment, i: int) -> Node;
```
## ShorthandPropertyAssignment::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ShorthandPropertyAssignment) -> int;
```
## ShorthandPropertyAssignment::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ShorthandPropertyAssignment) -> int;
```
## ShorthandPropertyAssignment::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ShorthandPropertyAssignment) -> int;
```
## ShorthandPropertyAssignment::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ShorthandPropertyAssignment) -> *Modifier;
```
## ShorthandPropertyAssignment::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ShorthandPropertyAssignment) -> *FunctionLikeDeclaration;
```
## ShorthandPropertyAssignment::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ShorthandPropertyAssignment, level: int) -> *Node;
```
## ShorthandPropertyAssignment::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ShorthandPropertyAssignment) -> int;
```
## ShorthandPropertyAssignment::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ShorthandPropertyAssignment) -> string;
```
## ShorthandPropertyAssignment::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ShorthandPropertyAssignment, level: int) -> Node;
```
## ShorthandPropertyAssignment::getNameNode

```rust
pub fn getNameNode(self: ShorthandPropertyAssignment) -> Identifier;
```
## ShorthandPropertyAssignment::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ShorthandPropertyAssignment) -> File;
```
## ShorthandPropertyAssignment::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ShorthandPropertyAssignment) -> FunctionLikeDeclaration;
```
## ShorthandPropertyAssignment::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ShorthandPropertyAssignment) -> *Node;
```
## ShorthandPropertyAssignment::getParent

```rust
pub fn getParent(self: ShorthandPropertyAssignment) -> ObjectLiteralExpression;
```
## ShorthandPropertyAssignment::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ShorthandPropertyAssignment) -> Node;
```
## ShorthandPropertyAssignment::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ShorthandPropertyAssignment) -> int;
```
## ShorthandPropertyAssignment::getIdentifier

```rust
pub fn getIdentifier(self: ShorthandPropertyAssignment) -> Identifier;
```
## ShorthandPropertyAssignment::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ShorthandPropertyAssignment) -> int;
```
## ShorthandPropertyAssignment::getIndex

```rust
pub fn getIndex(self: ShorthandPropertyAssignment) -> int;
```
## ShorthandPropertyAssignment::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ShorthandPropertyAssignment) -> int;
```
## ShorthandPropertyAssignment::getName

```rust
pub fn getName(self: ShorthandPropertyAssignment) -> string;
```
## ShorthandPropertyAssignment::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ShorthandPropertyAssignment) -> *Node;
```
## ShorthandPropertyAssignment::getValueSymbol

```rust
/**
     * Gets the value symbol associated with this shorthand property assignment.
     */
```
```rust
pub fn getValueSymbol(self: ShorthandPropertyAssignment) -> Symbol;
```
## ShorthandPropertyAssignment::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ShorthandPropertyAssignment;
```
## ShorthandPropertyAssignment::is\<T\>

```rust
pub fn is<T>(self: ShorthandPropertyAssignment) -> bool;
```
## ShorthandPropertyAssignment::to\<T\>

```rust
pub fn to<T>(self: ShorthandPropertyAssignment) -> <any>;
```
## ShorthandPropertyAssignment::key\_neq

```rust
pub fn key_neq(self: ShorthandPropertyAssignment, object: <any>) -> bool;
```
## ShorthandPropertyAssignment::key\_eq

```rust
pub fn key_eq(self: ShorthandPropertyAssignment, object: <any>) -> bool;
```
## ShorthandPropertyAssignment::to\_set

```rust
pub fn to_set(self: ShorthandPropertyAssignment) -> *ShorthandPropertyAssignment;
```
