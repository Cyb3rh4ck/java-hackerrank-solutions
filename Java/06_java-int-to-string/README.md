# Java Int to String

## Problem Description

You are given an integer `n`, you have to convert it into a string. Please complete the partially completed code in the editor. If your code successfully converts `n` into a string, the code will print "Good job". Otherwise it will print "Wrong answer".

`n` can range between -100 to 100 inclusive.

## Input Format
A single integer `n`.

## Constraints
-100 ≤ n ≤ 100

## Output Format
"Good job" if the conversion is successful, "Wrong answer" otherwise.

## Sample Input 0
```
100
```

## Sample Output 0
```
Good job
```

## Solution Explanation

The challenge is to convert an integer to a string. In Java, there are several ways to do this:

### Method 1: `Integer.toString(n)`
```java
String s = Integer.toString(n);
```

### Method 2: `String.valueOf(n)`
```java
String s = String.valueOf(n);
```

### Method 3: String concatenation
```java
String s = n + "";
```

All three methods will correctly convert an integer to its string representation. The platform automatically checks if your conversion produces the correct string format.

**Key Points:**
- The conversion must handle both positive and negative integers
- The string representation should be exact (e.g., 100 → "100", -50 → "-50")
- No additional formatting or spaces should be added
