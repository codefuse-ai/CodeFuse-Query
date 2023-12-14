# SuperConstructorInvocationDO

Primary key: `element_hash_id: int`

```rust
schema SuperConstructorInvocationDO {
  @primary element_hash_id: int,
}
```
## SuperConstructorInvocationDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *SuperConstructorInvocationDO;
```
## SuperConstructorInvocationDO::is\<T\>

```rust
pub fn is<T>(self: SuperConstructorInvocationDO) -> bool;
```
## SuperConstructorInvocationDO::to\<T\>

```rust
pub fn to<T>(self: SuperConstructorInvocationDO) -> <any>;
```
## SuperConstructorInvocationDO::key\_neq

```rust
pub fn key_neq(self: SuperConstructorInvocationDO, object: <any>) -> bool;
```
## SuperConstructorInvocationDO::key\_eq

```rust
pub fn key_eq(self: SuperConstructorInvocationDO, object: <any>) -> bool;
```
## SuperConstructorInvocationDO::to\_set

```rust
pub fn to_set(self: SuperConstructorInvocationDO) -> *SuperConstructorInvocationDO;
```
