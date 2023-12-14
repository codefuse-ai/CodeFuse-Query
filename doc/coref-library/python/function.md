# Global Function of coref.python.gdl

## branchingExpression

```rust
pub fn branchingExpression(tmp1: int, tmp2: int) -> bool;
```
## branchingBooleanExpression

```rust
pub fn branchingBooleanExpression(tmp: int, size: int) -> bool;
```
## branchingIfExpression

```rust
pub fn branchingIfExpression(tmp: int, f: int) -> bool;
```
## branchingMatchCase

```rust
pub fn branchingMatchCase(l: MatchCase, f: Function) -> bool;
```
## branchingStatement

```rust
pub fn branchingStatement(tmp: Statement, f: Function) -> bool;
```
## branchingExceptHandle

```rust
pub fn branchingExceptHandle(c: ExceptHandler, f: Function) -> bool;
```
## getInternalInheritance

```rust
pub fn getInternalInheritance(c: Class, n: string, a: Class) -> bool;
```
## getInheritanceFromImport

```rust
pub fn getInheritanceFromImport(cc: Class, n: string, a: Class) -> bool;
```
## getInheritanceInTheSameModule

```rust
pub fn getInheritanceInTheSameModule(c: Class, n: string, a: Class) -> bool;
```
## isCommentElement

```rust
pub fn isCommentElement(e: CombineElement) -> bool;
```
