load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
load("@bazel_tools//tools/build_defs/repo:utils.bzl", "maybe")
load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_file")
load("//:junit5.bzl", "junit_jupiter_java_repositories", "junit_platform_java_repositories")

### c dependencies

# SQLITE_VERSION "3.39.0"
SQLITE_BAZEL_COMMIT = "57ff3012abd4c832b40148aeb6ec1d5d0b4cc3f7"

SQLITE_BAZEL_SHA = "95d9872a38f9162e0138de8b38b124af250b38719c5380f0ee863ad306d70573"

http_archive(
    name = "com_github_rockwotj_sqlite_bazel",
    sha256 = SQLITE_BAZEL_SHA,
    strip_prefix = "sqlite-bazel-" + SQLITE_BAZEL_COMMIT,
    urls = ["https://github.com/rockwotj/sqlite-bazel/archive/%s.zip" % SQLITE_BAZEL_COMMIT],
)

# LLVM
SKYLIB_VERSION = "1.3.0"

http_archive(
    name = "bazel_skylib",
    sha256 = "74d544d96f4a5bb630d465ca8bbcfe231e3594e5aae57e1edbf17a6eb3ca2506",
    urls = [
        "https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/bazel-skylib-{version}.tar.gz".format(version = SKYLIB_VERSION),
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-skylib/releases/download/{version}/bazel-skylib-{version}.tar.gz".format(version = SKYLIB_VERSION),
        "https://github.com/bazelbuild/bazel-skylib/releases/download/{version}/bazel-skylib-{version}.tar.gz".format(version = SKYLIB_VERSION),
    ],
)

# LLVM 13.0.1 Release
# Replace with the LLVM commit you want to use.
LLVM_COMMIT = "75e33f71c2dae584b13a7d1186ae0a038ba98838"

# The easiest way to calculate this for a new commit is to set it to empty and
# then run a bazel build and it will report the digest necessary to cache the
# archive and make the build reproducible.
LLVM_SHA256 = "9e2ef2fac7525a77220742a3384cafe7a35adc7e5c9750378b2cf25c2d2933f5"

http_archive(
    name = "llvm-raw",
    build_file_content = "# empty",
    sha256 = LLVM_SHA256,
    strip_prefix = "llvm-project-" + LLVM_COMMIT,
    urls = [
        "https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/llvm/{commit}.tar.gz".format(commit = LLVM_COMMIT),
        "https://github.com/llvm/llvm-project/archive/{commit}.tar.gz".format(commit = LLVM_COMMIT),
    ],
)

http_archive(
    name = "llvm-bazel",
    sha256 = LLVM_SHA256,
    strip_prefix = "llvm-project-{}/utils/bazel".format(LLVM_COMMIT),
    urls = [
        "https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/llvm/{commit}.tar.gz".format(commit = LLVM_COMMIT),
        "https://github.com/llvm/llvm-project/archive/{commit}.tar.gz".format(commit = LLVM_COMMIT),
    ],
)

load("@llvm-bazel//:configure.bzl", "llvm_configure", "llvm_disable_optional_support_deps")

llvm_configure(
    name = "llvm-project",
    src_path = ".",
    src_workspace = "@llvm-raw//:WORKSPACE",
    targets = ["X86"],
)

# Disables optional dependencies for Support like zlib and terminfo. You may
# instead want to configure them using the macros in the corresponding bzl
# files.
llvm_disable_optional_support_deps()

### java dependencies
RULES_JVM_EXTERNAL_TAG = "4.2"

RULES_JVM_EXTERNAL_SHA = "cd1a77b7b02e8e008439ca76fd34f5b07aecb8c752961f9640dea15e9e5ba1ca"

JUNIT_JUPITER_VERSION = "5.9.1"

JUNIT_PLATFORM_VERSION = "1.9.1"

junit_jupiter_java_repositories(
    version = JUNIT_JUPITER_VERSION,
)

junit_platform_java_repositories(
    version = JUNIT_PLATFORM_VERSION,
)

http_archive(
    name = "rules_jvm_external",
    sha256 = RULES_JVM_EXTERNAL_SHA,
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
    patches = ["//external/rules_jvm_external:versions.bzl.patch"],
)

load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")

rules_jvm_external_deps()

load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")

