# MethodReceiverDO

Primary key: `oid: int`

```rust
schema MethodReceiverDO {
  receiver: int,
  method: int,
  @primary oid: int,
}
```
## MethodReceiverDO::getReceiver

```rust
/**
     * @brief gets the receiver of this element.
     * @return int
     */
```
```rust
pub fn getReceiver(self: MethodReceiverDO) -> int;
```
## MethodReceiverDO::getMethod

```rust
/**
     * @brief gets the method of this element.
     * @return int
     */
```
```rust
pub fn getMethod(self: MethodReceiverDO) -> int;
```
## MethodReceiverDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *MethodReceiverDO;
```
## MethodReceiverDO::is\<T\>

```rust
pub fn is<T>(self: MethodReceiverDO) -> bool;
```
## MethodReceiverDO::to\<T\>

```rust
pub fn to<T>(self: MethodReceiverDO) -> <any>;
```
## MethodReceiverDO::key\_neq

```rust
pub fn key_neq(self: MethodReceiverDO, object: <any>) -> bool;
```
## MethodReceiverDO::key\_eq

```rust
pub fn key_eq(self: MethodReceiverDO, object: <any>) -> bool;
```
## MethodReceiverDO::to\_set

```rust
pub fn to_set(self: MethodReceiverDO) -> *MethodReceiverDO;
```
