# TypeNode

Primary key: `id: int`

```rust
schema TypeNode {
  @primary id: int,
}
```
## TypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TypeNode) -> *Node;
```
## TypeNode::getIndex

```rust
pub fn getIndex(self: TypeNode) -> int;
```
## TypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TypeNode) -> int;
```
## TypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeNode) -> int;
```
## TypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TypeNode) -> Node;
```
## TypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TypeNode) -> FunctionLikeDeclaration;
```
## TypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TypeNode) -> File;
```
## TypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TypeNode, level: int) -> Node;
```
## TypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TypeNode) -> string;
```
## TypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeNode) -> int;
```
## TypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeNode) -> *FunctionLikeDeclaration;
```
## TypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TypeNode, level: int) -> *Node;
```
## TypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TypeNode) -> int;
```
## TypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TypeNode) -> *Modifier;
```
## TypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeNode) -> int;
```
## TypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeNode) -> int;
```
## TypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TypeNode, i: int) -> Node;
```
## TypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TypeNode, i: int) -> Decorator;
```
## TypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TypeNode) -> TopLevelDO;
```
## TypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TypeNode) -> int;
```
## TypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TypeNode) -> *Comment;
```
## TypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TypeNode) -> *Comment;
```
## TypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TypeNode) -> Node;
```
## TypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TypeNode) -> *Node;
```
## TypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TypeNode) -> *Node;
```
## TypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TypeNode) -> *Comment;
```
## TypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TypeNode, i: int) -> Modifier;
```
## TypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TypeNode) -> string;
```
## TypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TypeNode) -> *Decorator;
```
## TypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TypeNode) -> Symbol;
```
## TypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TypeNode) -> Location;
```
## TypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TypeNode;
```
## TypeNode::is\<T\>

```rust
pub fn is<T>(self: TypeNode) -> bool;
```
## TypeNode::to\<T\>

```rust
pub fn to<T>(self: TypeNode) -> <any>;
```
## TypeNode::key\_neq

```rust
pub fn key_neq(self: TypeNode, object: <any>) -> bool;
```
## TypeNode::key\_eq

```rust
pub fn key_eq(self: TypeNode, object: <any>) -> bool;
```
## TypeNode::to\_set

```rust
pub fn to_set(self: TypeNode) -> *TypeNode;
```
