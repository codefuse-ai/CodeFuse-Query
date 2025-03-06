load("//:visibility.bzl", "PUBLIC_VISIBILITY")

# Using filegroup is encouraged instead of referencing directories directly. The latter is unsound.
# When combined with glob, filegroup can ensure that all files are explicitly known to the build system.

# Only one level of depth is matched, and the templates in the resource directory under lib-gen will not be matched.
filegroup(
    name = "lib",
    srcs = glob(["lib/*"]),
    visibility = ["//visibility:public"],
)
