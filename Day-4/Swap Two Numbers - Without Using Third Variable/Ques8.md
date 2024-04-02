**Ques8.md**

# Swap Two Numbers - Without Using Third Variable

## Introduction

In this challenge, you will implement a function named `swapNumbers` that swaps the values of two given numbers without using a third variable. You will utilize arithmetic operations to achieve this.

## Steps

1. Define a function `swapNumbers` which accepts two integers, \(a\) and \(b\).
2. Add \(b\) to \(a\) and assign the result back to \(a\).
3. Subtract \(b\) from \(a\) and assign the result back to \(b\).
4. Subtract \(b\) from \(a\) and assign the result back to \(a\).
5. Return \(a\) and \(b\) in an array.

## Requirements

- The function `swapNumbers` should be defined in the `Exercise` class.
- The function `swapNumbers` should return an array of two integers after swapping.

## Input

Two integers \(a\) and \(b\).

## Output

An array of two integers \([a, b]\) after swapping.

## Examples

```java
Exercise.swapNumbers(10, 5); // Returns [5, 10]
Exercise.swapNumbers(2, -3); // Returns [-3, 2]
Exercise.swapNumbers(99, 0); // Returns [0, 99]
Exercise.swapNumbers(32, 32); // Returns [32, 32]
```

## Constraints

The integers can be negative, zero, or positive.

## Expected Time Complexity

\(O(1)\), constant time complexity.

## Expected Auxiliary Space

\(O(1)\), constant space complexity.

## Hint

The arithmetic way to swap two numbers uses addition and subtraction to perform the swap without a third variable.

**Note:** This method might lead to overflow for very large numbers because we perform an addition operation.
