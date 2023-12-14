# QuestionToken

Primary key: `id: int`

```rust
schema QuestionToken {
  @primary id: int,
}
```
## QuestionToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: QuestionToken) -> Location;
```
## QuestionToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: QuestionToken) -> Symbol;
```
## QuestionToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: QuestionToken) -> *Decorator;
```
## QuestionToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: QuestionToken) -> string;
```
## QuestionToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: QuestionToken, i: int) -> Modifier;
```
## QuestionToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: QuestionToken) -> *Comment;
```
## QuestionToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: QuestionToken) -> *Node;
```
## QuestionToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: QuestionToken) -> *Node;
```
## QuestionToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: QuestionToken) -> Node;
```
## QuestionToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: QuestionToken) -> int;
```
## QuestionToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: QuestionToken) -> TopLevelDO;
```
## QuestionToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: QuestionToken, i: int) -> Decorator;
```
## QuestionToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: QuestionToken) -> int;
```
## QuestionToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: QuestionToken) -> *Modifier;
```
## QuestionToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: QuestionToken) -> int;
```
## QuestionToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: QuestionToken, i: int) -> Node;
```
## QuestionToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: QuestionToken) -> int;
```
## QuestionToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: QuestionToken) -> *FunctionLikeDeclaration;
```
## QuestionToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: QuestionToken, level: int) -> *Node;
```
## QuestionToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: QuestionToken) -> int;
```
## QuestionToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: QuestionToken) -> string;
```
## QuestionToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: QuestionToken, level: int) -> Node;
```
## QuestionToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: QuestionToken) -> File;
```
## QuestionToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: QuestionToken) -> *Comment;
```
## QuestionToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: QuestionToken) -> *Comment;
```
## QuestionToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: QuestionToken) -> Node;
```
## QuestionToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: QuestionToken) -> FunctionLikeDeclaration;
```
## QuestionToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: QuestionToken) -> int;
```
## QuestionToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: QuestionToken) -> int;
```
## QuestionToken::getIndex

```rust
pub fn getIndex(self: QuestionToken) -> int;
```
## QuestionToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: QuestionToken) -> *Node;
```
## QuestionToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *QuestionToken;
```
## QuestionToken::is\<T\>

```rust
pub fn is<T>(self: QuestionToken) -> bool;
```
## QuestionToken::to\<T\>

```rust
pub fn to<T>(self: QuestionToken) -> <any>;
```
## QuestionToken::key\_neq

```rust
pub fn key_neq(self: QuestionToken, object: <any>) -> bool;
```
## QuestionToken::key\_eq

```rust
pub fn key_eq(self: QuestionToken, object: <any>) -> bool;
```
## QuestionToken::to\_set

```rust
pub fn to_set(self: QuestionToken) -> *QuestionToken;
```
