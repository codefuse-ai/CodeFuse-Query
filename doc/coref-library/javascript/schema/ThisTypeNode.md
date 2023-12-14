# ThisTypeNode

Primary key: `id: int`

```rust
schema ThisTypeNode {
  @primary id: int,
}
```
## ThisTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ThisTypeNode) -> Location;
```
## ThisTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ThisTypeNode) -> Symbol;
```
## ThisTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ThisTypeNode) -> *Decorator;
```
## ThisTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ThisTypeNode) -> string;
```
## ThisTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ThisTypeNode, i: int) -> Modifier;
```
## ThisTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ThisTypeNode) -> *Comment;
```
## ThisTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ThisTypeNode) -> *Node;
```
## ThisTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ThisTypeNode) -> *Node;
```
## ThisTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ThisTypeNode) -> Node;
```
## ThisTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ThisTypeNode) -> int;
```
## ThisTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ThisTypeNode) -> TopLevelDO;
```
## ThisTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ThisTypeNode, i: int) -> Decorator;
```
## ThisTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ThisTypeNode) -> int;
```
## ThisTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ThisTypeNode) -> *Modifier;
```
## ThisTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ThisTypeNode) -> int;
```
## ThisTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ThisTypeNode, i: int) -> Node;
```
## ThisTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ThisTypeNode) -> int;
```
## ThisTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ThisTypeNode) -> *FunctionLikeDeclaration;
```
## ThisTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ThisTypeNode, level: int) -> *Node;
```
## ThisTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ThisTypeNode) -> int;
```
## ThisTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ThisTypeNode) -> string;
```
## ThisTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ThisTypeNode, level: int) -> Node;
```
## ThisTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ThisTypeNode) -> File;
```
## ThisTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ThisTypeNode) -> *Comment;
```
## ThisTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ThisTypeNode) -> *Comment;
```
## ThisTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ThisTypeNode) -> Node;
```
## ThisTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ThisTypeNode) -> FunctionLikeDeclaration;
```
## ThisTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ThisTypeNode) -> int;
```
## ThisTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ThisTypeNode) -> int;
```
## ThisTypeNode::getIndex

```rust
pub fn getIndex(self: ThisTypeNode) -> int;
```
## ThisTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ThisTypeNode) -> *Node;
```
## ThisTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ThisTypeNode;
```
## ThisTypeNode::is\<T\>

```rust
pub fn is<T>(self: ThisTypeNode) -> bool;
```
## ThisTypeNode::to\<T\>

```rust
pub fn to<T>(self: ThisTypeNode) -> <any>;
```
## ThisTypeNode::key\_neq

```rust
pub fn key_neq(self: ThisTypeNode, object: <any>) -> bool;
```
## ThisTypeNode::key\_eq

```rust
pub fn key_eq(self: ThisTypeNode, object: <any>) -> bool;
```
## ThisTypeNode::to\_set

```rust
pub fn to_set(self: ThisTypeNode) -> *ThisTypeNode;
```
