# DiagnosticForDO

Primary key: `diagnostic: int`

```rust
schema DiagnosticForDO {
  file_number: int,
  file_number_diagnostic_number: int,
  compilation: int,
  @primary diagnostic: int,
}
```
## DiagnosticForDO::getFileNumberDiagnosticNumber

```java
/**
* @brief gets the file number diagnostic number of this element.
* @return int
*/
```
```rust
pub fn getFileNumberDiagnosticNumber(self: DiagnosticForDO) -> int;
```
## DiagnosticForDO::getCompilation

```java
/**
* @brief gets the compilation of this element.
* @return int
*/
```
```rust
pub fn getCompilation(self: DiagnosticForDO) -> int;
```
## DiagnosticForDO::getFileNumber

```java
/**
* @brief gets the file number of this element.
* @return int
*/
```
```rust
pub fn getFileNumber(self: DiagnosticForDO) -> int;
```
## DiagnosticForDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *DiagnosticForDO;
```
