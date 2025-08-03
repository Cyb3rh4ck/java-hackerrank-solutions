# Java Loops I

## Problem Description

Given an integer N, print its first 10 multiples. Each multiple i (where 1 ≤ i ≤ 10) should be printed on a new line in the form: N x i = result.

## Input Format
A single integer, N.

## Constraints
2 ≤ N ≤ 20

## Output Format
Print 10 lines of output; each line i (where 1 ≤ i ≤ 10) contains the result of N in the form:
N x i = result.

## Sample Input
```
2
```

## Sample Output
```
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
```

## Solution Explanation

The solution uses a simple for loop to iterate from 1 to 10, calculating and printing each multiple of N in the required format.

1. Read the integer N using Scanner
2. Use a for loop with i from 1 to 10
3. Calculate result = N * i
4. Print in the format "N x i = result"
