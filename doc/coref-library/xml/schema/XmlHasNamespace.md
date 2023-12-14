# XmlHasNamespace

Inherit from [XmlHasNamespaceDO](./XmlHasNamespaceDO.md)

Primary key: `id: int`

```rust
schema XmlHasNamespace extends XmlHasNamespaceDO {
  @primary id: int,
  element_id: int,
  namespace_id: int,
  container_id: int,
}
```
## XmlHasNamespace::getElementId

```java
/**
* @brief gets the element id.
* @return int 
*/
```
```rust
pub fn getElementId(self: XmlHasNamespace) -> int;
```
## XmlHasNamespace::getNamespaceId

```java
/**
* @brief gets the namespace id.
* @return int 
*/
```
```rust
pub fn getNamespaceId(self: XmlHasNamespace) -> int;
```
## XmlHasNamespace::getFile

```java
/**
* @brief gets the file of the location.
* @return XmlFile 
*/
```
```rust
pub fn getFile(self: XmlHasNamespace) -> XmlFile;
```
## XmlHasNamespace::getXmlNamespace

```java
/**
* @brief gets the namespace of the relation.
* @return XmlNamespace 
*/
```
```rust
pub fn getXmlNamespace(self: XmlHasNamespace) -> XmlNamespace;
```
## XmlHasNamespace::getXmlElement

```java
/**
* @brief gets the element of the relation.
* @return XmlElement 
*/
```
```rust
pub fn getXmlElement(self: XmlHasNamespace) -> XmlElement;
```
## XmlHasNamespace::getContainerId

```java
/**
* @brief gets the container id.
* @return int 
*/
```
```rust
pub fn getContainerId(self: XmlHasNamespace) -> int;
```
## XmlHasNamespace::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlHasNamespace;
```
