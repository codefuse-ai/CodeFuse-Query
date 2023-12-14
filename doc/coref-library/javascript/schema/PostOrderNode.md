# PostOrderNode

Primary key: `id: int`

```rust
schema PostOrderNode {
  @primary id: int,
}
```
## PostOrderNode::isSyntheticNode

```rust
pub fn isSyntheticNode(self: PostOrderNode) -> bool;
```
## PostOrderNode::getBasicBlock

```rust
/**
     * Get the basic block that contains this node.
     */
```
```rust
pub fn getBasicBlock(self: PostOrderNode) -> BasicBlock;
```
## PostOrderNode::getFile

```rust
/**
     * Get the file of this control flow node.
     */
```
```rust
pub fn getFile(self: PostOrderNode) -> File;
```
## PostOrderNode::getPredecessorCount

```rust
/**
     * Get the count of immediate predecessor nodes/
     */
```
```rust
pub fn getPredecessorCount(self: PostOrderNode) -> int;
```
## PostOrderNode::mayCompleteNormally

```rust
/**
     * Holds whether this node can finish with a normalCompletion.
     */
```
```rust
pub fn mayCompleteNormally(self: PostOrderNode) -> bool;
```
## PostOrderNode::getRelativePath

```rust
/**
     * Get the relative path of this control flow node.
     */
```
```rust
pub fn getRelativePath(self: PostOrderNode) -> string;
```
## PostOrderNode::isEntryNode

```rust
pub fn isEntryNode(self: PostOrderNode) -> bool;
```
## PostOrderNode::firstChild

```rust
/**
     * Gets the first child of this node.
     */
```
```rust
pub fn firstChild(self: PostOrderNode) -> ControlFlowNode;
```
## PostOrderNode::getASuccessorRecursive

```rust
/**
     * Gets the successor of this node, and query successors recursively
     */
```
```rust
pub fn getASuccessorRecursive(self: PostOrderNode) -> *ControlFlowNode;
```
## PostOrderNode::getASuccessor

```rust
/**
     * Get an immediate successor of this node.
     */
```
```rust
pub fn getASuccessor(self: PostOrderNode) -> *ControlFlowNode;
```
## PostOrderNode::isExitNode

```rust
pub fn isExitNode(self: PostOrderNode) -> bool;
```
## PostOrderNode::isLeafNode

```rust
/**
     * Hold whether this node is leaf node.
     */
```
```rust
pub fn isLeafNode(self: PostOrderNode) -> bool;
```
## PostOrderNode::getEnclosingFunction

```rust
/**
     * Get the enclosing function of node.
     * CfgEntryNode or CfgExitNode return belongs to function.
     */
```
```rust
pub fn getEnclosingFunction(self: PostOrderNode) -> FunctionLikeDeclaration;
```
## PostOrderNode::getKindName

```rust
/**
     * Get the kind name of node.
     * If node is ast node, just return ast node kind name; otherwise
     * return node name as CfgEntryNode or CfgExitNode.
     */
```
```rust
pub fn getKindName(self: PostOrderNode) -> string;
```
## PostOrderNode::getAPredecessor

```rust
/**
     * Get an immediate predecessor of this node.
     */
```
```rust
pub fn getAPredecessor(self: PostOrderNode) -> *ControlFlowNode;
```
## PostOrderNode::getText

```rust
/**
     * Get the text of this control flow node.
     */
```
```rust
pub fn getText(self: PostOrderNode) -> string;
```
## PostOrderNode::getASuccessorWithCompletion

```rust
/**
     * Get an immediate successor of this node with the given
     * type of Completion.
     */
```
```rust
pub fn getASuccessorWithCompletion(self: PostOrderNode, c: Completion) -> *ControlFlowNode;
```
## PostOrderNode::getSuccessorCount

```rust
/**
     * Get the count of immediate successor nodes.
     */
```
```rust
pub fn getSuccessorCount(self: PostOrderNode) -> int;
```
## PostOrderNode::getChildCount

```rust
/**
     * Gets the count of the children.
     */
```
```rust
pub fn getChildCount(self: PostOrderNode) -> int;
```
## PostOrderNode::getChildNode

```rust
/**
     * Gets child node with index, start from 0.
     */
```
```rust
pub fn getChildNode(self: PostOrderNode, index: int) -> ControlFlowNode;
```
## PostOrderNode::getAllChild

```rust
pub fn getAllChild(self: PostOrderNode) -> *ControlFlowNode;
```
## PostOrderNode::getLocation

```rust
/**
     * Get the location of this control flow node.
     */
```
```rust
pub fn getLocation(self: PostOrderNode) -> Location;
```
## PostOrderNode::isAstNode

```rust
pub fn isAstNode(self: PostOrderNode) -> bool;
```
## PostOrderNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PostOrderNode;
```
## PostOrderNode::is\<T\>

```rust
pub fn is<T>(self: PostOrderNode) -> bool;
```
## PostOrderNode::to\<T\>

```rust
pub fn to<T>(self: PostOrderNode) -> <any>;
```
## PostOrderNode::key\_neq

```rust
pub fn key_neq(self: PostOrderNode, object: <any>) -> bool;
```
## PostOrderNode::key\_eq

```rust
pub fn key_eq(self: PostOrderNode, object: <any>) -> bool;
```
## PostOrderNode::to\_set

```rust
pub fn to_set(self: PostOrderNode) -> *PostOrderNode;
```
