# Java Date and Time

## Problem Description

Given a date, you need to find what day of the week it falls on.

## Input Format
A single line of input containing three space-separated integers:
- `month`: The month (1-12)
- `day`: The day (1-31) 
- `year`: The year

## Constraints
- 2000 < year < 3000

## Output Format
Output the day of the week corresponding to the date, in uppercase.

## Sample Input
```
08 05 2015
```

## Sample Output
```
WEDNESDAY
```

## Solution Explanation

The solution uses Java's `LocalDate` class from the `java.time` package to:

1. **Create a LocalDate object** with the given year, month, and day
2. **Get the day of week** using `getDayOfWeek()`
3. **Format the output** using `getDisplayName()` to get the full day name
4. **Convert to uppercase** as required by the problem

### Key Java 8+ Features Used:
- `LocalDate.of(year, month, day)` - Creates a date object
- `getDayOfWeek()` - Returns the day of the week
- `getDisplayName(TextStyle.FULL, Locale.ENGLISH)` - Gets full day name in English
- `toUpperCase()` - Converts to uppercase format

### Alternative Approaches:
You could also use the older `Calendar` class, but `LocalDate` is the modern, recommended approach for date operations in Java.

```java
// Alternative using Calendar (older approach)
Calendar calendar = Calendar.getInstance();
calendar.set(year, month - 1, day); // Note: month is 0-indexed in Calendar
String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
return days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
```
