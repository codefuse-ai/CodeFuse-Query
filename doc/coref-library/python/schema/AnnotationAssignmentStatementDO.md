# AnnotationAssignmentStatementDO

Primary key: `element_oid: int`

```rust
schema AnnotationAssignmentStatementDO {
  target_oid: int,
  is_simple: int,
  annotation_oid: int,
  @primary element_oid: int,
}
```
## AnnotationAssignmentStatementDO::getIsSimple

```java
/**
* @brief gets the is simple of this element.
* @return int
*/
```
```rust
pub fn getIsSimple(self: AnnotationAssignmentStatementDO) -> int;
```
## AnnotationAssignmentStatementDO::getTargetOid

```java
/**
* @brief gets the target oid of this element.
* @return int
*/
```
```rust
pub fn getTargetOid(self: AnnotationAssignmentStatementDO) -> int;
```
## AnnotationAssignmentStatementDO::getAnnotationOid

```java
/**
* @brief gets the annotation oid of this element.
* @return int
*/
```
```rust
pub fn getAnnotationOid(self: AnnotationAssignmentStatementDO) -> int;
```
## AnnotationAssignmentStatementDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *AnnotationAssignmentStatementDO;
```
