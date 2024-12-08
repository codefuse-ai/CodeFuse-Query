load("@bazel_gazelle//:deps.bzl", "go_repository")

def go_dependencies():
    go_repository(
        name = "co_honnef_go_tools",
        build_file_proto_mode = "disable_global",
        importpath = "honnef.co/go/tools",
        sum = "h1:UoveltGrhghAA7ePc+e+QYDHXrBps2PqFZiHkGR/xK8=",
        version = "v0.0.1-2020.1.4",
    )
    go_repository(
        name = "com_github_alecthomas_template",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/alecthomas/template",
        sum = "h1:JYp7IbQjafoB+tBA3gMyHYHrpOtNuDiK/uB5uXxq5wM=",
        version = "v0.0.0-20190718012654-fb15b899a751",
    )
    go_repository(
        name = "com_github_alecthomas_units",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/alecthomas/units",
        sum = "h1:UQZhZ2O0vMHr2cI+DC1Mbh0TJxzA3RcLoMsFw+aXw7E=",
        version = "v0.0.0-20190924025748-f65c72e2690d",
    )
    go_repository(
        name = "com_github_alicebob_gopher_json",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/alicebob/gopher-json",
        sum = "h1:HbKu58rmZpUGpz5+4FfNmIU+FmZg2P3Xaj2v2bfNWmk=",
        version = "v0.0.0-20200520072559-a9ecdc9d1d3a",
    )
    go_repository(
        name = "com_github_alicebob_miniredis_v2",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/alicebob/miniredis/v2",
        sum = "h1:+lwAJYjvvdIVg6doFHuotFjueJ/7KY10xo/vm3X3Scw=",
        version = "v2.23.0",
    )
    go_repository(
        name = "com_github_antihax_optional",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/antihax/optional",
        sum = "h1:xK2lYat7ZLaVVcIuj82J8kIro4V6kDe0AUDFboUCwcg=",
        version = "v1.0.0",
    )
    go_repository(
        name = "com_github_armon_go_socks5",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/armon/go-socks5",
        sum = "h1:0CwZNZbxp69SHPdPJAN/hZIm0C4OItdklCFmMRWYpio=",
        version = "v0.0.0-20160902184237-e75332964ef5",
    )
    go_repository(
        name = "com_github_asaskevich_govalidator",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/asaskevich/govalidator",
        sum = "h1:idn718Q4B6AGu/h5Sxe66HYVdqdGu2l9Iebqhi/AEoA=",
        version = "v0.0.0-20190424111038-f61b66f89f4a",
    )
    go_repository(
        name = "com_github_azure_go_autorest",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/Azure/go-autorest",
        sum = "h1:V5VMDjClD3GiElqLWO7mz2MxNAK/vTfRHdAubSIPRgs=",
        version = "v14.2.0+incompatible",
    )
    go_repository(
        name = "com_github_azure_go_autorest_autorest",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/Azure/go-autorest/autorest",
        sum = "h1:F3R3q42aWytozkV8ihzcgMO4OA4cuqr3bNlsEuF6//A=",
        version = "v0.11.27",
    )
    go_repository(
        name = "com_github_azure_go_autorest_autorest_adal",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/Azure/go-autorest/autorest/adal",
        sum = "h1:gJ3E98kMpFB1MFqQCvA1yFab8vthOeD4VlFRQULxahg=",
        version = "v0.9.20",
    )
    go_repository(
        name = "com_github_azure_go_autorest_autorest_date",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/Azure/go-autorest/autorest/date",
        sum = "h1:7gUk1U5M/CQbp9WoqinNzJar+8KY+LPI6wiWrP/myHw=",
        version = "v0.3.0",
    )
    go_repository(
        name = "com_github_azure_go_autorest_autorest_mocks",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/Azure/go-autorest/autorest/mocks",
        sum = "h1:K0laFcLE6VLTOwNgSxaGbUcLPuGXlNkbVvq4cW4nIHk=",
        version = "v0.4.1",
    )
    go_repository(
        name = "com_github_azure_go_autorest_logger",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/Azure/go-autorest/logger",
        sum = "h1:IG7i4p/mDa2Ce4TRyAO8IHnVhAVF3RFU+ZtXWSmf4Tg=",
        version = "v0.2.1",
    )
    go_repository(
        name = "com_github_azure_go_autorest_tracing",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/Azure/go-autorest/tracing",
        sum = "h1:TYi4+3m5t6K48TGI9AUdb+IzbnSxvnvUMfuitfgcfuo=",
        version = "v0.6.0",
    )
    go_repository(
        name = "com_github_benbjohnson_clock",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/benbjohnson/clock",
        sum = "h1:Q92kusRqC1XV2MjkWETPvjJVqKetz1OzxZB7mHJLju8=",
        version = "v1.1.0",
    )
    go_repository(
        name = "com_github_beorn7_perks",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/beorn7/perks",
        sum = "h1:VlbKKnNfV8bJzeqoa4cOKqO6bYr3WgKZxO8Z16+hsOM=",
        version = "v1.0.1",
    )
    go_repository(
        name = "com_github_bkaradzic_go_lz4",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/bkaradzic/go-lz4",
        sum = "h1:RXc4wYsyz985CkXXeX04y4VnZFGG8Rd43pRaHsOXAKk=",
        version = "v1.0.0",
    )
    go_repository(
        name = "com_github_burntsushi_toml",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/BurntSushi/toml",
        sum = "h1:WXkYYl6Yr3qBf1K79EBnL4mak0OimBfB0XUf9Vl28OQ=",
        version = "v0.3.1",
    )
    go_repository(
        name = "com_github_burntsushi_xgb",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/BurntSushi/xgb",
        sum = "h1:1BDTz0u9nC3//pOCMdNH+CiXJVYJh5UQNCOBG7jbELc=",
        version = "v0.0.0-20160522181843-27f122750802",
    )
    go_repository(
        name = "com_github_cenkalti_backoff_v4",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/cenkalti/backoff/v4",
        sum = "h1:cFAlzYUlVYDysBEH2T5hyJZMh3+5+WCBvSnK6Q8UtC4=",
        version = "v4.1.3",
    )
    go_repository(
        name = "com_github_census_instrumentation_opencensus_proto",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/census-instrumentation/opencensus-proto",
        sum = "h1:glEXhBS5PSLLv4IXzLA5yPRVX4bilULVyxxbrfOtDAk=",
        version = "v0.2.1",
    )
    go_repository(
        name = "com_github_cespare_xxhash",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/cespare/xxhash",
        sum = "h1:a6HrQnmkObjyL+Gs60czilIUGqrzKutQD6XZog3p+ko=",
        version = "v1.1.0",
    )
    go_repository(
        name = "com_github_cespare_xxhash_v2",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/cespare/xxhash/v2",
        sum = "h1:YRXhKfTDauu4ajMg1TPgFO5jnlC2HCbmLXMcTG5cbYE=",
        version = "v2.1.2",
    )
    go_repository(
        name = "com_github_chzyer_logex",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/chzyer/logex",
        sum = "h1:Swpa1K6QvQznwJRcfTfQJmTE72DqScAa40E+fbHEXEE=",
        version = "v1.1.10",
    )
    go_repository(
        name = "com_github_chzyer_readline",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/chzyer/readline",
        sum = "h1:fY5BOSpyZCqRo5OhCuC+XN+r/bBCmeuuJtjz+bCNIf8=",
        version = "v0.0.0-20180603132655-2972be24d48e",
    )
    go_repository(
        name = "com_github_chzyer_test",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/chzyer/test",
        sum = "h1:q763qf9huN11kDQavWsoZXJNW3xEE4JJyHa5Q25/sd8=",
        version = "v0.0.0-20180213035817-a1ea475d72b1",
    )
    go_repository(
        name = "com_github_clickhouse_clickhouse_go",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/ClickHouse/clickhouse-go",
        sum = "h1:cKjXeYLNWVJIx2J1K6H2CqyRmfwVJVY1OV1coaaFcI0=",
        version = "v1.5.4",
    )
    go_repository(
        name = "com_github_clickhouse_clickhouse_go_v2",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/ClickHouse/clickhouse-go/v2",
        sum = "h1:7HW+MXPaQfVyCzPGEn/LciMc8K6cG58FZMUc7DXQmro=",
        version = "v2.0.14",
    )
    go_repository(
        name = "com_github_client9_misspell",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/client9/misspell",
        sum = "h1:ta993UF76GwbvJcIo3Y68y/M3WxlpEHPWIGDkJYwzJI=",
        version = "v0.3.4",
    )
    go_repository(
        name = "com_github_cloudflare_golz4",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/cloudflare/golz4",
        sum = "h1:F1EaeKL/ta07PY/k9Os/UFtwERei2/XzGemhpGnBKNg=",
        version = "v0.0.0-20150217214814-ef862a3cdc58",
    )
    go_repository(
        name = "com_github_cncf_udpa_go",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/cncf/udpa/go",
        sum = "h1:hzAQntlaYRkVSFEfj9OTWlVV1H155FMD8BTKktLv0QI=",
        version = "v0.0.0-20210930031921-04548b0d99d4",
    )
    go_repository(
        name = "com_github_cncf_xds_go",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/cncf/xds/go",
        sum = "h1:zH8ljVhhq7yC0MIeUL/IviMtY8hx2mK8cN9wEYb8ggw=",
        version = "v0.0.0-20211011173535-cb28da3451f1",
    )
    go_repository(
        name = "com_github_coreos_go_semver",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/coreos/go-semver",
        sum = "h1:wkHLiw0WNATZnSG7epLsujiMCgPAc9xhjJ4tgnAxmfM=",
        version = "v0.3.0",
    )
    go_repository(
        name = "com_github_coreos_go_systemd_v22",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/coreos/go-systemd/v22",
        sum = "h1:D9/bQk5vlXQFZ6Kwuu6zaiXJ9oTPe68++AzAJc1DzSI=",
        version = "v22.3.2",
    )
    go_repository(
        name = "com_github_cpuguy83_go_md2man_v2",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/cpuguy83/go-md2man/v2",
        sum = "h1:U+s90UTSYgptZMwQh2aRr3LuazLJIa+Pg3Kc1ylSYVY=",
        version = "v2.0.0-20190314233015-f79a8a8ca69d",
    )
    go_repository(
        name = "com_github_creack_pty",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/creack/pty",
        sum = "h1:uDmaGzcdjhF4i/plgjmEsriH11Y0o7RKapEf/LDaM3w=",
        version = "v1.1.9",
    )
    go_repository(
        name = "com_github_data_dog_go_sqlmock",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/DATA-DOG/go-sqlmock",
        sum = "h1:Shsta01QNfFxHCfpW6YH2STWB0MudeXXEWMr20OEh60=",
        version = "v1.5.0",
    )

    go_repository(
        name = "com_github_davecgh_go_spew",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/davecgh/go-spew",
        sum = "h1:vj9j/u1bqnvCEfJOwUhtlOARqs3+rkHYY13jYWTU97c=",
        version = "v1.1.1",
    )
    go_repository(
        name = "com_github_dgryski_go_rendezvous",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/dgryski/go-rendezvous",
        sum = "h1:lO4WD4F/rVNCu3HqELle0jiPLLBs70cWOduZpkS1E78=",
        version = "v0.0.0-20200823014737-9f7001d12a5f",
    )
    go_repository(
        name = "com_github_docopt_docopt_go",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/docopt/docopt-go",
        sum = "h1:bWDMxwH3px2JBh6AyO7hdCn/PkvCZXii8TGj7sbtEbQ=",
        version = "v0.0.0-20180111231733-ee0de3bc6815",
    )

    go_repository(
        name = "com_github_dustin_go_humanize",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/dustin/go-humanize",
        sum = "h1:VSnTsYCnlFHaM2/igO1h6X3HA71jcobQuxemgkq4zYo=",
        version = "v1.0.0",
    )
    go_repository(
        name = "com_github_eapache_go_resiliency",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/eapache/go-resiliency",
        sum = "h1:v7g92e/KSN71Rq7vSThKaWIq68fL4YHvWyiUKorFR1Q=",
        version = "v1.2.0",
    )
    go_repository(
        name = "com_github_eapache_go_xerial_snappy",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/eapache/go-xerial-snappy",
        sum = "h1:YEetp8/yCZMuEPMUDHG0CW/brkkEp8mzqk2+ODEitlw=",
        version = "v0.0.0-20180814174437-776d5712da21",
    )
    go_repository(
        name = "com_github_eapache_queue",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/eapache/queue",
        sum = "h1:YOEu7KNc61ntiQlcEeUIoDTJ2o8mQznoNvUhiigpIqc=",
        version = "v1.1.0",
    )
    go_repository(
        name = "com_github_elazarl_goproxy",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/elazarl/goproxy",
        sum = "h1:yUdfgN0XgIJw7foRItutHYUIhlcKzcSf5vDpdhQAKTc=",
        version = "v0.0.0-20180725130230-947c36da3153",
    )
    go_repository(
        name = "com_github_emicklei_go_restful",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/emicklei/go-restful",
        sum = "h1:H2pdYOb3KQ1/YsqVWoWNLQO+fusocsw354rqGTZtAgw=",
        version = "v0.0.0-20170410110728-ff4f55a20633",
    )
    go_repository(
        name = "com_github_emicklei_go_restful_v3",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/emicklei/go-restful/v3",
        sum = "h1:eCZ8ulSerjdAiaNpF7GxXIE7ZCMo1moN1qX+S609eVw=",
        version = "v3.8.0",
    )
    go_repository(
        name = "com_github_envoyproxy_go_control_plane",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/envoyproxy/go-control-plane",
        sum = "h1:xvqufLtNVwAhN8NMyWklVgxnWohi+wtMGQMhtxexlm0=",
        version = "v0.10.2-0.20220325020618-49ff273808a1",
    )
    go_repository(
        name = "com_github_envoyproxy_protoc_gen_validate",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/envoyproxy/protoc-gen-validate",
        sum = "h1:EQciDnbrYxy13PgWoY8AqoxGiPrpgBZ1R8UNe3ddc+A=",
        version = "v0.1.0",
    )
    go_repository(
        name = "com_github_evanphx_json_patch",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/evanphx/json-patch",
        sum = "h1:4onqiflcdA9EOZ4RxV643DvftH5pOlLGNtQ5lPWQu84=",
        version = "v4.12.0+incompatible",
    )
    go_repository(
        name = "com_github_fatih_color",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/fatih/color",
        sum = "h1:8LOYc1KYPPmyKMuN8QV2DNRWNbLo6LZ0iLs8+mlH53w=",
        version = "v1.13.0",
    )
    go_repository(
        name = "com_github_form3tech_oss_jwt_go",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/form3tech-oss/jwt-go",
        sum = "h1:7ZaBxOI7TMoYBfyA3cQHErNNyAWIKUMIwqxEtgHOs5c=",
        version = "v3.2.3+incompatible",
    )
    go_repository(
        name = "com_github_fortytw2_leaktest",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/fortytw2/leaktest",
        sum = "h1:u8491cBMTQ8ft8aeV+adlcytMZylmA5nnwwkRZjI8vw=",
        version = "v1.3.0",
    )
    go_repository(
        name = "com_github_frankban_quicktest",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/frankban/quicktest",
        sum = "h1:8sXhOn0uLys67V8EsXLc6eszDs8VXWxL3iRvebPhedY=",
        version = "v1.11.3",
    )
    go_repository(
        name = "com_github_fsnotify_fsnotify",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/fsnotify/fsnotify",
        sum = "h1:hsms1Qyu0jgnwNXIxa+/V/PDsU6CfLf6CNO8H7IWoS4=",
        version = "v1.4.9",
    )
    go_repository(
        name = "com_github_fullstorydev_grpcurl",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/fullstorydev/grpcurl",
        sum = "h1:xJWosq3BQovQ4QrdPO72OrPiWuGgEsxY8ldYsJbPrqI=",
        version = "v1.8.7",
    )
    go_repository(
        name = "com_github_ghodss_yaml",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/ghodss/yaml",
        sum = "h1:wQHKEahhL6wmXdzwWG11gIVCkOv05bNOh+Rxn0yngAk=",
        version = "v1.0.0",
    )

    go_repository(
        name = "com_github_glebarez_go_sqlite",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/glebarez/go-sqlite",
        sum = "h1:gyTyFr2RFFQd2gp6fOOdfnTvUn99zwvVOrQFHA4S+DY=",
        version = "v1.17.2",
    )
    go_repository(
        name = "com_github_glebarez_sqlite",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/glebarez/sqlite",
        sum = "h1:oaJupO4X9iTn4sXRvP5Vs15BNvKh9dx5AQfciKlDvV4=",
        version = "v1.4.5",
    )
    go_repository(
        name = "com_github_globalsign_mgo",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/globalsign/mgo",
        sum = "h1:DujepqpGd1hyOd7aW59XpK7Qymp8iy83xq74fLr21is=",
        version = "v0.0.0-20181015135952-eeefdecb41b8",
    )
    go_repository(
        name = "com_github_go_gl_glfw",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/go-gl/glfw",
        sum = "h1:QbL/5oDUmRBzO9/Z7Seo6zf912W/a6Sr4Eu0G/3Jho0=",
        version = "v0.0.0-20190409004039-e6da0acd62b1",
    )
    go_repository(
        name = "com_github_go_gl_glfw_v3_3_glfw",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/go-gl/glfw/v3.3/glfw",
        sum = "h1:WtGNWLvXpe6ZudgnXrq0barxBImvnnJoMEhXAzcbM0I=",
        version = "v0.0.0-20200222043503-6f7a984d4dc4",
    )
    go_repository(
        name = "com_github_go_kit_kit",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/go-kit/kit",
        sum = "h1:wDJmvq38kDhkVxi50ni9ykkdUr1PKgqKOoi01fa0Mdk=",
        version = "v0.9.0",
    )
    go_repository(
        name = "com_github_go_kit_log",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/go-kit/log",
        sum = "h1:7i2K3eKTos3Vc0enKCfnVcgHh2olr/MyfboYq7cAcFw=",
        version = "v0.2.0",
    )
    go_repository(
        name = "com_github_go_logfmt_logfmt",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/go-logfmt/logfmt",
        sum = "h1:otpy5pqBCBZ1ng9RQ0dPu4PN7ba75Y/aA+UpowDyNVA=",
        version = "v0.5.1",
    )
    go_repository(
        name = "com_github_go_logr_logr",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/go-logr/logr",
        sum = "h1:2DntVwHkVopvECVRSlL5PSo9eG+cAkDCuckLubN+rq0=",
        version = "v1.2.3",
    )
    go_repository(
        name = "com_github_go_logr_stdr",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/go-logr/stdr",
        sum = "h1:hSWxHoqTgW2S2qGc0LTAI563KZ5YKYRhT3MFKZMbjag=",
        version = "v1.2.2",
    )
    go_repository(
        name = "com_github_go_ole_go_ole",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/go-ole/go-ole",
        sum = "h1:nNBDSCOigTSiarFpYE9J/KtEA1IOW4CNeqT9TQDqCxI=",
        version = "v1.2.4",
    )
    go_repository(
        name = "com_github_go_openapi_jsonpointer",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/go-openapi/jsonpointer",
        sum = "h1:gZr+CIYByUqjcgeLXnQu2gHYQC9o73G2XUeOFYEICuY=",
        version = "v0.19.5",
    )
    go_repository(
        name = "com_github_go_openapi_jsonreference",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/go-openapi/jsonreference",
        sum = "h1:1WJP/wi4OjB4iV8KVbH73rQaoialJrqv8gitZLxGLtM=",
        version = "v0.19.5",
    )
    go_repository(
        name = "com_github_go_openapi_swag",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/go-openapi/swag",
        sum = "h1:gm3vOOXfiuw5i9p5N9xJvfjvuofpyvLA9Wr6QfK5Fng=",
        version = "v0.19.14",
    )
    go_repository(
        name = "com_github_go_redis_redis_v8",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/go-redis/redis/v8",
        sum = "h1:AcZZR7igkdvfVmQTPnu9WE37LRrO/YrBH5zWyjDC0oI=",
        version = "v8.11.5",
    )
    go_repository(
        name = "com_github_go_sql_driver_mysql",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/go-sql-driver/mysql",
        sum = "h1:BCTh4TKNUYmOmMUcQ3IipzF5prigylS7XXjEkfCHuOE=",
        version = "v1.6.0",
    )
    go_repository(
        name = "com_github_go_stack_stack",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/go-stack/stack",
        sum = "h1:5SgMzNM5HxrEjV0ww2lTmX6E2Izsfxas4+YHWRs3Lsk=",
        version = "v1.8.0",
    )
    go_repository(
        name = "com_github_go_task_slim_sprig",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/go-task/slim-sprig",
        sum = "h1:p104kn46Q8WdvHunIJ9dAyjPVtrBPhSr3KT2yUst43I=",
        version = "v0.0.0-20210107165309-348f09dbbbc0",
    )
    go_repository(
        name = "com_github_godbus_dbus_v5",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/godbus/dbus/v5",
        sum = "h1:9349emZab16e7zQvpmsbtjc18ykshndd8y2PG3sgJbA=",
        version = "v5.0.4",
    )
    go_repository(
        name = "com_github_gofrs_uuid",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/gofrs/uuid",
        sum = "h1:0/KbAdpx3UXAx1kEOWHJeOkpbgRFGHVgv+CFIY7dBJI=",
        version = "v4.3.1+incompatible",
    )
    go_repository(
        name = "com_github_gogo_protobuf",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/gogo/protobuf",
        sum = "h1:Ov1cvc58UF3b5XjBnZv7+opcTcQFZebYjWzi34vdm4Q=",
        version = "v1.3.2",
    )
    go_repository(
        name = "com_github_golang_glog",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/golang/glog",
        sum = "h1:nfP3RFugxnNRyKgeWd4oI1nYvXpxrx8ck8ZrcizshdQ=",
        version = "v1.0.0",
    )
    go_repository(
        name = "com_github_golang_groupcache",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/golang/groupcache",
        sum = "h1:oI5xCqsCo564l8iNU+DwB5epxmsaqB+rhGL0m5jtYqE=",
        version = "v0.0.0-20210331224755-41bb18bfe9da",
    )
    go_repository(
        name = "com_github_golang_jwt_jwt_v4",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/golang-jwt/jwt/v4",
        sum = "h1:rcc4lwaZgFMCZ5jxF9ABolDcIHdBytAFgqFPbSJQAYs=",
        version = "v4.4.2",
    )
    go_repository(
        name = "com_github_golang_mock",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/golang/mock",
        sum = "h1:ErTB+efbowRARo13NNdxyJji2egdxLGQhRaY+DUumQc=",
        version = "v1.6.0",
    )
    go_repository(
        name = "com_github_golang_protobuf",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/golang/protobuf",
        sum = "h1:ROPKBNFfQgOUMifHyP+KYbvpjbdoFNs+aK7DXlji0Tw=",
        version = "v1.5.2",
    )
    go_repository(
        name = "com_github_golang_snappy",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/golang/snappy",
        sum = "h1:yAGX7huGHXlcLOEtBnF4w7FQwA26wojNCwOYAEhLjQM=",
        version = "v0.0.4",
    )
    go_repository(
        name = "com_github_google_btree",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/google/btree",
        sum = "h1:gK4Kx5IaGY9CD5sPJ36FHiBJ6ZXl0kilRiiCj+jdYp4=",
        version = "v1.0.1",
    )
    go_repository(
        name = "com_github_google_gnostic",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/google/gnostic",
        sum = "h1:FhTMOKj2VhjpouxvWJAV1TL304uMlb9zcDqkl6cEI54=",
        version = "v0.5.7-v3refs",
    )

    go_repository(
        name = "com_github_google_go_cmp",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/google/go-cmp",
        sum = "h1:e6P7q2lk1O+qJJb4BtCQXlK8vWEO8V1ZeuEdJNOqZyg=",
        version = "v0.5.8",
    )
    go_repository(
        name = "com_github_google_gofuzz",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/google/gofuzz",
        sum = "h1:xRy4A+RhZaiKjJ1bPfwQ8sedCA+YS2YcCHW6ec7JMi0=",
        version = "v1.2.0",
    )
    go_repository(
        name = "com_github_google_martian",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/google/martian",
        sum = "h1:/CP5g8u/VJHijgedC/Legn3BAbAaWPgecwXBIDzw5no=",
        version = "v2.1.0+incompatible",
    )
    go_repository(
        name = "com_github_google_martian_v3",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/google/martian/v3",
        sum = "h1:pMen7vLs8nvgEYhywH3KDWJIJTeEr2ULsVWHWYHQyBs=",
        version = "v3.0.0",
    )
    go_repository(
        name = "com_github_google_pprof",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/google/pprof",
        sum = "h1:yAJXTCF9TqKcTiHJAE8dj7HMvPfh66eeA2JYW7eFpSE=",
        version = "v0.0.0-20210407192527-94a9f03dee38",
    )
    go_repository(
        name = "com_github_google_renameio",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/google/renameio",
        sum = "h1:GOZbcHa3HfsPKPlmyPyN2KEohoMXOhdMbHrvbpl2QaA=",
        version = "v0.1.0",
    )

    go_repository(
        name = "com_github_google_uuid",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/google/uuid",
        sum = "h1:t6JiXgmwXMjEs8VusXIJk2BXHsn+wx8BZdTaoZ5fu7I=",
        version = "v1.3.0",
    )
    go_repository(
        name = "com_github_googleapis_gax_go_v2",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/googleapis/gax-go/v2",
        sum = "h1:sjZBwGj9Jlw33ImPtvFviGYvseOtDM7hkSKB7+Tv3SM=",
        version = "v2.0.5",
    )
    go_repository(
        name = "com_github_googleapis_gnostic",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/googleapis/gnostic",
        sum = "h1:9fHAtK0uDfpveeqqo1hkEZJcFvYXAiCN3UutL8F9xHw=",
        version = "v0.5.5",
    )
    go_repository(
        name = "com_github_gorilla_handlers",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/gorilla/handlers",
        sum = "h1:0QniY0USkHQ1RGCLfKxeNHK9bkDHGRYGNDFBCS+YARg=",
        version = "v1.4.2",
    )
    go_repository(
        name = "com_github_gorilla_mux",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/gorilla/mux",
        sum = "h1:i40aqfkR1h2SlN9hojwV5ZA91wcXFOvkdNIeFDP5koI=",
        version = "v1.8.0",
    )
    go_repository(
        name = "com_github_gorilla_securecookie",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/gorilla/securecookie",
        sum = "h1:miw7JPhV+b/lAHSXz4qd/nN9jRiAFV5FwjeKyCS8BvQ=",
        version = "v1.1.1",
    )
    go_repository(
        name = "com_github_gorilla_sessions",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/gorilla/sessions",
        sum = "h1:DHd3rPN5lE3Ts3D8rKkQ8x/0kqfeNmBAaiSi+o7FsgI=",
        version = "v1.2.1",
    )
    go_repository(
        name = "com_github_gorilla_websocket",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/gorilla/websocket",
        sum = "h1:+/TMaTYc4QFitKJxsQ7Yye35DkWvkdLcvGKqM+x0Ufc=",
        version = "v1.4.2",
    )
    go_repository(
        name = "com_github_gregjones_httpcache",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/gregjones/httpcache",
        sum = "h1:pdN6V1QBWetyv/0+wjACpqVH+eVULgEjkurDLq3goeM=",
        version = "v0.0.0-20180305231024-9cad4c3443a7",
    )
    go_repository(
        name = "com_github_grpc_ecosystem_go_grpc_prometheus",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/grpc-ecosystem/go-grpc-prometheus",
        sum = "h1:Ovs26xHkKqVztRpIrF/92BcuyuQ/YW4NSIpoGtfXNho=",
        version = "v1.2.0",
    )
    go_repository(
        name = "com_github_grpc_ecosystem_grpc_gateway",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/grpc-ecosystem/grpc-gateway",
        sum = "h1:gmcG1KaJ57LophUzW0Hy8NmPhnMZb4M0+kPpLofRdBo=",
        version = "v1.16.0",
    )
    go_repository(
        name = "com_github_grpc_ecosystem_grpc_gateway_v2",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/grpc-ecosystem/grpc-gateway/v2",
        sum = "h1:BZHcxBETFHIdVyhyEfOvn/RdU/QGdLI4y34qQGjGWO0=",
        version = "v2.7.0",
    )
    go_repository(
        name = "com_github_h2non_parth",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/h2non/parth",
        sum = "h1:2VTzZjLZBgl62/EtslCrtky5vbi9dd7HrQPQIx6wqiw=",
        version = "v0.0.0-20190131123155-b4df798d6542",
    )
    go_repository(
        name = "com_github_hashicorp_go_uuid",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/hashicorp/go-uuid",
        sum = "h1:cfejS+Tpcp13yd5nYHWDI6qVCny6wyX2Mt5SGur2IGE=",
        version = "v1.0.2",
    )
    go_repository(
        name = "com_github_hashicorp_golang_lru",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/hashicorp/golang-lru",
        sum = "h1:0hERBMJE1eitiLkihrMvRVBYAkpHzc/J3QdDN+dAcgU=",
        version = "v0.5.1",
    )
    go_repository(
        name = "com_github_hpcloud_tail",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/hpcloud/tail",
        sum = "h1:nfCOvKYfkgYP8hkirhJocXT2+zOD8yUNjXaWfTlyFKI=",
        version = "v1.0.0",
    )
    go_repository(
        name = "com_github_ianlancetaylor_demangle",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/ianlancetaylor/demangle",
        sum = "h1:mV02weKRL81bEnm8A0HT1/CAelMQDBuQIfLw8n+d6xI=",
        version = "v0.0.0-20200824232613-28f6c0f3b639",
    )
    go_repository(
        name = "com_github_imdario_mergo",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/imdario/mergo",
        sum = "h1:xTNEAn+kxVO7dTZGu0CegyqKZmoWFI0rF8UxjlB2d28=",
        version = "v0.3.6",
    )
    go_repository(
        name = "com_github_jcmturner_aescts_v2",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/jcmturner/aescts/v2",
        sum = "h1:9YKLH6ey7H4eDBXW8khjYslgyqG2xZikXP0EQFKrle8=",
        version = "v2.0.0",
    )
    go_repository(
        name = "com_github_jcmturner_dnsutils_v2",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/jcmturner/dnsutils/v2",
        sum = "h1:lltnkeZGL0wILNvrNiVCR6Ro5PGU/SeBvVO/8c/iPbo=",
        version = "v2.0.0",
    )
    go_repository(
        name = "com_github_jcmturner_gofork",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/jcmturner/gofork",
        sum = "h1:J7uCkflzTEhUZ64xqKnkDxq3kzc96ajM1Gli5ktUem8=",
        version = "v1.0.0",
    )
    go_repository(
        name = "com_github_jcmturner_goidentity_v6",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/jcmturner/goidentity/v6",
        sum = "h1:VKnZd2oEIMorCTsFBnJWbExfNN7yZr3EhJAxwOkZg6o=",
        version = "v6.0.1",
    )
    go_repository(
        name = "com_github_jcmturner_gokrb5_v8",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/jcmturner/gokrb5/v8",
        sum = "h1:6ZIM6b/JJN0X8UM43ZOM6Z4SJzla+a/u7scXFJzodkA=",
        version = "v8.4.2",
    )
    go_repository(
        name = "com_github_jcmturner_rpc_v2",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/jcmturner/rpc/v2",
        sum = "h1:7FXXj8Ti1IaVFpSAziCZWNzbNuZmnvw/i6CqLNdWfZY=",
        version = "v2.0.3",
    )
    go_repository(
        name = "com_github_jhump_gopoet",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/jhump/gopoet",
        sum = "h1:gYjOPnzHd2nzB37xYQZxj4EIQNpBrBskRqQQ3q4ZgSg=",
        version = "v0.1.0",
    )
    go_repository(
        name = "com_github_jhump_goprotoc",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/jhump/goprotoc",
        sum = "h1:Y1UgUX+txUznfqcGdDef8ZOVlyQvnV0pKWZH08RmZuo=",
        version = "v0.5.0",
    )
    go_repository(
        name = "com_github_jhump_protoreflect",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/jhump/protoreflect",
        sum = "h1:zrrZqa7JAc2YGgPSzZZkmUXJ5G6NRPdxOg/9t7ISImA=",
        version = "v1.13.0",
    )

    go_repository(
        name = "com_github_jinzhu_inflection",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/jinzhu/inflection",
        sum = "h1:K317FqzuhWc8YvSVlFMCCUb36O/S9MCKRDI7QkRKD/E=",
        version = "v1.0.0",
    )
    go_repository(
        name = "com_github_jinzhu_now",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/jinzhu/now",
        sum = "h1:tHnRBy1i5F2Dh8BAFxqFzxKqqvezXrL2OW1TnX+Mlas=",
        version = "v1.1.4",
    )
    go_repository(
        name = "com_github_jmoiron_sqlx",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/jmoiron/sqlx",
        sum = "h1:41Ip0zITnmWNR/vHV+S4m+VoUivnWY5E4OJfLZjCJMA=",
        version = "v1.2.0",
    )
    go_repository(
        name = "com_github_josharian_intern",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/josharian/intern",
        sum = "h1:vlS4z54oSdjm0bgjRigI+G1HpF+tI+9rE5LLzOg8HmY=",
        version = "v1.0.0",
    )
    go_repository(
        name = "com_github_jpillora_backoff",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/jpillora/backoff",
        sum = "h1:uvFg412JmmHBHw7iwprIxkPMI+sGQ4kzOWsMeHnm2EA=",
        version = "v1.0.0",
    )
    go_repository(
        name = "com_github_json_iterator_go",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/json-iterator/go",
        sum = "h1:PV8peI4a0ysnczrg+LtxykD8LfKY9ML6u2jnxaEnrnM=",
        version = "v1.1.12",
    )
    go_repository(
        name = "com_github_jstemmer_go_junit_report",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/jstemmer/go-junit-report",
        sum = "h1:6QPYqodiu3GuPL+7mfx+NwDdp2eTkp9IfEUpgAwUN0o=",
        version = "v0.9.1",
    )
    go_repository(
        name = "com_github_julienschmidt_httprouter",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/julienschmidt/httprouter",
        sum = "h1:U0609e9tgbseu3rBINet9P48AI/D3oJs4dN7jwJOQ1U=",
        version = "v1.3.0",
    )

    go_repository(
        name = "com_github_kballard_go_shellquote",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/kballard/go-shellquote",
        sum = "h1:Z9n2FFNUXsshfwJMBgNA0RU6/i7WVaAegv3PtuIHPMs=",
        version = "v0.0.0-20180428030007-95032a82bc51",
    )
    go_repository(
        name = "com_github_kisielk_errcheck",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/kisielk/errcheck",
        sum = "h1:e8esj/e4R+SAOwFwN+n3zr0nYeCyeweozKfO23MvHzY=",
        version = "v1.5.0",
    )
    go_repository(
        name = "com_github_kisielk_gotool",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/kisielk/gotool",
        sum = "h1:AV2c/EiW3KqPNT9ZKl07ehoAGi4C5/01Cfbblndcapg=",
        version = "v1.0.0",
    )
    go_repository(
        name = "com_github_klauspost_compress",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/klauspost/compress",
        sum = "h1:P76CopJELS0TiO2mebmnzgWaajssP/EszplttgQxcgc=",
        version = "v1.13.6",
    )
    go_repository(
        name = "com_github_konsorten_go_windows_terminal_sequences",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/konsorten/go-windows-terminal-sequences",
        sum = "h1:CE8S1cTafDpPvMhIxNJKvHsGVBgn1xWYf1NbHQhywc8=",
        version = "v1.0.3",
    )
    go_repository(
        name = "com_github_kr_logfmt",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/kr/logfmt",
        sum = "h1:T+h1c/A9Gawja4Y9mFVWj2vyii2bbUNDw3kt9VxK2EY=",
        version = "v0.0.0-20140226030751-b84e30acd515",
    )
    go_repository(
        name = "com_github_kr_pretty",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/kr/pretty",
        sum = "h1:Fmg33tUaq4/8ym9TJN1x7sLJnHVwhP33CNkpYV/7rwI=",
        version = "v0.2.1",
    )
    go_repository(
        name = "com_github_kr_pty",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/kr/pty",
        sum = "h1:VkoXIwSboBpnk99O/KFauAEILuNHv5DVFKZMBN/gUgw=",
        version = "v1.1.1",
    )
    go_repository(
        name = "com_github_kr_text",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/kr/text",
        sum = "h1:5Nx0Ya0ZqY2ygV366QzturHI13Jq95ApcVaJBhpS+AY=",
        version = "v0.2.0",
    )
    go_repository(
        name = "com_github_lib_pq",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/lib/pq",
        sum = "h1:p7ZhMD+KsSRozJr34udlUrhboJwWAgCg34+/ZZNvZZw=",
        version = "v1.10.7",
    )
    go_repository(
        name = "com_github_mailru_easyjson",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/mailru/easyjson",
        sum = "h1:8yTIVnZgCoiM1TgqoeTl+LfU5Jg6/xL3QhGQnimLYnA=",
        version = "v0.7.6",
    )
    go_repository(
        name = "com_github_mattn_go_colorable",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/mattn/go-colorable",
        sum = "h1:sqDoxXbdeALODt0DAeJCVp38ps9ZogZEAXjus69YV3U=",
        version = "v0.1.9",
    )

    go_repository(
        name = "com_github_mattn_go_isatty",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/mattn/go-isatty",
        sum = "h1:bq3VjFmv/sOjHtdEhmkEV4x1AJtvUvOJ2PFAZ5+peKQ=",
        version = "v0.0.16",
    )
    go_repository(
        name = "com_github_mattn_go_runewidth",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/mattn/go-runewidth",
        sum = "h1:lTGmDsbAYt5DmK6OnoV7EuIF1wEIFAcxld6ypU4OSgU=",
        version = "v0.0.13",
    )

    go_repository(
        name = "com_github_mattn_go_sqlite3",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/mattn/go-sqlite3",
        sum = "h1:TJ1bhYJPV44phC+IMu1u2K/i5RriLTPe+yc68XDJ1Z0=",
        version = "v1.14.12",
    )
    go_repository(
        name = "com_github_matttproud_golang_protobuf_extensions",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/matttproud/golang_protobuf_extensions",
        sum = "h1:I0XW9+e1XWDxdcEniV4rQAIOPUGDq67JSCiRCgGCZLI=",
        version = "v1.0.2-0.20181231171920-c182affec369",
    )
    go_repository(
        name = "com_github_mitchellh_mapstructure",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/mitchellh/mapstructure",
        sum = "h1:fmNYVwqnSfB9mZU6OS2O6GsXM+wcskZDuKQzvN1EDeE=",
        version = "v1.1.2",
    )
    go_repository(
        name = "com_github_mkevac_debugcharts",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/mkevac/debugcharts",
        sum = "h1:/mD+ABZyXD39BzJI2XyRJlqdZG11gXFo0SSynL+OFeU=",
        version = "v0.0.0-20191222103121-ae1c48aa8615",
    )
    go_repository(
        name = "com_github_moby_spdystream",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/moby/spdystream",
        sum = "h1:cjW1zVyyoiM0T7b6UoySUFqzXMoqRckQtXwGPiBhOM8=",
        version = "v0.2.0",
    )
    go_repository(
        name = "com_github_modern_go_concurrent",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/modern-go/concurrent",
        sum = "h1:TRLaZ9cD/w8PVh93nsPXa1VrQ6jlwL5oN8l14QlcNfg=",
        version = "v0.0.0-20180306012644-bacd9c7ef1dd",
    )
    go_repository(
        name = "com_github_modern_go_reflect2",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/modern-go/reflect2",
        sum = "h1:xBagoLtFs94CBntxluKeaWgTMpvLxC4ur3nMaC9Gz0M=",
        version = "v1.0.2",
    )
    go_repository(
        name = "com_github_montanaflynn_stats",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/montanaflynn/stats",
        sum = "h1:iruDEfMl2E6fbMZ9s0scYfZQ84/6SPL6zC8ACM2oIL0=",
        version = "v0.0.0-20171201202039-1bf9dbcd8cbe",
    )
    go_repository(
        name = "com_github_munnerz_goautoneg",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/munnerz/goautoneg",
        sum = "h1:C3w9PqII01/Oq1c1nUAm88MOHcQC9l5mIlSMApZMrHA=",
        version = "v0.0.0-20191010083416-a7dc8b61c822",
    )
    go_repository(
        name = "com_github_mwitkow_go_conntrack",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/mwitkow/go-conntrack",
        sum = "h1:KUppIJq7/+SVif2QVs3tOP0zanoHgBEVAwHxUSIzRqU=",
        version = "v0.0.0-20190716064945-2f068394615f",
    )
    go_repository(
        name = "com_github_mxk_go_flowrate",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/mxk/go-flowrate",
        sum = "h1:y5//uYreIhSUg3J1GEMiLbxo1LJaP8RfCpH6pymGZus=",
        version = "v0.0.0-20140419014527-cca7078d478f",
    )
    go_repository(
        name = "com_github_nbio_st",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/nbio/st",
        sum = "h1:W6apQkHrMkS0Muv8G/TipAy/FJl/rCYT0+EuS8+Z0z4=",
        version = "v0.0.0-20140626010706-e9e8d9816f32",
    )
    go_repository(
        name = "com_github_niemeyer_pretty",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/niemeyer/pretty",
        sum = "h1:fD57ERR4JtEqsWbfPhv4DMiApHyliiK5xCTNVSPiaAs=",
        version = "v0.0.0-20200227124842-a10e7caefd8e",
    )
    go_repository(
        name = "com_github_nxadm_tail",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/nxadm/tail",
        sum = "h1:nPr65rt6Y5JFSKQO7qToXr7pePgD6Gwiw05lkbyAQTE=",
        version = "v1.4.8",
    )
    go_repository(
        name = "com_github_nytimes_gziphandler",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/NYTimes/gziphandler",
        sum = "h1:lsxEuwrXEAokXB9qhlbKWPpo3KMLZQ5WB5WLQRW1uq0=",
        version = "v0.0.0-20170623195520-56545f4a5d46",
    )
    go_repository(
        name = "com_github_olekukonko_tablewriter",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/olekukonko/tablewriter",
        sum = "h1:P2Ga83D34wi1o9J6Wh1mRuqd4mF/x/lgBS7N7AbDhec=",
        version = "v0.0.5",
    )
    go_repository(
        name = "com_github_oneofone_xxhash",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/OneOfOne/xxhash",
        sum = "h1:KMrpdQIwFcEqXDklaen+P1axHaj9BSKzvpUUfnHldSE=",
        version = "v1.2.2",
    )
    go_repository(
        name = "com_github_onsi_ginkgo",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/onsi/ginkgo",
        sum = "h1:8xi0RTUf59SOSfEtZMvwTvXYMzG4gV23XVHOZiXNtnE=",
        version = "v1.16.5",
    )
    go_repository(
        name = "com_github_onsi_ginkgo_v2",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/onsi/ginkgo/v2",
        sum = "h1:Fx2POJZfKRQcM1pH49qSZiYeu319wji004qX+GDovrU=",
        version = "v2.1.6",
    )
    go_repository(
        name = "com_github_onsi_gomega",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/onsi/gomega",
        sum = "h1:PA/3qinGoukvymdIDV8pii6tiZgC8kbmJO6Z5+b002Q=",
        version = "v1.20.1",
    )
    go_repository(
        name = "com_github_openzipkin_zipkin_go",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/openzipkin/zipkin-go",
        sum = "h1:CtfRrOVZtbDj8rt1WXjklw0kqqJQwICrCKmlfUuBUUw=",
        version = "v0.4.0",
    )
    go_repository(
        name = "com_github_paulmach_orb",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/paulmach/orb",
        sum = "h1:sNhJV5ML+mv1F077ljOck/9inorF4ahDO8iNNpHbKHY=",
        version = "v0.5.0",
    )
    go_repository(
        name = "com_github_paulmach_protoscan",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/paulmach/protoscan",
        sum = "h1:rM0FpcTjUMvPUNk2BhPJrreDKetq43ChnL+x1sRg8O8=",
        version = "v0.2.1",
    )
    go_repository(
        name = "com_github_pelletier_go_toml_v2",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/pelletier/go-toml/v2",
        sum = "h1:ipoSadvV8oGUjnUbMub59IDPPwfxF694nG/jwbMiyQg=",
        version = "v2.0.5",
    )
    go_repository(
        name = "com_github_peterbourgon_diskv",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/peterbourgon/diskv",
        sum = "h1:UBdAOUP5p4RWqPBg048CAvpKN+vxiaj6gdUUzhl4XmI=",
        version = "v2.0.1+incompatible",
    )
    go_repository(
        name = "com_github_pierrec_lz4",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/pierrec/lz4",
        sum = "h1:9UY3+iC23yxF0UfGaYrGplQ+79Rg+h/q9FV9ix19jjM=",
        version = "v2.6.1+incompatible",
    )
    go_repository(
        name = "com_github_pierrec_lz4_v4",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/pierrec/lz4/v4",
        sum = "h1:+fL8AQEZtz/ijeNnpduH0bROTu0O3NZAlPjQxGn8LwE=",
        version = "v4.1.14",
    )
    go_repository(
        name = "com_github_pkg_errors",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/pkg/errors",
        sum = "h1:FEBLx1zS214owpjy7qsBeixbURkuhQAwrK5UwLGTwt4=",
        version = "v0.9.1",
    )

    go_repository(
        name = "com_github_pmezard_go_difflib",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/pmezard/go-difflib",
        sum = "h1:4DBwDE0NGyQoBHbLQYPwSUPoCMWR5BEzIk/f1lZbAQM=",
        version = "v1.0.0",
    )
    go_repository(
        name = "com_github_prashantv_gostub",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/prashantv/gostub",
        sum = "h1:BTyx3RfQjRHnUWaGF9oQos79AlQ5k8WNktv7VGvVH4g=",
        version = "v1.1.0",
    )
    go_repository(
        name = "com_github_prometheus_client_golang",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/prometheus/client_golang",
        sum = "h1:b71QUfeo5M8gq2+evJdTPfZhYMAU0uKPkyPJ7TPsloU=",
        version = "v1.13.0",
    )
    go_repository(
        name = "com_github_prometheus_client_model",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/prometheus/client_model",
        sum = "h1:uq5h0d+GuxiXLJLNABMgp2qUWDPiLvgCzz2dUR+/W/M=",
        version = "v0.2.0",
    )
    go_repository(
        name = "com_github_prometheus_common",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/prometheus/common",
        sum = "h1:ccBbHCgIiT9uSoFY0vX8H3zsNR5eLt17/RQLUvn8pXE=",
        version = "v0.37.0",
    )
    go_repository(
        name = "com_github_prometheus_procfs",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/prometheus/procfs",
        sum = "h1:ODq8ZFEaYeCaZOJlZZdJA2AbQR98dSHSM1KW/You5mo=",
        version = "v0.8.0",
    )
    go_repository(
        name = "com_github_puerkitobio_purell",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/PuerkitoBio/purell",
        sum = "h1:WEQqlqaGbrPkxLJWfBwQmfEAE1Z7ONdDLqrN38tNFfI=",
        version = "v1.1.1",
    )
    go_repository(
        name = "com_github_puerkitobio_urlesc",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/PuerkitoBio/urlesc",
        sum = "h1:d+Bc7a5rLufV/sSk/8dngufqelfh6jnri85riMAaF/M=",
        version = "v0.0.0-20170810143723-de5bf2ad4578",
    )
    go_repository(
        name = "com_github_rabbitmq_amqp091_go",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/rabbitmq/amqp091-go",
        sum = "h1:qx8cGMJha71/5t31Z+LdPLdPrkj/BvD38cqC3Bi1pNI=",
        version = "v1.1.0",
    )
    go_repository(
        name = "com_github_rcrowley_go_metrics",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/rcrowley/go-metrics",
        sum = "h1:N/ElC8H3+5XpJzTSTfLsJV/mx9Q9g7kxmchpfZyxgzM=",
        version = "v0.0.0-20201227073835-cf1acfcdf475",
    )

    go_repository(
        name = "com_github_remyoudompheng_bigfft",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/remyoudompheng/bigfft",
        sum = "h1:OdAsTTz6OkFY5QxjkYwrChwuRruF69c169dPK26NUlk=",
        version = "v0.0.0-20200410134404-eec4a21b6bb0",
    )
    go_repository(
        name = "com_github_rivo_uniseg",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/rivo/uniseg",
        sum = "h1:S1pD9weZBuJdFmowNwbpi7BJ8TNftyUImj/0WQi72jY=",
        version = "v0.2.0",
    )
    go_repository(
        name = "com_github_rogpeppe_fastuuid",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/rogpeppe/fastuuid",
        sum = "h1:Ppwyp6VYCF1nvBTXL3trRso7mXMlRrw9ooo375wvi2s=",
        version = "v1.2.0",
    )
    go_repository(
        name = "com_github_rogpeppe_go_internal",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/rogpeppe/go-internal",
        sum = "h1:RR9dF3JtopPvtkroDZuVD7qquD0bnHlKSqaQhgwt8yk=",
        version = "v1.3.0",
    )
    go_repository(
        name = "com_github_russross_blackfriday_v2",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/russross/blackfriday/v2",
        sum = "h1:lPqVAte+HuHNfhJ/0LC98ESWRz8afy9tM/0RK8m9o+Q=",
        version = "v2.0.1",
    )
    go_repository(
        name = "com_github_shirou_gopsutil",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/shirou/gopsutil",
        sum = "h1:+1+c1VGhc88SSonWP6foOcLhvnKlUeu/erjjvaPEYiI=",
        version = "v3.21.11+incompatible",
    )
    go_repository(
        name = "com_github_shirou_w32",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/shirou/w32",
        sum = "h1:udFKJ0aHUL60LboW/A+DfgoHVedieIzIXE8uylPue0U=",
        version = "v0.0.0-20160930032740-bb4de0191aa4",
    )
    go_repository(
        name = "com_github_shopify_sarama",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/Shopify/sarama",
        sum = "h1:TOZL6r37xJBDEMLx4yjB77jxbZYXPaDow08TSK6vIL0=",
        version = "v1.30.0",
    )
    go_repository(
        name = "com_github_shopify_toxiproxy_v2",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/Shopify/toxiproxy/v2",
        sum = "h1:ePgznFqEG1v3AjMklnK8H7BSc++FDSo7xfK9K7Af+0Y=",
        version = "v2.1.6-0.20210914104332-15ea381dcdae",
    )
    go_repository(
        name = "com_github_shopspring_decimal",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/shopspring/decimal",
        sum = "h1:2Usl1nmF/WZucqkFZhnfFYxxxu8LG21F6nPQBE5gKV8=",
        version = "v1.3.1",
    )
    go_repository(
        name = "com_github_shurcool_sanitized_anchor_name",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/shurcooL/sanitized_anchor_name",
        sum = "h1:PdmoCO6wvbs+7yrJyMORt4/BmY5IYyJwS/kOiWx8mHo=",
        version = "v1.0.0",
    )
    go_repository(
        name = "com_github_sirupsen_logrus",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/sirupsen/logrus",
        sum = "h1:dJKuHgqk1NNQlqoA6BTlM1Wf9DOH3NBjQyu0h9+AZZE=",
        version = "v1.8.1",
    )
    go_repository(
        name = "com_github_spaolacci_murmur3",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/spaolacci/murmur3",
        sum = "h1:7c1g84S4BPRrfL5Xrdp6fOJ206sU9y293DDHaoy0bLI=",
        version = "v1.1.0",
    )
    go_repository(
        name = "com_github_spf13_afero",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/spf13/afero",
        sum = "h1:5jhuqJyZCZf2JRofRvN/nIFgIWNzPa3/Vz8mYylgbWc=",
        version = "v1.2.2",
    )
    go_repository(
        name = "com_github_spf13_pflag",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/spf13/pflag",
        sum = "h1:iy+VFUOCP1a+8yFto/drg2CJ5u0yRoB7fZw3DKv/JXA=",
        version = "v1.0.5",
    )
    go_repository(
        name = "com_github_stackexchange_wmi",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/StackExchange/wmi",
        sum = "h1:G0m3OIz70MZUWq3EgK3CesDbo8upS2Vm9/P3FtgI+Jk=",
        version = "v0.0.0-20190523213315-cbe66965904d",
    )
    go_repository(
        name = "com_github_stoewer_go_strcase",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/stoewer/go-strcase",
        sum = "h1:Z2iHWqGXH00XYgqDmNgQbIBxf3wrNq0F3feEy0ainaU=",
        version = "v1.2.0",
    )

    go_repository(
        name = "com_github_stretchr_objx",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/stretchr/objx",
        sum = "h1:M2gUjqZET1qApGOWNSnZ49BAIMX4F/1plDv3+l31EJ4=",
        version = "v0.4.0",
    )
    go_repository(
        name = "com_github_stretchr_testify",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/stretchr/testify",
        sum = "h1:pSgiaMZlXftHpm5L7V1+rVB+AZJydKsMxsQBIJw4PKk=",
        version = "v1.8.0",
    )
    go_repository(
        name = "com_github_tidwall_pretty",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/tidwall/pretty",
        sum = "h1:HsD+QiTn7sK6flMKIvNmpqz1qrpP3Ps6jOKIKMooyg4=",
        version = "v1.0.0",
    )
    go_repository(
        name = "com_github_tklauser_go_sysconf",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/tklauser/go-sysconf",
        sum = "h1:IJ1AZGZRWbY8T5Vfk04D9WOA5WSejdflXxP03OUqALw=",
        version = "v0.3.10",
    )
    go_repository(
        name = "com_github_tklauser_numcpus",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/tklauser/numcpus",
        sum = "h1:E53Dm1HjH1/R2/aoCtXtPgzmElmn51aOkhCFSuZq//o=",
        version = "v0.4.0",
    )
    go_repository(
        name = "com_github_urfave_cli_v2",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/urfave/cli/v2",
        sum = "h1:qph92Y649prgesehzOrQjdWyxFOp/QVM+6imKHad91M=",
        version = "v2.3.0",
    )
    go_repository(
        name = "com_github_xdg_go_pbkdf2",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/xdg-go/pbkdf2",
        sum = "h1:Su7DPu48wXMwC3bs7MCNG+z4FhcyEuz5dlvchbq0B0c=",
        version = "v1.0.0",
    )
    go_repository(
        name = "com_github_xdg_go_scram",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/xdg-go/scram",
        sum = "h1:VOMT+81stJgXW3CpHyqHN3AXDYIMsx56mEFrB37Mb/E=",
        version = "v1.1.1",
    )
    go_repository(
        name = "com_github_xdg_go_stringprep",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/xdg-go/stringprep",
        sum = "h1:kdwGpVNwPFtjs98xCGkHjQtGKh86rDcRZN17QEMCOIs=",
        version = "v1.0.3",
    )
    go_repository(
        name = "com_github_youmark_pkcs8",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/youmark/pkcs8",
        sum = "h1:splanxYIlg+5LfHAM6xpdFEAYOk8iySO56hMFq6uLyA=",
        version = "v0.0.0-20181117223130-1be2e3e5546d",
    )

    go_repository(
        name = "com_github_yuin_goldmark",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/yuin/goldmark",
        sum = "h1:fVcFKWvrslecOb/tg+Cc05dkeYx540o0FuFt3nUVDoE=",
        version = "v1.4.13",
    )
    go_repository(
        name = "com_github_yuin_gopher_lua",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/yuin/gopher-lua",
        sum = "h1:k/gmLsJDWwWqbLCur2yWnJzwQEKRcAHXo6seXGuSwWw=",
        version = "v0.0.0-20210529063254-f4c35e4016d9",
    )
    go_repository(
        name = "com_github_zeromicro_go_zero",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/zeromicro/go-zero",
        sum = "h1:1P9TuzxONqxQG3Bvpk7r7vPOGEnfXn3lTX/4W5Y2GlQ=",
        version = "v1.4.2",
    )
    go_repository(
        name = "com_google_cloud_go",
        build_file_proto_mode = "disable_global",
        importpath = "cloud.google.com/go",
        sum = "h1:3DXvAyifywvq64LfkKaMOmkWPS1CikIQdMe2lY9vxU8=",
        version = "v0.97.0",
    )
    go_repository(
        name = "com_google_cloud_go_bigquery",
        build_file_proto_mode = "disable_global",
        importpath = "cloud.google.com/go/bigquery",
        sum = "h1:PQcPefKFdaIzjQFbiyOgAqyx8q5djaE7x9Sqe712DPA=",
        version = "v1.8.0",
    )
    go_repository(
        name = "com_google_cloud_go_datastore",
        build_file_proto_mode = "disable_global",
        importpath = "cloud.google.com/go/datastore",
        sum = "h1:/May9ojXjRkPBNVrq+oWLqmWCkr4OU5uRY29bu0mRyQ=",
        version = "v1.1.0",
    )
    go_repository(
        name = "com_google_cloud_go_pubsub",
        build_file_proto_mode = "disable_global",
        importpath = "cloud.google.com/go/pubsub",
        sum = "h1:ukjixP1wl0LpnZ6LWtZJ0mX5tBmjp1f8Sqer8Z2OMUU=",
        version = "v1.3.1",
    )
    go_repository(
        name = "com_google_cloud_go_storage",
        build_file_proto_mode = "disable_global",
        importpath = "cloud.google.com/go/storage",
        sum = "h1:STgFzyU5/8miMl0//zKh2aQeTyeaUH3WN9bSUiJ09bA=",
        version = "v1.10.0",
    )

    go_repository(
        name = "com_lukechampine_uint128",
        build_file_proto_mode = "disable_global",
        importpath = "lukechampine.com/uint128",
        sum = "h1:pnxCASz787iMf+02ssImqk6OLt+Z5QHMoZyUXR4z6JU=",
        version = "v1.1.1",
    )
    go_repository(
        name = "com_shuralyov_dmitri_gpu_mtl",
        build_file_proto_mode = "disable_global",
        importpath = "dmitri.shuralyov.com/gpu/mtl",
        sum = "h1:VpgP7xuJadIUuKccphEpTJnWhS2jkQyMt6Y7pJCD7fY=",
        version = "v0.0.0-20190408044501-666a987793e9",
    )
    go_repository(
        name = "in_gopkg_alecthomas_kingpin_v2",
        build_file_proto_mode = "disable_global",
        importpath = "gopkg.in/alecthomas/kingpin.v2",
        sum = "h1:jMFz6MfLP0/4fUyZle81rXUoxOBFi19VUFKVDOQfozc=",
        version = "v2.2.6",
    )

    go_repository(
        name = "in_gopkg_check_v1",
        build_file_proto_mode = "disable_global",
        importpath = "gopkg.in/check.v1",
        sum = "h1:Hei/4ADfdWqJk1ZMxUNpqntNwaWcugrBjAiHlqqRiVk=",
        version = "v1.0.0-20201130134442-10cb98267c6c",
    )
    go_repository(
        name = "in_gopkg_cheggaaa_pb_v1",
        build_file_proto_mode = "disable_global",
        importpath = "gopkg.in/cheggaaa/pb.v1",
        sum = "h1:n1tBJnnK2r7g9OW2btFH91V92STTUevLXYFb8gy9EMk=",
        version = "v1.0.28",
    )
    go_repository(
        name = "in_gopkg_errgo_v2",
        build_file_proto_mode = "disable_global",
        importpath = "gopkg.in/errgo.v2",
        sum = "h1:0vLT13EuvQ0hNvakwLuFZ/jYrLp5F3kcWHXdRggjCE8=",
        version = "v2.1.0",
    )
    go_repository(
        name = "in_gopkg_fsnotify_v1",
        build_file_proto_mode = "disable_global",
        importpath = "gopkg.in/fsnotify.v1",
        sum = "h1:xOHLXZwVvI9hhs+cLKq5+I5onOuwQLhQwiu63xxlHs4=",
        version = "v1.4.7",
    )
    go_repository(
        name = "in_gopkg_h2non_gock_v1",
        build_file_proto_mode = "disable_global",
        importpath = "gopkg.in/h2non/gock.v1",
        sum = "h1:jBbHXgGBK/AoPVfJh5x4r/WxIrElvbLel8TCZkkZJoY=",
        version = "v1.1.2",
    )
    go_repository(
        name = "in_gopkg_inf_v0",
        build_file_proto_mode = "disable_global",
        importpath = "gopkg.in/inf.v0",
        sum = "h1:73M5CoZyi3ZLMOyDlQh031Cx6N9NDJ2Vvfl76EDAgDc=",
        version = "v0.9.1",
    )
    go_repository(
        name = "in_gopkg_tomb_v1",
        build_file_proto_mode = "disable_global",
        importpath = "gopkg.in/tomb.v1",
        sum = "h1:uRGJdciOHaEIrze2W8Q3AKkepLTh2hOroT7a+7czfdQ=",
        version = "v1.0.0-20141024135613-dd632973f1e7",
    )
    go_repository(
        name = "in_gopkg_yaml_v2",
        build_file_proto_mode = "disable_global",
        importpath = "gopkg.in/yaml.v2",
        sum = "h1:D8xgwECY7CYvx+Y2n4sBz93Jn9JRvxdiyyo8CTfuKaY=",
        version = "v2.4.0",
    )

    go_repository(
        name = "in_gopkg_yaml_v3",
        build_file_proto_mode = "disable_global",
        importpath = "gopkg.in/yaml.v3",
        sum = "h1:fxVm/GzAzEWqLHuvctI91KS9hhNmmWOoWu0XTYJS7CA=",
        version = "v3.0.1",
    )
    go_repository(
        name = "io_etcd_go_etcd_api_v3",
        build_file_proto_mode = "disable_global",
        importpath = "go.etcd.io/etcd/api/v3",
        sum = "h1:BX4JIbQ7hl7+jL+g+2j5UAr0o1bctCm6/Ct+ArBGkf0=",
        version = "v3.5.5",
    )
    go_repository(
        name = "io_etcd_go_etcd_client_pkg_v3",
        build_file_proto_mode = "disable_global",
        importpath = "go.etcd.io/etcd/client/pkg/v3",
        sum = "h1:9S0JUVvmrVl7wCF39iTQthdaaNIiAaQbmK75ogO6GU8=",
        version = "v3.5.5",
    )
    go_repository(
        name = "io_etcd_go_etcd_client_v3",
        build_file_proto_mode = "disable_global",
        importpath = "go.etcd.io/etcd/client/v3",
        sum = "h1:q++2WTJbUgpQu4B6hCuT7VkdwaTP7Qz6Daak3WzbrlI=",
        version = "v3.5.5",
    )

    go_repository(
        name = "io_gorm_gorm",
        build_file_proto_mode = "disable_global",
        importpath = "gorm.io/gorm",
        sum = "h1:TnlF26wScKSvknUC/Rn8t0NLLM22fypYBlvj1+aH6dM=",
        version = "v1.23.5",
    )
    go_repository(
        name = "io_k8s_api",
        build_file_proto_mode = "disable_global",
        importpath = "k8s.io/api",
        sum = "h1:3YO8J4RtmG7elEgaWMb4HgmpS2CfY1QlaOz9nwB+ZSs=",
        version = "v0.25.4",
    )
    go_repository(
        name = "io_k8s_apimachinery",
        build_file_proto_mode = "disable_global",
        importpath = "k8s.io/apimachinery",
        sum = "h1:CtXsuaitMESSu339tfhVXhQrPET+EiWnIY1rcurKnAc=",
        version = "v0.25.4",
    )
    go_repository(
        name = "io_k8s_client_go",
        build_file_proto_mode = "disable_global",
        importpath = "k8s.io/client-go",
        sum = "h1:3RNRDffAkNU56M/a7gUfXaEzdhZlYhoW8dgViGy5fn8=",
        version = "v0.25.4",
    )
    go_repository(
        name = "io_k8s_gengo",
        build_file_proto_mode = "disable_global",
        importpath = "k8s.io/gengo",
        sum = "h1:sAvhNk5RRuc6FNYGqe7Ygz3PSo/2wGWbulskmzRX8Vs=",
        version = "v0.0.0-20200413195148-3a45101e95ac",
    )
    go_repository(
        name = "io_k8s_klog_v2",
        build_file_proto_mode = "disable_global",
        importpath = "k8s.io/klog/v2",
        sum = "h1:7aaoSdahviPmR+XkS7FyxlkkXs6tHISSG03RxleQAVQ=",
        version = "v2.70.1",
    )
    go_repository(
        name = "io_k8s_kube_openapi",
        build_file_proto_mode = "disable_global",
        importpath = "k8s.io/kube-openapi",
        sum = "h1:MQ8BAZPZlWk3S9K4a9NCkIFQtZShWqoha7snGixVgEA=",
        version = "v0.0.0-20220803162953-67bda5d908f1",
    )
    go_repository(
        name = "io_k8s_sigs_json",
        build_file_proto_mode = "disable_global",
        importpath = "sigs.k8s.io/json",
        sum = "h1:iXTIw73aPyC+oRdyqqvVJuloN1p0AC/kzH07hu3NE+k=",
        version = "v0.0.0-20220713155537-f223a00ba0e2",
    )
    go_repository(
        name = "io_k8s_sigs_structured_merge_diff_v4",
        build_file_proto_mode = "disable_global",
        importpath = "sigs.k8s.io/structured-merge-diff/v4",
        sum = "h1:PRbqxJClWWYMNV1dhaG4NsibJbArud9kFxnAMREiWFE=",
        version = "v4.2.3",
    )
    go_repository(
        name = "io_k8s_sigs_yaml",
        build_file_proto_mode = "disable_global",
        importpath = "sigs.k8s.io/yaml",
        sum = "h1:kr/MCeFWJWTwyaHoR9c8EjH9OumOmoF9YGiZd7lFm/Q=",
        version = "v1.2.0",
    )
    go_repository(
        name = "io_k8s_utils",
        build_file_proto_mode = "disable_global",
        importpath = "k8s.io/utils",
        sum = "h1:jAne/RjBTyawwAy0utX5eqigAwz/lQhTmy+Hr/Cpue4=",
        version = "v0.0.0-20220728103510-ee6ede2d64ed",
    )
    go_repository(
        name = "io_opencensus_go",
        build_file_proto_mode = "disable_global",
        importpath = "go.opencensus.io",
        sum = "h1:LYy1Hy3MJdrCdMwwzxA/dRok4ejH+RwNGbuoD9fCjto=",
        version = "v0.22.4",
    )
    go_repository(
        name = "io_opentelemetry_go_otel",
        build_file_proto_mode = "disable_global",
        importpath = "go.opentelemetry.io/otel",
        sum = "h1:kfToEGMDq6TrVrJ9Vht84Y8y9enykSZzDDZglV0kIEk=",
        version = "v1.11.0",
    )
    go_repository(
        name = "io_opentelemetry_go_otel_exporters_jaeger",
        build_file_proto_mode = "disable_global",
        importpath = "go.opentelemetry.io/otel/exporters/jaeger",
        sum = "h1:Sv2valcFfMlfu6g8USSS+ZUN5vwbuGj1aY/CFtMG33w=",
        version = "v1.11.0",
    )
    go_repository(
        name = "io_opentelemetry_go_otel_exporters_otlp_internal_retry",
        build_file_proto_mode = "disable_global",
        importpath = "go.opentelemetry.io/otel/exporters/otlp/internal/retry",
        sum = "h1:0dly5et1i/6Th3WHn0M6kYiJfFNzhhxanrJ0bOfnjEo=",
        version = "v1.11.0",
    )
    go_repository(
        name = "io_opentelemetry_go_otel_exporters_otlp_otlptrace",
        build_file_proto_mode = "disable_global",
        importpath = "go.opentelemetry.io/otel/exporters/otlp/otlptrace",
        sum = "h1:eyJ6njZmH16h9dOKCi7lMswAnGsSOwgTqWzfxqcuNr8=",
        version = "v1.11.0",
    )
    go_repository(
        name = "io_opentelemetry_go_otel_exporters_otlp_otlptrace_otlptracegrpc",
        build_file_proto_mode = "disable_global",
        importpath = "go.opentelemetry.io/otel/exporters/otlp/otlptrace/otlptracegrpc",
        sum = "h1:j2RFV0Qdt38XQ2Jvi4WIsQ56w8T7eSirYbMw19VXRDg=",
        version = "v1.11.0",
    )
    go_repository(
        name = "io_opentelemetry_go_otel_exporters_zipkin",
        build_file_proto_mode = "disable_global",
        importpath = "go.opentelemetry.io/otel/exporters/zipkin",
        sum = "h1:v/Abo5REOWrCj4zcEIUHFZtXpsCVjrwZj28iyX2rHXE=",
        version = "v1.11.0",
    )
    go_repository(
        name = "io_opentelemetry_go_otel_sdk",
        build_file_proto_mode = "disable_global",
        importpath = "go.opentelemetry.io/otel/sdk",
        sum = "h1:ZnKIL9V9Ztaq+ME43IUi/eo22mNsb6a7tGfzaOWB5fo=",
        version = "v1.11.0",
    )
    go_repository(
        name = "io_opentelemetry_go_otel_trace",
        build_file_proto_mode = "disable_global",
        importpath = "go.opentelemetry.io/otel/trace",
        sum = "h1:20U/Vj42SX+mASlXLmSGBg6jpI1jQtv682lZtTAOVFI=",
        version = "v1.11.0",
    )
    go_repository(
        name = "io_opentelemetry_go_proto_otlp",
        build_file_proto_mode = "disable_global",
        importpath = "go.opentelemetry.io/proto/otlp",
        sum = "h1:IVN6GR+mhC4s5yfcTbmzHYODqvWAp3ZedA2SJPI1Nnw=",
        version = "v0.19.0",
    )
    go_repository(
        name = "io_rsc_binaryregexp",
        build_file_proto_mode = "disable_global",
        importpath = "rsc.io/binaryregexp",
        sum = "h1:HfqmD5MEmC0zvwBuF187nq9mdnXjXsSivRiXN7SmRkE=",
        version = "v0.2.0",
    )
    go_repository(
        name = "io_rsc_quote_v3",
        build_file_proto_mode = "disable_global",
        importpath = "rsc.io/quote/v3",
        sum = "h1:9JKUTTIUgS6kzR9mK1YuGKv6Nl+DijDNIc0ghT58FaY=",
        version = "v3.1.0",
    )
    go_repository(
        name = "io_rsc_sampler",
        build_file_proto_mode = "disable_global",
        importpath = "rsc.io/sampler",
        sum = "h1:7uVkIFmeBqHfdjD+gZwtXXI+RODJ2Wc4O7MPEh/QiW4=",
        version = "v1.3.0",
    )
    go_repository(
        name = "org_golang_google_api",
        build_file_proto_mode = "disable_global",
        importpath = "google.golang.org/api",
        sum = "h1:yfrXXP61wVuLb0vBcG6qaOoIoqYEzOQS8jum51jkv2w=",
        version = "v0.30.0",
    )
    go_repository(
        name = "org_golang_google_appengine",
        build_file_proto_mode = "disable_global",
        importpath = "google.golang.org/appengine",
        sum = "h1:FZR1q0exgwxzPzp/aF+VccGrSfxfPpkBqjIIEq3ru6c=",
        version = "v1.6.7",
    )
    go_repository(
        name = "org_golang_google_genproto",
        build_file_proto_mode = "disable_global",
        importpath = "google.golang.org/genproto",
        sum = "h1:qRu95HZ148xXw+XeZ3dvqe85PxH4X8+jIo0iRPKcEnM=",
        version = "v0.0.0-20220602131408-e326c6e8e9c8",
    )
    go_repository(
        name = "org_golang_google_grpc",
        build_file_proto_mode = "disable_global",
        importpath = "google.golang.org/grpc",
        sum = "h1:E1eGv1FTqoLIdnBCZufiSHgKjlqG6fKFf6pPWtMTh8U=",
        version = "v1.51.0",
    )
    go_repository(
        name = "org_golang_google_protobuf",
        build_file_proto_mode = "disable_global",
        importpath = "google.golang.org/protobuf",
        sum = "h1:d0NfwRgPtno5B1Wa6L2DAG+KivqkdutMf1UhdNx175w=",
        version = "v1.28.1",
    )

    go_repository(
        name = "org_golang_x_crypto",
        build_file_proto_mode = "disable_global",
        importpath = "golang.org/x/crypto",
        sum = "h1:sK3txAijHtOK88l68nt020reeT1ZdKLIYetKl95FzVY=",
        version = "v0.0.0-20220622213112-05595931fe9d",
    )
    go_repository(
        name = "org_golang_x_exp",
        build_file_proto_mode = "disable_global",
        importpath = "golang.org/x/exp",
        sum = "h1:QE6XYQK6naiK1EPAe1g/ILLxN5RBoH5xkJk3CqlMI/Y=",
        version = "v0.0.0-20200224162631-6cc2880d07d6",
    )
    go_repository(
        name = "org_golang_x_image",
        build_file_proto_mode = "disable_global",
        importpath = "golang.org/x/image",
        sum = "h1:+qEpEAPhDZ1o0x3tHzZTQDArnOixOzGD9HUJfcg0mb4=",
        version = "v0.0.0-20190802002840-cff245a6509b",
    )
    go_repository(
        name = "org_golang_x_lint",
        build_file_proto_mode = "disable_global",
        importpath = "golang.org/x/lint",
        sum = "h1:VLliZ0d+/avPrXXH+OakdXhpJuEoBZuwh1m2j7U6Iug=",
        version = "v0.0.0-20210508222113-6edffad5e616",
    )
    go_repository(
        name = "org_golang_x_mobile",
        build_file_proto_mode = "disable_global",
        importpath = "golang.org/x/mobile",
        sum = "h1:4+4C/Iv2U4fMZBiMCc98MG1In4gJY5YRhtpDNeDeHWs=",
        version = "v0.0.0-20190719004257-d2bd2a29d028",
    )

    go_repository(
        name = "org_golang_x_mod",
        build_file_proto_mode = "disable_global",
        importpath = "golang.org/x/mod",
        sum = "h1:LapD9S96VoQRhi/GrNTqeBJFrUjs5UHCAtTlgwA5oZA=",
        version = "v0.7.0",
    )
    go_repository(
        name = "org_golang_x_net",
        build_file_proto_mode = "disable_global",
        importpath = "golang.org/x/net",
        sum = "h1:VWL6FNY2bEEmsGVKabSlHu5Irp34xmMRoqb/9lF9lxk=",
        version = "v0.3.0",
    )
    go_repository(
        name = "org_golang_x_oauth2",
        build_file_proto_mode = "disable_global",
        importpath = "golang.org/x/oauth2",
        sum = "h1:clP8eMhB30EHdc0bd2Twtq6kgU7yl5ub2cQLSdrv1Dg=",
        version = "v0.0.0-20220223155221-ee480838109b",
    )

    go_repository(
        name = "org_golang_x_sync",
        build_file_proto_mode = "disable_global",
        importpath = "golang.org/x/sync",
        sum = "h1:wsuoTGHzEhffawBOhz5CYhcrV4IdKZbEyZjBMuTp12o=",
        version = "v0.1.0",
    )
    go_repository(
        name = "org_golang_x_sys",
        build_file_proto_mode = "disable_global",
        importpath = "golang.org/x/sys",
        sum = "h1:w8ZOecv6NaNa/zC8944JTU3vz4u6Lagfk4RPQxv92NQ=",
        version = "v0.3.0",
    )
    go_repository(
        name = "org_golang_x_term",
        build_file_proto_mode = "disable_global",
        importpath = "golang.org/x/term",
        sum = "h1:qoo4akIqOcDME5bhc/NgxUdovd6BSS2uMsVjB56q1xI=",
        version = "v0.3.0",
    )

    go_repository(
        name = "org_golang_x_text",
        build_file_proto_mode = "disable_global",
        importpath = "golang.org/x/text",
        sum = "h1:OLmvp0KP+FVG99Ct/qFiL/Fhk4zp4QQnZ7b2U+5piUM=",
        version = "v0.5.0",
    )
    go_repository(
        name = "org_golang_x_time",
        build_file_proto_mode = "disable_global",
        importpath = "golang.org/x/time",
        sum = "h1:+gHMid33q6pen7kv9xvT+JRinntgeXO2AeZVd0AWD3w=",
        version = "v0.0.0-20220411224347-583f2d630306",
    )

    go_repository(
        name = "org_golang_x_tools",
        build_file_proto_mode = "disable_global",
        importpath = "golang.org/x/tools",
        sum = "h1:7mTAgkunk3fr4GAloyyCasadO6h9zSsQZbwvcaIciV4=",
        version = "v0.4.0",
    )
    go_repository(
        name = "org_golang_x_xerrors",
        build_file_proto_mode = "disable_global",
        importpath = "golang.org/x/xerrors",
        sum = "h1:go1bK/D/BFZV2I8cIQd1NKEZ+0owSTG1fDTci4IqFcE=",
        version = "v0.0.0-20200804184101-5ec99f83aff1",
    )
    go_repository(
        name = "org_modernc_cc_v3",
        build_file_proto_mode = "disable_global",
        importpath = "modernc.org/cc/v3",
        sum = "h1:0kmRkTmqNidmu3c7BNDSdVHCxXCkWLmWmCIVX4LUboo=",
        version = "v3.36.0",
    )
    go_repository(
        name = "org_modernc_ccgo_v3",
        build_file_proto_mode = "disable_global",
        importpath = "modernc.org/ccgo/v3",
        sum = "h1:3l18poV+iUemQ98O3X5OMr97LOqlzis+ytivU4NqGhA=",
        version = "v3.16.6",
    )
    go_repository(
        name = "org_modernc_ccorpus",
        build_file_proto_mode = "disable_global",
        importpath = "modernc.org/ccorpus",
        sum = "h1:J16RXiiqiCgua6+ZvQot4yUuUy8zxgqbqEEUuGPlISk=",
        version = "v1.11.6",
    )
    go_repository(
        name = "org_modernc_httpfs",
        build_file_proto_mode = "disable_global",
        importpath = "modernc.org/httpfs",
        sum = "h1:AAgIpFZRXuYnkjftxTAZwMIiwEqAfk8aVB2/oA6nAeM=",
        version = "v1.0.6",
    )
    go_repository(
        name = "org_modernc_libc",
        build_file_proto_mode = "disable_global",
        importpath = "modernc.org/libc",
        sum = "h1:Ux98PaOMvolgoFX/YwusFOHBnanXdGRmWgI8ciI2z4o=",
        version = "v1.16.8",
    )
    go_repository(
        name = "org_modernc_mathutil",
        build_file_proto_mode = "disable_global",
        importpath = "modernc.org/mathutil",
        sum = "h1:ij3fYGe8zBF4Vu+g0oT7mB06r8sqGWKuJu1yXeR4by8=",
        version = "v1.4.1",
    )
    go_repository(
        name = "org_modernc_memory",
        build_file_proto_mode = "disable_global",
        importpath = "modernc.org/memory",
        sum = "h1:bDOL0DIDLQv7bWhP3gMvIrnoFw+Eo6F7a2QK9HPDiFU=",
        version = "v1.1.1",
    )
    go_repository(
        name = "org_modernc_opt",
        build_file_proto_mode = "disable_global",
        importpath = "modernc.org/opt",
        sum = "h1:/0RX92k9vwVeDXj+Xn23DKp2VJubL7k8qNffND6qn3A=",
        version = "v0.1.1",
    )
    go_repository(
        name = "org_modernc_sqlite",
        build_file_proto_mode = "disable_global",
        importpath = "modernc.org/sqlite",
        sum = "h1:TjmF36Wi5QcPYqRoAacV1cAyJ7xB/CD0ExpVUEMebnw=",
        version = "v1.17.2",
    )
    go_repository(
        name = "org_modernc_strutil",
        build_file_proto_mode = "disable_global",
        importpath = "modernc.org/strutil",
        sum = "h1:xv+J1BXY3Opl2ALrBwyfEikFAj8pmqcpnfmuwUwcozs=",
        version = "v1.1.1",
    )
    go_repository(
        name = "org_modernc_tcl",
        build_file_proto_mode = "disable_global",
        importpath = "modernc.org/tcl",
        sum = "h1:npxzTwFTZYM8ghWicVIX1cRWzj7Nd8i6AqqX2p+IYao=",
        version = "v1.13.1",
    )
    go_repository(
        name = "org_modernc_token",
        build_file_proto_mode = "disable_global",
        importpath = "modernc.org/token",
        sum = "h1:a0jaWiNMDhDUtqOj09wvjWWAqd3q7WpBulmL9H2egsk=",
        version = "v1.0.0",
    )
    go_repository(
        name = "org_modernc_z",
        build_file_proto_mode = "disable_global",
        importpath = "modernc.org/z",
        sum = "h1:RTNHdsrOpeoSeOF4FbzTo8gBYByaJ5xT7NgZ9ZqRiJM=",
        version = "v1.5.1",
    )
    go_repository(
        name = "org_mongodb_go_mongo_driver",
        build_file_proto_mode = "disable_global",
        importpath = "go.mongodb.org/mongo-driver",
        sum = "h1:XDQEvmh6z1EUsXuIkXE9TaVeqHw6SwS1uf93jFs0HBA=",
        version = "v1.10.3",
    )
    go_repository(
        name = "org_uber_go_atomic",
        build_file_proto_mode = "disable_global",
        importpath = "go.uber.org/atomic",
        sum = "h1:ECmE8Bn/WFTYwEW/bpKD3M8VtR/zQVbavAoalC1PYyE=",
        version = "v1.9.0",
    )
    go_repository(
        name = "org_uber_go_automaxprocs",
        build_file_proto_mode = "disable_global",
        importpath = "go.uber.org/automaxprocs",
        sum = "h1:e1YG66Lrk73dn4qhg8WFSvhF0JuFQF0ERIp4rpuV8Qk=",
        version = "v1.5.1",
    )
    go_repository(
        name = "org_uber_go_goleak",
        build_file_proto_mode = "disable_global",
        importpath = "go.uber.org/goleak",
        sum = "h1:xqgm/S+aQvhWFTtR0XK3Jvg7z8kGV8P4X14IzwN3Eqk=",
        version = "v1.2.0",
    )
    go_repository(
        name = "org_uber_go_multierr",
        build_file_proto_mode = "disable_global",
        importpath = "go.uber.org/multierr",
        sum = "h1:dg6GjLku4EH+249NNmoIciG9N/jURbDG+pFlTkhzIC8=",
        version = "v1.8.0",
    )
    go_repository(
        name = "org_uber_go_zap",
        build_file_proto_mode = "disable_global",
        importpath = "go.uber.org/zap",
        sum = "h1:WefMeulhovoZ2sYXz7st6K0sLj7bBhpiFaud4r4zST8=",
        version = "v1.21.0",
    )
    go_repository(
        name = "com_github_deckarep_golang_set",
        build_file_proto_mode = "disable_global",
        importpath = "github.com/deckarep/golang-set",
        sum = "h1:sk9/l/KqpunDwP7pSjUg0keiOOLEnOBHzykLrsPppp4=",
        version = "v1.8.0",
    )
