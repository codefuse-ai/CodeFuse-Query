# XmlEncoding

Primary key: `id: int`

```rust
schema XmlEncoding {
  @primary id: int,
  encoding: string,
}
```
## XmlEncoding::getEncoding

```rust
/**
     * @brief gets the encoding information.
     * @return string 
     */
```
```rust
pub fn getEncoding(self: XmlEncoding) -> string;
```
## XmlEncoding::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlEncoding;
```
## XmlEncoding::is\<T\>

```rust
pub fn is<T>(self: XmlEncoding) -> bool;
```
## XmlEncoding::to\<T\>

```rust
pub fn to<T>(self: XmlEncoding) -> <any>;
```
## XmlEncoding::key\_neq

```rust
pub fn key_neq(self: XmlEncoding, object: <any>) -> bool;
```
## XmlEncoding::key\_eq

```rust
pub fn key_eq(self: XmlEncoding, object: <any>) -> bool;
```
## XmlEncoding::to\_set

```rust
pub fn to_set(self: XmlEncoding) -> *XmlEncoding;
```
