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
sparrow_lib_1_0="$HOME/sparrow-cli/sparrow-cli/lib-1.0"

# Define get_files function
get_files() {
  find "$1" -type f \( -name "*$2" \) -print
}

# Define rebuild_lib function
rebuild_lib() {
  local lib_path="$1"
  local lib="$2"
  local gdl_list=()
  local output_file
  local tmp_out
  local start_time
  local end_time
  local elapsed_time

  gdl_list+=($(get_files "$lib_path" ".gs"))
  gdl_list+=($(get_files "$lib_path" ".gdl"))

  output_file=$(mktemp "tempfile.XXXXXX.gdl")
  trap 'rm -f "$output_file"' EXIT

  echo "// script" > "$output_file"
  for file_name in "${gdl_list[@]}"; do
    cat "$file_name" >> "$output_file"
  done

  tmp_out=$(mktemp "tempfile.XXXXXX.gdl")
  trap 'rm -f "$tmp_out"' EXIT

  start_time=$(date +%s%3N)
  if ! "$sparrow_godel_script" "$output_file" -o "$tmp_out"; then
    echo "$lib_path lib compile error, please check it yourself" >&2
    exit 1
  fi

  mv "$tmp_out" "$sparrow_lib_1_0/coref.$lib.gdl"

  end_time=$(date +%s%3N)
  elapsed_time=$((end_time - start_time))
  echo "$lib_path lib compile success time: ${elapsed_time} milliseconds" >&2
}

# Define get_language function
get_language() {
  local dir="$1"
  local dirname
  local language

  dirname=$(dirname "$dir")
  language=$(basename "$dirname")
  echo "$language"
}

# Get libs directories
directories=($(find "$PWD" -type d \( -path "$PWD/language/*/lib" -o -path "$PWD/language/*/libs" \) -print))

# Get libs
for dir in "${directories[@]}"; do
  lang=$(get_language "$dir")
  echo "Building lib for $lang ..."
  rebuild_lib "$dir" "$lang"
done

# Define get_target_files function
get_target_files() {
  find "$1" -type f \( -name "*.gs" -o -name "*.gdl" \) -not -name "tempfile.*.gdl" -not -path "$1/language/*/lib/*"
}

files=$(get_target_files "$PWD")

# Iterate over the files
for file in $files; do
  output=$(("$sparrow_godel_script" "$file" -p "$sparrow_lib_1_0" --semantic-only 2>&1)

  # Check if the output is not empty
  if [ -n "$output" ]; then
    echo "The file $file produced the following output:"
    echo "$output"
    echo "Please check if this file is a godel script (.gs) or a godel 1.0 script (.gdl)"
    exit 1
  else
    echo "$file build successful"
  fi
done

exit 0