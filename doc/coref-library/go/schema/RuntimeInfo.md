# RuntimeInfo

Inherit from [RuntimeInfoDO](./RuntimeInfoDO.md)

Primary key: `oid: int`

```rust
schema RuntimeInfo extends RuntimeInfoDO {
  @primary oid: int,
  build_version: string,
  go_os: string,
  extractor_info: string,
  go_arch: string,
}
```
## RuntimeInfo::getExtractorInfo

```java
/**
* @brief gets the extractor info of this element.
* @return string
*/
```
```rust
pub fn getExtractorInfo(self: RuntimeInfo) -> string;
```
## RuntimeInfo::getGoOs

```java
/**
* @brief gets the go os of this element.
* @return string
*/
```
```rust
pub fn getGoOs(self: RuntimeInfo) -> string;
```
## RuntimeInfo::getGoArch

```java
/**
* @brief gets the go arch of this element.
* @return string
*/
```
```rust
pub fn getGoArch(self: RuntimeInfo) -> string;
```
## RuntimeInfo::getBuildVersion

```java
/**
* @brief gets the build version of this element.
* @return string
*/
```
```rust
pub fn getBuildVersion(self: RuntimeInfo) -> string;
```
## RuntimeInfo::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *RuntimeInfo;
```
