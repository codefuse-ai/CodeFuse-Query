#!/bin/bash

: '
This script performs validation and compilation of Godel script files (.gs and .gdl).

Usage:
  ./check_gdl.sh <directory>

Arguments:
  <directory>    The directory to scan for Godel script files. The script will
                 search for .gs and .gdl files to compile and validate.

Description:
  The script does the following:
  - Validates that a directory is provided as an argument.
  - Changes to the specified directory.
  - Finds all .gs and .gdl files within the specified directory (excluding specific paths).
  - For each located library directory, it concatenates the library files and compiles them.
  - For each script file, it runs a separate compilation process and checks for errors.
  - Reports any compilation errors and terminates execution if an error occurs.
  - If no errors occur, it reports successful compilation for each file.

Requires:
  - The "sparrow-cli" tool must be installed and available under the user"s home directory.
  - Command "find" available on the system (commonly available on Unix-like systems).
  - Command "mktemp" available on the system for creating temporary files.
  - Command "date" available on the system for time measurements.

Author: AntGroup
Date: 2024-01-16
Version: 1.0

'

set +x

# Check if the parameter is empty
if [ -z "$1" ]; then
  echo "Please provide a directory as an argument"
  exit 1
fi

# Change to the directory
cd "$1" || exit 1

sparrow_godel_script="$HOME/sparrow-cli/sparrow-cli/godel-script/usr/bin/godel"
sparrow_lib="$HOME/sparrow-cli/sparrow-cli/lib"

# Define get_files function
get_files() {
  find "$1" -type f \( -name "*$2" \) -print
}

# Define get_target_files function
get_target_files() {
  find "$1" -type f \( -name "*.gs" -o -name "*.gdl" \) -not -name "tempfile.*.gdl" -not -path "$1/language/*/lib/*"
}

files=$(get_target_files "$PWD")

# Iterate over the files
for file in $files; do
  output=$(("$sparrow_godel_script" "$file" -p "$sparrow_lib" --semantic-only) 2>&1)
  result=$?

  if [ -n "$output" ]; then
    echo "File $file produced the following output:"
    echo "$output"
  fi

  # Check if the output is not empty
  if [ $result -ne 0 ]; then
    echo "Build failed, please check this file"
    exit 1
  else
    echo "$file build successful"
  fi
done

exit 0