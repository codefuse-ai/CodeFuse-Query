# XmlEncoding

Inherit from [XmlEncodingDO](./XmlEncodingDO.md)

Primary key: `id: int`

```rust
schema XmlEncoding extends XmlEncodingDO {
  @primary id: int,
  encoding: string,
}
```
## XmlEncoding::getEncoding

```java
/**
* @brief gets the encoding information.
* @return string 
*/
```
```rust
pub fn getEncoding(self: XmlEncoding) -> string;
```
## XmlEncoding::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlEncoding;
```
