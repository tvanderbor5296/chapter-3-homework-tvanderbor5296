Homework Assignment Chapter 3
Printing the Decimal Equivalent of a Binary Number.

Write an application that inputs an integer containing only 0s and 1s (i.e. a binary integer) and prints its decimal equivalent. [Do not use the String object parseInt to perform the conversion.]

Create a UML activity diagram that describes the flow of your program using the PlantUML editor and save the PNG version of it into your repository so it is part of your project.

Make sure you document the program with a header containing your name and a description of what the program does and appropriate comments in the code.

Hint: Use the remainder (%) and division (/) operators to pick off the binary number's digits one at a time, from right to left. 
In the decimal number system, the rightmost digit has a positional value of 1 and the next digit to the left has a positional value of 10,
then 100, then 1000, an so on.

The decimal number 234 can be interpreted as 4\*1 + 3\*10 + 2\*100.

In the binary system, the rightmost digit has a positional value of 1, the next digit to the left a positional value of 2, 
then 4, then 8, and so on. The decimal equivalent of binary 1101 is 1\*1 + 0\*2 + 1\*4 + 1\*8 or 13.

Here are sample runs:

```
Enter a binary number: 10101101
The decimal value is: 173
```

```
Enter a binary number: 01001101010
The decimal vaule is: 618
```

Run the program to make sure it works.

Submit the UML activity diagram and your solution using git.
