import os
import sys
import subprocess
import platform
import re
import argparse


def my_print(*args, **kargs):
    sep = kargs.get('sep', ' ')
    end = kargs.get('end', '\n')
    for idx, arg in enumerate(args):
        if idx != 0:
            sys.stdout.write(sep)
        sys.stdout.write(format(arg))
    if end is None:
        end = '\n'
    sys.stdout.write(end)


def covert_to_str_list(data):
    # In Python 2, type(l) is str/bytes, in Python 3 it is bytes.
    return list(map(lambda l: l.decode() if (type(l) is not str) else l, data))


class LibTool:
    def __init__(self, show_command_only):
        self.show_command_only = show_command_only

    def get_libs(self, program):
        return covert_to_str_list(self._get_libs(program))

    def get_rpaths(self, program):
        return []

    def _get_libs(self, program):
        return []

    def set_rpath(self, program):
        pass

    def change_reference(self, program, library):
        pass

    def copy_to_libpath(self, library, libpath):
        self._run('cp %s %s' % (library, libpath))

    def _run(self, command):
        my_print('** Run command: %s' % command)
        if not self.show_command_only:
            return subprocess.call(command, shell=True)
        else:
            return 0


class LinuxLibTool(LibTool):
    def _get_libs(self, program):
        libs = subprocess.check_output(['ldd', program]).splitlines()
        return list(map(lambda lib: lib[0],
                        filter(lambda lib: lib,
                               map(lambda lib: re.findall(b'\t.+ => (.+) \\(.+\\)', lib), libs))))

    def set_rpath(self, program):
        self._run("patchelf --set-rpath '$ORIGIN/../lib64' '%s'" % program)

    def change_reference(self, program, library):
        pass


class MacLibTool(LibTool):
    def _get_libs(self, program):
        return subprocess.check_output("otool -L '%s' | awk '{print $1}' | grep .dylib" % program, shell=True).splitlines()

    def get_rpaths(self, program):
        rs = subprocess.check_output(['otool', '-l', program]).splitlines()
        rs = covert_to_str_list(rs)
        rpaths = []
        for idx, line in enumerate(rs):
            if 'cmd LC_RPATH' in line:
                mat = re.match(r'\s*path\s*(.+?)\s*\(offset', rs[idx + 2])
                if mat:
                    rpaths.append(mat.group(1))
        return rpaths

    def set_rpath(self, program):
        for rpath in self.get_rpaths(program):
            self._run("install_name_tool -delete_rpath '%s' '%s'" % (rpath, program))
        self._run("install_name_tool -add_rpath @executable_path/../lib64 '%s'" % program)

    def change_reference(self, program, library):
        self._run("install_name_tool -change '%s' @rpath/$(basename '%s') '%s'" % (library, library, program))


class USRPath:
    def __init__(self, usr_root):
        self.root = usr_root
        self.bin = os.path.join(self.root, 'bin')
        self.lib = os.path.join(self.root, 'lib')
        self.lib64 = os.path.join(self.root, 'lib64')

    def mkdir(self):
        for path in (self.lib, self.lib64):
            if not os.path.exists(path):
                os.mkdir(path)


def is_system_lib(lib):
    filter_libs = [
        'libc.so',
        'libm.so',
        'libdl.so',
        'librt.so',
        'libresolv.so',
        'libnsl.so',
        'libutil.so',
        'libcrypt.so',
        'libpthread.so',

        'libpam.so',
        'libgcc_s.so',
        'libcurses.so',
        'libncurses.so',
        'libz.so',

        'libc++.1.dylib',
        'libSystem.B.dylib',
        'libcharset.1.dylib',
        'libiconv.2.dylib',
        'libncurses.5.4.dylib',
        'libffi.dylib',
        'libsqlite3.dylib',
        'libz.1.dylib',
    ]
    lib_name = os.path.basename(lib) 
    for filter_lib in filter_libs:
        if lib_name.startswith(filter_lib):
            return True
    return False


def change_binary(libtool, usr_path, binary_file):
    my_print('Analysing binary: %s' % binary_file)
    libs = libtool.get_libs(binary_file)
    rpaths = libtool.get_rpaths(binary_file)
    for lib in libs:
        my_print('* Analysing library: %s' % lib, end='')
        if not is_system_lib(lib):
            if isinstance(libtool, MacLibTool) and ('@rpath' in lib):
                my_print()
                for rpath in rpaths:
                    library = lib.replace('@rpath', rpath).replace('@executable_path',
                                                                   os.path.dirname(os.path.abspath(binary_file)))
                    if os.path.exists(library):
                        libtool.copy_to_libpath(library=library, libpath=usr_path.lib64)
                        libtool.change_reference(binary_file, lib)
                        break
            else:
                if os.path.exists(lib):
                    my_print()
                    libtool.copy_to_libpath(library=lib, libpath=usr_path.lib64)
                    libtool.change_reference(binary_file, lib)
                else:
                    my_print(' [skip: library not found]')
        else:
            my_print(' [skip: system library]')
    libtool.set_rpath(binary_file)


def main(args):
    parser = argparse.ArgumentParser('Pack Libs')
    parser.add_argument('usr_root')
    parser.add_argument('--show-command-only', action='store_true')
    args = parser.parse_args(args[1:])
    if platform.system() == 'Linux':
        libtool = LinuxLibTool(show_command_only=args.show_command_only)
    elif platform.system() == 'Darwin':
        libtool = MacLibTool(show_command_only=args.show_command_only)
    else:
        sys.stderr.write('The platform \'%s\' is not supported.' % platform.system())
        return 1
    usr = USRPath(args.usr_root)
    usr.mkdir()

    for binary_file in os.listdir(usr.bin):
        try:
            change_binary(libtool, usr, os.path.join(usr.bin, binary_file))
        except Exception as e:
            my_print(e)
    # TODO: Recursive call
    for binary_file in os.listdir(usr.lib64):
        try:
            change_binary(libtool, usr, os.path.join(usr.lib64, binary_file))
        except Exception as e:
            my_print(e)
    return 0


if __name__ == '__main__':
    sys.exit(main(sys.argv))
