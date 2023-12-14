# ControlFlowNode

Primary key: `id: int`

```rust
schema ControlFlowNode {
  @primary id: int,
}
```
## ControlFlowNode::getSuccessorCount

```rust
/**
     * Get the count of immediate successor nodes.
     */
```
```rust
pub fn getSuccessorCount(self: ControlFlowNode) -> int;
```
## ControlFlowNode::getAPredecessor

```rust
/**
     * Get an immediate predecessor of this node.
     */
```
```rust
pub fn getAPredecessor(self: ControlFlowNode) -> *ControlFlowNode;
```
## ControlFlowNode::getASuccessorRecursive

```rust
/**
     * Gets the successor of this node, and query successors recursively
     */
```
```rust
pub fn getASuccessorRecursive(self: ControlFlowNode) -> *ControlFlowNode;
```
## ControlFlowNode::getBasicBlock

```rust
/**
     * Get the basic block that contains this node.
     */
```
```rust
pub fn getBasicBlock(self: ControlFlowNode) -> BasicBlock;
```
## ControlFlowNode::getASuccessorWithCompletion

```rust
/**
     * Get an immediate successor of this node with the given
     * type of Completion.
     */
```
```rust
pub fn getASuccessorWithCompletion(self: ControlFlowNode, c: Completion) -> *ControlFlowNode;
```
## ControlFlowNode::getText

```rust
/**
     * Get the text of this control flow node.
     */
```
```rust
pub fn getText(self: ControlFlowNode) -> string;
```
## ControlFlowNode::getKindName

```rust
/**
     * Get the kind name of node.
     * If node is ast node, just return ast node kind name; otherwise
     * return node name as CfgEntryNode or CfgExitNode.
     */
```
```rust
pub fn getKindName(self: ControlFlowNode) -> string;
```
## ControlFlowNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ControlFlowNode;
```
## ControlFlowNode::isAstNode

```rust
pub fn isAstNode(self: ControlFlowNode) -> bool;
```
## ControlFlowNode::getLocation

```rust
/**
     * Get the location of this control flow node.
     */
```
```rust
pub fn getLocation(self: ControlFlowNode) -> Location;
```
## ControlFlowNode::getEnclosingFunction

```rust
/**
     * Get the enclosing function of node.
     * CfgEntryNode or CfgExitNode return belongs to function.
     */
```
```rust
pub fn getEnclosingFunction(self: ControlFlowNode) -> FunctionLikeDeclaration;
```
## ControlFlowNode::isExitNode

```rust
pub fn isExitNode(self: ControlFlowNode) -> bool;
```
## ControlFlowNode::getASuccessor

```rust
/**
     * Get an immediate successor of this node.
     */
```
```rust
pub fn getASuccessor(self: ControlFlowNode) -> *ControlFlowNode;
```
## ControlFlowNode::isEntryNode

```rust
pub fn isEntryNode(self: ControlFlowNode) -> bool;
```
## ControlFlowNode::getRelativePath

```rust
/**
     * Get the relative path of this control flow node.
     */
```
```rust
pub fn getRelativePath(self: ControlFlowNode) -> string;
```
## ControlFlowNode::getPredecessorCount

```rust
/**
     * Get the count of immediate predecessor nodes/
     */
```
```rust
pub fn getPredecessorCount(self: ControlFlowNode) -> int;
```
## ControlFlowNode::getFile

```rust
/**
     * Get the file of this control flow node.
     */
```
```rust
pub fn getFile(self: ControlFlowNode) -> File;
```
## ControlFlowNode::isSyntheticNode

```rust
pub fn isSyntheticNode(self: ControlFlowNode) -> bool;
```
## ControlFlowNode::is\<T\>

```rust
pub fn is<T>(self: ControlFlowNode) -> bool;
```
## ControlFlowNode::to\<T\>

```rust
pub fn to<T>(self: ControlFlowNode) -> <any>;
```
## ControlFlowNode::key\_neq

```rust
pub fn key_neq(self: ControlFlowNode, object: <any>) -> bool;
```
## ControlFlowNode::key\_eq

```rust
pub fn key_eq(self: ControlFlowNode, object: <any>) -> bool;
```
## ControlFlowNode::to\_set

```rust
pub fn to_set(self: ControlFlowNode) -> *ControlFlowNode;
```
