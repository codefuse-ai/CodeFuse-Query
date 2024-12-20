load("//:junit5.bzl", "java_junit5_test")

# add lombok annotation processor
java_import(
    name = "lombok_jar",
    jars = [
        "@maven//:v1/https/maven.aliyun.com/repository/public/org/projectlombok/lombok/1.18.16/lombok-1.18.16.jar",
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

# add picocli annotation processor
java_import(
    name = "picocli_jar",
    jars = [
        "@maven//:v1/https/maven.aliyun.com/repository/public/info/picocli/picocli/4.6.1/picocli-4.6.1.jar",
        "@maven//:v1/https/maven.aliyun.com/repository/public/info/picocli/picocli-codegen/4.6.1/picocli-codegen-4.6.1.jar",
    ],
)

java_plugin(
    name = "picocli_processor",
    processor_class = "picocli.codegen.aot.graalvm.processor.NativeImageConfigGeneratorProcessor",
    #    processor_class = "picocli.codegen.aot.graalvm.processor.AbstractCompositeGeneratorProcessor",
    deps = [
        ":picocli_jar",
    ],
)

# all in one exported processors library
java_library(
    name = "all_processors",
    exported_plugins = [
        ":lombok_processor",
        ":picocli_processor",
    ],
    tags = ["maven:compile_only"],
    exports = [
        "@maven//:info_picocli_picocli_codegen",
        "@maven//:org_projectlombok_lombok",
    ],
)

java_library(
    name = "util",
    srcs = glob(["src/main/java/com/alipay/codequery/util/*.java"]),
    deps = [
        "@maven//:org_apache_commons_commons_lang3",
        "@maven//:org_apache_logging_log4j_log4j_api",
        "@maven//:org_apache_logging_log4j_log4j_core",
        "@maven//:org_apache_logging_log4j_log4j_slf4j_impl",
        "@maven//:org_jetbrains_annotations",
        "@maven//:org_slf4j_slf4j_api",
    ],
)

java_binary(
    name = "coref-sql-src-extractor",
    srcs = glob(["src/main/java/**/*.java"]),
    main_class = "com.alipay.codequery.coref.sql.Extractor",
    resources = glob(["src/main/resources/**/*"]),
    visibility = ["//visibility:public"],
    deps = [
        ":all_processors",
        ":util",
        "@maven//:com_alibaba_druid",
        "@maven//:com_google_code_gson_gson",
        "@maven//:com_google_guava_guava",
        "@maven//:com_google_re2j_re2j",
        "@maven//:com_ibm_icu_icu4j",
        "@maven//:commons_codec_commons_codec",
        "@maven//:commons_io_commons_io",
        "@maven//:info_picocli_picocli",
        "@maven//:javax_annotation_javax_annotation_api",
        "@maven//:me_tongfei_progressbar",
        "@maven//:net_java_dev_jna_jna",
        "@maven//:org_apache_commons_commons_lang3",
        "@maven//:org_apache_logging_log4j_log4j_api",
        "@maven//:org_apache_logging_log4j_log4j_core",
        "@maven//:org_apache_logging_log4j_log4j_slf4j_impl",
        "@maven//:org_hamcrest_hamcrest_all",
        "@maven//:org_ini4j_ini4j",
        "@maven//:org_jetbrains_annotations",
        "@maven//:org_mybatis_dynamic_sql_mybatis_dynamic_sql",
        "@maven//:org_mybatis_mybatis",
        "@maven//:org_projectlombok_lombok",
        "@maven//:org_slf4j_slf4j_api",
        "@maven//:org_xerial_sqlite_jdbc",
        "@maven//:tk_mybatis_mapper",
        "@maven//:uk_com_robust_it_cloning",
    ],
)
