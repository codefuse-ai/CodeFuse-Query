# ArrayTypeNode

Primary key: `id: int`

```rust
schema ArrayTypeNode {
  @primary id: int,
}
```
## ArrayTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ArrayTypeNode) -> Location;
```
## ArrayTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ArrayTypeNode) -> Symbol;
```
## ArrayTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ArrayTypeNode) -> *Decorator;
```
## ArrayTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ArrayTypeNode) -> string;
```
## ArrayTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ArrayTypeNode, i: int) -> Modifier;
```
## ArrayTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ArrayTypeNode) -> *Comment;
```
## ArrayTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ArrayTypeNode) -> *Node;
```
## ArrayTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ArrayTypeNode) -> *Node;
```
## ArrayTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ArrayTypeNode) -> Node;
```
## ArrayTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ArrayTypeNode) -> int;
```
## ArrayTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ArrayTypeNode) -> TopLevelDO;
```
## ArrayTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ArrayTypeNode, i: int) -> Decorator;
```
## ArrayTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ArrayTypeNode) -> int;
```
## ArrayTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ArrayTypeNode) -> *Modifier;
```
## ArrayTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ArrayTypeNode) -> int;
```
## ArrayTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ArrayTypeNode, i: int) -> Node;
```
## ArrayTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ArrayTypeNode) -> int;
```
## ArrayTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ArrayTypeNode) -> *FunctionLikeDeclaration;
```
## ArrayTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ArrayTypeNode, level: int) -> *Node;
```
## ArrayTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ArrayTypeNode) -> int;
```
## ArrayTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ArrayTypeNode) -> string;
```
## ArrayTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ArrayTypeNode, level: int) -> Node;
```
## ArrayTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ArrayTypeNode) -> File;
```
## ArrayTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ArrayTypeNode) -> *Comment;
```
## ArrayTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ArrayTypeNode) -> *Comment;
```
## ArrayTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ArrayTypeNode) -> Node;
```
## ArrayTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ArrayTypeNode) -> FunctionLikeDeclaration;
```
## ArrayTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ArrayTypeNode) -> int;
```
## ArrayTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ArrayTypeNode) -> int;
```
## ArrayTypeNode::getIndex

```rust
pub fn getIndex(self: ArrayTypeNode) -> int;
```
## ArrayTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ArrayTypeNode) -> *Node;
```
## ArrayTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ArrayTypeNode;
```
## ArrayTypeNode::is\<T\>

```rust
pub fn is<T>(self: ArrayTypeNode) -> bool;
```
## ArrayTypeNode::to\<T\>

```rust
pub fn to<T>(self: ArrayTypeNode) -> <any>;
```
## ArrayTypeNode::key\_neq

```rust
pub fn key_neq(self: ArrayTypeNode, object: <any>) -> bool;
```
## ArrayTypeNode::key\_eq

```rust
pub fn key_eq(self: ArrayTypeNode, object: <any>) -> bool;
```
## ArrayTypeNode::to\_set

```rust
pub fn to_set(self: ArrayTypeNode) -> *ArrayTypeNode;
```
