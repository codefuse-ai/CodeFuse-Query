import subprocess
import sys

if len(sys.argv) != 2:
    print("Usage: python this_file.py godel_script_executable_path")
    exit(-1)

godel_script_executable = sys.argv[1]

print("Copy ../assets into ./doc/assets")
subprocess.run(["cp", "-r", "../assets", "./"])
print("Concat coref library from ../language into ./.coref-api-build")
subprocess.run(["python3", "tools/generate_coref_library.py", "../language"])
print("Generate markdown documents into ./godel-api")
subprocess.run(["python3", "tools/generate_markdown.py", godel_script_executable])