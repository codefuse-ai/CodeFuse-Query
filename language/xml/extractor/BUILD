# add lombok annotation processor
java_import(
    name = "lombok_jar",
    jars = [
        "@maven//:v1/http/mvn.dev.alipay.net/artifactory/content/groups/public/org/projectlombok/lombok/1.18.16/lombok-1.18.16.jar",
    ],
)

java_plugin(
    name = "lombok_processor",
    # should be specified
    processor_class = "lombok.launch.AnnotationProcessorHider$AnnotationProcessor",
    deps = [
        ":lombok_jar",
    ],
)

# all in one exported processors library
java_library(
    name = "all_processors",
    exported_plugins = [
        ":lombok_processor",
    ],
    tags = ["maven:compile_only"],
    exports = [
        "@maven//:org_projectlombok_lombok",
    ],
)

java_import(
    name = "woodstox_core_jar",
    jars = ["lib/woodstox-core-6.4.1-SNAPSHOT.jar"],
)

java_binary(
    name = "coref-xml-extractor",
    srcs = glob(["src/main/java/**/*.java"]),
    main_class = "com.alipay.codequery.Extractor",
    resources = glob(["src/main/resources/**/*"]),
    visibility = ["//visibility:public"],
    deps = [
        ":all_processors",
        ":woodstox_core_jar",
        "@maven//:javax_persistence_javax_persistence_api",
        "@maven//:org_apache_commons_commons_lang3",
        "@maven//:org_apache_logging_log4j_log4j_api",
        "@maven//:org_apache_logging_log4j_log4j_core",
        "@maven//:org_apache_logging_log4j_log4j_slf4j_impl",
        "@maven//:org_codehaus_woodstox_stax2_api",
        "@maven//:org_mybatis_mybatis",
        "@maven//:org_projectlombok_lombok",
        "@maven//:org_xerial_sqlite_jdbc",
        "@maven//:tk_mybatis_mapper",
    ],
)
