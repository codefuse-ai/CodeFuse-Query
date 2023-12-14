# VariableDeclarationList

Primary key: `id: int`

```rust
schema VariableDeclarationList {
  @primary id: int,
}
```
## VariableDeclarationList::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: VariableDeclarationList) -> *Node;
```
## VariableDeclarationList::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: VariableDeclarationList) -> Node;
```
## VariableDeclarationList::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: VariableDeclarationList) -> FunctionLikeDeclaration;
```
## VariableDeclarationList::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: VariableDeclarationList) -> File;
```
## VariableDeclarationList::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: VariableDeclarationList, level: int) -> Node;
```
## VariableDeclarationList::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: VariableDeclarationList) -> string;
```
## VariableDeclarationList::getEndLineNumber

```rust
pub fn getEndLineNumber(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: VariableDeclarationList) -> Location;
```
## VariableDeclarationList::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: VariableDeclarationList) -> *FunctionLikeDeclaration;
```
## VariableDeclarationList::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: VariableDeclarationList, level: int) -> *Node;
```
## VariableDeclarationList::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: VariableDeclarationList) -> *Modifier;
```
## VariableDeclarationList::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: VariableDeclarationList, i: int) -> Node;
```
## VariableDeclarationList::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: VariableDeclarationList) -> TopLevelDO;
```
## VariableDeclarationList::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: VariableDeclarationList, i: int) -> Decorator;
```
## VariableDeclarationList::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: VariableDeclarationList) -> *Node;
```
## VariableDeclarationList::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: VariableDeclarationList) -> Node;
```
## VariableDeclarationList::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: VariableDeclarationList) -> *Comment;
```
## VariableDeclarationList::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: VariableDeclarationList) -> *Comment;
```
## VariableDeclarationList::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: VariableDeclarationList) -> *Node;
```
## VariableDeclarationList::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: VariableDeclarationList) -> *Comment;
```
## VariableDeclarationList::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: VariableDeclarationList, i: int) -> Modifier;
```
## VariableDeclarationList::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: VariableDeclarationList) -> string;
```
## VariableDeclarationList::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: VariableDeclarationList) -> *Decorator;
```
## VariableDeclarationList::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: VariableDeclarationList) -> Symbol;
```
## VariableDeclarationList::getIndex

```rust
pub fn getIndex(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getVariableDeclarationCount

```rust
/**
     * get the count of the variable declarations
     */
```
```rust
pub fn getVariableDeclarationCount(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getStartLineNumber

```rust
pub fn getStartLineNumber(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getVariableDeclaration

```rust
/**
     * get the variable declaration with given
     */
```
```rust
pub fn getVariableDeclaration(self: VariableDeclarationList, i: int) -> VariableDeclaration;
```
## VariableDeclarationList::getAVariableDeclaration

```rust
/**
     * get a variable declaration
     */
```
```rust
pub fn getAVariableDeclaration(self: VariableDeclarationList) -> *VariableDeclaration;
```
## VariableDeclarationList::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *VariableDeclarationList;
```
## VariableDeclarationList::is\<T\>

```rust
pub fn is<T>(self: VariableDeclarationList) -> bool;
```
## VariableDeclarationList::to\<T\>

```rust
pub fn to<T>(self: VariableDeclarationList) -> <any>;
```
## VariableDeclarationList::key\_neq

```rust
pub fn key_neq(self: VariableDeclarationList, object: <any>) -> bool;
```
## VariableDeclarationList::key\_eq

```rust
pub fn key_eq(self: VariableDeclarationList, object: <any>) -> bool;
```
## VariableDeclarationList::to\_set

```rust
pub fn to_set(self: VariableDeclarationList) -> *VariableDeclarationList;
```
