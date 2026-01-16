# Java Practice Repository Instructions

## Overview
This repository contains standalone Java programs for practicing various programming concepts, organized by topic folders (e.g., Array, OOP, MultiThreading). Each file is a complete program with a main method.

## Project Structure
- **Array/**: Array manipulation and algorithms (e.g., FindMax.java, ReverseArray.java)
- **Collection-Framework/**: Java collections usage (e.g., List.java with ArrayList/Vector)
- **OOP/**: Object-oriented programming examples with subfolders for concepts like Inheritance, Polymorphism
- **MultiThreading/**: Threading examples (e.g., BankSimulation.java, RaceCondition.java)
- **String/**: String operations
- **DSA/**: Data structures and algorithms
- Other folders for specific topics like Exception-Handling, File_Handling

## Coding Patterns
- **Class Structure**: Public class matching filename, with `public static void main(String[] args)`
- **Input Handling**: Use `Scanner sc = new Scanner(System.in);` for user input, followed by `sc.close();`
- **Output**: `System.out.println()` for results
- **Imports**: `import java.util.*;` for Scanner, ArrayList, etc.
- **Data Types**: Prefer primitives (int, double) over wrappers unless collections require Objects
- **Error Handling**: Basic try-catch for exceptions, but often omitted in simple examples

Example from Array/FindMax.java:
```java
import java.util.*;
public class FindMax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // ... input loop
        sc.close();
    }
}
```

## Running Programs
- **Compilation**: `javac File.java` (or `javac *.java` for multiple files)
- **Execution**: `java ClassName`
- **IDE**: Use IntelliJ IDEA (configured via java_practice.iml) for easier running and debugging
- **No Build Tools**: Pure Java, no Maven/Gradle - compile and run manually

## Conventions
- **Naming**: Class names in PascalCase matching filename, variables/methods in camelCase
- **Hardcoded Examples**: Some files use hardcoded arrays (e.g., Jan-2026/FindTheSecondHigh.java) for quick testing
- **Threading**: Extend Thread or implement Runnable, use synchronized for shared resources
- **Collections**: Raw types common in older examples (e.g., ArrayList without generics)

## Key Files for Reference
- Array/FindMax.java: User input pattern
- Collection-Framework/List.java: Basic collections usage
- MultiThreading/BankSimulation.java: Thread synchronization example</content>
<parameter name="filePath">c:\Users\gadep\Desktop\java_practice\.github\copilot-instructions.md