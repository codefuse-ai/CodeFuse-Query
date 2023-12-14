# BasicBlock

Primary key: `id: int`

```rust
schema BasicBlock {
  @primary id: int,
}
```
## BasicBlock::isSyntheticNode

```rust
pub fn isSyntheticNode(self: BasicBlock) -> bool;
```
## BasicBlock::getPredecessorCount

```rust
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

```rust
/**
     * Get the enclosing function of node.
     * CfgEntryNode or CfgExitNode return belongs to function.
     */
```
```rust
pub fn getEnclosingFunction(self: BasicBlock) -> FunctionLikeDeclaration;
```
## BasicBlock::getASuccessor

```rust
/**
     * Get an immediate successor of this node.
     */
```
```rust
pub fn getASuccessor(self: BasicBlock) -> *ControlFlowNode;
```
## BasicBlock::getASuccessorRecursive

```rust
/**
     * Gets the successor of this node, and query successors recursively
     */
```
```rust
pub fn getASuccessorRecursive(self: BasicBlock) -> *ControlFlowNode;
```
## BasicBlock::getAPredecessor

```rust
/**
     * Get an immediate predecessor of this node.
     */
```
```rust
pub fn getAPredecessor(self: BasicBlock) -> *ControlFlowNode;
```
## BasicBlock::getSuccessorCount

```rust
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

```rust
/**
     * Get a node in this basic block.
     */
```
```rust
pub fn getANode(self: BasicBlock) -> *ControlFlowNode;
```
## BasicBlock::getBBSuccessorCount

```rust
/**
     * Gets the count of bb successor of this bb.
     */
```
```rust
pub fn getBBSuccessorCount(self: BasicBlock) -> int;
```
## BasicBlock::getText

```rust
/**
     * Get the text of this control flow node.
     */
```
```rust
pub fn getText(self: BasicBlock) -> string;
```
## BasicBlock::getASuccessorWithCompletion

```rust
/**
     * Get an immediate successor of this node with the given
     * type of Completion.
     */
```
```rust
pub fn getASuccessorWithCompletion(self: BasicBlock, c: Completion) -> *ControlFlowNode;
```
## BasicBlock::getFile

```rust
/**
     * Get the file of this control flow node.
     */
```
```rust
pub fn getFile(self: BasicBlock) -> File;
```
## BasicBlock::getBasicBlock

```rust
/**
     * Get the basic block that contains this node.
     */
```
```rust
pub fn getBasicBlock(self: BasicBlock) -> BasicBlock;
```
## BasicBlock::getBBPredecessorCount

```rust
/**
     * Gets the count of bb predecessor of this bb.
     */
```
```rust
pub fn getBBPredecessorCount(self: BasicBlock) -> int;
```
## BasicBlock::isEntryBB

```rust
/**
     * Determine whether this basic block is an entry bb.
     */
```
```rust
pub fn isEntryBB(self: BasicBlock) -> bool;
```
## BasicBlock::getLastNode

```rust
/**
     * Get the last node in this basic block.
     */
```
```rust
pub fn getLastNode(self: BasicBlock) -> ControlFlowNode;
```
## BasicBlock::getFirstNode

```rust
/**
     * Get the first node in this basic block.
     */
```
```rust
pub fn getFirstNode(self: BasicBlock) -> ControlFlowNode;
```
## BasicBlock::getRelativePath

```rust
/**
     * Get the relative path of this control flow node.
     */
```
```rust
pub fn getRelativePath(self: BasicBlock) -> string;
```
## BasicBlock::getABBPredecessor

```rust
/**
     * Gets an immediate predecessor of this basic block.
     */
```
```rust
pub fn getABBPredecessor(self: BasicBlock) -> *BasicBlock;
```
## BasicBlock::getABBSuccessor

```rust
/**
     * Gets an immediate successor of this basic block.
     */
```
```rust
pub fn getABBSuccessor(self: BasicBlock) -> *BasicBlock;
```
## BasicBlock::getLength

```rust
/**
     * Get the length of this basic block.
     */
```
```rust
pub fn getLength(self: BasicBlock) -> int;
```
## BasicBlock::getNode

```rust
/**
     * Get the node in this basic block with the given index.
     */
```
```rust
pub fn getNode(self: BasicBlock, index: int) -> ControlFlowNode;
```
## BasicBlock::getKindName

```rust
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

```rust
// CfgEntryNode is a standalone BB
```
```rust
pub fn __all__(db: JavascriptDB) -> *BasicBlock;
```
## BasicBlock::isExitBB

```rust
/**
     * Determine whether this basic block is an exit bb.
     */
```
```rust
pub fn isExitBB(self: BasicBlock) -> bool;
```
## BasicBlock::getLocation

```rust
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
## BasicBlock::is\<T\>

```rust
pub fn is<T>(self: BasicBlock) -> bool;
```
## BasicBlock::to\<T\>

```rust
pub fn to<T>(self: BasicBlock) -> <any>;
```
## BasicBlock::key\_neq

```rust
pub fn key_neq(self: BasicBlock, object: <any>) -> bool;
```
## BasicBlock::key\_eq

```rust
pub fn key_eq(self: BasicBlock, object: <any>) -> bool;
```
## BasicBlock::to\_set

```rust
pub fn to_set(self: BasicBlock) -> *BasicBlock;
```
