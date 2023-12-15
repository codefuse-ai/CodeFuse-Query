# VarUse

Inherit from [ControlFlowNode](./ControlFlowNode.md)

Primary key: `id: int`

```rust
schema VarUse extends ControlFlowNode {
  @primary id: int
}
```
## VarUse::isSyntheticNode

```rust
pub fn isSyntheticNode(self: VarUse) -> bool;
```
## VarUse::getPredecessorCount

```java
/**
* Get the count of immediate predecessor nodes/
*/
```
```rust
pub fn getPredecessorCount(self: VarUse) -> int;
```
## VarUse::getRelativePath

```java
/**
* Get the relative path of this control flow node.
*/
```
```rust
pub fn getRelativePath(self: VarUse) -> string;
```
## VarUse::getDefinedByLValue

```java
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

```java
/**
* Gets the successor of this node, and query successors recursively
*/
```
```rust
pub fn getASuccessorRecursive(self: VarUse) -> *ControlFlowNode;
```
## VarUse::getASuccessor

```java
/**
* Get an immediate successor of this node.
*/
```
```rust
pub fn getASuccessor(self: VarUse) -> *ControlFlowNode;
```
## VarUse::getEnclosingFunction

```java
/**
* Get the enclosing function of node.
* CfgEntryNode or CfgExitNode return belongs to function.
*/
```
```rust
pub fn getEnclosingFunction(self: VarUse) -> FunctionLikeDeclaration;
```
## VarUse::getKindName

```java
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

```java
/**
* Get the text of this control flow node.
*/
```
```rust
pub fn getText(self: VarUse) -> string;
```
## VarUse::getASuccessorWithCompletion

```java
/**
* Get an immediate successor of this node with the given
* type of Completion.
*/
```
```rust
pub fn getASuccessorWithCompletion(self: VarUse, c: Completion) -> *ControlFlowNode;
```
## VarUse::getFile

```java
/**
* Get the file of this control flow node.
*/
```
```rust
pub fn getFile(self: VarUse) -> File;
```
## VarUse::getBasicBlock

```java
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

```java
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

```java
/**
* Get an immediate predecessor of this node.
*/
```
```rust
pub fn getAPredecessor(self: VarUse) -> *ControlFlowNode;
```
## VarUse::getADef

```java
/**
* Gets VarDef site.
*/
```
```rust
pub fn getADef(self: VarUse) -> *ControlFlowNode;
```
## VarUse::getSuccessorCount

```java
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

```java
/**
* Determine whether there exists a neareast LValue that defines current use node in same BB.
*/
```
```rust
pub fn existNearestLocalDefinedLValue(self: VarUse) -> bool;
```
## VarUse::getLocation

```java
/**
* Get the location of this control flow node.
*/
```
```rust
pub fn getLocation(self: VarUse) -> Location;
```
## VarUse::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *VarUse;
```
