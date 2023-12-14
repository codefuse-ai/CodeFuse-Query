# GoFile

Inherit from [File](./File.md)

Primary key: `id: int`

```rust
schema GoFile extends File {
  @primary id: int,
}
```
## GoFile::getMd5Sum

```rust
pub fn getMd5Sum(self: GoFile) -> string;
```
## GoFile::isModFile

```rust
pub fn isModFile(self: GoFile) -> bool;
```
## GoFile::getPkgName

```rust
pub fn getPkgName(self: GoFile) -> string;
```
## GoFile::getAchildNode

```rust
pub fn getAchildNode(self: GoFile) -> *Node;
```
## GoFile::isGoFile

```rust
pub fn isGoFile(self: GoFile) -> bool;
```
## GoFile::getText

```java
// getText Extract the text associated with a specific node in a file
```
```rust
pub fn getText(self: GoFile) -> string;
```
## GoFile::isRootNode

```rust
pub fn isRootNode(self: GoFile) -> bool;
```
## GoFile::isTestFile

```rust
pub fn isTestFile(self: GoFile) -> bool;
```
## GoFile::getLocation

```rust
pub fn getLocation(self: GoFile) -> Location;
```
## GoFile::getBelongsFunction

```rust
pub fn getBelongsFunction(self: GoFile) -> Function;
```
## GoFile::getPkgLoc

```rust
pub fn getPkgLoc(self: GoFile) -> Location;
```
## GoFile::countAssociatedComment

```rust
pub fn countAssociatedComment(self: GoFile) -> int;
```
## GoFile::getChildCount

```rust
pub fn getChildCount(self: GoFile) -> int;
```
## GoFile::getBelongsPkg

```rust
pub fn getBelongsPkg(self: GoFile) -> Pkg;
```
## GoFile::getAssociatedCommentString

```rust
pub fn getAssociatedCommentString(self: GoFile) -> string;
```
## GoFile::getName

```rust
pub fn getName(self: GoFile) -> string;
```
## GoFile::filterByKeyWords

```java
// filterByKeyWords
```
```rust
pub fn filterByKeyWords(self: GoFile) -> bool;
```
## GoFile::getDepthFromRoot

```rust
pub fn getDepthFromRoot(self: GoFile) -> int;
```
## GoFile::hasLocation

```rust
pub fn hasLocation(self: GoFile) -> bool;
```
## GoFile::getAnAncestor

```rust
pub fn getAnAncestor(self: GoFile) -> *Node;
```
## GoFile::getSha256Sum

```rust
pub fn getSha256Sum(self: GoFile) -> string;
```
## GoFile::getFunctionCount

```java
/**
* 获取每个文件包含的函数
*/
```
```rust
pub fn getFunctionCount(self: GoFile) -> int;
```
## GoFile::getLineInfo

```rust
pub fn getLineInfo(self: GoFile) -> NumberOfLineDO;
```
## GoFile::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *GoFile;
```
## GoFile::getTextStartOffset

```rust
pub fn getTextStartOffset(self: GoFile) -> int;
```
## GoFile::getType

```rust
pub fn getType(self: GoFile) -> string;
```
## GoFile::getBelongsFile

```rust
pub fn getBelongsFile(self: GoFile) -> File;
```
## GoFile::getParentNode

```rust
pub fn getParentNode(self: GoFile) -> Node;
```
## GoFile::isAutoGenereatedFile

```rust
pub fn isAutoGenereatedFile(self: GoFile) -> bool;
```
## GoFile::filterByFolderNames

```java
// filterByFolderNames
```
```rust
pub fn filterByFolderNames(self: GoFile) -> bool;
```
## GoFile::print

```rust
pub fn print(self: GoFile) -> *string;
```
## GoFile::getAnAncestorForIndex

```rust
pub fn getAnAncestorForIndex(self: GoFile, index: int) -> Node;
```
## GoFile::getTextSize

```rust
pub fn getTextSize(self: GoFile) -> int;
```
