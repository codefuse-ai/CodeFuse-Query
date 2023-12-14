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

```java
/**
* @brief gets the go arch of this element.
* @return string
*/
```
```rust
pub fn getGoArch(self: RuntimeInfoDO) -> string;
```
## RuntimeInfoDO::getGoOs

```java
/**
* @brief gets the go os of this element.
* @return string
*/
```
```rust
pub fn getGoOs(self: RuntimeInfoDO) -> string;
```
## RuntimeInfoDO::getExtractorInfo

```java
/**
* @brief gets the extractor info of this element.
* @return string
*/
```
```rust
pub fn getExtractorInfo(self: RuntimeInfoDO) -> string;
```
## RuntimeInfoDO::getBuildVersion

```java
/**
* @brief gets the build version of this element.
* @return string
*/
```
```rust
pub fn getBuildVersion(self: RuntimeInfoDO) -> string;
```
## RuntimeInfoDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *RuntimeInfoDO;
```
