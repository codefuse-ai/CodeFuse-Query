# Node

Primary key: `id: int`

```rust
schema Node {
  @primary id: int,
}
```
## Node::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: Node) -> *Decorator;
```
## Node::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: Node) -> Symbol;
```
## Node::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: Node, i: int) -> Modifier;
```
## Node::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: Node) -> string;
```
## Node::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: Node) -> *Comment;
```
## Node::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: Node) -> *Comment;
```
## Node::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: Node) -> *Comment;
```
## Node::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: Node, i: int) -> Decorator;
```
## Node::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: Node) -> TopLevelDO;
```
## Node::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: Node) -> int;
```
## Node::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: Node) -> *Node;
```
## Node::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: Node) -> Node;
```
## Node::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: Node) -> *Node;
```
## Node::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: Node) -> *Modifier;
```
## Node::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: Node) -> int;
```
## Node::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: Node) -> int;
```
## Node::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: Node, level: int) -> *Node;
```
## Node::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: Node) -> *FunctionLikeDeclaration;
```
## Node::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: Node, i: int) -> Node;
```
## Node::getStartLineNumber

```rust
pub fn getStartLineNumber(self: Node) -> int;
```
## Node::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *Node;
```
## Node::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: Node) -> Location;
```
## Node::getEndLineNumber

```rust
pub fn getEndLineNumber(self: Node) -> int;
```
## Node::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: Node) -> string;
```
## Node::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: Node, level: int) -> Node;
```
## Node::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: Node) -> File;
```
## Node::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: Node) -> FunctionLikeDeclaration;
```
## Node::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: Node) -> Node;
```
## Node::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: Node) -> int;
```
## Node::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: Node) -> int;
```
## Node::getIndex

```rust
pub fn getIndex(self: Node) -> int;
```
## Node::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: Node) -> *Node;
```
## Node::is\<T\>

```rust
pub fn is<T>(self: Node) -> bool;
```
## Node::to\<T\>

```rust
pub fn to<T>(self: Node) -> <any>;
```
## Node::key\_neq

```rust
pub fn key_neq(self: Node, object: <any>) -> bool;
```
## Node::key\_eq

```rust
pub fn key_eq(self: Node, object: <any>) -> bool;
```
## Node::to\_set

```rust
pub fn to_set(self: Node) -> *Node;
```
