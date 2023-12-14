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

```rust
/**
     * @brief gets the file number diagnostic number of this element.
     * @return int
     */
```
```rust
pub fn getFileNumberDiagnosticNumber(self: DiagnosticForDO) -> int;
```
## DiagnosticForDO::getCompilation

```rust
/**
     * @brief gets the compilation of this element.
     * @return int
     */
```
```rust
pub fn getCompilation(self: DiagnosticForDO) -> int;
```
## DiagnosticForDO::getFileNumber

```rust
/**
     * @brief gets the file number of this element.
     * @return int
     */
```
```rust
pub fn getFileNumber(self: DiagnosticForDO) -> int;
```
## DiagnosticForDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *DiagnosticForDO;
```
## DiagnosticForDO::is\<T\>

```rust
pub fn is<T>(self: DiagnosticForDO) -> bool;
```
## DiagnosticForDO::to\<T\>

```rust
pub fn to<T>(self: DiagnosticForDO) -> <any>;
```
## DiagnosticForDO::key\_neq

```rust
pub fn key_neq(self: DiagnosticForDO, object: <any>) -> bool;
```
## DiagnosticForDO::key\_eq

```rust
pub fn key_eq(self: DiagnosticForDO, object: <any>) -> bool;
```
## DiagnosticForDO::to\_set

```rust
pub fn to_set(self: DiagnosticForDO) -> *DiagnosticForDO;
```
