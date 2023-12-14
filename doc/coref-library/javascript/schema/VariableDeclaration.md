# VariableDeclaration

Primary key: `id: int`

```rust
schema VariableDeclaration {
  @primary id: int,
}
```
## VariableDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: VariableDeclaration) -> *Node;
```
## VariableDeclaration::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: VariableDeclaration) -> Node;
```
## VariableDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: VariableDeclaration) -> FunctionLikeDeclaration;
```
## VariableDeclaration::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: VariableDeclaration, level: int) -> Node;
```
## VariableDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: VariableDeclaration) -> Location;
```
## VariableDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: VariableDeclaration, i: int) -> Node;
```
## VariableDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: VariableDeclaration) -> *Node;
```
## VariableDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: VariableDeclaration) -> Node;
```
## VariableDeclaration::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: VariableDeclaration) -> *Comment;
```
## VariableDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: VariableDeclaration) -> *Comment;
```
## VariableDeclaration::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: VariableDeclaration) -> *Decorator;
```
## VariableDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: VariableDeclaration) -> Symbol;
```
## VariableDeclaration::getIndex

```rust
pub fn getIndex(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getModifierCount

```rust
/**
     * Gets the number of modifiers.
     */
```
```rust
pub fn getModifierCount(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: VariableDeclaration, i: int) -> Decorator;
```
## VariableDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: VariableDeclaration) -> TopLevelDO;
```
## VariableDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getNameNodeIndex

```rust
/**
     * Get the index of name node.
     */
```
```rust
pub fn getNameNodeIndex(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: VariableDeclaration) -> *Node;
```
## VariableDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: VariableDeclaration) -> *Comment;
```
## VariableDeclaration::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: VariableDeclaration) -> *FunctionLikeDeclaration;
```
## VariableDeclaration::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: VariableDeclaration, level: int) -> *Node;
```
## VariableDeclaration::getDecoratorCount

```rust
/**
     * Gets the number of decorators.
     */
```
```rust
pub fn getDecoratorCount(self: VariableDeclaration) -> int;
```
## VariableDeclaration::hasInitializer

```rust
/**
     * Determines whether this variable declaration has the initializer.
     */
```
```rust
pub fn hasInitializer(self: VariableDeclaration) -> bool;
```
## VariableDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: VariableDeclaration) -> File;
```
## VariableDeclaration::getNameNode

```rust
/**
     * Gets the declared variable name
     */
```
```rust
pub fn getNameNode(self: VariableDeclaration) -> BindingName;
```
## VariableDeclaration::getExclamationToken

```rust
/**
     * Gets the `!` token of this variable declaration. (Optional)
     */
```
```rust
pub fn getExclamationToken(self: VariableDeclaration) -> ExclamationToken;
```
## VariableDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: VariableDeclaration) -> *Modifier;
```
## VariableDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: VariableDeclaration, i: int) -> Modifier;
```
## VariableDeclaration::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: VariableDeclaration) -> string;
```
## VariableDeclaration::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: VariableDeclaration) -> string;
```
## VariableDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getInitializer

```rust
/**
     * Gets the initialization expression. (Optional)
     */
```
```rust
pub fn getInitializer(self: VariableDeclaration) -> Expression;
```
## VariableDeclaration::getTypeNode

```rust
/**
     * Gets the type node of the variable declaration. (Optional)
     */
```
```rust
pub fn getTypeNode(self: VariableDeclaration) -> TypeNode;
```
## VariableDeclaration::hasDefiniteAssignmentAssertion

```rust
/**
     * Determines whether this variable declaration has the definite assignment assertion.
     */
```
```rust
pub fn hasDefiniteAssignmentAssertion(self: VariableDeclaration) -> bool;
```
## VariableDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *VariableDeclaration;
```
## VariableDeclaration::is\<T\>

```rust
pub fn is<T>(self: VariableDeclaration) -> bool;
```
## VariableDeclaration::to\<T\>

```rust
pub fn to<T>(self: VariableDeclaration) -> <any>;
```
## VariableDeclaration::key\_neq

```rust
pub fn key_neq(self: VariableDeclaration, object: <any>) -> bool;
```
## VariableDeclaration::key\_eq

```rust
pub fn key_eq(self: VariableDeclaration, object: <any>) -> bool;
```
## VariableDeclaration::to\_set

```rust
pub fn to_set(self: VariableDeclaration) -> *VariableDeclaration;
```
