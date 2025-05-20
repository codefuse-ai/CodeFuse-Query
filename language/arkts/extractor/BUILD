load("//:visibility.bzl", "PUBLIC_VISIBILITY")

genrule(
    name = "ohos_typescript_compile",
    srcs = [],
    tools = [
        "@ohos_typescript_src//:compile_typescript"
    ],
    outs = ["ohos-typescript"],
    cmd = """
    export OHOS_TYPESCRIPT_SRC=$$(dirname $$(pwd)/$(execpath @ohos_typescript_src//:compile_typescript))
    export OUTPUT_DIR=$$(dirname $$(pwd)/$@)
    export OHOS_TYPESCRIPT_SRC_CP=$$OUTPUT_DIR/ohos_typescript_src
    cp -r $$OHOS_TYPESCRIPT_SRC $$OUTPUT_DIR
    mkdir $(OUTS)
    # must change dir to src, then execute compile script
    cd $$OHOS_TYPESCRIPT_SRC_CP
    python3 compile_typescript.py . $$OUTPUT_DIR/ohos-typescript
    echo ohos_typescript build success: $$OUTPUT_DIR/ohos-typescript
    """,
)

genrule(
    name = "build-coref-arkts-src-extractor",
    srcs = glob(["src/**/*.ts"]) + glob(["sdk/**/*"]) + [
        "schema.prisma",
        "package.json",
        "package-lock.json",
        "paths.json",
        "tsconfig.json",
        "@pkg_cache//:node-bin",
    ] + [":ohos_typescript_compile"],
    tools = [
        "@nodejs_host//:npm_bin",
    ],
    outs = [
        "coref-arkts-src-extractor",
    ],
    cmd = """
    NPM_PATH="$$(pwd)/$(execpath @nodejs_host//:npm_bin)"
    echo NPM_PATH: $$NPM_PATH

    export PKG_CACHE_PATH=$$(dirname $$(dirname $$(pwd)/$(execpath @pkg_cache//:node-bin)))
    echo PKG_CACHE_PATH: $$PKG_CACHE_PATH

    OUT_PATH="$$(pwd)/$@"
    echo OUT_PATH: $$OUT_PATH

    # 注意在下面cd前对需要拷贝的typescript进行路径确认
    export THIRD_TYPESCIRPT_PATH=$$(pwd)/$(location :ohos_typescript_compile)
    echo THIRD_TYPESCIRPT_PATH: $$THIRD_TYPESCIRPT_PATH

    cd language/arkts/extractor
    
    $$NPM_PATH i
    cp -rf $$THIRD_TYPESCIRPT_PATH ./node_modules/
    $$NPM_PATH run pkg
    mv coref-arkts-src-extractor $$OUT_PATH
    """,
    executable = 1,
    visibility = ["//visibility:public"],
)
