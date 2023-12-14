# XmlEncodingDO

Primary key: `id: int`

```rust
schema XmlEncodingDO {
  encoding: string,
  @primary id: int,
}
```
## XmlEncodingDO::getEncoding

```rust
/**
     * @brief gets the encoding information.
     * @return string 
     */
```
```rust
pub fn getEncoding(self: XmlEncodingDO) -> string;
```
## XmlEncodingDO::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlEncodingDO;
```
## XmlEncodingDO::is\<T\>

```rust
pub fn is<T>(self: XmlEncodingDO) -> bool;
```
## XmlEncodingDO::to\<T\>

```rust
pub fn to<T>(self: XmlEncodingDO) -> <any>;
```
## XmlEncodingDO::key\_neq

```rust
pub fn key_neq(self: XmlEncodingDO, object: <any>) -> bool;
```
## XmlEncodingDO::key\_eq

```rust
pub fn key_eq(self: XmlEncodingDO, object: <any>) -> bool;
```
## XmlEncodingDO::to\_set

```rust
pub fn to_set(self: XmlEncodingDO) -> *XmlEncodingDO;
```
