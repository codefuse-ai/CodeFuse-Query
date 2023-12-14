# DebuggerStatement

Primary key: `id: int`

```rust
schema DebuggerStatement {
  @primary id: int,
}
```
## DebuggerStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: DebuggerStatement) -> Location;
```
## DebuggerStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: DebuggerStatement) -> Symbol;
```
## DebuggerStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: DebuggerStatement) -> *Decorator;
```
## DebuggerStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: DebuggerStatement) -> string;
```
## DebuggerStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: DebuggerStatement, i: int) -> Modifier;
```
## DebuggerStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: DebuggerStatement) -> *Comment;
```
## DebuggerStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: DebuggerStatement) -> *Node;
```
## DebuggerStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: DebuggerStatement) -> *Node;
```
## DebuggerStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: DebuggerStatement) -> Node;
```
## DebuggerStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: DebuggerStatement) -> int;
```
## DebuggerStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: DebuggerStatement) -> TopLevelDO;
```
## DebuggerStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: DebuggerStatement, i: int) -> Decorator;
```
## DebuggerStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: DebuggerStatement) -> int;
```
## DebuggerStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: DebuggerStatement) -> *Modifier;
```
## DebuggerStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DebuggerStatement) -> int;
```
## DebuggerStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: DebuggerStatement, i: int) -> Node;
```
## DebuggerStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DebuggerStatement) -> int;
```
## DebuggerStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DebuggerStatement) -> *FunctionLikeDeclaration;
```
## DebuggerStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: DebuggerStatement, level: int) -> *Node;
```
## DebuggerStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DebuggerStatement) -> int;
```
## DebuggerStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: DebuggerStatement) -> string;
```
## DebuggerStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: DebuggerStatement, level: int) -> Node;
```
## DebuggerStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: DebuggerStatement) -> File;
```
## DebuggerStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: DebuggerStatement) -> *Comment;
```
## DebuggerStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: DebuggerStatement) -> *Comment;
```
## DebuggerStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: DebuggerStatement) -> Node;
```
## DebuggerStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: DebuggerStatement) -> FunctionLikeDeclaration;
```
## DebuggerStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DebuggerStatement) -> int;
```
## DebuggerStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: DebuggerStatement) -> int;
```
## DebuggerStatement::getIndex

```rust
pub fn getIndex(self: DebuggerStatement) -> int;
```
## DebuggerStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: DebuggerStatement) -> *Node;
```
## DebuggerStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *DebuggerStatement;
```
## DebuggerStatement::is\<T\>

```rust
pub fn is<T>(self: DebuggerStatement) -> bool;
```
## DebuggerStatement::to\<T\>

```rust
pub fn to<T>(self: DebuggerStatement) -> <any>;
```
## DebuggerStatement::key\_neq

```rust
pub fn key_neq(self: DebuggerStatement, object: <any>) -> bool;
```
## DebuggerStatement::key\_eq

```rust
pub fn key_eq(self: DebuggerStatement, object: <any>) -> bool;
```
## DebuggerStatement::to\_set

```rust
pub fn to_set(self: DebuggerStatement) -> *DebuggerStatement;
```
