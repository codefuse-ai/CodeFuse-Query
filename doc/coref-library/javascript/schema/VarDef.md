# VarDef

Inherit from [ControlFlowNode](./ControlFlowNode.md)

Primary key: `id: int`

```rust
schema VarDef extends ControlFlowNode {
  @primary id: int,
}
```
## VarDef::getRelativePath

```java
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

```java
/**
* Get an immediate successor of this node.
*/
```
```rust
pub fn getASuccessor(self: VarDef) -> *ControlFlowNode;
```
## VarDef::getEnclosingFunction

```java
/**
* Get the enclosing function of node.
* CfgEntryNode or CfgExitNode return belongs to function.
*/
```
```rust
pub fn getEnclosingFunction(self: VarDef) -> FunctionLikeDeclaration;
```
## VarDef::getKindName

```java
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

```java
/**
* Get the basic block that contains this node.
*/
```
```rust
pub fn getBasicBlock(self: VarDef) -> BasicBlock;
```
## VarDef::getASuccessorWithCompletion

```java
/**
* Get an immediate successor of this node with the given
* type of Completion.
*/
```
```rust
pub fn getASuccessorWithCompletion(self: VarDef, c: Completion) -> *ControlFlowNode;
```
## VarDef::getText

```java
/**
* Get the text of this control flow node.
*/
```
```rust
pub fn getText(self: VarDef) -> string;
```
## VarDef::getAPredecessor

```java
/**
* Get an immediate predecessor of this node.
*/
```
```rust
pub fn getAPredecessor(self: VarDef) -> *ControlFlowNode;
```
## VarDef::getLocation

```java
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

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *VarDef;
```
## VarDef::getAUse

```java
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

```java
/**
* Get the file of this control flow node.
*/
```
```rust
pub fn getFile(self: VarDef) -> File;
```
## VarDef::getPredecessorCount

```java
/**
* Get the count of immediate predecessor nodes/
*/
```
```rust
pub fn getPredecessorCount(self: VarDef) -> int;
```
## VarDef::getATarget

```java
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

```java
/**
* Get the data source of this variable definition.
*/
```
```rust
pub fn getSource(self: VarDef) -> Expression;
```
## VarDef::getASuccessorRecursive

```java
/**
* Gets the successor of this node, and query successors recursively
*/
```
```rust
pub fn getASuccessorRecursive(self: VarDef) -> *ControlFlowNode;
```
## VarDef::getSuccessorCount

```java
/**
* Get the count of immediate successor nodes.
*/
```
```rust
pub fn getSuccessorCount(self: VarDef) -> int;
```
