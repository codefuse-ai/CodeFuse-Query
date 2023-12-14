# MetricCallable

Primary key: `id: int`

```rust
schema MetricCallable {
  @primary id: int,
}
```
## MetricCallable::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: MetricCallable) -> Location;
```
## MetricCallable::getCalleeFromAnonymousMethod

```java
/**
* @brief gets the extra callee from enclosed anonymous method.
* @return callee 
*/
```
```rust
pub fn getCalleeFromAnonymousMethod(self: MetricCallable) -> *Callable;
```
## MetricCallable::getModifier

```java
/**
* @brief gets the modifier of the callable.
* @return Modifier 
*/
```
```rust
pub fn getModifier(self: MetricCallable) -> *Modifier;
```
## MetricCallable::getSignature

```java
/**
* @brief gets the name of the callable
* @return string 
*/
```
```rust
pub fn getSignature(self: MetricCallable) -> string;
```
## MetricCallable::getBody

```java
/**
* @brief gets the body of the method.
* @return CodeBlock 
*/
```
```rust
pub fn getBody(self: MetricCallable) -> CodeBlock;
```
## MetricCallable::getEnclosedAnonymousMethod

```java
/**
* @brief gets the anonymous method enclosed by it.
* @return AnonymousMethod 
*/
```
```rust
pub fn getEnclosedAnonymousMethod(self: MetricCallable) -> *AnonymousMethod;
```
## MetricCallable::getCaller

```java
/**
* @brief gets the caller of the callable
* @return Callable 
*/
```
```rust
pub fn getCaller(self: MetricCallable) -> *Callable;
```
## MetricCallable::getEfferentCoupling

```java
/**
* @brief * The efferent coupling of a callable is defined as
* the number of callables on which this callable depends.
*
* This may also be referred to as the "fan-out" or
* "outgoing dependencies" of a callable.
* @return int 
*/
```
```rust
pub fn getEfferentCoupling(self: MetricCallable) -> int;
```
## MetricCallable::getName

```java
/**
* @brief gets the name of the callable
* @return string 
*/
```
```rust
pub fn getName(self: MetricCallable) -> string;
```
## MetricCallable::getParameter

```java
/**
* @brief gets the parameter of the method, if any.
* @return Parameter 
*/
```
```rust
pub fn getParameter(self: MetricCallable) -> *Parameter;
```
## MetricCallable::getAfferentCoupling

```java
/**
* @brief The afferent coupling of a callable is defined as
* the number of callables that depend on this callable.
*
* This may also be referred to as the "fan-in" or
* "incoming dependencies" of a callable.
* @return int 
*/
```
```rust
pub fn getAfferentCoupling(self: MetricCallable) -> int;
```
## MetricCallable::getReturnType

```java
/**
* @brief gets the type for the element.
* @return Type
*/
```
```rust
pub fn getReturnType(self: MetricCallable) -> Type;
```
## MetricCallable::getPolyCallable

```java
/**
* @brief gets the polymorphism methods of the method, if any.
* @return Method 
*/
```
```rust
pub fn getPolyCallable(self: MetricCallable) -> *Callable;
```
## MetricCallable::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: MetricCallable) -> *ElementParent;
```
## MetricCallable::getAnAncestorCaller

```java
/**
* @brief gets an ancestor caller of the callable, if any
* @return Callable 
*/
```
```rust
pub fn getAnAncestorCaller(self: MetricCallable) -> *Callable;
```
## MetricCallable::getCallee

```java
/**
* @brief gets the callee of the callable
* @return Callable 
*/
```
```rust
pub fn getCallee(self: MetricCallable) -> *Callable;
```
## MetricCallable::getCyclomaticComplexity

```java
/**
* @brief The cyclomatic complexity of a callable is defined as the number
* of branching statements (`if`, `while`, `do`, `for`, `switch`, `case`, `catch`)
* plus the number of branching expressions (`?`, `&&` and `||`)
* plus one.
* @return int 
*/
```
```rust
pub fn getCyclomaticComplexity(self: MetricCallable) -> int;
```
## MetricCallable::getHalsteadVocabulary

```java
/**
* @brief  The Halstead vocabulary of a callable is estimated as the number of unique Halstead IDs of all statements and expressions within the callable.
* @return int 
*/
```
```rust
pub fn getHalsteadVocabulary(self: MetricCallable) -> int;
```
## MetricCallable::getBelongedClass

```java
/**
* @brief gets the parent of the Callable element.
* @return ClassOrInterface 
*/
```
```rust
pub fn getBelongedClass(self: MetricCallable) -> ClassOrInterface;
```
## MetricCallable::getADependency

```java
/**
* @brief * Gets a callable on which this callable depends. A callable `m` depends on another callable `n` if there exists a call to `n` from within `m`, taking overriding into account.
* @return Callable 
*/
```
```rust
pub fn getADependency(self: MetricCallable) -> *Callable;
```
## MetricCallable::getType

```java
/**
* @brief gets the name of the callable
* @return string 
*/
```
```rust
pub fn getType(self: MetricCallable) -> Type;
```
## MetricCallable::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *MetricCallable;
```
## MetricCallable::getAnAncestorCallee

```java
/**
* @brief gets an ancestor callee of the callable, if any
* @return Callable 
*/
```
```rust
pub fn getAnAncestorCallee(self: MetricCallable) -> *Callable;
```
## MetricCallable::getBelongedInterface

```java
/**
* @brief gets the parent of the Callable element.
* @return Interface 
*/
```
```rust
pub fn getBelongedInterface(self: MetricCallable) -> Interface;
```
## MetricCallable::getAnnotation

```java
/**
* @brief gets the annotation of the Callable element.
* @return Annotation 
*/
```
```rust
pub fn getAnnotation(self: MetricCallable) -> *Annotation;
```
## MetricCallable::getSize

```java
/**
* @brief gets the size for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: MetricCallable) -> NumberOfLines;
```
## MetricCallable::getHalsteadLength

```java
/**
* @brief The Halstead length of a callable is estimated as the sum of the number of statements and expressions within the callable, plus one for the callable itself.
* @return int 
*/
```
```rust
pub fn getHalsteadLength(self: MetricCallable) -> int;
```
