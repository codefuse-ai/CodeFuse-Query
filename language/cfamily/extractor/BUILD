load("//:visibility.bzl", "PUBLIC_VISIBILITY")

package(
    default_visibility = ["//language:default_visibility"],
)

cc_library(
    name = "build-coref-files",
    srcs = glob(["Coref/**/*.cpp"]),
    hdrs = glob(["Coref/**/*.hpp"]),
    includes = [""],
    linkstatic = 1,
    visibility = ["//visibility:public"],
    deps = [
        "@llvm-project//clang:ast",
        "@llvm-project//clang:basic",
    ],
)

cc_library(
    name = "build-ast-files",
    srcs = glob(["AST/**/*.cpp"]),
    hdrs = glob(["AST/**/*.hpp"]) + [
        "Coref/SignatureGenerator.hpp",
        "Coref/CorefUri.hpp",
        "Coref/Utils/Switcher.h",
    ],
    includes = ["AST"],
    linkstatic = 1,
    visibility = ["//visibility:public"],
    deps = [
        ":digestpp",
        ":storage",
        "@llvm-project//clang:ast",
        "@llvm-project//clang:tooling",
    ],
)

cc_library(
    name = "sqlite_orm",
    hdrs = [
        "ThirdParty/sqlite_orm/sqlite_orm.h",
    ],
    linkstatic = 1,
    visibility = ["//visibility:public"],
)

cc_library(
    name = "digestpp",
    hdrs = glob([
        "ThirdParty/digestpp/**/*.hpp",
    ]),
    linkstatic = 1,
    visibility = ["//visibility:public"],
)

cc_library(
    name = "model",
    hdrs = [
        ":generate-headers",
    ],
    linkstatic = 1,
)

cc_library(
    name = "storage",
    srcs = glob(["Storage/*.cpp"]),
    hdrs = glob(["Storage/*.hpp"]) + [
        "Coref/CorefDef.hpp",
        ":generate-headers",
    ],
    linkstatic = 1,
    deps = [
        ":build-coref-files",
        ":model",
        ":sqlite_orm",
        "@com_github_rockwotj_sqlite_bazel//:sqlite3",
    ],
)

filegroup(
    name = "generate_headers_script",
    srcs = [
        "Tools/generate_headers.py",
    ],
)

filegroup(
    name = "j2-templates",
    srcs = glob(["**/*.j2"]),
)

# This rule will
# 1. run script to generate headers to source code directory
# 2. copy them to bazel sandbox directory in order to be built
genrule(
    name = "generate-headers",
    srcs = [
        "//language/cfamily/extractor:generate_headers_script",
        ":j2-templates",
        "coref_er_diagram.puml",
    ],
    outs = [
        "Model/Models.hpp",
        # Storage/StorageFacade.hpp needs to use #include "Storage.hpp" from its current dir
        # In order not to break CMAKE build, output Storage.hpp instead of Storage/Storage.hpp
        "Storage.hpp",
    ],
    cmd = " &&".join([
        "python3 -m pip install --user --break-system-packages -r $$(dirname $(location //language/cfamily/extractor:generate_headers_script))/requirements.txt",
        "python3 $(location //language/cfamily/extractor:generate_headers_script)",
        "cp $$(dirname $(location //language/cfamily/extractor:generate_headers_script))/../Model/Models.hpp $(location Model/Models.hpp)",
        "cp $$(dirname $(location //language/cfamily/extractor:generate_headers_script))/../Storage/Storage.hpp $(location Storage.hpp)",
    ]),
    message = "Generating files from jinja template for C++ model headers",
)

# This rule will copy Clang header files to <executable_path>/usr/lib/clang/<CLANG_VERSION>/include
# where CLANG_VERSION is configured by parsing bazel-bin/external/llvm-project/clang/include/clang/Basic/Version.inc file
genrule(
    name = "copy-clang-builtin-headers",
    srcs = [
        "@llvm-project//clang:basic_version_gen",
        "@llvm-project//clang:builtin_headers_gen",
    ],
    outs = [
        "usr/lib/clang",
    ],
    cmd = """
    CLANG_VERSION_STRING=$$(grep $(location @llvm-project//clang:basic_version_gen) -e 'CLANG_VERSION_STRING')
    CLANG_VERSION=$$(echo $$CLANG_VERSION_STRING | awk -F' ' '{print $$3}')
    CLANG_VERSION=$$(eval echo $$CLANG_VERSION) # strip double quote
    mkdir -p $@/$${CLANG_VERSION}
    cp -r $$(dirname $(location @llvm-project//clang:basic_version_gen))/../../../staging/include $@/$${CLANG_VERSION}
    """,
    message = "Copy Clang header files to <executable_path>/usr/lib/clang/<CLANG_VERSION>/include",
    visibility = ["//visibility:public"],
)

cc_binary(
    # Build binary under /usr/bin directory
    name = "usr/bin/coref-cfamily-src-extractor",
    srcs = ["main.cpp"],
    data = [":copy-clang-builtin-headers"],
    visibility = ["//visibility:public"],
    deps = [
        ":build-ast-files",
        ":build-coref-files",
        ":storage",
    ],
)

alias(
    name = "coref-cfamily-src-extractor",
    actual = "usr/bin/coref-cfamily-src-extractor",
    visibility = ["//visibility:public"],
)
