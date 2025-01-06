#!/bin/bash

# Check if a number argument is provided
if [ -z "$1" ]; then
  echo "Usage: $0 <number>"
  exit 1
fi

# Validate the input
number="$1"
if ! [[ $number =~ ^[0-9]+$ ]]; then
  echo "Error: Please enter a valid number."
  exit 1
fi

# Create the directory
dirname="p$number"
mkdir -p "$dirname"

# Create Solution.java with the specified package
cat <<EOL > "$dirname/Solution.java"
package p$number;

EOL

# Create Test.java with the specified package and main method
cat <<EOL > "$dirname/Test.java"
package p$number;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();

        /*
         * 
         */
    }
}
EOL
