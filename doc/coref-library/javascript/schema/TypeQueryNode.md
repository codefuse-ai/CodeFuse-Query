# TypeQueryNode

Primary key: `id: int`

```rust
schema TypeQueryNode {
  @primary id: int,
}
```
## TypeQueryNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TypeQueryNode) -> Location;
```
## TypeQueryNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TypeQueryNode) -> Symbol;
```
## TypeQueryNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TypeQueryNode) -> *Decorator;
```
## TypeQueryNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TypeQueryNode) -> string;
```
## TypeQueryNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TypeQueryNode, i: int) -> Modifier;
```
## TypeQueryNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TypeQueryNode) -> *Comment;
```
## TypeQueryNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TypeQueryNode) -> *Node;
```
## TypeQueryNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TypeQueryNode) -> *Node;
```
## TypeQueryNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TypeQueryNode) -> Node;
```
## TypeQueryNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TypeQueryNode) -> int;
```
## TypeQueryNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TypeQueryNode) -> TopLevelDO;
```
## TypeQueryNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TypeQueryNode, i: int) -> Decorator;
```
## TypeQueryNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TypeQueryNode) -> int;
```
## TypeQueryNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TypeQueryNode) -> *Modifier;
```
## TypeQueryNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeQueryNode) -> int;
```
## TypeQueryNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TypeQueryNode, i: int) -> Node;
```
## TypeQueryNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeQueryNode) -> int;
```
## TypeQueryNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeQueryNode) -> *FunctionLikeDeclaration;
```
## TypeQueryNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TypeQueryNode, level: int) -> *Node;
```
## TypeQueryNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeQueryNode) -> int;
```
## TypeQueryNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TypeQueryNode) -> string;
```
## TypeQueryNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TypeQueryNode, level: int) -> Node;
```
## TypeQueryNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TypeQueryNode) -> File;
```
## TypeQueryNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TypeQueryNode) -> *Comment;
```
## TypeQueryNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TypeQueryNode) -> *Comment;
```
## TypeQueryNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TypeQueryNode) -> Node;
```
## TypeQueryNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TypeQueryNode) -> FunctionLikeDeclaration;
```
## TypeQueryNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeQueryNode) -> int;
```
## TypeQueryNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TypeQueryNode) -> int;
```
## TypeQueryNode::getIndex

```rust
pub fn getIndex(self: TypeQueryNode) -> int;
```
## TypeQueryNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TypeQueryNode) -> *Node;
```
## TypeQueryNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TypeQueryNode;
```
## TypeQueryNode::is\<T\>

```rust
pub fn is<T>(self: TypeQueryNode) -> bool;
```
## TypeQueryNode::to\<T\>

```rust
pub fn to<T>(self: TypeQueryNode) -> <any>;
```
## TypeQueryNode::key\_neq

```rust
pub fn key_neq(self: TypeQueryNode, object: <any>) -> bool;
```
## TypeQueryNode::key\_eq

```rust
pub fn key_eq(self: TypeQueryNode, object: <any>) -> bool;
```
## TypeQueryNode::to\_set

```rust
pub fn to_set(self: TypeQueryNode) -> *TypeQueryNode;
```
