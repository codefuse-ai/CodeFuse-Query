import subprocess
import sys
import os

print(sys.platform)
print(os.getcwd())
src_path = os.path.join(sys.path[0], "main.spec")
current_dir = sys.path[0]
os.chdir(current_dir)
print(os.getcwd())

py_path = os.path.join(os.path.dirname(sys.executable), "pyinstaller")
subprocess.call([py_path, src_path])
