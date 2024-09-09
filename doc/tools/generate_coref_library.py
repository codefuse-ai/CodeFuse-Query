import sys
import os

if len(sys.argv) != 2:
    print("Usage: python this_file.py language_library_directory")
    exit(-1)

input_language_dir = sys.argv[1]

print("Generate library from", input_language_dir)
if not os.path.exists("./.coref-api-build"):
    os.mkdir("./.coref-api-build")

# merge library files into one file
mapper = {
    "coref.cfamily.gdl": input_language_dir + "/cfamily/lib",
    "coref.go.gdl": input_language_dir + "/go/lib",
    "coref.java.gdl": input_language_dir + "/java/lib",
    "coref.javascript.gdl": input_language_dir + "/javascript/lib",
    "coref.properties.gdl": input_language_dir + "/properties/lib",
    "coref.python.gdl": input_language_dir + "/python/lib",
    # "coref.sql.gdl": input_language_dir + "/sql/lib",
    "coref.xml.gdl": input_language_dir + "/xml/lib",
}

# store merged files into .coref-api-build
for key in mapper.keys():
    output_file = "./.coref-api-build/" + key
    result = ""
    for root, ignored, files in os.walk(mapper[key]):
        for file in files:
            result += open(root + "/" + file, "r").read() + "\n"
    open(output_file, "w").write(result)