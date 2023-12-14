# Location

Inherit from [LocationDO](./LocationDO.md)

Primary key: `oid: int`

```rust
schema Location extends LocationDO {
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

```java
/**
* Gets the file of this location
* @return File 
*/
```
```rust
pub fn getFile(self: Location) -> File;
```
## Location::getRelativePath

```java
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

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *Location;
```
