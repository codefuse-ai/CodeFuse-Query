# QuestionDotToken

Primary key: `id: int`

```rust
schema QuestionDotToken {
  @primary id: int,
}
```
## QuestionDotToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: QuestionDotToken) -> Location;
```
## QuestionDotToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: QuestionDotToken) -> Symbol;
```
## QuestionDotToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: QuestionDotToken) -> *Decorator;
```
## QuestionDotToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: QuestionDotToken) -> string;
```
## QuestionDotToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: QuestionDotToken, i: int) -> Modifier;
```
## QuestionDotToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: QuestionDotToken) -> *Comment;
```
## QuestionDotToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: QuestionDotToken) -> *Node;
```
## QuestionDotToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: QuestionDotToken) -> *Node;
```
## QuestionDotToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: QuestionDotToken) -> Node;
```
## QuestionDotToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: QuestionDotToken) -> int;
```
## QuestionDotToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: QuestionDotToken) -> TopLevelDO;
```
## QuestionDotToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: QuestionDotToken, i: int) -> Decorator;
```
## QuestionDotToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: QuestionDotToken) -> int;
```
## QuestionDotToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: QuestionDotToken) -> *Modifier;
```
## QuestionDotToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: QuestionDotToken) -> int;
```
## QuestionDotToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: QuestionDotToken, i: int) -> Node;
```
## QuestionDotToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: QuestionDotToken) -> int;
```
## QuestionDotToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: QuestionDotToken) -> *FunctionLikeDeclaration;
```
## QuestionDotToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: QuestionDotToken, level: int) -> *Node;
```
## QuestionDotToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: QuestionDotToken) -> int;
```
## QuestionDotToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: QuestionDotToken) -> string;
```
## QuestionDotToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: QuestionDotToken, level: int) -> Node;
```
## QuestionDotToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: QuestionDotToken) -> File;
```
## QuestionDotToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: QuestionDotToken) -> *Comment;
```
## QuestionDotToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: QuestionDotToken) -> *Comment;
```
## QuestionDotToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: QuestionDotToken) -> Node;
```
## QuestionDotToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: QuestionDotToken) -> FunctionLikeDeclaration;
```
## QuestionDotToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: QuestionDotToken) -> int;
```
## QuestionDotToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: QuestionDotToken) -> int;
```
## QuestionDotToken::getIndex

```rust
pub fn getIndex(self: QuestionDotToken) -> int;
```
## QuestionDotToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: QuestionDotToken) -> *Node;
```
## QuestionDotToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *QuestionDotToken;
```
## QuestionDotToken::is\<T\>

```rust
pub fn is<T>(self: QuestionDotToken) -> bool;
```
## QuestionDotToken::to\<T\>

```rust
pub fn to<T>(self: QuestionDotToken) -> <any>;
```
## QuestionDotToken::key\_neq

```rust
pub fn key_neq(self: QuestionDotToken, object: <any>) -> bool;
```
## QuestionDotToken::key\_eq

```rust
pub fn key_eq(self: QuestionDotToken, object: <any>) -> bool;
```
## QuestionDotToken::to\_set

```rust
pub fn to_set(self: QuestionDotToken) -> *QuestionDotToken;
```
