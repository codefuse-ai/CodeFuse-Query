# RuntimeInfoDO

Primary key: `oid: int`

```rust
schema RuntimeInfoDO {
  go_arch: string,
  extractor_info: string,
  go_os: string,
  build_version: string,
  @primary oid: int,
}
```
## RuntimeInfoDO::getGoArch

```rust
/**
     * @brief gets the go arch of this element.
     * @return string
     */
```
```rust
pub fn getGoArch(self: RuntimeInfoDO) -> string;
```
## RuntimeInfoDO::getGoOs

```rust
/**
     * @brief gets the go os of this element.
     * @return string
     */
```
```rust
pub fn getGoOs(self: RuntimeInfoDO) -> string;
```
## RuntimeInfoDO::getExtractorInfo

```rust
/**
     * @brief gets the extractor info of this element.
     * @return string
     */
```
```rust
pub fn getExtractorInfo(self: RuntimeInfoDO) -> string;
```
## RuntimeInfoDO::getBuildVersion

```rust
/**
     * @brief gets the build version of this element.
     * @return string
     */
```
```rust
pub fn getBuildVersion(self: RuntimeInfoDO) -> string;
```
## RuntimeInfoDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *RuntimeInfoDO;
```
## RuntimeInfoDO::is\<T\>

```rust
pub fn is<T>(self: RuntimeInfoDO) -> bool;
```
## RuntimeInfoDO::to\<T\>

```rust
pub fn to<T>(self: RuntimeInfoDO) -> <any>;
```
## RuntimeInfoDO::key\_neq

```rust
pub fn key_neq(self: RuntimeInfoDO, object: <any>) -> bool;
```
## RuntimeInfoDO::key\_eq

```rust
pub fn key_eq(self: RuntimeInfoDO, object: <any>) -> bool;
```
## RuntimeInfoDO::to\_set

```rust
pub fn to_set(self: RuntimeInfoDO) -> *RuntimeInfoDO;
```
