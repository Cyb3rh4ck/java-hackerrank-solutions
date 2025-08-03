# Java End-of-file (EOF)

## Problem Description

The challenge here is to read content lines of input until you reach EOF, then number and print all lines.

**Hint:** Java's `Scanner.hasNext()` method is helpful for this problem.

## Input Format
Read some unknown lines of input from stdin (System.in) until you reach EOF; each line of input contains a non-empty String.

## Output Format
For each line, print the line number, followed by a single space, and then the line content received as input.

## Sample Input
```
Hello world
I am a file
Read me until end-of-file.
```

## Sample Output
```
1 Hello world
2 I am a file
3 Read me until end-of-file.
```

## Solution Explanation

The solution uses `Scanner.hasNext()` to detect when there's no more input (EOF):

1. Create a Scanner to read from System.in
2. Initialize a line counter starting at 1
3. Use a while loop with `scanner.hasNext()` to continue reading until EOF
4. For each line, read it with `nextLine()` and print the line number followed by the content
5. Increment the line counter after each line

The key insight is using `hasNext()` which returns `false` when EOF is reached, allowing us to read an unknown number of lines.
