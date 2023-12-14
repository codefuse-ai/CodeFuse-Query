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

```rust
/**
     * @brief gets the is simple of this element.
     * @return int
     */
```
```rust
pub fn getIsSimple(self: AnnotationAssignmentStatementDO) -> int;
```
## AnnotationAssignmentStatementDO::getTargetOid

```rust
/**
     * @brief gets the target oid of this element.
     * @return int
     */
```
```rust
pub fn getTargetOid(self: AnnotationAssignmentStatementDO) -> int;
```
## AnnotationAssignmentStatementDO::getAnnotationOid

```rust
/**
     * @brief gets the annotation oid of this element.
     * @return int
     */
```
```rust
pub fn getAnnotationOid(self: AnnotationAssignmentStatementDO) -> int;
```
## AnnotationAssignmentStatementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *AnnotationAssignmentStatementDO;
```
## AnnotationAssignmentStatementDO::is\<T\>

```rust
pub fn is<T>(self: AnnotationAssignmentStatementDO) -> bool;
```
## AnnotationAssignmentStatementDO::to\<T\>

```rust
pub fn to<T>(self: AnnotationAssignmentStatementDO) -> <any>;
```
## AnnotationAssignmentStatementDO::key\_neq

```rust
pub fn key_neq(self: AnnotationAssignmentStatementDO, object: <any>) -> bool;
```
## AnnotationAssignmentStatementDO::key\_eq

```rust
pub fn key_eq(self: AnnotationAssignmentStatementDO, object: <any>) -> bool;
```
## AnnotationAssignmentStatementDO::to\_set

```rust
pub fn to_set(self: AnnotationAssignmentStatementDO) -> *AnnotationAssignmentStatementDO;
```
