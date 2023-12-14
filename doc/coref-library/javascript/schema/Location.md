# Location

Primary key: `oid: int`

```rust
schema Location {
  @primary oid: int,
  file_oid: int,
  text: string,
  end_column_number: int,
  start_line_number: int,
  start_column_number: int,
  end_line_number: int,
}
```
## Location::getFileOid

```rust
pub fn getFileOid(self: Location) -> int;
```
## Location::getStartLineNumber

```rust
pub fn getStartLineNumber(self: Location) -> int;
```
## Location::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: Location) -> int;
```
## Location::getText

```rust
pub fn getText(self: Location) -> string;
```
## Location::getFile

```rust
/**
     * Gets the file of this location
     * @return File 
     */
```
```rust
pub fn getFile(self: Location) -> File;
```
## Location::getRelativePath

```rust
/**
     * Gets the file relative path of this location
     */
```
```rust
pub fn getRelativePath(self: Location) -> string;
```
## Location::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: Location) -> int;
```
## Location::getEndLineNumber

```rust
pub fn getEndLineNumber(self: Location) -> int;
```
## Location::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *Location;
```
## Location::is\<T\>

```rust
pub fn is<T>(self: Location) -> bool;
```
## Location::to\<T\>

```rust
pub fn to<T>(self: Location) -> <any>;
```
## Location::key\_neq

```rust
pub fn key_neq(self: Location, object: <any>) -> bool;
```
## Location::key\_eq

```rust
pub fn key_eq(self: Location, object: <any>) -> bool;
```
## Location::to\_set

```rust
pub fn to_set(self: Location) -> *Location;
```
