# GödelScript Enum

Back to [README.md](../../README.md#documents)

## Declaration

```rust
enum Status {
    exited,  // 0
    running, // 1
    suspend  // 2
}
```

Usage:

```rust
fn example() -> Status {
    Status::exited
    Status::running
    Status::suspend
}
```

Back to [README.md](../../README.md#documents)