rules_jvm_external_setup()

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "info.picocli:picocli-codegen:4.6.1",
        "org.apache.commons:commons-compress:1.21",
        "org.apache.commons:commons-lang3:3.12.0",
        "commons-io:commons-io:2.8.0",
        "commons-lang:commons-lang:2.4",
        "org.slf4j:slf4j-api:1.7.21",
        "org.slf4j:slf4j-log4j12:1.7.21",
        "org.projectlombok:lombok:1.18.16",
        "com.aliyun.oss:aliyun-sdk-oss:3.10.2",
        "com.alibaba:fastjson:1.2.72_noneautotype",
        "com.contrastsecurity:java-sarif:2.0",
        "com.fasterxml.jackson.core:jackson-core:2.13.4",
        "com.fasterxml.jackson.core:jackson-databind:2.13.4",
        "com.fasterxml.jackson.core:jackson-annotations:2.13.4",
        "org.powermock:powermock-module-junit4:2.0.9",
        "org.powermock:powermock-api-mockito2:2.0.9",
        "org.mybatis:mybatis:3.5.7",
        "org.mybatis.dynamic-sql:mybatis-dynamic-sql:1.3.0",
        "org.mybatis.generator:mybatis-generator-core:1.4.0",
        "javax.annotation:javax.annotation-api:1.3.2",
        "commons-codec:commons-codec:1.15",
        "com.ibm.icu:icu4j:59.1",
        "me.tongfei:progressbar:0.9.2",
        "org.jetbrains:annotations:22.0.0",
        "org.jetbrains.kotlin:kotlin-compiler-embeddable:1.5.21",
        "org.jetbrains.kotlin:kotlin-reflect:1.5.21",
        "org.jetbrains.kotlin:kotlin-script-runtime:1.5.21",
        "org.jetbrains.kotlin:kotlin-stdlib:1.5.21",
        "uk.com.robust-it:cloning:1.9.12",
        "com.google.code.gson:gson:2.8.9",
        "com.google.guava:guava:30.1.1-jre",
        "org.hamcrest:hamcrest-all:1.3",
        "com.google.re2j:re2j:1.6",
        "net.java.dev.jna:jna:4.1.0",
        "org.xerial:sqlite-jdbc:3.41.2.2",
        "tk.mybatis:mapper:4.1.5",
        "org.apache.logging.log4j:log4j-core:2.17.1",
        "org.apache.logging.log4j:log4j-api:2.17.1",
        "org.apache.logging.log4j:log4j-slf4j-impl:2.17.1",
        "stax:stax-api:1.0.1",
        "javax.persistence:javax.persistence-api:2.2",
        "org.codehaus.woodstox:stax2-api:4.2.1",
        "commons-collections:commons-collections:3.2.2",
        "com.aliyun.oss:aliyun-sdk-oss:3.10.2",
        "org.ini4j:ini4j:0.5.4",
        "org.benf:cfr:0.151",
        "org.jd:jd-core:1.1.3",
        "com.alibaba:druid:1.2.12",
        "net.java.dev.msv:msv-core:2013.6.1",
        "net.java.dev.msv:xsdlib:2013.6.1",
        "relaxngDatatype:relaxngDatatype:20020414",
        "org.osgi:osgi.core:5.0.0",
        "biz.aQute.bnd:biz.aQute.bnd.annotation:6.3.1",
        "org.codehaus.jettison:jettison:1.5.4",
        
    ],
    repositories = [
        # Private repositories are supported through HTTP Basic auth
        "http://mvn.dev.alipay.net/artifactory/content/groups/public/",
        "http://mvn.test.alipay.net/artifactory/content/groups/public",
        "https://maven.aliyun.com/repository/public",
        "https://repo1.maven.org/maven2",
    ],
)

### js dependencies
http_archive(
    name = "build_bazel_rules_nodejs",
    sha256 = "ee3280a7f58aa5c1caa45cb9e08cbb8f4d74300848c508374daf37314d5390d6",
    urls = [
        "https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/rules_nodejs-5.5.1.tar.gz",
        "https://github.com/bazelbuild/rules_nodejs/releases/download/5.5.1/rules_nodejs-5.5.1.tar.gz",
    ],
)

load("@build_bazel_rules_nodejs//:repositories.bzl", "build_bazel_rules_nodejs_dependencies")

build_bazel_rules_nodejs_dependencies()

# fetches nodejs and yarn
load("@build_bazel_rules_nodejs//:index.bzl", "node_repositories", "npm_install", "yarn_install")

