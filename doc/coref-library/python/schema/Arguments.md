# Arguments

Primary key: `element_oid: int`

```rust
schema Arguments {
  @primary element_oid: int,
  parent_oid: int,
  printable_text: string,
}
```
## Arguments::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: Arguments) -> int;
```
## Arguments::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: Arguments) -> string;
```
## Arguments::getLocation

```rust
/**
     * @brief gets the location for the element's parent since this type has no location info.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Arguments) -> Location;
```
## Arguments::getParent

```rust
/**
     * @brief gets the parent element of the element
     * @return CombineElement 
     */
```
```rust
pub fn getParent(self: Arguments) -> CombineElement;
```
## Arguments::getArgByIndex

```rust
/**
     * @brief gets the arg in the arguments by index, if any.
     * @return Arg
     */
```
```rust
pub fn getArgByIndex(self: Arguments, i: int) -> Arg;
```
## Arguments::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return CombineElement 
     */
```
```rust
pub fn getAnAncestor(self: Arguments) -> *CombineElement;
```
## Arguments::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *Arguments;
```
## Arguments::is\<T\>

```rust
pub fn is<T>(self: Arguments) -> bool;
```
## Arguments::to\<T\>

```rust
pub fn to<T>(self: Arguments) -> <any>;
```
## Arguments::key\_neq

```rust
pub fn key_neq(self: Arguments, object: <any>) -> bool;
```
## Arguments::key\_eq

```rust
pub fn key_eq(self: Arguments, object: <any>) -> bool;
```
## Arguments::to\_set

```rust
pub fn to_set(self: Arguments) -> *Arguments;
```
