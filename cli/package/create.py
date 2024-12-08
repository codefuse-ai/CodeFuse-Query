import package.manifest as manifest
import package.pack as pack
import package.compile_and_run as cr

def package_create(args):
    if args.manifest:
        manifest.manifest_create()
    elif args.pack:
        pack.pack_to_zip()
    elif args.install:
        pack.unpack_from_zip(args.install)