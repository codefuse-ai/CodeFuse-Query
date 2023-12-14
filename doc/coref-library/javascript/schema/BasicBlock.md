# BasicBlock

Inherit from [ControlFlowNode](./ControlFlowNode.md)

Primary key: `id: int`

```rust
schema BasicBlock extends ControlFlowNode {
  @primary id: int,
}
```
## BasicBlock::isSyntheticNode

```rust
pub fn isSyntheticNode(self: BasicBlock) -> bool;
```
## BasicBlock::getPredecessorCount

```java
/**
* Get the count of immediate predecessor nodes/
*/
```
```rust
pub fn getPredecessorCount(self: BasicBlock) -> int;
```
## BasicBlock::isExitNode

```rust
pub fn isExitNode(self: BasicBlock) -> bool;
```
## BasicBlock::getEnclosingFunction

```java
/**
* Get the enclosing function of node.
* CfgEntryNode or CfgExitNode return belongs to function.
*/
```
```rust
pub fn getEnclosingFunction(self: BasicBlock) -> FunctionLikeDeclaration;
```
## BasicBlock::getASuccessor

```java
/**
* Get an immediate successor of this node.
*/
```
```rust
pub fn getASuccessor(self: BasicBlock) -> *ControlFlowNode;
```
## BasicBlock::getASuccessorRecursive

```java
/**
* Gets the successor of this node, and query successors recursively
*/
```
```rust
pub fn getASuccessorRecursive(self: BasicBlock) -> *ControlFlowNode;
```
## BasicBlock::getAPredecessor

```java
/**
* Get an immediate predecessor of this node.
*/
```
```rust
pub fn getAPredecessor(self: BasicBlock) -> *ControlFlowNode;
```
## BasicBlock::getSuccessorCount

```java
/**
* Get the count of immediate successor nodes.
*/
```
```rust
pub fn getSuccessorCount(self: BasicBlock) -> int;
```
## BasicBlock::isEntryNode

```rust
pub fn isEntryNode(self: BasicBlock) -> bool;
```
## BasicBlock::getANode

```java
/**
* Get a node in this basic block.
*/
```
```rust
pub fn getANode(self: BasicBlock) -> *ControlFlowNode;
```
## BasicBlock::getBBSuccessorCount

```java
/**
* Gets the count of bb successor of this bb.
*/
```
```rust
pub fn getBBSuccessorCount(self: BasicBlock) -> int;
```
## BasicBlock::getText

```java
/**
* Get the text of this control flow node.
*/
```
```rust
pub fn getText(self: BasicBlock) -> string;
```
## BasicBlock::getASuccessorWithCompletion

```java
/**
* Get an immediate successor of this node with the given
* type of Completion.
*/
```
```rust
pub fn getASuccessorWithCompletion(self: BasicBlock, c: Completion) -> *ControlFlowNode;
```
## BasicBlock::getFile

```java
/**
* Get the file of this control flow node.
*/
```
```rust
pub fn getFile(self: BasicBlock) -> File;
```
## BasicBlock::getBasicBlock

```java
/**
* Get the basic block that contains this node.
*/
```
```rust
pub fn getBasicBlock(self: BasicBlock) -> BasicBlock;
```
## BasicBlock::getBBPredecessorCount

```java
/**
* Gets the count of bb predecessor of this bb.
*/
```
```rust
pub fn getBBPredecessorCount(self: BasicBlock) -> int;
```
## BasicBlock::isEntryBB

```java
/**
* Determine whether this basic block is an entry bb.
*/
```
```rust
pub fn isEntryBB(self: BasicBlock) -> bool;
```
## BasicBlock::getLastNode

```java
/**
* Get the last node in this basic block.
*/
```
```rust
pub fn getLastNode(self: BasicBlock) -> ControlFlowNode;
```
## BasicBlock::getFirstNode

```java
/**
* Get the first node in this basic block.
*/
```
```rust
pub fn getFirstNode(self: BasicBlock) -> ControlFlowNode;
```
## BasicBlock::getRelativePath

```java
/**
* Get the relative path of this control flow node.
*/
```
```rust
pub fn getRelativePath(self: BasicBlock) -> string;
```
## BasicBlock::getABBPredecessor

```java
/**
* Gets an immediate predecessor of this basic block.
*/
```
```rust
pub fn getABBPredecessor(self: BasicBlock) -> *BasicBlock;
```
## BasicBlock::getABBSuccessor

```java
/**
* Gets an immediate successor of this basic block.
*/
```
```rust
pub fn getABBSuccessor(self: BasicBlock) -> *BasicBlock;
```
## BasicBlock::getLength

```java
/**
* Get the length of this basic block.
*/
```
```rust
pub fn getLength(self: BasicBlock) -> int;
```
## BasicBlock::getNode

```java
/**
* Get the node in this basic block with the given index.
*/
```
```rust
pub fn getNode(self: BasicBlock, index: int) -> ControlFlowNode;
```
## BasicBlock::getKindName

```java
/**
* Get the kind name of node.
* If node is ast node, just return ast node kind name; otherwise
* return node name as CfgEntryNode or CfgExitNode.
*/
```
```rust
pub fn getKindName(self: BasicBlock) -> string;
```
## BasicBlock::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BasicBlock;
```
## BasicBlock::isExitBB

```java
/**
* Determine whether this basic block is an exit bb.
*/
```
```rust
pub fn isExitBB(self: BasicBlock) -> bool;
```
## BasicBlock::getLocation

```java
/**
* Get the location of this control flow node.
*/
```
```rust
pub fn getLocation(self: BasicBlock) -> Location;
```
## BasicBlock::isAstNode

```rust
pub fn isAstNode(self: BasicBlock) -> bool;
```
