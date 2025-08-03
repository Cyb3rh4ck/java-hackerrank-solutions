# Compare the Triplets

## Problem Description

Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].

- If a[i] > b[i], then Alice is awarded 1 point.
- If a[i] < b[i], then Bob is awarded 1 point.
- If a[i] = b[i], then neither person receives a point.

## Input Format
- The first line contains 3 space-separated integers, a[0], a[1], and a[2], the respective values in triplet a.
- The second line contains 3 space-separated integers, b[0], b[1], and b[2], the respective values in triplet b.

## Constraints
- 1 ≤ a[i] ≤ 100
- 1 ≤ b[i] ≤ 100

## Output Format
Return an array of two integers denoting the respective comparison points earned by Alice and Bob.

## Sample Input
```
5 6 7
3 6 10
```

## Sample Output
```
1 1
```

## Explanation
In this example:
- a = [5, 6, 7] and b = [3, 6, 10]
- Compare a[0] and b[0]: 5 > 3, so Alice gets 1 point.
- Compare a[1] and b[1]: 6 = 6, so no one gets a point.
- Compare a[2] and b[2]: 7 < 10, so Bob gets 1 point.
- Alice's comparison points: 1
- Bob's comparison points: 1
- Return [1, 1]

## Solution Explanation

The solution iterates through each pair of corresponding elements in the two triplets and compares them:

1. **Input Validation**: Check that all scores are between 1 and 100 inclusive
2. **Initialize Result**: Create a list [0, 0] to track Alice's and Bob's points
3. **Compare Elements**: For each position i:
   - If a[i] > b[i]: Alice gets a point
   - If a[i] < b[i]: Bob gets a point
   - If a[i] = b[i]: No points awarded
4. **Return Result**: Return the final scores as [Alice's points, Bob's points]
