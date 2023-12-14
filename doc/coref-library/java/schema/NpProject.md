# NpProject

Primary key: `element_hash_id: int`

```rust
schema NpProject {
  @primary element_hash_id: int,
  name: string,
  extension: string,
}
```
## NpProject::getExtension

```rust
/**
     * @brief gets the extension of this element.
     * @return string
     */
```
```rust
pub fn getExtension(self: NpProject) -> string;
```
## NpProject::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: NpProject) -> string;
```
## NpProject::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *NpProject;
```
## NpProject::is\<T\>

```rust
pub fn is<T>(self: NpProject) -> bool;
```
## NpProject::to\<T\>

```rust
pub fn to<T>(self: NpProject) -> <any>;
```
## NpProject::key\_neq

```rust
pub fn key_neq(self: NpProject, object: <any>) -> bool;
```
## NpProject::key\_eq

```rust
pub fn key_eq(self: NpProject, object: <any>) -> bool;
```
## NpProject::to\_set

```rust
pub fn to_set(self: NpProject) -> *NpProject;
```
