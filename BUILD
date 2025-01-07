load("//:visibility.bzl", "PUBLIC_VISIBILITY")
load("@rules_pkg//pkg:tar.bzl", "pkg_tar")
load("@rules_pkg//pkg:mappings.bzl", "pkg_attributes", "pkg_files", "strip_prefix")

# This rule is deprecated but useful to pack a directory from output of genrule
load("@bazel_tools//tools/build_defs/pkg:pkg.bzl", pkg_tar_old = "pkg_tar")
load("@com_github_bazelbuild_buildtools//buildifier:def.bzl", "buildifier")
load("@aspect_bazel_lib//lib:copy_to_bin.bzl", "copy_to_bin")
load("@aspect_bazel_lib//lib:copy_to_directory.bzl", "copy_to_directory")

# By using select() in a configurable attribute, the attribute effectively adopts different values when different conditions hold.
config_setting(
    name = "custom_build",
    values = {
        "define": "enable_swift_extractor=false",
    },
)

# For convenience to use bazel run command (e.g. bazel run -- //:sparrow-cli-entrypoint database create) to execute sparrow-cli,
# so make this target as entrypoint for bazel run
genrule(
    name = "sparrow-cli-entrypoint",
    srcs = [":sparrow-cli"],
    outs = ["dist/sparrow-cli/sparrow"],
    cmd = """
    rm -rf $(RULEDIR)/dist
    mkdir -p $(RULEDIR)/dist
    tar -zxvf $(SRCS) -C $(RULEDIR)/dist
    """,
    executable = 1,
)

# CLI executable
# Current pkg_tar/pkg_files rules can't pack a directory generated from genrule.
# To workaround this, use the deprecated pkg_tar rule instead
pkg_tar_old(
    name = "sparrow-cli-pkg",
    srcs = [
        "//cli:pyinstaller-sparrow-cli",
    ],
    mode = "0755",
    package_dir = "cli",
)

# Pack C family artifacts
# pkg_files(
#     name = "coref-cfamily-lib-03-pkg",
#     srcs = [
#         "//language/cfamily:lib-03",
#     ],
#     attributes = pkg_attributes(
#         mode = "0644",
#     ),
#     prefix = "lib-03/coref/cfamily",
#     strip_prefix = strip_prefix.from_pkg() + "lib-03",
# )

pkg_files(
    name = "coref-cfamily-lib-script-pkg",
    srcs = [
        "//language/cfamily:lib",
    ],
    attributes = pkg_attributes(
        mode = "0644",
    ),
    prefix = "lib/coref/cfamily",
    strip_prefix = strip_prefix.from_pkg() + "lib",
)

# Current pkg_tar/pkg_files rules can't pack a directory generated from genrule.
# To workaround this, use the deprecated pkg_tar rule instead
pkg_tar_old(
    name = "coref-cfamily-src-extractor-pkg",
    srcs = [
        "//:generate-coref-cfamily-src-extractor-library",
    ],
    mode = "0755",
    package_dir = "language/cfamily/extractor",
    strip_prefix = "coref-cfamily-src-extractor",
)

# TODO Shoud not use this script to change rpath. Should put dylib during linking to have correct rpath.
genrule(
    name = "generate-coref-cfamily-src-extractor-library",
    srcs = [
        "//language/cfamily/extractor:coref-cfamily-src-extractor",
        "//:tool/build-utils/pack_libs.py",
        "//language/cfamily/extractor:copy-clang-builtin-headers",
    ],
    # Normally outs of genrule should be a list of files, not just a directory, but don't see another way to workaround this
    outs = [
        "coref-cfamily-src-extractor",
    ],
    cmd = """
    mkdir -p $@/usr/bin
    cp $(location //language/cfamily/extractor:coref-cfamily-src-extractor) $@/usr/bin
    python3 $(location //:tool/build-utils/pack_libs.py) $@/usr
    cp -r $(location //language/cfamily/extractor:copy-clang-builtin-headers) $@/usr/lib
    """,
)

# Pack Go artifacts
# pkg_files(
#     name = "coref-go-lib-03-pkg",
#     srcs = [
#         "//language/go:lib-03",
#     ],
#     attributes = pkg_attributes(
#         mode = "0644",
#     ),
#     prefix = "lib-03/coref/go",
#     strip_prefix = strip_prefix.from_pkg() + "lib-03",
# )

