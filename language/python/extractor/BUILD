load("//:visibility.bzl", "PUBLIC_VISIBILITY")
load("@rules_python//python:defs.bzl", "py_runtime_pair")
load("@python3_10//:defs.bzl", "interpreter")

py_runtime(
    name = "my_py3_runtime",
    interpreter = interpreter,
    python_version = "PY3",
)

#py_runtime_pair(
#    name = "my_py_runtime_pair",
#    py3_runtime = ":my_py3_runtime",
#)
#
#toolchain(
#    name = "my_toolchain",
#    toolchain = ":my_py_runtime_pair",
#    toolchain_type = "@rules_python//python:toolchain_type",
#)

package(
    default_visibility = ["//language:default_visibility"],
)

load("@deps//:requirements.bzl", "requirement")
load("@rules_python//python:defs.bzl", "py_library")

#py_binary(
#    name = "coref-python-src-extractor1",
#    srcs = glob(["src/**/*.py"], exclude=["**/tests/**"]),
#    main = "src/main.py",
#    visibility = ["//visibility:public"],
#    deps = [
#        ":test",
#        requirement("tqdm"),
#        requirement("SQLAlchemy"),
#        requirement("pyinstaller")
#    ],
#)

py_library(
    name = "coref-python-extractor-src",
    srcs = glob(
        ["src/**/*.py"],
        exclude = ["**/tests/**"],
    ),
    visibility = ["//visibility:public"],
    deps = [
        requirement("tqdm"),
        requirement("SQLAlchemy"),
        requirement("pyinstaller"),
    ],
)

filegroup(
    name = "install_source",
    srcs = [
        "src/auto_build.py",
    ],
)

genrule(
    name = "coref-python-extractor-bin",
    srcs = [
        "//language/python/extractor:install_source",
        ":coref-python-extractor-src",
    ],
    outs = ["coref-python-src-extractor"],
    cmd = """
    chmod -R 755 $$(dirname $(PYTHON3))/../lib/python3.10/site-packages
    $(PYTHON3) -m pip install -r language/python/extractor/requirements.txt
    cp language/python/extractor/src/resources/hook-_tkinter.py $$(dirname $(PYTHON3))/../lib/python3.10/site-packages/PyInstaller/hooks/hook-_tkinter.py
    $(PYTHON3) $(locations //language/python/extractor:install_source)
    cp language/python/extractor/src/dist/coref-python-src-extractor $(RULEDIR)
    """,
    toolchains = ["@rules_python//python:current_py_toolchain"],
    visibility = ["//visibility:public"],
)