node_repositories(
    node_urls = [
        "https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/node/v{version}/{filename}",
        "https://nodejs.org/dist/v{version}/{filename}",
    ],
    node_version = "16.14.2",
    yarn_releases = {
        "1.22.11": ("yarn-v1.22.11.tar.gz", "yarn-v1.22.11", "2c320de14a6014f62d29c34fec78fdbb0bc71c9ccba48ed0668de452c1f5fe6c"),
    },
    # yarn repository info
    yarn_repository_name = "yarn",
    yarn_urls = [
        "https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/yarn/v{version}/{filename}",
        "https://github.com/yarnpkg/yarn/releases/download/v{version}/{filename}",
    ],
    yarn_version = "1.22.11",
)

yarn_install(
    name = "npm",
    package_json = "//language/javascript/extractor:package.json",
    symlink_node_modules = True,
    use_global_yarn_cache = False,
    yarn_lock = "//language/javascript/extractor:yarn.lock",
)

http_archive(
    name = "pkg_cache",
    build_file = "//:tool/build_rule/pkg_cache.BUILD",
    sha256 = "ee392cf2bfe0d0a5a493e073651fb70b03503dfe98e347ed61b91e9ef9ada122",
    url = "https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/pkg-cache.tar.gz",
)

http_archive(
    name = "osx_godel_0.3",
    build_file = "godel.BUILD",
    sha256 = "1e7e0151f1acd1656f4079b7b16dfa4e5da607a1239149a88e9df3b543b23c30",
    urls = [
        "https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/osx-godel/godel-multipleinput-20221115.tar.gz",
        "https://github.com/codefuse-ai/CodeFuse-Query/releases/download/godel_0.3_artifacts/godel-0.3.osx.multipleinput-20221115.tar.gz",
    ],
)

http_archive(
    name = "linux_godel_0.3",
    build_file = "godel.BUILD",
    sha256 = "4dbc04677b9c785a00c127228368919ba6cee2a1f160e83e497d44fb4820dcd3",
    urls = [
        "https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/linux-godel/godel-multipleinput-20221115.tar.gz",
        "https://github.com/codefuse-ai/CodeFuse-Query/releases/download/godel_0.3_artifacts/godel-0.3.linux.multipleinput-20221115.tar.gz",
    ],
)

http_archive(
    name = "osx_godel_script",
    build_file = "godel.BUILD",
    sha256 = "4c4189320523ca63d9fb50e37aa0bcbd452109011a8d669d878b91492168e4e0",
    urls = [
        "https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/godel-script/osx/godel-script-osx-2ac5184520240812.tar.gz",
        "https://github.com/codefuse-ai/CodeFuse-Query/releases/download/godel_0.3_artifacts/godel-script-osx-2ac5184520240812.tar.gz",
    ],
)

http_archive(
    name = "linux_godel_script",
    build_file = "godel.BUILD",
    sha256 = "ac7c0d62b02cb3d7c673dac0c69079e347f727232a56053402ebbab655fd5649",
    urls = [
        "https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/godel-script/linux/godel-script-linux-2ac5184520240812.tar.gz",
        "https://github.com/codefuse-ai/CodeFuse-Query/releases/download/godel_0.3_artifacts/godel-script-linux-2ac5184520240812.tar.gz",
    ],
)

# Setting up for bazel go dependency
http_archive(
    name = "io_bazel_rules_go",
    sha256 = "2b1641428dff9018f9e85c0384f03ec6c10660d935b750e3fa1492a281a53b0f",
    urls = [
        "http://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/rules_go-v0.29.0.zip",
        "https://mirror.bazel.build/github.com/bazelbuild/rules_go/releases/download/v0.29.0/rules_go-v0.29.0.zip",
        "https://github.com/bazelbuild/rules_go/releases/download/v0.29.0/rules_go-v0.29.0.zip",
    ],
)

http_archive(
    name = "bazel_gazelle",
    sha256 = "62ca106be173579c0a167deb23358fdfe71ffa1e4cfdddf5582af26520f1c66f",
    urls = [
        "http://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/bazel-gazelle-v0.23.0.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-gazelle/releases/download/v0.23.0/bazel-gazelle-v0.23.0.tar.gz",
        "https://github.com/bazelbuild/bazel-gazelle/releases/download/v0.23.0/bazel-gazelle-v0.23.0.tar.gz",
    ],
)

load("@io_bazel_rules_go//go:deps.bzl", "go_download_sdk", "go_register_toolchains", "go_rules_dependencies")
load("@bazel_gazelle//:deps.bzl", "gazelle_dependencies")
load("//:deps.bzl", "go_dependencies")

