# DataFlowNode

Primary key: `id: int`

```rust
schema DataFlowNode {
  @primary id: int,
}
```
## DataFlowNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: DataFlowNode) -> *Node;
```
## DataFlowNode::getIndex

```rust
pub fn getIndex(self: DataFlowNode) -> int;
```
## DataFlowNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: DataFlowNode) -> int;
```
## DataFlowNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DataFlowNode) -> int;
```
## DataFlowNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: DataFlowNode) -> Node;
```
## DataFlowNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: DataFlowNode) -> FunctionLikeDeclaration;
```
## DataFlowNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: DataFlowNode) -> File;
```
## DataFlowNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: DataFlowNode, level: int) -> Node;
```
## DataFlowNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: DataFlowNode) -> string;
```
## DataFlowNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DataFlowNode) -> int;
```
## DataFlowNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: DataFlowNode) -> Location;
```
## DataFlowNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: DataFlowNode) -> int;
```
## DataFlowNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: DataFlowNode) -> *Modifier;
```
## DataFlowNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DataFlowNode) -> int;
```
## DataFlowNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DataFlowNode) -> int;
```
## DataFlowNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: DataFlowNode, i: int) -> Node;
```
## DataFlowNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: DataFlowNode, level: int) -> *Node;
```
## DataFlowNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DataFlowNode) -> *FunctionLikeDeclaration;
```
## DataFlowNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: DataFlowNode) -> int;
```
## DataFlowNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: DataFlowNode, i: int) -> Decorator;
```
## DataFlowNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: DataFlowNode) -> TopLevelDO;
```
## DataFlowNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: DataFlowNode) -> *Comment;
```
## DataFlowNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: DataFlowNode) -> *Comment;
```
## DataFlowNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: DataFlowNode) -> Node;
```
## DataFlowNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: DataFlowNode) -> *Node;
```
## DataFlowNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: DataFlowNode) -> *Node;
```
## DataFlowNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: DataFlowNode) -> *Comment;
```
## DataFlowNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: DataFlowNode, i: int) -> Modifier;
```
## DataFlowNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: DataFlowNode) -> string;
```
## DataFlowNode::getAPredecessor

```rust
pub fn getAPredecessor(self: DataFlowNode) -> *DataFlowNode;
```
## DataFlowNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: DataFlowNode) -> Symbol;
```
## DataFlowNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: DataFlowNode) -> *Decorator;
```
## DataFlowNode::getASuccessor

```rust
pub fn getASuccessor(self: DataFlowNode) -> *DataFlowNode;
```
## DataFlowNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *DataFlowNode;
```
## DataFlowNode::is\<T\>

```rust
pub fn is<T>(self: DataFlowNode) -> bool;
```
## DataFlowNode::to\<T\>

```rust
pub fn to<T>(self: DataFlowNode) -> <any>;
```
## DataFlowNode::key\_neq

```rust
pub fn key_neq(self: DataFlowNode, object: <any>) -> bool;
```
## DataFlowNode::key\_eq

```rust
pub fn key_eq(self: DataFlowNode, object: <any>) -> bool;
```
## DataFlowNode::to\_set

```rust
pub fn to_set(self: DataFlowNode) -> *DataFlowNode;
```
