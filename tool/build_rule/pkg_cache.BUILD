package(default_visibility = ["//visibility:public"])

"""A local build file for pkg-cache http repository.
  pkg-cache is a cached package used to store nodejs executable files,
  which is used when building js extractor.
  If we don't have this cache file, then when building js extractor,
  npm pkg will download nodejs from GitHub; slow download speeds may
  result in build failures.

  File layout:
  pkg-cache
  ├── linux
  │   └── v3.4
  │       └── fetched-v18.5.0-linux-x64
  └── macos
      └── v3.4
          ├── fetched-v18.5.0-macos-arm64
          └── fetched-v18.5.0-macos-x64

  ATTENTION: please update pkg-cache file when npm pkg version is updated.
"""

exports_files(glob(["*"]))

filegroup(
    name = "node-bin",
    srcs = select({
      "@bazel_tools//src/conditions:darwin_x86_64": ["pkg-cache/macos/v3.4/fetched-v18.5.0-macos-x64"],
      "@bazel_tools//src/conditions:darwin_arm64": ["pkg-cache/macos/v3.4/fetched-v18.5.0-macos-arm64"],
      "//conditions:default": glob(["pkg-cache/linux/v3.4/fetched-v18.5.0-linux-x64"]),
   }),
    visibility = ["//visibility:public"],
)