# pkg_files(
#     name = "coref-go-lib-script-pkg",
#     srcs = [
#         "//language/go:lib",
#     ],
#     attributes = pkg_attributes(
#         mode = "0644",
#     ),
#     prefix = "lib/coref/go",
#     strip_prefix = strip_prefix.from_pkg() + "lib",
# )

# pkg_files(
#     name = "coref-go-src-extractor-pkg",
#     srcs = [
#         "//language/go/extractor/src/cli/auto-builder:coref-go-src-extractor",
#         "//language/go/extractor/src/cli/auto-builder:generate-go-sdk",
#     ],
#     attributes = pkg_attributes(
#         mode = "0755",
#     ),
#     prefix = "language/go/extractor",
# )

# Pack Java artifacts
# pkg_files(
#     name = "coref-java-lib-03-pkg",
#     srcs = [
#         "//language/java:lib-03",
#     ],
#     attributes = pkg_attributes(
#         mode = "0644",
#     ),
#     prefix = "lib-03/coref/java",
#     strip_prefix = strip_prefix.from_pkg() + "lib-03",
# )

pkg_files(
    name = "coref-java-lib-script-pkg",
    srcs = [
        "//language/java:lib",
    ],
    attributes = pkg_attributes(
        mode = "0644",
    ),
    prefix = "lib/coref/java",
    strip_prefix = strip_prefix.from_pkg() + "lib",
)

pkg_files(
    name = "coref-java-src-extractor-pkg",
    srcs = [
        "//language/java/extractor:coref-java-src-extractor_deploy.jar",
    ],
    attributes = pkg_attributes(
        mode = "0755",
    ),
    prefix = "language/java/extractor",
)

# Pack JavaScript artifacts
# pkg_files(
#     name = "coref-javascript-lib-03-pkg",
#     srcs = [
#         "//language/javascript:lib-03",
#     ],
#     attributes = pkg_attributes(
#         mode = "0644",
#     ),
#     prefix = "lib-03/coref/javascript",
#     strip_prefix = strip_prefix.from_pkg() + "lib-03",
# )

pkg_files(
    name = "coref-javascript-lib-script-pkg",
    srcs = [
        "//language/javascript:lib",
    ],
    attributes = pkg_attributes(
        mode = "0644",
    ),
    prefix = "lib/coref/javascript",
    strip_prefix = strip_prefix.from_pkg() + "lib",
)

pkg_files(
    name = "coref-javascript-src-extractor-pkg",
    srcs = [
        "//language/javascript/extractor:coref-javascript-src-extractor",
    ],
    attributes = pkg_attributes(
        mode = "0755",
    ),
    prefix = "language/javascript/extractor",
)

# Pack Python artifacts
# pkg_files(
#     name = "coref-python-lib-03-pkg",
#     srcs = [
#         "//language/python:lib-03",
#     ],
#     attributes = pkg_attributes(
#         mode = "0644",
#     ),
#     prefix = "lib-03/coref/python",
#     strip_prefix = strip_prefix.from_pkg() + "lib-03",
# )

pkg_files(
    name = "coref-python-lib-script-pkg",
    srcs = [
        "//language/python:lib",
    ],
    attributes = pkg_attributes(
        mode = "0644",
    ),
    prefix = "lib/coref/python",
    strip_prefix = strip_prefix.from_pkg() + "lib",
)

pkg_files(
    name = "coref-python-src-extractor-pkg",
    srcs = [
        "//language/python/extractor:coref-python-extractor-bin",
    ],
    attributes = pkg_attributes(
        mode = "0755",
    ),
    prefix = "language/python/extractor/",
)

# Pack XML artifacts
# pkg_files(
#     name = "coref-xml-lib-03-pkg",
#     srcs = [
#         "//language/xml:lib-03",
#     ],
#     attributes = pkg_attributes(
#         mode = "0644",
#     ),
#     prefix = "lib-03/coref/xml",
#     strip_prefix = strip_prefix.from_pkg() + "lib-03",
# )

pkg_files(
    name = "coref-xml-lib-script-pkg",
    srcs = [
        "//language/xml:lib",
    ],
    attributes = pkg_attributes(
        mode = "0644",
    ),
    prefix = "lib/coref/xml",
    strip_prefix = strip_prefix.from_pkg() + "lib",
)

pkg_files(
    name = "coref-xml-extractor-pkg",
    srcs = [
        "//language/xml/extractor:coref-xml-extractor_deploy.jar",
    ],
    attributes = pkg_attributes(
        mode = "0755",
    ),
    prefix = "language/xml/extractor",
)

