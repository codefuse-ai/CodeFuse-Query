# ParenthesizedTypeNode

Primary key: `id: int`

```rust
schema ParenthesizedTypeNode {
  @primary id: int,
}
```
## ParenthesizedTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ParenthesizedTypeNode) -> Location;
```
## ParenthesizedTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ParenthesizedTypeNode) -> Symbol;
```
## ParenthesizedTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ParenthesizedTypeNode) -> *Decorator;
```
## ParenthesizedTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ParenthesizedTypeNode) -> string;
```
## ParenthesizedTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ParenthesizedTypeNode, i: int) -> Modifier;
```
## ParenthesizedTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ParenthesizedTypeNode) -> *Comment;
```
## ParenthesizedTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ParenthesizedTypeNode) -> *Node;
```
## ParenthesizedTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ParenthesizedTypeNode) -> *Node;
```
## ParenthesizedTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ParenthesizedTypeNode) -> Node;
```
## ParenthesizedTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ParenthesizedTypeNode) -> int;
```
## ParenthesizedTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ParenthesizedTypeNode) -> TopLevelDO;
```
## ParenthesizedTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ParenthesizedTypeNode, i: int) -> Decorator;
```
## ParenthesizedTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ParenthesizedTypeNode) -> int;
```
## ParenthesizedTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ParenthesizedTypeNode) -> *Modifier;
```
## ParenthesizedTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ParenthesizedTypeNode) -> int;
```
## ParenthesizedTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ParenthesizedTypeNode, i: int) -> Node;
```
## ParenthesizedTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ParenthesizedTypeNode) -> int;
```
## ParenthesizedTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ParenthesizedTypeNode) -> *FunctionLikeDeclaration;
```
## ParenthesizedTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ParenthesizedTypeNode, level: int) -> *Node;
```
## ParenthesizedTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ParenthesizedTypeNode) -> int;
```
## ParenthesizedTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ParenthesizedTypeNode) -> string;
```
## ParenthesizedTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ParenthesizedTypeNode, level: int) -> Node;
```
## ParenthesizedTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ParenthesizedTypeNode) -> File;
```
## ParenthesizedTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ParenthesizedTypeNode) -> *Comment;
```
## ParenthesizedTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ParenthesizedTypeNode) -> *Comment;
```
## ParenthesizedTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ParenthesizedTypeNode) -> Node;
```
## ParenthesizedTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ParenthesizedTypeNode) -> FunctionLikeDeclaration;
```
## ParenthesizedTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ParenthesizedTypeNode) -> int;
```
## ParenthesizedTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ParenthesizedTypeNode) -> int;
```
## ParenthesizedTypeNode::getIndex

```rust
pub fn getIndex(self: ParenthesizedTypeNode) -> int;
```
## ParenthesizedTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ParenthesizedTypeNode) -> *Node;
```
## ParenthesizedTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ParenthesizedTypeNode;
```
## ParenthesizedTypeNode::is\<T\>

```rust
pub fn is<T>(self: ParenthesizedTypeNode) -> bool;
```
## ParenthesizedTypeNode::to\<T\>

```rust
pub fn to<T>(self: ParenthesizedTypeNode) -> <any>;
```
## ParenthesizedTypeNode::key\_neq

```rust
pub fn key_neq(self: ParenthesizedTypeNode, object: <any>) -> bool;
```
## ParenthesizedTypeNode::key\_eq

```rust
pub fn key_eq(self: ParenthesizedTypeNode, object: <any>) -> bool;
```
## ParenthesizedTypeNode::to\_set

```rust
pub fn to_set(self: ParenthesizedTypeNode) -> *ParenthesizedTypeNode;
```