# gazelle:repository_macro deps.bzl%go_dependencies
go_dependencies()

go_rules_dependencies()

# fetch golang package from oss with first priority.
go_download_sdk(
    name = "go_sdk",
    sdks = {
        # Avoid the dependency on the index file for the SHA-256 checksums.
        # Filenames and checksums from https://go.dev/dl/
        "linux_amd64": ("go1.18.3.linux-amd64.tar.gz", "956f8507b302ab0bb747613695cdae10af99bbd39a90cae522b7c0302cc27245"),
        "darwin_amd64": ("go1.18.3.darwin-amd64.tar.gz", "d9dcf8fc35da54c6f259be41954783a9f4984945a855d03a003a7fd6ea4c5ca1"),
        "darwin_arm64": ("go1.18.3.darwin-arm64.tar.gz", "40ecd383c941cc9f0682e6a6f2a333539d58c7dea15c842434d03afafe2f7242"),
    },
    urls = [
        "http://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/golang/{}",
        "https://dl.google.com/go/{}",
    ],
    version = "1.18.3",
)

go_register_toolchains()

# If you use WORKSPACE.bazel, use the following line instead of the bare gazelle_dependencies():
# gazelle_dependencies(go_repository_default_config = "@//:WORKSPACE.bazel")
gazelle_dependencies()

http_archive(
    name = "com_google_protobuf",
    sha256 = "3bd7828aa5af4b13b99c191e8b1e884ebfa9ad371b0ce264605d347f135d2568",
    strip_prefix = "protobuf-3.19.4",
    urls = [
        "http://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/protobuf-3.19.4.tar.gz",
        "https://github.com/protocolbuffers/protobuf/archive/v3.19.4.tar.gz",
    ],
)

load("@com_google_protobuf//:protobuf_deps.bzl", "protobuf_deps")

protobuf_deps()

http_archive(
    name = "com_github_bazelbuild_buildtools",
    sha256 = "ae34c344514e08c23e90da0e2d6cb700fcd28e80c02e23e4d5715dddcb42f7b3",
    strip_prefix = "buildtools-4.2.2",
    urls = [
        "http://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/buildtools-4.2.2.tar.gz",
        "https://github.com/bazelbuild/buildtools/archive/refs/tags/4.2.2.tar.gz",
    ],
)

http_archive(
    name = "rules_python",
    sha256 = "a3a6e99f497be089f81ec082882e40246bfd435f52f4e82f37e89449b04573f6",
    strip_prefix = "rules_python-0.10.2",
    urls = [
        "https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/rules_python-0.10.2.tar.gz",
        "https://github.com/bazelbuild/rules_python/archive/refs/tags/0.10.2.tar.gz",
    ],
    patches = ["//external/rules_python:repositories.bzl.patch"],
)

load("@rules_python//python:repositories.bzl", "python_register_toolchains")

python_register_toolchains(
    name = "python3_10",
    base_url = "https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/python/cpython",
    # Available versions are listed in @rules_python//python:versions.bzl.
    # We recommend using the same version your team is already standardized on.
    python_version = "3.10.4",
    tool_versions = {
        "3.10.4": {
            "url": "20220502/cpython-{python_version}%2B20220502-{platform}-{build}.tar.gz",
            "sha256": {
                "aarch64-apple-darwin": "2c99983d1e83e4b6e7411ed9334019f193fba626344a50c36fba6c25d4de78a2",
                "aarch64-unknown-linux-gnu": "d8098c0c54546637e7516f93b13403b11f9db285def8d7abd825c31407a13d7e",
                "x86_64-apple-darwin": "f2711eaffff3477826a401d09a013c6802f11c04c63ab3686aa72664f1216a05",
                "x86_64-pc-windows-msvc": "bee24a3a5c83325215521d261d73a5207ab7060ef3481f76f69b4366744eb81d",
                "x86_64-unknown-linux-gnu": "f6f871e53a7b1469c13f9bd7920ad98c4589e549acad8e5a1e14760fff3dd5c9",
            },
            "strip_prefix": "python",
        },
    },
)

load("@python3_10//:defs.bzl", "interpreter")
load("@rules_python//python:pip.bzl", "pip_install")

# Create a central external repo, @deps, that contains Bazel targets for all the
# third-party packages specified in the requirements.txt file.
pip_install(
    name = "deps",
    python_interpreter_target = interpreter,
    requirements = "//language/python/extractor:requirements.txt",
)

