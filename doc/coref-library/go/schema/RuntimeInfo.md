# RuntimeInfo

Primary key: `oid: int`

```rust
schema RuntimeInfo {
  @primary oid: int,
  build_version: string,
  go_os: string,
  extractor_info: string,
  go_arch: string,
}
```
## RuntimeInfo::getExtractorInfo

```rust
/**
     * @brief gets the extractor info of this element.
     * @return string
     */
```
```rust
pub fn getExtractorInfo(self: RuntimeInfo) -> string;
```
## RuntimeInfo::getGoOs

```rust
/**
     * @brief gets the go os of this element.
     * @return string
     */
```
```rust
pub fn getGoOs(self: RuntimeInfo) -> string;
```
## RuntimeInfo::getGoArch

```rust
/**
     * @brief gets the go arch of this element.
     * @return string
     */
```
```rust
pub fn getGoArch(self: RuntimeInfo) -> string;
```
## RuntimeInfo::getBuildVersion

```rust
/**
     * @brief gets the build version of this element.
     * @return string
     */
```
```rust
pub fn getBuildVersion(self: RuntimeInfo) -> string;
```
## RuntimeInfo::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *RuntimeInfo;
```
## RuntimeInfo::is\<T\>

```rust
pub fn is<T>(self: RuntimeInfo) -> bool;
```
## RuntimeInfo::to\<T\>

```rust
pub fn to<T>(self: RuntimeInfo) -> <any>;
```
## RuntimeInfo::key\_neq

```rust
pub fn key_neq(self: RuntimeInfo, object: <any>) -> bool;
```
## RuntimeInfo::key\_eq

```rust
pub fn key_eq(self: RuntimeInfo, object: <any>) -> bool;
```
## RuntimeInfo::to\_set

```rust
pub fn to_set(self: RuntimeInfo) -> *RuntimeInfo;
```
