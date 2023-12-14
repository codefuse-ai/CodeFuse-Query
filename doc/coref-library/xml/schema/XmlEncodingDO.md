# XmlEncodingDO

Primary key: `id: int`

```rust
schema XmlEncodingDO {
  encoding: string,
  @primary id: int,
}
```
## XmlEncodingDO::getEncoding

```java
/**
* @brief gets the encoding information.
* @return string 
*/
```
```rust
pub fn getEncoding(self: XmlEncodingDO) -> string;
```
## XmlEncodingDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlEncodingDO;
```