pip_install(
    name = "cli-deps",
    python_interpreter_target = interpreter,
    requirements = "//cli:requirements.txt",
)

RULES_PKG_VERSION = "0.7.0"

http_archive(
    name = "rules_pkg",
    sha256 = "8a298e832762eda1830597d64fe7db58178aa84cd5926d76d5b744d6558941c2",
    urls = [
        "https://mirror.bazel.build/github.com/bazelbuild/rules_pkg/releases/download/%s/rules_pkg-%s.tar.gz" % (RULES_PKG_VERSION, RULES_PKG_VERSION),
        "https://github.com/bazelbuild/rules_pkg/releases/download/%s/rules_pkg-%s.tar.gz" % (RULES_PKG_VERSION, RULES_PKG_VERSION),
    ],
)

load("@rules_pkg//:deps.bzl", "rules_pkg_dependencies")

rules_pkg_dependencies()

http_archive(
    name = "aspect_bazel_lib",
    sha256 = "0154b46f350c7941919eaa30a4f2284a0128ac13c706901a5c768a829af49e11",
    strip_prefix = "bazel-lib-1.13.0",
    url = "https://github.com/aspect-build/bazel-lib/archive/refs/tags/v1.13.0.tar.gz",
)

load("@aspect_bazel_lib//lib:repositories.bzl", "aspect_bazel_lib_dependencies")

aspect_bazel_lib_dependencies()

# ### Swift dependencies
# # Introduce Swift Package Manager Rules for Bazel
# http_archive(
#     name = "cgrindel_rules_spm",
#     sha256 = "03718eb865a100ba4449ebcbca6d97bf6ea78fa17346ce6d55532312e8bf9aa8",
#     strip_prefix = "rules_spm-0.11.0",
#     urls = [
#         "https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/swift/v0.11.0.tar.gz",
#         "http://github.com/cgrindel/rules_spm/archive/v0.11.0.tar.gz",
#     ],
# )

# load(
#     "@cgrindel_rules_spm//spm:deps.bzl",
#     "spm_rules_dependencies",
# )

# spm_rules_dependencies()

# load("@cgrindel_rules_spm//spm:defs.bzl", "spm_pkg", "spm_repositories")

# spm_repositories(
#     name = "swift_pkgs_darwin",
#     dependencies = [
#         spm_pkg(
#             "https://oauth:a12681eba8d14255a49a74cd1c2d5f8d@code.alipay.com/codeinsight_thirdparty/swift-argument-parser.git",
#             from_version = "1.1.1",
#             products = ["ArgumentParser"],
#         ),
#         spm_pkg(
#             "https://oauth:d7ece9eda5bb4b438b3f5797321a5d2c@code.alipay.com/codeinsight_thirdparty/swift-log.git",
#             from_version = "1.4.4",
#             products = ["Logging"],
#         ),
#         spm_pkg(
#             "https://oauth:07e4fc6a7ce14b41a4f71561208ca118@code.alipay.com/codeinsight_thirdparty/SQLite.swift.git",
#             from_version = "0.13.3",
#             products = ["SQLite"],
#         ),
#     ],
# )

# spm_repositories(
#     name = "swift_pkgs_linux",
#     dependencies = [
#         spm_pkg(
#             "https://oauth:a12681eba8d14255a49a74cd1c2d5f8d@code.alipay.com/codeinsight_thirdparty/swift-argument-parser.git",
#             from_version = "1.1.1",
#             products = ["ArgumentParser"],
#         ),
#         spm_pkg(
#             "https://oauth:d7ece9eda5bb4b438b3f5797321a5d2c@code.alipay.com/codeinsight_thirdparty/swift-log.git",
#             from_version = "1.4.4",
#             products = ["Logging"],
#         ),
#         # On Linux, this package relies on SQLite3 and it search for its system library /usr/include/sqlite3.h
#         # which is outdated on CentOS, therefore causing linking failure.
#         # So I fork this project and make my own patch to make it totally compiled from SQLite3 C source code
#         spm_pkg(
#             "https://oauth:07e4fc6a7ce14b41a4f71561208ca118@code.alipay.com/codeinsight_thirdparty/SQLite.swift.git",
#             products = ["SQLite"],
#             # Commit for 0.13.3-patch
#             revision = "821d4cff02dfd9c0ac426bb3e4d67e40fef6c882",
#         ),
#         spm_pkg(
#             name = "SwiftSyntax",
#             exact_version = "0.50500.0",
#             products = ["SwiftSyntax"],
#             url = "https://oauth:e23f9a1ec4c94580a41d7fd761e7f172@code.alipay.com/codeinsight_thirdparty/swift-syntax.git",
#         ),
#     ],
# )