# Pack Swift artifacts
# pkg_files(
#     name = "coref-swift-lib-03-pkg",
#     srcs = [
#         "//language/swift:lib-03",
#     ],
#     attributes = pkg_attributes(
#         mode = "0644",
#     ),
#     prefix = "lib-03/coref/swift",
#     strip_prefix = strip_prefix.from_pkg() + "lib-03",
# )

# pkg_files(
#     name = "coref-swift-lib-script-pkg",
#     srcs = [
#         "//language/swift:lib",
#     ],
#     attributes = pkg_attributes(
#         mode = "0644",
#     ),
#     prefix = "lib/coref/swift",
#     strip_prefix = strip_prefix.from_pkg() + "lib",
# )

# Pack SQL artifacts
# pkg_files(
#     name = "coref-sql-lib-03-pkg",
#     srcs = [
#         "//language/sql:lib-03",
#     ],
#     attributes = pkg_attributes(
#         mode = "0644",
#     ),
#     prefix = "lib-03/coref/sql",
#     strip_prefix = strip_prefix.from_pkg() + "lib-03",
# )

pkg_files(
    name = "coref-sql-lib-script-pkg",
    srcs = [
        "//language/sql:lib",
    ],
    attributes = pkg_attributes(
        mode = "0644",
    ),
    prefix = "lib/coref/sql",
    strip_prefix = strip_prefix.from_pkg() + "lib",
)

pkg_files(
    name = "coref-sql-src-extractor-pkg",
    srcs = [
        "//language/sql/extractor:coref-sql-src-extractor_deploy.jar",
    ],
    attributes = pkg_attributes(
        mode = "0755",
    ),
    prefix = "language/sql/extractor",
)

# Pack Properties artifacts
# pkg_files(
#     name = "coref-properties-lib-03-pkg",
#     srcs = [
#         "//language/properties:lib-03",
#     ],
#     attributes = pkg_attributes(
#         mode = "0644",
#     ),
#     prefix = "lib-03/coref/properties",
#     strip_prefix = strip_prefix.from_pkg() + "lib-03",
# )

pkg_files(
    name = "coref-properties-lib-script-pkg",
    srcs = [
        "//language/properties:lib",
    ],
    attributes = pkg_attributes(
        mode = "0644",
    ),
    prefix = "lib/coref/properties",
    strip_prefix = strip_prefix.from_pkg() + "lib",
)

pkg_files(
    name = "coref-properties-extractor-pkg",
    srcs = [
        "//language/properties/extractor:coref-properties-src-extractor_deploy.jar",
    ],
    attributes = pkg_attributes(
        mode = "0755",
    ),
    prefix = "language/properties/extractor",
)

# Pack ArkTs artifacts
# pkg_files(
#     name = "coref-arkts-lib-script-pkg",
#     srcs = [
#         "//language/arkts:lib",
#     ],
#     attributes = pkg_attributes(
#         mode = "0644",
#     ),
#     prefix = "lib/coref/arkts",
#     strip_prefix = strip_prefix.from_pkg() + "lib",
# )

# pkg_files(
#     name = "coref-arkts-src-extractor-pkg",
#     srcs = [
#         "//language/arkts/extractor:coref-arkts-src-extractor",
#     ],
#     attributes = pkg_attributes(
#         mode = "0755",
#     ),
#     prefix = "language/arkts/extractor",
# )

# Current pkg_tar/pkg_files rules can't pack a directory generated from genrule.
# To workaround this, use the deprecated pkg_tar rule instead
# pkg_tar_old(
#     name = "coref-swift-src-extractor-pkg",
#     srcs = [
#         "//:generate-coref-swift-src-extractor-library",
#     ],
#     mode = "0755",
#     package_dir = "language/swift/extractor",
#     strip_prefix = "coref-swift-src-extractor",
# )

# TODO Shoud not use this script to change rpath. Should put dylib during linking to have correct rpath.
# genrule(
#     name = "generate-coref-swift-src-extractor-library",
#     srcs = [
#         "//language/swift/extractor:coref-swift-src-extractor",
#         "//:tool/build-utils/pack_libs.py",
#     ],
#     # Normally outs of genrule should be a list of files, not just a directory, but don't see another way to workaround this
#     outs = [
#         "coref-swift-src-extractor",
#     ],
#     cmd = """
#     mkdir -p $@/usr/bin
#     cp $(location //language/swift/extractor:coref-swift-src-extractor) $@/usr/bin
#     python3 $(location //:tool/build-utils/pack_libs.py) $@/usr
#     """,
# )

