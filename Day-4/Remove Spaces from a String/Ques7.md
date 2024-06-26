**Ques7.md**

# Remove Spaces from a String - String Manipulation

## Introduction

In this exercise, you will create a method to remove all spaces from a given string. This is an important exercise for understanding how to manipulate strings in Java. The task might seem straightforward, but it will provide you with a solid basis for dealing with more complex string operations in the future.

## Steps

- You will be provided with a string that may contain any number of spaces.
- Your task is to write a method that removes all these spaces.
- The method should return the modified string, which should not contain any spaces.

## Requirements

- The function `removeSpaces` should be defined in the `Exercise` class.
- The `removeSpaces` function takes a string as input and returns a string.
- The function should remove all spaces from the input string.

## Input

A string `input` (\(1 \leq |input| \leq 10^5\)), which may contain spaces.

## Output

The modified string, which does not contain any spaces.

## Examples

```java
Exercise.removeSpaces("Hello World") // returns "HelloWorld"
Exercise.removeSpaces("Java  Programming") // returns "JavaProgramming"
Exercise.removeSpaces(" Java ") // returns "Java"
```

## Constraints

- The input string may contain leading, trailing, and multiple spaces between words.
- The input string may contain any printable ASCII characters.

## Expected Time Complexity

The expected time complexity is \(O(n)\), where \(n\) is the length of the input string. This is because the `replaceAll` function iterates over each character in the string once.

## Expected Auxiliary Space

The expected auxiliary space is \(O(n)\), where \(n\) is the length of the input string. This is because the `replaceAll` function creates a new string to store the result.

## Hint

The `replaceAll` method of the `String` class in Java can be used to replace all occurrences of a regular expression in a string with a replacement string.

**Note:** In Java, strings are immutable, meaning that their values cannot be changed once they are created. Therefore, any operation that modifies a string, such as `replaceAll`, creates a new string.
