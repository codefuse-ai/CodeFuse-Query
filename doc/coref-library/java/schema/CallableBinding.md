# CallableBinding

Primary key: `caller_hash_id: int`

```rust
schema CallableBinding {
  @primary caller_hash_id: int,
  callee_hash_id: int,
}
```
## CallableBinding::getCalleeHashId

```rust
/**
     * @brief gets the target callable id of this call.
     * @return int 
     */
```
```rust
pub fn getCalleeHashId(self: CallableBinding) -> int;
```
## CallableBinding::getCallee

```rust
/**
     * @brief gets the callee of the method access expression.
     * @return Method 
     */
```
```rust
pub fn getCallee(self: CallableBinding) -> Callable;
```
## CallableBinding::getCaller

```rust
/**
     * @brief gets the caller expression.
     * @return CallExpression 
     */
```
```rust
pub fn getCaller(self: CallableBinding) -> CallExpression;
```
## CallableBinding::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *CallableBinding;
```
## CallableBinding::is\<T\>

```rust
pub fn is<T>(self: CallableBinding) -> bool;
```
## CallableBinding::to\<T\>

```rust
pub fn to<T>(self: CallableBinding) -> <any>;
```
## CallableBinding::key\_neq

```rust
pub fn key_neq(self: CallableBinding, object: <any>) -> bool;
```
## CallableBinding::key\_eq

```rust
pub fn key_eq(self: CallableBinding, object: <any>) -> bool;
```
## CallableBinding::to\_set

```rust
pub fn to_set(self: CallableBinding) -> *CallableBinding;
```
