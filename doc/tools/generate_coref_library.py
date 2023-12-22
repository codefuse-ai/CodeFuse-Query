import sys
import os

if len(sys.argv) != 2:
    print("Usage: python this_file.py language_library_directory")
    exit(-1)

input_language_dir = sys.argv[1]

print("Generate library from", input_language_dir)
if not os.path.exists("./.coref-api-build"):
    os.mkdir("./.coref-api-build")

mapper = {
    "coref.go.gdl": input_language_dir + "/go/lib",
    "coref.java.gdl": input_language_dir + "/java/lib",
    "coref.javascript.gdl": input_language_dir + "/javascript/lib",
    "coref.python.gdl": input_language_dir + "/python/lib",
    "coref.xml.gdl": input_language_dir + "/xml/lib",
}

for key in mapper.keys():
    output_file = "./.coref-api-build/" + key
    result = ""
    for root, ignored, files in os.walk(mapper[key]):
        for file in files:
            result += open(root + "/" + file, "r").read() + "\n"
    open(output_file, "w").write(result)