# MetainfoDO

Primary key: `oid: int`

```rust
schema MetainfoDO {
  value: string,
  program_hash_id: int,
  kind: string,
  @primary oid: int
}
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
## MetainfoDO::getProgramHashId

```java
/**
* @brief gets the program hash id of this element.
* @return int
*/
```
```rust
pub fn getProgramHashId(self: MetainfoDO) -> int;
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
pub fn __all__(db: JavaDB) -> *MetainfoDO;
```