# # Introduce Apple Rules for Bazel depended by the rule @com_github_keith_swift_syntax
# http_archive(
#     name = "build_bazel_rules_apple",
#     sha256 = "90e3b5e8ff942be134e64a83499974203ea64797fd620eddeb71b3a8e1bff681",
#     urls = [
#         "https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/swift/rules_apple.1.1.2.tar.gz",
#         "https://github.com/bazelbuild/rules_apple/releases/download/1.1.2/rules_apple.1.1.2.tar.gz",
#     ],
# )

# load(
#     "@build_bazel_rules_apple//apple:repositories.bzl",
#     "apple_rules_dependencies",
# )

# apple_rules_dependencies()

# load(
#     "@build_bazel_rules_swift//swift:repositories.bzl",
#     "swift_rules_dependencies",
# )

# swift_rules_dependencies()

# load(
#     "@build_bazel_rules_swift//swift:extras.bzl",
#     "swift_rules_extra_dependencies",
# )

# swift_rules_extra_dependencies()

# load(
#     "@build_bazel_apple_support//lib:repositories.bzl",
#     "apple_support_dependencies",
# )

# apple_support_dependencies()

# # This repo provides a bazel target for SwiftSyntax. Most importantly it handles vendoring lib_InternalSwiftSyntaxParser
# # as a static library so your tool doesn't depend on a specific Xcode.app path or version.
# # This release switched to using an actual static version of the framework produced here https://github.com/keith/StaticInternalSwiftSyntaxParser/releases/tag/5.5.2
# # instead of managing a dylib.
# http_archive(
#     name = "com_github_keith_swift_syntax_bazel",
#     patch_args = ["-p1"],
#     # Apply patch to make the rule to download StaticInternalSwiftSyntaxParser stored in OSS
#     patches = ["//language/swift/extractor:bazel/swift-syntax-bazel.patch"],
#     sha256 = "c05d0c21ccb4beb62428e49187a4bf2c3c8f2e0d46d53324180aff7cadf80be6",
#     strip_prefix = "swift-syntax-bazel-13.2.1.13C100",
#     urls = [
#         "https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/swift/13.2.1.13C100.tar.gz",
#         "https://github.com/keith/swift-syntax-bazel/archive/refs/tags/13.2.1.13C100.tar.gz",
#     ],
# )

# load("@com_github_keith_swift_syntax_bazel//:deps.bzl", "swift_syntax_deps")

# swift_syntax_deps()

# # Linux only. Download the prebuilt shared library to make the swift extractor executable self-contained
# # macOS don't need this thanks to the rule @com_github_keith_swift_syntax
# http_archive(
#     name = "linux_lib_InternalSwiftSyntaxParser",
#     build_file = "//:language/swift/extractor/bazel/lib_InternalSwiftSyntaxParser.BUILD",
#     sha256 = "d4292d9b898a9d264c3e8ea58c83074a63d0c8d84602f4a85b9dbb1b4dcd52ad",
#     urls = ["https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/swift/lib_InternalSwiftSyntaxParser/5.5.3-alios7/lib_InternalSwiftSyntaxParser.zip"],
# )


# third_party_typescript 4.9.5-raw Release
# Replace with the third_party_typescript commit you want to use.
third_party_typescript_commit = "5bef9c4ec07035be8167d8190f6df47275b81058"
third_party_typescript_SHA256 = "e703a2ccb546e7fa78f0a0681cbc9569991b807247ff903bf6f0fe5304ec0fe9"

http_archive(
    name = "ohos_typescript_src",
    sha256 = third_party_typescript_SHA256,
    strip_prefix = "third_party_typescript-" + third_party_typescript_commit,
    build_file = "//:external/rules_ohos_typescript/ohos_typescript.BUILD",
    urls = [
        "https://gitee.com/openharmony/third_party_typescript/repository/archive/{commit}.zip".format(commit = third_party_typescript_commit),
        "https://antsys-sparrow-data.cn-shanghai-alipay-office.oss-alipay.aliyuncs.com/sparrow/public/tools/ohos-typescript/third_party_typescript-{commit}.zip".format(commit = third_party_typescript_commit),
    ],
)
