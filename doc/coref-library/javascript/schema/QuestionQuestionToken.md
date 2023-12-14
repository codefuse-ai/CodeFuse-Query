# QuestionQuestionToken

Primary key: `id: int`

```rust
schema QuestionQuestionToken {
  @primary id: int,
}
```
## QuestionQuestionToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: QuestionQuestionToken) -> Location;
```
## QuestionQuestionToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: QuestionQuestionToken) -> Symbol;
```
## QuestionQuestionToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: QuestionQuestionToken) -> *Decorator;
```
## QuestionQuestionToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: QuestionQuestionToken) -> string;
```
## QuestionQuestionToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: QuestionQuestionToken, i: int) -> Modifier;
```
## QuestionQuestionToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: QuestionQuestionToken) -> *Comment;
```
## QuestionQuestionToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: QuestionQuestionToken) -> *Node;
```
## QuestionQuestionToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: QuestionQuestionToken) -> *Node;
```
## QuestionQuestionToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: QuestionQuestionToken) -> Node;
```
## QuestionQuestionToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: QuestionQuestionToken) -> int;
```
## QuestionQuestionToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: QuestionQuestionToken) -> TopLevelDO;
```
## QuestionQuestionToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: QuestionQuestionToken, i: int) -> Decorator;
```
## QuestionQuestionToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: QuestionQuestionToken) -> int;
```
## QuestionQuestionToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: QuestionQuestionToken) -> *Modifier;
```
## QuestionQuestionToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: QuestionQuestionToken) -> int;
```
## QuestionQuestionToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: QuestionQuestionToken, i: int) -> Node;
```
## QuestionQuestionToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: QuestionQuestionToken) -> int;
```
## QuestionQuestionToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: QuestionQuestionToken) -> *FunctionLikeDeclaration;
```
## QuestionQuestionToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: QuestionQuestionToken, level: int) -> *Node;
```
## QuestionQuestionToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: QuestionQuestionToken) -> int;
```
## QuestionQuestionToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: QuestionQuestionToken) -> string;
```
## QuestionQuestionToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: QuestionQuestionToken, level: int) -> Node;
```
## QuestionQuestionToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: QuestionQuestionToken) -> File;
```
## QuestionQuestionToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: QuestionQuestionToken) -> *Comment;
```
## QuestionQuestionToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: QuestionQuestionToken) -> *Comment;
```
## QuestionQuestionToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: QuestionQuestionToken) -> Node;
```
## QuestionQuestionToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: QuestionQuestionToken) -> FunctionLikeDeclaration;
```
## QuestionQuestionToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: QuestionQuestionToken) -> int;
```
## QuestionQuestionToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: QuestionQuestionToken) -> int;
```
## QuestionQuestionToken::getIndex

```rust
pub fn getIndex(self: QuestionQuestionToken) -> int;
```
## QuestionQuestionToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: QuestionQuestionToken) -> *Node;
```
## QuestionQuestionToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *QuestionQuestionToken;
```
## QuestionQuestionToken::is\<T\>

```rust
pub fn is<T>(self: QuestionQuestionToken) -> bool;
```
## QuestionQuestionToken::to\<T\>

```rust
pub fn to<T>(self: QuestionQuestionToken) -> <any>;
```
## QuestionQuestionToken::key\_neq

```rust
pub fn key_neq(self: QuestionQuestionToken, object: <any>) -> bool;
```
## QuestionQuestionToken::key\_eq

```rust
pub fn key_eq(self: QuestionQuestionToken, object: <any>) -> bool;
```
## QuestionQuestionToken::to\_set

```rust
pub fn to_set(self: QuestionQuestionToken) -> *QuestionQuestionToken;
```
