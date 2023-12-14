# CommentDO

Primary key: `element_oid: int`

```rust
schema CommentDO {
  location_oid: int,
  parent_oid: int,
  text: string,
  @primary element_oid: int,
}
```
## CommentDO::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: CommentDO) -> int;
```
## CommentDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: CommentDO) -> int;
```
## CommentDO::getText

```java
/**
* @brief gets the text of this element.
* @return string
*/
```
```rust
pub fn getText(self: CommentDO) -> string;
```
## CommentDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *CommentDO;
```
