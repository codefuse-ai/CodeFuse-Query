# CallableBindingDO

Primary key: `caller_oid: int`

```rust
schema CallableBindingDO {
  callee_oid: int,
  @primary caller_oid: int,
}
```
## CallableBindingDO::getCalleeOid

```java
/**
* @brief gets the callee oid of this element.
* @return int
*/
```
```rust
pub fn getCalleeOid(self: CallableBindingDO) -> int;
```
## CallableBindingDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *CallableBindingDO;
```
