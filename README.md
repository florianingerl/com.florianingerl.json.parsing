# com.florianingerl.json.parsing

## Purpose of this project
The purpose of this project is to test the ["CaptureTree"](https://github.com/florianingerl/com.florianingerl.util.regex#capture-trees)-feature of the `com.florianingerl.util.regex`-library and its usefulness in parsing recursive constructs such as json strings.

## What this program does?
The program parses a json string that represents a person using the `com.florianingerl.util.regex`-library with the regex in [json.regex](jsonparsing/src/main/resources/json.regex). After parsing, the so-called "CaptureTree" is printed to the console.

## How to run the program?
Download this repository and build the project with `mvn package`. Then run the program with `java -jar target/jsonparsing-0.0.1-SNAPSHOT-jar-with-dependencies.jar`.