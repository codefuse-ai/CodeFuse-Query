# XmlHasNamespaceDO

Primary key: `id: int`

```rust
schema XmlHasNamespaceDO {
  container_id: int,
  namespace_id: int,
  element_id: int,
  @primary id: int,
}
```
## XmlHasNamespaceDO::getNamespaceId

```rust
/**
     * @brief gets the namespace id.
     * @return int 
     */
```
```rust
pub fn getNamespaceId(self: XmlHasNamespaceDO) -> int;
```
## XmlHasNamespaceDO::getContainerId

```rust
/**
     * @brief gets the container id.
     * @return int 
     */
```
```rust
pub fn getContainerId(self: XmlHasNamespaceDO) -> int;
```
## XmlHasNamespaceDO::getElementId

```rust
/**
     * @brief gets the element id.
     * @return int 
     */
```
```rust
pub fn getElementId(self: XmlHasNamespaceDO) -> int;
```
## XmlHasNamespaceDO::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlHasNamespaceDO;
```
## XmlHasNamespaceDO::is\<T\>

```rust
pub fn is<T>(self: XmlHasNamespaceDO) -> bool;
```
## XmlHasNamespaceDO::to\<T\>

```rust
pub fn to<T>(self: XmlHasNamespaceDO) -> <any>;
```
## XmlHasNamespaceDO::key\_neq

```rust
pub fn key_neq(self: XmlHasNamespaceDO, object: <any>) -> bool;
```
## XmlHasNamespaceDO::key\_eq

```rust
pub fn key_eq(self: XmlHasNamespaceDO, object: <any>) -> bool;
```
## XmlHasNamespaceDO::to\_set

```rust
pub fn to_set(self: XmlHasNamespaceDO) -> *XmlHasNamespaceDO;
```
