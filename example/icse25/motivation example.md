# Motivation Example

## Relation

### Java

```
field(id, tid, name, locId)
method(id, tid, name)
parent(id1, id2)
class(id, name)
interface(id, name)
type(id, n)
javaLoc(locId, s, e, path)
```

### XML

```
xmlEle()
xmlAttri()
```

### JS/TS

```
enclose(exprId, methodId)
callExpr(exprId, methodId, argExprId, callSiteId)
reference(refId, defId)
service(id, appId, locId)
jsLoc(locId, s, e, path)
app(id, name)
api(id, apiName, apiSignature, appId)
functionLikeDeclaration(id, name)
parent(id1, id2)
class(id, name)
```

## Rule

### Java

```
changedField(fid) :- (
    field(fid, _, _, locId),
    loc(locId, s, e, path),
    changedSet(line, path),
    line >= s,
    line <= e
).
fieldInClassType(fName, tName) :- (
    field(fid, _, fName),
    parent(fid, cid),
    class(cid, tName),
    type(tid, tName)
).

fieldInDescendantClassType(fName, tName) :- fieldInClassType(fName, tName).
fieldInDescendantClassType(fName, tName) :- fieldInClassType(fName, tName1), fieldInDescendantClassType(tName1, tName).

changedMethodInInterface(fid, mid, iid) :- (
    changedField(fid),
    field(fid, _, fName, _),
    fieldInDescendantClassType(fName, tName),
    type(tid, tName),
    method(mid, tid, _),
    parent(mid, iid),
    interface(iid, _)
).
```

### Java, XML

参考原论文

```
getChangedTrAPI(trInterfaceName, trMethodName) :- (
    changedMethodInInterface(fid, mid, iid),
    method(mid, _, trMethodName),
    interface(iid, trInterfaceName),
    service(bid, cid),
    in(iid, cid)
).
```

### JS

```
getAppFacade(appName, proxyFacadeName, facadeQualifiedName) :- (
    service(id, appId, locId),
    jsLoc(locId, _, _, path),
    path = "config/proxy.js",
    app(appId, appName),
    api(_, proxyFacadeName, facadeQualifiedName, appId)
).
getInfluencedTrAPI(appName, proxyFacadeName, facadeQualifiedName, trMethodName) :- (
    getChangedTrAPI(facadeQualifiedName, trMethodName),
    getAppFacade(appName, proxyFacadeName, facadeQualifiedName)
). 
```

### TS

```
getInfluencedTrAPICall(appName, proxyFacadeName, callExprId) :- (
    getInfluencedTrAPI(appName, proxyFacadeName, facadeQualifiedName, trMethodName),
    callExpr(callExprId, mid, _, callSiteId),
    reference(callSiteId, defId),
    api(defId, proxyFacadeName, _, _)
).

getInfluencedFrontEndAPI(rpcName, trFuncName) :- (
    getInfluencedTrAPICall(_, _, callExprId),
    enclose(callExprId, methodId),
    functionLikeDeclaration(mid, trFuncName),
    parent(mid, cid),
    class(cid, rpcName)
).
```

## Workflow

1. 根据变更行号，识别出变更内容为新增某一个Field f。
2. 通过影响面分析，得出有一个 Interface 的函数 m 的返回类型为包含这个新增字段的类 c。
3. 通过结合xml配置分析，这个函数 m 所在的 Interface i 实际为一个对外发布的 rpc 接口。
4. 通过分析 bff 应用的配置 proxy.js 文件，发现 该应用 配置了 变更的 rpc 接口。
5. 通过分析 bff 应用里所有的 函数调用，发现有使用了 该变更的 rpc 接口，并且 调用函数所在类也是对前端开放的服务接口，由于调用函数的传参与变更后的不一致，导致查询失败，使用该接口的前端服务全部崩溃。