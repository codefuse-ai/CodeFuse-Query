# ConditionalTypeNode

Primary key: `id: int`

```rust
schema ConditionalTypeNode {
  @primary id: int,
}
```
## ConditionalTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ConditionalTypeNode) -> Location;
```
## ConditionalTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ConditionalTypeNode) -> Symbol;
```
## ConditionalTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ConditionalTypeNode) -> *Decorator;
```
## ConditionalTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ConditionalTypeNode) -> string;
```
## ConditionalTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ConditionalTypeNode, i: int) -> Modifier;
```
## ConditionalTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ConditionalTypeNode) -> *Comment;
```
## ConditionalTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ConditionalTypeNode) -> *Node;
```
## ConditionalTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ConditionalTypeNode) -> *Node;
```
## ConditionalTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ConditionalTypeNode) -> Node;
```
## ConditionalTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ConditionalTypeNode) -> *Comment;
```
## ConditionalTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ConditionalTypeNode) -> *Comment;
```
## ConditionalTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ConditionalTypeNode) -> int;
```
## ConditionalTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ConditionalTypeNode) -> TopLevelDO;
```
## ConditionalTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ConditionalTypeNode, i: int) -> Decorator;
```
## ConditionalTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ConditionalTypeNode, i: int) -> Node;
```
## ConditionalTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ConditionalTypeNode) -> int;
```
## ConditionalTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ConditionalTypeNode) -> int;
```
## ConditionalTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ConditionalTypeNode) -> int;
```
## ConditionalTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ConditionalTypeNode) -> *Modifier;
```
## ConditionalTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ConditionalTypeNode) -> *FunctionLikeDeclaration;
```
## ConditionalTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ConditionalTypeNode, level: int) -> *Node;
```
## ConditionalTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ConditionalTypeNode) -> int;
```
## ConditionalTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ConditionalTypeNode) -> string;
```
## ConditionalTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ConditionalTypeNode, level: int) -> Node;
```
## ConditionalTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ConditionalTypeNode) -> File;
```
## ConditionalTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ConditionalTypeNode) -> int;
```
## ConditionalTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ConditionalTypeNode) -> FunctionLikeDeclaration;
```
## ConditionalTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ConditionalTypeNode) -> Node;
```
## ConditionalTypeNode::getIndex

```rust
pub fn getIndex(self: ConditionalTypeNode) -> int;
```
## ConditionalTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ConditionalTypeNode) -> int;
```
## ConditionalTypeNode::getElseType

```rust
pub fn getElseType(self: ConditionalTypeNode) -> TypeNode;
```
## ConditionalTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ConditionalTypeNode) -> *Node;
```
## ConditionalTypeNode::getCheckType

```rust
pub fn getCheckType(self: ConditionalTypeNode) -> TypeNode;
```
## ConditionalTypeNode::getThenType

```rust
pub fn getThenType(self: ConditionalTypeNode) -> TypeNode;
```
## ConditionalTypeNode::getExtendsType

```rust
pub fn getExtendsType(self: ConditionalTypeNode) -> TypeNode;
```
## ConditionalTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ConditionalTypeNode;
```
## ConditionalTypeNode::is\<T\>

```rust
pub fn is<T>(self: ConditionalTypeNode) -> bool;
```
## ConditionalTypeNode::to\<T\>

```rust
pub fn to<T>(self: ConditionalTypeNode) -> <any>;
```
## ConditionalTypeNode::key\_neq

```rust
pub fn key_neq(self: ConditionalTypeNode, object: <any>) -> bool;
```
## ConditionalTypeNode::key\_eq

```rust
pub fn key_eq(self: ConditionalTypeNode, object: <any>) -> bool;
```
## ConditionalTypeNode::to\_set

```rust
pub fn to_set(self: ConditionalTypeNode) -> *ConditionalTypeNode;
```
