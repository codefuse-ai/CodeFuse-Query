import argparse
import os
import sys

from rebuild.lib import rebuild_lib, open_lib

sys.path.append(os.path.join(sys.path[0], ".."))
from sparrow_schema.schema import *
from query.run import *
from extractor.extractor import Extractor
from database.create import database_create
from package.create import package_create
from package.compile_and_run import package_run

SPARROW_HOME = os.path.abspath(os.path.join(os.path.join(sys.path[0], "..")))


class ErrorFilter(logging.Filter):
    def filter(self, record):
        return record.levelno == logging.ERROR


class InfoFilter(logging.Filter):
    def filter(self, record):
        return record.levelno == logging.INFO


class WarningFilter(logging.Filter):
    def filter(self, record):
        return record.levelno == logging.WARNING


def extractor_choices():
    extractor_list = list()
    for name, value in vars(Extractor).items():
        if "extractor" in name:
            extractor_list.append(name.split("_")[0])
    return extractor_list


def sparrow_check():
    for name, value in vars(Extractor).items():
        if isinstance(value, Path):
            if not value.exists():
                return False
    for name, value in vars(sparrow).items():
        if isinstance(value, Path):
            if not value.exists():
                return False
    return True


def parse_args():
    global SPARROW_HOME
    parser = argparse.ArgumentParser(description='sparrow-cli',
                                     formatter_class=argparse.RawTextHelpFormatter)
    parser.add_argument("--version", "-v", dest='version', action="store_true", help='version')
    parser.add_argument("--sparrow-home", "-sparrow-home", dest='sparrow_home',
                        help='sparrow home, You can specify the sparrow location yourself')
    parser.add_argument('--sparrow-cli-internal', dest='sparrow_home_internal', help=argparse.SUPPRESS)
    subparsers = parser.add_subparsers(title='subcommands', dest='subcommand')
    # 子命令query
    subparser_query = subparsers.add_parser('query', help='execute godel script')
    # 子命令query的子解析器
    sub_subparser_query = subparser_query.add_subparsers(title='query_subcommands', dest='query_subcommands')
    # query的子命令run
    subparser_query_run = sub_subparser_query.add_parser('run', help='execute godel script')
    subparser_query_run.add_argument("--database", '-d', help='Directory to a godel database to query')
    subparser_query_run.add_argument("--format", '-f', choices=['csv', 'json', "sqlite"], default='json',
                                     help='Select output format. default output json')
    subparser_query_run.add_argument("--output", '-o', default=os.getcwd(),
                                     help='Select output dir, The output file will have the same name as the Godel '
                                          'script, but with the {.json} extension')
    subparser_query_run.add_argument("--timeout", '-t', type=int, default=3600,
                                     help='Set query timeout in seconds, default 3600')
    subparser_query_run.add_argument("--gdl", '-gdl', required=True, nargs="*", dest="godel_dir",
                                     help='The location of the godel script that needs to execute')
    subparser_query_run.add_argument('--verbose', action='store_true', help='Enable verbose mode')
    subparser_query_run.add_argument('--sarif', action='store_true', help='Turn on the sarif report option, all '
                                                                          'outputs will be merged into one sarif, '
                                                                          'and the output result will be '
                                                                          'sparrow-cli-report.sarif in the output '
                                                                          'directory. The original godel script '
                                                                          'output must contain information such as '
                                                                          'filePath, startLine, ruleName, '
                                                                          'ruleDescription, etc.')
    subparser_query_run.add_argument('--merge', '-m', action='store_true', help='Combined execution of multiple '
                                                                                'scripts,Only one function and class '
                                                                                'with the same name in the script '
                                                                                'will be retained, and the output and '
                                                                                'header files will be merged '
                                                                                'together. and they must to be '
                                                                                'godel-script query')
    subparser_query_run.add_argument('--log-dir', help='Log storage dir')
    # 子命令package
    subparser_package = subparsers.add_parser('package', help='godel script package manager')
    # 子命令package的子解析器
    sub_subparser_package = subparser_package.add_subparsers(title='package_subcommands', dest='package_subcommands')
    # package的子命令create
    subparser_package_create = sub_subparser_package.add_parser('create', help='create package or manifest.json')
    subparser_package_create.add_argument("--manifest", '-m', help='Create a new manifest file in this directory',
                                          action="store_true")
    subparser_package_create.add_argument("--pack", '-p', help='Pack up project and generate zip file',
                                          action="store_true")
    subparser_package_create.add_argument("--install", '-i', help='Unpack zip file and install')
    subparser_package_create.add_argument('--log-dir', help='Log storage dir')
    # package的子命令run
    subparser_package_run = sub_subparser_package.add_parser('run', help='execute godel script with packages')
    subparser_package_run.add_argument("--database", '-d', help='Directory to a godel database to query')
    subparser_package_run.add_argument("--gdl", '-gdl', required=True, nargs="*", dest="godel_dir",
                                       help='The location of the godel script that needs to execute')
    subparser_package_run.add_argument('--verbose', action='store_true', help='Enable verbose mode')
    subparser_package_run.add_argument('--log-dir', help='Log storage dir')
    # 子命令database
    subparser_database = subparsers.add_parser('database', help='data extract')
    # 子命令database子解析器
    sub_subparser_database = subparser_database.add_subparsers(title='database_subcommands',
                                                               dest='database_subcommands')
    # database的子命令create
    subparser_database_create = sub_subparser_database.add_parser('create', help='data extract')
    subparser_database_create.add_argument("--source-root", '-s', required=True,
                                           help='Select source root,default to current directory')
    subparser_database_create.add_argument('--data-language-type', '-lang', nargs="*", dest="language",
                                           choices=extractor_choices(), required=True, help='data language type, Pass '
                                                                                            'in parameters separated '
                                                                                            'by whitespace. e.g. '
                                                                                            '-lang java xml')
    subparser_database_create.add_argument("--output", '-o', required=True, help='Database generation directory')
    subparser_database_create.add_argument("--timeout", '-t', type=int, default=3600,
                                           help='Set extract timeout in seconds, default 3600')
    subparser_database_create.add_argument('--verbose', action='store_true', help='Enable verbose mode')
    subparser_database_create.add_argument('--log-dir', help='Log storage dir')
    subparser_database_create.add_argument('--overwrite', action='store_true',
                                           help='whether to overwrite the database, Default not')
    subparser_database_create.add_argument('--extraction-config-file',
                                           help='Extractor execute option file, The requirement is a json file')
    subparser_database_create.add_argument('--extraction-config', nargs="*", help='Extractor execute option,'
                                                                                  'java.a=b will regard as "java" : {'
                                                                                  '"a" : "b"} in '
                                                                                  'extraction-config-file，Parameters '
                                                                                  'other than a.b=c will not be '
                                                                                  'accepted')
    # 子命令rebuild
    subparser_rebuild = subparsers.add_parser('rebuild', help='rebuild tool')
    # 子命令rebuild的子解析器
    sub_subparser_rebuild = subparser_rebuild.add_subparsers(title='rebuild_subcommands', dest='rebuild_subcommands')
    # rebuild的子命令lib
    subparser_rebuild_lib = sub_subparser_rebuild.add_parser('lib', help='rebuild lib')
    subparser_rebuild_lib.add_argument('--data-language-type', '-lang', nargs="*", dest="language",
                                       choices=open_lib() + ["all"], required=True, help='data language type, Pass '
                                                                                         'in parameters separated '
                                                                                         'by whitespace. e.g. '
                                                                                         '-lang java xml')
    subparser_rebuild_lib.add_argument('--verbose', action='store_true', help='Enable verbose mode')
    subparser_rebuild_lib.add_argument('--log-dir', help='Log storage dir')
    args = parser.parse_args()

    # 如果没有参数输入，直接回车，则显示帮助信息
    if len(sys.argv) == 1:
        parser.print_help()
        logging.warning("please give conf to start sparrow as help, it will not start, You can use -h to view the "
                        "help list")
        return

    # 设置SPARROW_HOME
    # bazel会将脚本打包进pyz中，SPARROW_HOME需要从SHELL中传入，对用户不可见
    if args.sparrow_home_internal:
        SPARROW_HOME = args.sparrow_home_internal
    # 用户设置SPARROW_HOME可以覆盖掉脚本设置
    if args.sparrow_home:
        SPARROW_HOME = args.sparrow_home
    sparrow(SPARROW_HOME)

    Extractor()
    # 暂不开启
    # if not sparrow_check():
    #     logging.error("Please specify the sparrow-cli directory correctly")
    #     return
    # 查询版本号, 查找配置文件
    if args.version:
        print(sparrow.version)
        return

    logging.info("sparrow %s will start", sparrow.version)
    if args.subcommand:
        if args.verbose:
            log_level = logging.DEBUG
        else:
            log_level = logging.INFO
        logger = logging.getLogger()
        logger.setLevel(log_level)
        for hdlr in logger.handlers:
            hdlr.setFormatter(logging.Formatter('%(asctime)s %(levelname)s: %(message)s'))
        if args.log_dir:
            log_format = '%(asctime)s %(levelname)s: %(message)s'
            # error warning info 分开存储
            file_handler_error = logging.FileHandler(os.path.join(args.log_dir, 'sparrow-cli-error.log'))
            formatter_error = logging.Formatter(log_format)
            file_handler_error.setFormatter(formatter_error)
            file_handler_error.addFilter(ErrorFilter())

            file_handler_warning = logging.FileHandler(os.path.join(args.log_dir, 'sparrow-cli-warn.log'))
            formatter_warning = logging.Formatter(log_format)
            file_handler_warning.setFormatter(formatter_warning)
            file_handler_warning.addFilter(WarningFilter())

            file_handler_info = logging.FileHandler(os.path.join(args.log_dir, 'sparrow-cli-info.log'))
            formatter_info = logging.Formatter(log_format)
            file_handler_info.setFormatter(formatter_info)
            file_handler_info.addFilter(InfoFilter())

            logger.addHandler(file_handler_warning)
            logger.addHandler(file_handler_info)
            logger.addHandler(file_handler_error)
    else:
        parser.print_help()
        logging.warning("please give conf to start sparrow as help, it will not start, You can use -h to view the "
                        "help list")
        return
    if args.subcommand == "query":
        if args.query_subcommands == "run":
            query_run(args)
        return
    elif args.subcommand == "database":
        if args.database_subcommands == "create":
            database_create(args)
        return
    elif args.subcommand == "rebuild":
        if args.rebuild_subcommands == "lib":
            rebuild_lib(args)
        else:
            sub_subparser_rebuild.print_help()
        return
    elif args.subcommand == "package":
        if args.package_subcommands == "create":
            package_create(args)
        elif args.package_subcommands == "run":
            package_run(args)
        return
    else:
        parser.print_help()
        logging.warning("please give conf to start sparrow as help, it will not start, You can use -h to view the "
                        "help list")


if __name__ == '__main__':
    parse_args()