# Pack Godel 0.3 & script artifacts
# pkg_files(
#     name = "godel-0.3-pkg",
#     srcs = select({
#         "@bazel_tools//src/conditions:darwin": ["@osx_godel_0.3//:all"],
#         "//conditions:default": ["@linux_godel_0.3//:all"],
#     }),
#     attributes = pkg_attributes(
#         mode = "0755",
#     ),
#     prefix = "godel-0.3",
#     strip_prefix = strip_prefix.from_pkg(),
# )

pkg_files(
    name = "godel-script-pkg",
    srcs = select({
        "@bazel_tools//src/conditions:darwin": ["@osx_godel_script//:all"],
        "//conditions:default": ["@linux_godel_script//:all"],
    }),
    attributes = pkg_attributes(
        mode = "0755",
    ),
    prefix = "godel-script",
    strip_prefix = strip_prefix.from_pkg(),
)

# copy file to sparrowHome, for local debug
copy_to_bin(
    name = "copy-version-file",
    srcs = [
        "version.txt",
    ],
    visibility = ["//visibility:public"],
)

# copy_to_directory(
#     name = "copy-godel-0.3-lib",
#     srcs = [
#         "//language/cfamily:lib-03",
#         "//language/go:lib-03",
#         "//language/java:lib-03",
#         "//language/javascript:lib-03",
#         "//language/properties:lib-03",
#         "//language/python:lib-03",
#         "//language/sql:lib-03",
#         "//language/xml:lib-03",
#     ],
#     out = "lib-03",
#     visibility = ["//visibility:public"],
# )

# coref_lib_03_pkgs = [
#     ":coref-cfamily-lib-03-pkg",
#     ":coref-go-lib-03-pkg",
#     ":coref-sql-lib-03-pkg",
#     ":coref-java-lib-03-pkg",
#     ":coref-javascript-lib-03-pkg",
#     ":coref-python-lib-03-pkg",
#     ":coref-xml-lib-03-pkg",
#     ":coref-properties-lib-03-pkg",
# ] + select({
#     ":custom_build": [],
#     "//conditions:default": [":coref-swift-lib-03-pkg"],
# })

coref_lib_script_pkgs = [
    # ":coref-go-lib-script-pkg",
    ":coref-java-lib-script-pkg",
    ":coref-javascript-lib-script-pkg",
    ":coref-python-lib-script-pkg",
    ":coref-xml-lib-script-pkg",
    ":coref-cfamily-lib-script-pkg",
    ":coref-properties-lib-script-pkg",
    ":coref-sql-lib-script-pkg",
    # ":coref-arkts-lib-script-pkg",
] 

coref_libscript_languages = [
    "java",
    "javascript",
    # "go",
    "python",
    "xml",
    "cfamily",
    "properties",
    "sql",
    # "swift",
    # "arkts",
]

copy_to_directory(
    name = "copy-godel-script",
    srcs = select({
        "@bazel_tools//src/conditions:darwin": ["@osx_godel_script//:all"],
        "//conditions:default": ["@linux_godel_script//:all"],
    }),
    out = "godel-script",
    include_external_repositories = [
        "osx_godel_script",
        "linux_godel_script",
    ],
    visibility = ["//visibility:public"],
)

copy_to_directory(
    name = "copy-java-lib-script",
    srcs = [
        "//language/java:lib",
    ],
    out = "lib/coref/java",
    replace_prefixes = {"language/java/lib": ""},
    visibility = ["//visibility:public"],
)

copy_to_directory(
    name = "copy-javascript-lib-script",
    srcs = [
        "//language/javascript:lib",
    ],
    out = "lib/coref/javascript",
    replace_prefixes = {"language/javascript/lib": ""},
    visibility = ["//visibility:public"],
)

# copy_to_directory(
#     name = "copy-go-lib-script",
#     srcs = [
#         "//language/go:lib",
#     ],
#     out = "lib/coref/go",
#     replace_prefixes = {"language/go/lib": ""},
#     visibility = ["//visibility:public"],
# )

copy_to_directory(
    name = "copy-python-lib-script",
    srcs = [
        "//language/python:lib",
    ],
    out = "lib/coref/python",
    replace_prefixes = {"language/python/lib": ""},
    visibility = ["//visibility:public"],
)

