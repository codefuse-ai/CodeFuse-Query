# VarDef

Primary key: `id: int`

```rust
schema VarDef {
  @primary id: int,
}
```
## VarDef::getRelativePath

```rust
/**
     * Get the relative path of this control flow node.
     */
```
```rust
pub fn getRelativePath(self: VarDef) -> string;
```
## VarDef::isEntryNode

```rust
pub fn isEntryNode(self: VarDef) -> bool;
```
## VarDef::getASuccessor

```rust
/**
     * Get an immediate successor of this node.
     */
```
```rust
pub fn getASuccessor(self: VarDef) -> *ControlFlowNode;
```
## VarDef::getEnclosingFunction

```rust
/**
     * Get the enclosing function of node.
     * CfgEntryNode or CfgExitNode return belongs to function.
     */
```
```rust
pub fn getEnclosingFunction(self: VarDef) -> FunctionLikeDeclaration;
```
## VarDef::getKindName

```rust
/**
     * Get the kind name of node.
     * If node is ast node, just return ast node kind name; otherwise
     * return node name as CfgEntryNode or CfgExitNode.
     */
```
```rust
pub fn getKindName(self: VarDef) -> string;
```
## VarDef::getBasicBlock

```rust
/**
     * Get the basic block that contains this node.
     */
```
```rust
pub fn getBasicBlock(self: VarDef) -> BasicBlock;
```
## VarDef::getASuccessorWithCompletion

```rust
/**
     * Get an immediate successor of this node with the given
     * type of Completion.
     */
```
```rust
pub fn getASuccessorWithCompletion(self: VarDef, c: Completion) -> *ControlFlowNode;
```
## VarDef::getText

```rust
/**
     * Get the text of this control flow node.
     */
```
```rust
pub fn getText(self: VarDef) -> string;
```
## VarDef::getAPredecessor

```rust
/**
     * Get an immediate predecessor of this node.
     */
```
```rust
pub fn getAPredecessor(self: VarDef) -> *ControlFlowNode;
```
## VarDef::getLocation

```rust
/**
     * Get the location of this control flow node.
     */
```
```rust
pub fn getLocation(self: VarDef) -> Location;
```
## VarDef::isAstNode

```rust
pub fn isAstNode(self: VarDef) -> bool;
```
## VarDef::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *VarDef;
```
## VarDef::getAUse

```rust
/**
     * Gets the RValue that are defined by this node.
     */
```
```rust
pub fn getAUse(self: VarDef) -> *VarUse;
```
## VarDef::isSyntheticNode

```rust
pub fn isSyntheticNode(self: VarDef) -> bool;
```
## VarDef::getFile

```rust
/**
     * Get the file of this control flow node.
     */
```
```rust
pub fn getFile(self: VarDef) -> File;
```
## VarDef::getPredecessorCount

```rust
/**
     * Get the count of immediate predecessor nodes/
     */
```
```rust
pub fn getPredecessorCount(self: VarDef) -> int;
```
## VarDef::getATarget

```rust
/**
     * Gets the target of VarDef, maybe the type of target is LValue?
     */
```
```rust
pub fn getATarget(self: VarDef) -> *LValue;
```
## VarDef::isExitNode

```rust
pub fn isExitNode(self: VarDef) -> bool;
```
## VarDef::getSource

```rust
/**
     * Get the data source of this variable definition.
     */
```
```rust
pub fn getSource(self: VarDef) -> Expression;
```
## VarDef::getASuccessorRecursive

```rust
/**
     * Gets the successor of this node, and query successors recursively
     */
```
```rust
pub fn getASuccessorRecursive(self: VarDef) -> *ControlFlowNode;
```
## VarDef::getSuccessorCount

```rust
/**
     * Get the count of immediate successor nodes.
     */
```
```rust
pub fn getSuccessorCount(self: VarDef) -> int;
```
## VarDef::is\<T\>

```rust
pub fn is<T>(self: VarDef) -> bool;
```
## VarDef::to\<T\>

```rust
pub fn to<T>(self: VarDef) -> <any>;
```
## VarDef::key\_neq

```rust
pub fn key_neq(self: VarDef, object: <any>) -> bool;
```
## VarDef::key\_eq

```rust
pub fn key_eq(self: VarDef, object: <any>) -> bool;
```
## VarDef::to\_set

```rust
pub fn to_set(self: VarDef) -> *VarDef;
```
