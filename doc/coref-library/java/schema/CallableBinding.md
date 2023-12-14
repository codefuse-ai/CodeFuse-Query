# CallableBinding

Inherit from [CallableBindingDO](./CallableBindingDO.md)

Primary key: `caller_hash_id: int`

```rust
schema CallableBinding extends CallableBindingDO {
  @primary caller_hash_id: int,
  callee_hash_id: int,
}
```
## CallableBinding::getCalleeHashId

```java
/**
* @brief gets the target callable id of this call.
* @return int 
*/
```
```rust
pub fn getCalleeHashId(self: CallableBinding) -> int;
```
## CallableBinding::getCallee

```java
/**
* @brief gets the callee of the method access expression.
* @return Method 
*/
```
```rust
pub fn getCallee(self: CallableBinding) -> Callable;
```
## CallableBinding::getCaller

```java
/**
* @brief gets the caller expression.
* @return CallExpression 
*/
```
```rust
pub fn getCaller(self: CallableBinding) -> CallExpression;
```
## CallableBinding::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *CallableBinding;
```
