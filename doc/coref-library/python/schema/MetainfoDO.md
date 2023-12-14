# MetainfoDO

Primary key: `oid: int`

```rust
schema MetainfoDO {
  program_oid: int,
  value: string,
  kind: string,
  @primary oid: int,
}
```
## MetainfoDO::getProgramOid

```java
/**
* @brief gets the program oid of this element.
* @return int
*/
```
```rust
pub fn getProgramOid(self: MetainfoDO) -> int;
```
## MetainfoDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: MetainfoDO) -> string;
```
## MetainfoDO::getKind

```java
/**
* @brief gets the kind of this element.
* @return string
*/
```
```rust
pub fn getKind(self: MetainfoDO) -> string;
```
## MetainfoDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *MetainfoDO;
```
