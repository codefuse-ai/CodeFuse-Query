# XmlHasNamespace

Primary key: `id: int`

```rust
schema XmlHasNamespace {
  @primary id: int,
  element_id: int,
  namespace_id: int,
  container_id: int,
}
```
## XmlHasNamespace::getElementId

```rust
/**
     * @brief gets the element id.
     * @return int 
     */
```
```rust
pub fn getElementId(self: XmlHasNamespace) -> int;
```
## XmlHasNamespace::getNamespaceId

```rust
/**
     * @brief gets the namespace id.
     * @return int 
     */
```
```rust
pub fn getNamespaceId(self: XmlHasNamespace) -> int;
```
## XmlHasNamespace::getFile

```rust
/**
      * @brief gets the file of the location.
      * @return XmlFile 
      */
```
```rust
pub fn getFile(self: XmlHasNamespace) -> XmlFile;
```
## XmlHasNamespace::getXmlNamespace

```rust
/**
      * @brief gets the namespace of the relation.
      * @return XmlNamespace 
      */
```
```rust
pub fn getXmlNamespace(self: XmlHasNamespace) -> XmlNamespace;
```
## XmlHasNamespace::getXmlElement

```rust
/**
      * @brief gets the element of the relation.
      * @return XmlElement 
      */
```
```rust
pub fn getXmlElement(self: XmlHasNamespace) -> XmlElement;
```
## XmlHasNamespace::getContainerId

```rust
/**
     * @brief gets the container id.
     * @return int 
     */
```
```rust
pub fn getContainerId(self: XmlHasNamespace) -> int;
```
## XmlHasNamespace::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlHasNamespace;
```
## XmlHasNamespace::is\<T\>

```rust
pub fn is<T>(self: XmlHasNamespace) -> bool;
```
## XmlHasNamespace::to\<T\>

```rust
pub fn to<T>(self: XmlHasNamespace) -> <any>;
```
## XmlHasNamespace::key\_neq

```rust
pub fn key_neq(self: XmlHasNamespace, object: <any>) -> bool;
```
## XmlHasNamespace::key\_eq

```rust
pub fn key_eq(self: XmlHasNamespace, object: <any>) -> bool;
```
## XmlHasNamespace::to\_set

```rust
pub fn to_set(self: XmlHasNamespace) -> *XmlHasNamespace;
```
