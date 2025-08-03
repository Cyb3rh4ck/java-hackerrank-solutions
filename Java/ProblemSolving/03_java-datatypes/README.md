# Java Datatypes - HackerRank Problem

## Problem Statement

Java has 8 primitive data types; `char`, `boolean`, `byte`, `short`, `int`, `long`, `float`, and `double`. For this exercise, we'll work with the primitives used to hold integer values (`byte`, `short`, `int`, and `long`):

- A **byte** is an 8-bit signed integer.
- A **short** is a 16-bit signed integer.
- An **int** is a 32-bit signed integer.
- A **long** is a 64-bit signed integer.

Given an input integer, you must determine which primitive data types are capable of properly storing that input.

## Data Type Ranges

| Data Type | Size | Range |
|-----------|------|-------|
| `byte` | 8-bit | -128 to 127 |
| `short` | 16-bit | -32,768 to 32,767 |
| `int` | 32-bit | -2,147,483,648 to 2,147,483,647 |
| `long` | 64-bit | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |

## Input Format

- The first line contains an integer, `t`, denoting the number of test cases.
- Each test case, `i`, is comprised of a single line with an integer, `n`, which can be arbitrarily large or small.

## Output Format

For each input variable `n` and appropriate primitive data type, you must determine if the given primitives are capable of storing it. If yes, then print:

```
n can be fitted in:
* dataType
```

If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: `byte`, `short`, `int`, `long`).

If the number cannot be stored in one of the four aforementioned primitives, print the line:

```
n can't be fitted anywhere.
```

## Sample Input

```
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
```

## Sample Output

```
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
```

## Explanation

- **-150** can be stored in a `short`, an `int`, or a `long` (but not in a `byte` since -150 < -128).
- **150000** exceeds the range of `short` but fits in `int` and `long`.
- **1500000000** fits in `int` and `long`.
- **213333333333333333333333333333333333** is very large and is outside of the allowable range of values for all primitive integer data types.
- **-100000000000000** exceeds the range of `int` but fits in `long`.

## Solution Approach

### Key Insights

1. **Handle Arbitrarily Large Numbers**: Use `BigInteger` to parse and handle numbers that might exceed `long` range.
2. **Range Checking**: Compare the input number against the minimum and maximum values of each primitive type.
3. **Ordered Output**: Check data types in size order (byte → short → int → long).

### Implementation Strategy

1. **BigInteger Usage**: Parse input as `BigInteger` to handle numbers of any size.
2. **Range Constants**: Use `Byte.MIN_VALUE`, `Byte.MAX_VALUE`, etc., to get the exact ranges.
3. **Comparison**: Use `BigInteger.compareTo()` method for range checking.
4. **Error Handling**: Use try-catch to handle invalid number formats.

### Time Complexity

- **Time**: O(t × k) where t is the number of test cases and k is the constant time for checking 4 data types.
- **Space**: O(1) for each test case (excluding input storage).

## Reference

[Oracle Java Documentation - Primitive Data Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
