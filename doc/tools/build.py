import subprocess

print("Download Sparrow CLI")
subprocess.run([
    "curl",
    "-L",
    "https://github.com/codefuse-ai/CodeFuse-Query/releases/download/2.1.0/sparrow-cli-2.1.0.linux.tar.gz",
    "-o",
    "sparrow-cli.tar.gz"
])
subprocess.run([
    "tar",
    "-xvzf",
    "sparrow-cli.tar.gz"
])
print("Copy ../assets into ./doc/assets")
subprocess.run(["cp", "-r", "../assets", "./"])
print("Concat coref library from ../language into ./.coref-api-build")
subprocess.run(["python3", "tools/generate_coref_library.py", "../language"])
print("Generate markdown documents into ./godel-api")
subprocess.run(["python3", "tools/generate_markdown.py", "./sparrow-cli/godel-script/usr/bin/godel"])
