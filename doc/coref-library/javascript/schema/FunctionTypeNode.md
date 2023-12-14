# FunctionTypeNode

Primary key: `id: int`

```rust
schema FunctionTypeNode {
  @primary id: int,
}
```
## FunctionTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: FunctionTypeNode) -> Location;
```
## FunctionTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: FunctionTypeNode) -> Symbol;
```
## FunctionTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: FunctionTypeNode) -> *Decorator;
```
## FunctionTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: FunctionTypeNode) -> string;
```
## FunctionTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: FunctionTypeNode, i: int) -> Modifier;
```
## FunctionTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: FunctionTypeNode) -> *Comment;
```
## FunctionTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: FunctionTypeNode) -> *Node;
```
## FunctionTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: FunctionTypeNode) -> *Node;
```
## FunctionTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: FunctionTypeNode) -> Node;
```
## FunctionTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: FunctionTypeNode) -> int;
```
## FunctionTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: FunctionTypeNode) -> TopLevelDO;
```
## FunctionTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: FunctionTypeNode, i: int) -> Decorator;
```
## FunctionTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: FunctionTypeNode) -> int;
```
## FunctionTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: FunctionTypeNode) -> *Modifier;
```
## FunctionTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: FunctionTypeNode) -> int;
```
## FunctionTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: FunctionTypeNode, i: int) -> Node;
```
## FunctionTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: FunctionTypeNode) -> int;
```
## FunctionTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: FunctionTypeNode) -> *FunctionLikeDeclaration;
```
## FunctionTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: FunctionTypeNode, level: int) -> *Node;
```
## FunctionTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: FunctionTypeNode) -> int;
```
## FunctionTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: FunctionTypeNode) -> string;
```
## FunctionTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: FunctionTypeNode, level: int) -> Node;
```
## FunctionTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: FunctionTypeNode) -> File;
```
## FunctionTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: FunctionTypeNode) -> *Comment;
```
## FunctionTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: FunctionTypeNode) -> *Comment;
```
## FunctionTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: FunctionTypeNode) -> Node;
```
## FunctionTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: FunctionTypeNode) -> FunctionLikeDeclaration;
```
## FunctionTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: FunctionTypeNode) -> int;
```
## FunctionTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: FunctionTypeNode) -> int;
```
## FunctionTypeNode::getIndex

```rust
pub fn getIndex(self: FunctionTypeNode) -> int;
```
## FunctionTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: FunctionTypeNode) -> *Node;
```
## FunctionTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *FunctionTypeNode;
```
## FunctionTypeNode::is\<T\>

```rust
pub fn is<T>(self: FunctionTypeNode) -> bool;
```
## FunctionTypeNode::to\<T\>

```rust
pub fn to<T>(self: FunctionTypeNode) -> <any>;
```
## FunctionTypeNode::key\_neq

```rust
pub fn key_neq(self: FunctionTypeNode, object: <any>) -> bool;
```
## FunctionTypeNode::key\_eq

```rust
pub fn key_eq(self: FunctionTypeNode, object: <any>) -> bool;
```
## FunctionTypeNode::to\_set

```rust
pub fn to_set(self: FunctionTypeNode) -> *FunctionTypeNode;
```
