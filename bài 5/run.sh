#!/bin/bash

cd src || exit

javac Solution.java

if [ $? -eq 0 ]; then
    java Solution
else
    echo "Compilation failed."
fi