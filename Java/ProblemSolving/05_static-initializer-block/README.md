# Java Static Initializer Block

## Problem Description

Static initialization blocks are executed when the class is first loaded. The challenge is to read two integers representing the breadth and height of a parallelogram and compute its area.

You are given a class `Solution` with a `main` method. Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. You should read the variables from the standard input.

If B ≤ 0 or H ≤ 0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

## Input Format
There are two lines of input. The first line contains B: the breadth of the parallelogram. The second line contains H: the height of the parallelogram.

## Constraints
- -100 ≤ B ≤ 100
- -100 ≤ H ≤ 100

## Output Format
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

## Sample Input 1
```
1
3
```

## Sample Output 1
```
3
```

## Sample Input 2
```
-1
2
```

## Sample Output 2
```
java.lang.Exception: Breadth and height must be positive
```

## Solution Explanation

The solution uses a static initializer block to:

1. **Read Input**: Use Scanner to read B and H from standard input
2. **Validate Input**: Check if both B and H are positive
3. **Set Flag**: Use a static boolean flag to indicate if input is valid
4. **Handle Exceptions**: Print error message if input is invalid
5. **Calculate Area**: In main method, calculate and print area if flag is true

### Key Concepts:
- **Static Initializer Block**: Executed when class is first loaded, before any object creation or main method execution
- **Static Variables**: Shared across all instances of the class
- **Input Validation**: Ensuring data meets the problem constraints

The static block runs exactly once when the class is loaded, making it perfect for one-time initialization and validation.
