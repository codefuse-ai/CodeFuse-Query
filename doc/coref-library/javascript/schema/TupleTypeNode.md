# TupleTypeNode

Primary key: `id: int`

```rust
schema TupleTypeNode {
  @primary id: int,
}
```
## TupleTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TupleTypeNode) -> Location;
```
## TupleTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TupleTypeNode) -> Symbol;
```
## TupleTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TupleTypeNode) -> *Decorator;
```
## TupleTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TupleTypeNode) -> string;
```
## TupleTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TupleTypeNode, i: int) -> Modifier;
```
## TupleTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TupleTypeNode) -> *Comment;
```
## TupleTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TupleTypeNode) -> *Node;
```
## TupleTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TupleTypeNode) -> *Node;
```
## TupleTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TupleTypeNode) -> Node;
```
## TupleTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TupleTypeNode) -> int;
```
## TupleTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TupleTypeNode) -> TopLevelDO;
```
## TupleTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TupleTypeNode, i: int) -> Decorator;
```
## TupleTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TupleTypeNode) -> int;
```
## TupleTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TupleTypeNode) -> *Modifier;
```
## TupleTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TupleTypeNode) -> int;
```
## TupleTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TupleTypeNode, i: int) -> Node;
```
## TupleTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TupleTypeNode) -> int;
```
## TupleTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TupleTypeNode) -> *FunctionLikeDeclaration;
```
## TupleTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TupleTypeNode, level: int) -> *Node;
```
## TupleTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TupleTypeNode) -> int;
```
## TupleTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TupleTypeNode) -> string;
```
## TupleTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TupleTypeNode, level: int) -> Node;
```
## TupleTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TupleTypeNode) -> File;
```
## TupleTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TupleTypeNode) -> *Comment;
```
## TupleTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TupleTypeNode) -> *Comment;
```
## TupleTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TupleTypeNode) -> Node;
```
## TupleTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TupleTypeNode) -> FunctionLikeDeclaration;
```
## TupleTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TupleTypeNode) -> int;
```
## TupleTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TupleTypeNode) -> int;
```
## TupleTypeNode::getIndex

```rust
pub fn getIndex(self: TupleTypeNode) -> int;
```
## TupleTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TupleTypeNode) -> *Node;
```
## TupleTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TupleTypeNode;
```
## TupleTypeNode::is\<T\>

```rust
pub fn is<T>(self: TupleTypeNode) -> bool;
```
## TupleTypeNode::to\<T\>

```rust
pub fn to<T>(self: TupleTypeNode) -> <any>;
```
## TupleTypeNode::key\_neq

```rust
pub fn key_neq(self: TupleTypeNode, object: <any>) -> bool;
```
## TupleTypeNode::key\_eq

```rust
pub fn key_eq(self: TupleTypeNode, object: <any>) -> bool;
```
## TupleTypeNode::to\_set

```rust
pub fn to_set(self: TupleTypeNode) -> *TupleTypeNode;
```
