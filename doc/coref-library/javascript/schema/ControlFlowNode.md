# ControlFlowNode

Primary key: `id: int`

```rust
schema ControlFlowNode {
  @primary id: int,
}
```
## ControlFlowNode::getSuccessorCount

```java
/**
* Get the count of immediate successor nodes.
*/
```
```rust
pub fn getSuccessorCount(self: ControlFlowNode) -> int;
```
## ControlFlowNode::getAPredecessor

```java
/**
* Get an immediate predecessor of this node.
*/
```
```rust
pub fn getAPredecessor(self: ControlFlowNode) -> *ControlFlowNode;
```
## ControlFlowNode::getASuccessorRecursive

```java
/**
* Gets the successor of this node, and query successors recursively
*/
```
```rust
pub fn getASuccessorRecursive(self: ControlFlowNode) -> *ControlFlowNode;
```
## ControlFlowNode::getBasicBlock

```java
/**
* Get the basic block that contains this node.
*/
```
```rust
pub fn getBasicBlock(self: ControlFlowNode) -> BasicBlock;
```
## ControlFlowNode::getASuccessorWithCompletion

```java
/**
* Get an immediate successor of this node with the given
* type of Completion.
*/
```
```rust
pub fn getASuccessorWithCompletion(self: ControlFlowNode, c: Completion) -> *ControlFlowNode;
```
## ControlFlowNode::getText

```java
/**
* Get the text of this control flow node.
*/
```
```rust
pub fn getText(self: ControlFlowNode) -> string;
```
## ControlFlowNode::getKindName

```java
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

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ControlFlowNode;
```
## ControlFlowNode::isAstNode

```rust
pub fn isAstNode(self: ControlFlowNode) -> bool;
```
## ControlFlowNode::getLocation

```java
/**
* Get the location of this control flow node.
*/
```
```rust
pub fn getLocation(self: ControlFlowNode) -> Location;
```
## ControlFlowNode::getEnclosingFunction

```java
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

```java
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

```java
/**
* Get the relative path of this control flow node.
*/
```
```rust
pub fn getRelativePath(self: ControlFlowNode) -> string;
```
## ControlFlowNode::getPredecessorCount

```java
/**
* Get the count of immediate predecessor nodes/
*/
```
```rust
pub fn getPredecessorCount(self: ControlFlowNode) -> int;
```
## ControlFlowNode::getFile

```java
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
