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

```java
/**
* @brief gets the namespace id.
* @return int 
*/
```
```rust
pub fn getNamespaceId(self: XmlHasNamespaceDO) -> int;
```
## XmlHasNamespaceDO::getContainerId

```java
/**
* @brief gets the container id.
* @return int 
*/
```
```rust
pub fn getContainerId(self: XmlHasNamespaceDO) -> int;
```
## XmlHasNamespaceDO::getElementId

```java
/**
* @brief gets the element id.
* @return int 
*/
```
```rust
pub fn getElementId(self: XmlHasNamespaceDO) -> int;
```
## XmlHasNamespaceDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlHasNamespaceDO;
```
