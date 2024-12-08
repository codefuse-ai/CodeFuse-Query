
# Using filegroup is encouraged instead of referencing directories directly. The latter is unsound.
# When combined with glob, filegroup can ensure that all files are explicitly known to the build system.
filegroup(
    name = "lib-03",
    srcs = glob(["lib-03/**/*"]),
    visibility = ["//visibility:public"],
)

filegroup(
    name = "lib",
    srcs = glob(["lib/**/*"]),
    visibility = ["//visibility:public"],
)
