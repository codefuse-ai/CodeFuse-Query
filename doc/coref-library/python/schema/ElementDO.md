# ElementDO

Primary key: `oid: int`

```rust
schema ElementDO {
  type: string,
  parent_oid: int,
  value: string,
  @primary oid: int
}
```
## ElementDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: ElementDO) -> int;
```
## ElementDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: ElementDO) -> string;
```
## ElementDO::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: ElementDO) -> string;
```
## ElementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ElementDO;
```