copy_to_directory(
    name = "copy-xml-lib-script",
    srcs = [
        "//language/xml:lib",
    ],
    out = "lib/coref/xml",
    replace_prefixes = {"language/xml/lib": ""},
    visibility = ["//visibility:public"],
)

copy_to_directory(
    name = "copy-properties-lib-script",
    srcs = [
        "//language/properties:lib",
    ],
    out = "lib/coref/properties",
    replace_prefixes = {"language/properties/lib": ""},
    visibility = ["//visibility:public"],
)

copy_to_directory(
    name = "copy-sql-lib-script",
    srcs = [
        "//language/sql:lib",
    ],
    out = "lib/coref/sql",
    replace_prefixes = {"language/sql/lib": ""},
    visibility = ["//visibility:public"],
)

copy_to_directory(
    name = "copy-cfamily-lib-script",
    srcs = [
        "//language/cfamily:lib",
    ],
    out = "lib/coref/cfamily",
    replace_prefixes = {"language/cfamily/lib": ""},
    visibility = ["//visibility:public"],
)

# copy_to_directory(
#     name = "copy-swift-lib-script",
#     srcs = [
#         "//language/swift:lib",
#     ],
#     out = "lib/coref/swift",
#     replace_prefixes = {"language/swift/lib": ""},
#     visibility = ["//visibility:public"],
# )

# copy_to_directory(
#     name = "copy-arkts-lib-script",
#     srcs = [
#         "//language/arkts:lib",
#     ],
#     out = "lib/coref/arkts",
#     replace_prefixes = {"language/arkts/lib": ""},
#     visibility = ["//visibility:public"],
# )

genrule(
    name = "coref-lib-script-gen",
    srcs = [
        "//cli:pyinstaller-sparrow-cli",
        ":copy-godel-script",
        ":copy-java-lib-script",
        ":copy-javascript-lib-script",
        # ":copy-go-lib-script",
        ":copy-python-lib-script",
        ":copy-xml-lib-script",
        ":copy-properties-lib-script",
        ":copy-sql-lib-script",
        ":copy-cfamily-lib-script",
        # ":copy-swift-lib-script",
        # ":copy-arkts-lib-script",
    ],
    outs = ["lib/coref/%s.gdl" % language for language in coref_libscript_languages],
    cmd = """
    string="$(locations //cli:pyinstaller-sparrow-cli)"
    # Remove everything before the last space character
    result="$${string##* }"
    echo "$$result"
    $$result --sparrow-cli-internal $(@D) rebuild lib -lang all
    """,
    local = True,
    visibility = ["//visibility:public"],
)

pkg_files(
    name = "coref-lib-pkg",
    srcs = [
        ":coref-lib-script-gen",
    ],
    attributes = pkg_attributes(
        mode = "0644",
    ),
    strip_prefix = strip_prefix.from_pkg(),
)

# Pack final sparrow-cli package
pkg_tar(
    name = "sparrow-cli",
    srcs = [
        ":coref-lib-pkg",
        # ":coref-arkts-src-extractor-pkg",
        # ":coref-go-src-extractor-pkg",
        ":coref-sql-src-extractor-pkg",
        ":coref-java-src-extractor-pkg",
        ":coref-javascript-src-extractor-pkg",
        ":coref-python-src-extractor-pkg",
        ":coref-xml-extractor-pkg",
        ":coref-properties-extractor-pkg",
        # ":godel-0.3-pkg",
        ":godel-script-pkg",
        "//cli:sparrow",
        "version.txt",
    ] + coref_lib_script_pkgs,
    extension = "tar.gz",
    mode = "0755",
    package_dir = "sparrow-cli",
    strip_prefix = strip_prefix.from_pkg(),
    visibility = ["//visibility:public"],
    deps = [
        ":coref-cfamily-src-extractor-pkg",
        ":sparrow-cli-pkg",
    ],
)

# buildifier(
#     name = "buildifier",
# )

# load("@bazel_gazelle//:def.bzl", "gazelle")

# # gazelle:prefix alipay.com/code_insight/coref-go-extractor
# gazelle(name = "gazelle")

# gazelle(
#     name = "gazelle-update-repos",
#     args = [
#         "-from_file=language/go/extractor/go.mod",
#         "-to_macro=deps.bzl%go_dependencies",
#         "-prune",
#         "-build_file_proto_mode=disable_global",
#     ],
#     command = "update-repos",
# )   
