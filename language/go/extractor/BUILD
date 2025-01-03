load("@io_bazel_rules_go//go:def.bzl", "go_binary", "go_library")
load("@bazel_gazelle//:def.bzl", "gazelle")

# gazelle:prefix alipay.com/code_insight/coref-go-extractor
gazelle(name = "gazelle")

go_library(
    name = "coref-go-extractor_lib",
    srcs = ["main.go"],
    importpath = "alipay.com/code_insight/coref-go-extractor",
    visibility = ["//visibility:private"],
    deps = [
        "//language/go/extractor/src/config",
        "//language/go/extractor/src/core",
    ],
)

go_binary(
    name = "extractor",
    embed = [":coref-go-extractor_lib"],
    visibility = ["//visibility:public"],
)
