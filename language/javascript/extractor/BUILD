load("//:visibility.bzl", "PUBLIC_VISIBILITY")
load("@build_bazel_rules_nodejs//:index.bzl", "npm_package_bin")
load("@npm//@bazel/typescript:index.bzl", "ts_project")
load("@aspect_bazel_lib//lib:copy_to_bin.bzl", "copy_to_bin")

# Declare a naive ts_project just to install dependencies
ts_project(
    name = "ts-a",
    srcs = [
        "package.json",
    ],
    declaration = True,
    link_workspace_root = False,
    tsconfig = {
        "include": [
            "package.json",
        ],
        "exclude": [
            "**/node_modules/**/*",
        ],
    },
    validate = False,
    deps = [
        "@npm//@bazel/typescript",
        "@npm//@prisma/client",
        "@npm//@types/jest",
        "@npm//@types/lodash",
        "@npm//@types/node",
        "@npm//@types/shelljs",
        "@npm//@typescript-eslint/eslint-plugin",
        "@npm//@typescript-eslint/parser",
        "@npm//commander",
        "@npm//eslint",
        "@npm//ignore",
        "@npm//jest",
        "@npm//lodash",
        "@npm//pkg",
        "@npm//prettier",
        "@npm//prisma",
        "@npm//shelljs",
        "@npm//ts-jest",
        "@npm//ts-node",
        "@npm//typescript",
        "@npm//typescript-latest",
    ],
)

copy_to_bin(
    name = "copy-prisma-schema",
    srcs = [
        "prisma/schema.prisma",
    ],
)

copy_to_bin(
    name = "copy-package-json",
    srcs = [
        "package.json",
    ],
)

genrule(
    name = "prisma-postinstall",
    srcs = [
        "@npm//@prisma/client",
        "prisma/schema.prisma",
        ":ts-a",
        ":copy-prisma-schema",
        ":copy-package-json",
    ],
    outs = [
        "prisma-postinstall-generated",
    ],
    cmd = """
        $(location @nodejs_host//:npx_bin) --prefix language/javascript/extractor prisma generate --schema language/javascript/extractor/prisma/schema.prisma
        touch $@
    """,
    tools = [
        "@nodejs_host//:npx_bin",
        "@npm//prisma/bin:prisma",
    ],
)

genrule(
    name = "prisma-db",
    srcs = [
        "@npm//@prisma/client",
        ":copy-prisma-schema",
        ":copy-package-json",
        ":prisma-postinstall",
    ],
    outs = [
        "init.db",
    ],
    cmd = """
        cd $(RULEDIR)
        ../../../../../../$(location @npm//prisma/bin:prisma) db push --schema prisma/schema.prisma --skip-generate
    """,
    tools = [
        "@npm//prisma/bin:prisma",
    ],
)

genrule(
    name = "ts-src",
    srcs = glob(["src/**/*.ts"]) + [
        ":prisma-postinstall",
        ":copy-package-json",
        ":ts-a",
        "yarn.lock",
        "tsconfig.json",
    ],
    outs = [
        "dist",
    ],
    cmd = """
    $(location @npm//typescript-latest/bin:tsc) --project $(locations tsconfig.json) --outDir $@
    """,
    tools = [
        "@nodejs_host//:npm_bin",
        "@nodejs_host//:npx_bin",
        "@npm//typescript-latest/bin:tsc",
    ],
)

# export environment variable PKG_CACHE_PATH, can be used by pkg,
# pkg will find the nodejs binary file from PKG_CACHE_PATH directory.
genrule(
    name = "coref-javascript-src-extractor",
    srcs = [
        ":ts-src",
        ":prisma-db",
        ":copy-package-json",
        "@pkg_cache//:node-bin",
    ],
    outs = [
        "coref-javascript-src-extractor",
    ],
    cmd = """
    chmod 666 $(RULEDIR)/init.db
    chmod -R 777 $(RULEDIR)
    cp -r language/javascript/extractor/node_modules $(RULEDIR)/
    cp -r language/javascript/extractor/scripts $(RULEDIR)/
    $(location @nodejs_host//:node) $(RULEDIR)/scripts/fix-dot-prisma-client-package-json.js
    export PKG_CACHE_PATH=$$(dirname $$(dirname $(execpaths @pkg_cache//:node-bin)))
    echo $$PKG_CACHE_PATH
    $(location @npm//pkg/bin:pkg) $(RULEDIR) -C GZip -t node18 --options max-old-space-size=7168 -o $@
    """,
    executable = 1,
    tools = [
        "@nodejs_host//:node",
        "@npm//pkg/bin:pkg",
    ],
    visibility = ["//visibility:public"],
)

# genrule(
#    name = "coref-javascript-src-extractor",
#    srcs = glob(["src/**/*.ts"]) + [
#        "prisma/schema.prisma",
#        "package.json",
#        "yarn.lock",
#        "tsconfig.json",
#        "@pkg_cache//:node-bin",
#    ],
#    outs = [
#        "coref-javascript-src-extractor",
#    ],
#    cmd = """
#        export PKG_CACHE_PATH=$$(dirname $$(dirname $(execpaths @pkg_cache//:node-bin)))
#        echo $$PKG_CACHE_PATH
#        $(location @yarn//:yarn_bin) --cwd language/javascript/extractor install
#        $(location @yarn//:yarn_bin) --cwd language/javascript/extractor run build
#        $(location @nodejs_host//:npx_bin) --prefix language/javascript/extractor prisma db push --schema language/javascript/extractor/prisma/schema.prisma
#        $(location @nodejs_host//:npx_bin) --prefix language/javascript/extractor pkg language/javascript/extractor -C GZip -t node18 -o coref-javascript-src-extractor
#        mv coref-javascript-src-extractor $@
#    """,
#    tools = [
#         "@nodejs_host//:node",
#         "@yarn//:yarn_bin",
#         "@nodejs_host//:npx_bin",
#    ],
#    visibility = ["//visibility:public"],
# )
