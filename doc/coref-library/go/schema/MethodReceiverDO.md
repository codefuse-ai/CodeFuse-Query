# MethodReceiverDO

Primary key: `oid: int`

```rust
schema MethodReceiverDO {
  receiver: int,
  method: int,
  @primary oid: int
}
```
## MethodReceiverDO::getReceiver

```java
/**
* @brief gets the receiver of this element.
* @return int
*/
```
```rust
pub fn getReceiver(self: MethodReceiverDO) -> int;
```
## MethodReceiverDO::getMethod

```java
/**
* @brief gets the method of this element.
* @return int
*/
```
```rust
pub fn getMethod(self: MethodReceiverDO) -> int;
```
## MethodReceiverDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *MethodReceiverDO;
```
