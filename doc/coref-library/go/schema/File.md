# File

Primary key: `id: int`

```rust
schema File {
  @primary id: int,
}
```
## File::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: File, index: int) -> Node;
```
## File::getTextSize

```rust
pub fn getTextSize(self: File) -> int;
```
## File::getParentNode

```rust
pub fn getParentNode(self: File) -> Node;
```
## File::getBelongsFile

```rust
pub fn getBelongsFile(self: File) -> File;
```
## File::print

```rust
pub fn print(self: File) -> *string;
```
## File::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *File;
```
## File::getTextStartOffset

```rust
pub fn getTextStartOffset(self: File) -> int;
```
## File::getType

```rust
pub fn getType(self: File) -> string;
```
## File::getLineInfo

```rust
pub fn getLineInfo(self: File) -> NumberOfLineDO;
```
## File::getAnAncestor

```rust
pub fn getAnAncestor(self: File) -> *Node;
```
## File::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: File) -> int;
```
## File::hasLocation

```rust
pub fn hasLocation(self: File) -> bool;
```
## File::getChildCount

```rust
pub fn getChildCount(self: File) -> int;
```
## File::getName

```rust
pub fn getName(self: File) -> string;
```
## File::getBelongsPkg

```rust
pub fn getBelongsPkg(self: File) -> Pkg;
```
## File::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: File) -> string;
```
## File::countAssociatedComment

```rust
pub fn countAssociatedComment(self: File) -> int;
```
## File::getPkgLoc

```rust
pub fn getPkgLoc(self: File) -> Location;
```
## File::getFunctionCount

```java
/**
* 获取每个文件包含的函数
*/
```
```rust
pub fn getFunctionCount(self: File) -> int;
```
## File::getSha256Sum

```rust
pub fn getSha256Sum(self: File) -> string;
```
## File::getBelongsFunction

```rust
pub fn getBelongsFunction(self: File) -> Function;
```
## File::getLocation

```rust
pub fn getLocation(self: File) -> Location;
```
## File::isTestFile

```rust
pub fn isTestFile(self: File) -> bool;
```
## File::isRootNode

```rust
pub fn isRootNode(self: File) -> bool;
```
## File::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: File) -> string;
```
## File::isGoFile

```rust
pub fn isGoFile(self: File) -> bool;
```
## File::getAchildNode

```rust
pub fn getAchildNode(self: File) -> *Node;
```
## File::getPkgName

```rust
pub fn getPkgName(self: File) -> string;
```
## File::isModFile

```rust
pub fn isModFile(self: File) -> bool;
```
## File::getMd5Sum

```rust
pub fn getMd5Sum(self: File) -> string;
```
