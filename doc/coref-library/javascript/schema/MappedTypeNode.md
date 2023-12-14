# MappedTypeNode

Primary key: `id: int`

```rust
schema MappedTypeNode {
  @primary id: int,
}
```
## MappedTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: MappedTypeNode) -> Location;
```
## MappedTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: MappedTypeNode) -> Symbol;
```
## MappedTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: MappedTypeNode) -> *Decorator;
```
## MappedTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: MappedTypeNode) -> string;
```
## MappedTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: MappedTypeNode, i: int) -> Modifier;
```
## MappedTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: MappedTypeNode) -> *Comment;
```
## MappedTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: MappedTypeNode) -> *Node;
```
## MappedTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: MappedTypeNode) -> *Node;
```
## MappedTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: MappedTypeNode) -> Node;
```
## MappedTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: MappedTypeNode) -> int;
```
## MappedTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: MappedTypeNode) -> TopLevelDO;
```
## MappedTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: MappedTypeNode, i: int) -> Decorator;
```
## MappedTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: MappedTypeNode) -> int;
```
## MappedTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: MappedTypeNode) -> *Modifier;
```
## MappedTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MappedTypeNode) -> int;
```
## MappedTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: MappedTypeNode, i: int) -> Node;
```
## MappedTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MappedTypeNode) -> int;
```
## MappedTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MappedTypeNode) -> *FunctionLikeDeclaration;
```
## MappedTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: MappedTypeNode, level: int) -> *Node;
```
## MappedTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MappedTypeNode) -> int;
```
## MappedTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: MappedTypeNode) -> string;
```
## MappedTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: MappedTypeNode, level: int) -> Node;
```
## MappedTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: MappedTypeNode) -> File;
```
## MappedTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: MappedTypeNode) -> *Comment;
```
## MappedTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: MappedTypeNode) -> *Comment;
```
## MappedTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: MappedTypeNode) -> Node;
```
## MappedTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: MappedTypeNode) -> FunctionLikeDeclaration;
```
## MappedTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MappedTypeNode) -> int;
```
## MappedTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: MappedTypeNode) -> int;
```
## MappedTypeNode::getIndex

```rust
pub fn getIndex(self: MappedTypeNode) -> int;
```
## MappedTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: MappedTypeNode) -> *Node;
```
## MappedTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MappedTypeNode;
```
## MappedTypeNode::is\<T\>

```rust
pub fn is<T>(self: MappedTypeNode) -> bool;
```
## MappedTypeNode::to\<T\>

```rust
pub fn to<T>(self: MappedTypeNode) -> <any>;
```
## MappedTypeNode::key\_neq

```rust
pub fn key_neq(self: MappedTypeNode, object: <any>) -> bool;
```
## MappedTypeNode::key\_eq

```rust
pub fn key_eq(self: MappedTypeNode, object: <any>) -> bool;
```
## MappedTypeNode::to\_set

```rust
pub fn to_set(self: MappedTypeNode) -> *MappedTypeNode;
```
