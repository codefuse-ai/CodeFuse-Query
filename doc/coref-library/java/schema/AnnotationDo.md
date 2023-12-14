# AnnotationDo

Primary key: `id: int`

```rust
schema AnnotationDo {
  @primary id: int,
}
```
## AnnotationDo::getAnnotationDeclaration

```rust
/**
     * @brief gets the declaration of the element, if any.
     * @return AnnotationDeclaration 
     */
```
```rust
pub fn getAnnotationDeclaration(self: AnnotationDo) -> AnnotationDeclaration;
```
## AnnotationDo::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: AnnotationDo) -> *ElementParent;
```
## AnnotationDo::getParent

```rust
/**
     * @brief gets the parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: AnnotationDo) -> ElementParent;
```
## AnnotationDo::getParentHashId

```rust
/**
     * @brief gets the parent id of the element.
     * @return int 
     */
```
```rust
pub fn getParentHashId(self: AnnotationDo) -> int;
```
## AnnotationDo::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: AnnotationDo) -> Location;
```
## AnnotationDo::getPrintableText

```rust
/**
     * @brief gets the name for the element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: AnnotationDo) -> string;
```
## AnnotationDo::getName

```rust
/**
     * @brief gets the name for the element.
     * @return string
     */
```
```rust
pub fn getName(self: AnnotationDo) -> string;
```
## AnnotationDo::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnnotationDo;
```
## AnnotationDo::is\<T\>

```rust
pub fn is<T>(self: AnnotationDo) -> bool;
```
## AnnotationDo::to\<T\>

```rust
pub fn to<T>(self: AnnotationDo) -> <any>;
```
## AnnotationDo::key\_neq

```rust
pub fn key_neq(self: AnnotationDo, object: <any>) -> bool;
```
## AnnotationDo::key\_eq

```rust
pub fn key_eq(self: AnnotationDo, object: <any>) -> bool;
```
## AnnotationDo::to\_set

```rust
pub fn to_set(self: AnnotationDo) -> *AnnotationDo;
```
