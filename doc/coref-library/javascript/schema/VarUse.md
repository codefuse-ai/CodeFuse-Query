# VarUse

Primary key: `id: int`

```rust
schema VarUse {
  @primary id: int,
}
```
## VarUse::isSyntheticNode

```rust
pub fn isSyntheticNode(self: VarUse) -> bool;
```
## VarUse::getPredecessorCount

```rust
/**
     * Get the count of immediate predecessor nodes/
     */
```
```rust
pub fn getPredecessorCount(self: VarUse) -> int;
```
## VarUse::getRelativePath

```rust
/**
     * Get the relative path of this control flow node.
     */
```
```rust
pub fn getRelativePath(self: VarUse) -> string;
```
## VarUse::getDefinedByLValue

```rust
/**
     * Gets the LValue nodes that can define this use node.
     */
```
```rust
pub fn getDefinedByLValue(self: VarUse) -> *LValue;
```
## VarUse::isEntryNode

```rust
pub fn isEntryNode(self: VarUse) -> bool;
```
## VarUse::getASuccessorRecursive

```rust
/**
     * Gets the successor of this node, and query successors recursively
     */
```
```rust
pub fn getASuccessorRecursive(self: VarUse) -> *ControlFlowNode;
```
## VarUse::getASuccessor

```rust
/**
     * Get an immediate successor of this node.
     */
```
```rust
pub fn getASuccessor(self: VarUse) -> *ControlFlowNode;
```
## VarUse::getEnclosingFunction

```rust
/**
     * Get the enclosing function of node.
     * CfgEntryNode or CfgExitNode return belongs to function.
     */
```
```rust
pub fn getEnclosingFunction(self: VarUse) -> FunctionLikeDeclaration;
```
## VarUse::getKindName

```rust
/**
     * Get the kind name of node.
     * If node is ast node, just return ast node kind name; otherwise
     * return node name as CfgEntryNode or CfgExitNode.
     */
```
```rust
pub fn getKindName(self: VarUse) -> string;
```
## VarUse::getText

```rust
/**
     * Get the text of this control flow node.
     */
```
```rust
pub fn getText(self: VarUse) -> string;
```
## VarUse::getASuccessorWithCompletion

```rust
/**
     * Get an immediate successor of this node with the given
     * type of Completion.
     */
```
```rust
pub fn getASuccessorWithCompletion(self: VarUse, c: Completion) -> *ControlFlowNode;
```
## VarUse::getFile

```rust
/**
     * Get the file of this control flow node.
     */
```
```rust
pub fn getFile(self: VarUse) -> File;
```
## VarUse::getBasicBlock

```rust
/**
     * Get the basic block that contains this node.
     */
```
```rust
pub fn getBasicBlock(self: VarUse) -> BasicBlock;
```
## VarUse::isExitNode

```rust
pub fn isExitNode(self: VarUse) -> bool;
```
## VarUse::nearestLocalDefinedLValue

```rust
/**
     * Gets the neareast LValue that defines current use node in same BB.
     */
```
```rust
pub fn nearestLocalDefinedLValue(self: VarUse) -> LValue;
```
## VarUse::isAstNode

```rust
pub fn isAstNode(self: VarUse) -> bool;
```
## VarUse::getADefRecursive

```rust
pub fn getADefRecursive(self: VarUse) -> *ControlFlowNode;
```
## VarUse::getAPredecessor

```rust
/**
     * Get an immediate predecessor of this node.
     */
```
```rust
pub fn getAPredecessor(self: VarUse) -> *ControlFlowNode;
```
## VarUse::getADef

```rust
/**
     * Gets VarDef site.
     */
```
```rust
pub fn getADef(self: VarUse) -> *ControlFlowNode;
```
## VarUse::getSuccessorCount

```rust
/**
     * Get the count of immediate successor nodes.
     */
```
```rust
pub fn getSuccessorCount(self: VarUse) -> int;
```
## VarUse::getDefinedByLValueRecursive

```rust
pub fn getDefinedByLValueRecursive(self: VarUse) -> *LValue;
```
## VarUse::existNearestLocalDefinedLValue

```rust
/**
     * Determine whether there exists a neareast LValue that defines current use node in same BB.
     */
```
```rust
pub fn existNearestLocalDefinedLValue(self: VarUse) -> bool;
```
## VarUse::getLocation

```rust
/**
     * Get the location of this control flow node.
     */
```
```rust
pub fn getLocation(self: VarUse) -> Location;
```
## VarUse::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *VarUse;
```
## VarUse::is\<T\>

```rust
pub fn is<T>(self: VarUse) -> bool;
```
## VarUse::to\<T\>

```rust
pub fn to<T>(self: VarUse) -> <any>;
```
## VarUse::key\_neq

```rust
pub fn key_neq(self: VarUse, object: <any>) -> bool;
```
## VarUse::key\_eq

```rust
pub fn key_eq(self: VarUse, object: <any>) -> bool;
```
## VarUse::to\_set

```rust
pub fn to_set(self: VarUse) -> *VarUse;
```
