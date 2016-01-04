# Smallo Library

Smallo is a [Big-O](https://en.wikipedia.org/wiki/Big_O_notation) notation library in Java. 

It contains several classic algorithms, which are often taught to students, as 
part of their Computer Science course, at universities around the world. Smallo 
then serves an academic purpose, and aims at illustrating classes that can be 
overwhelmingly theoretical. Smallo's code can be debugged, in a step-by-step 
manner, in order to facilitate the understanding of these algorithms, and the 
time complexity they experience.

## Algorithms

Smallo has grouped algorithms into the following packages:

1. Math: [Factorial](https://github.com/otaviofff/smallo/blob/master/src/main/java/org/smallo/algorithms/math/adapters/Factorial.java), [Fibonacci](https://github.com/otaviofff/smallo/blob/master/src/main/java/org/smallo/algorithms/math/adapters/Fibonacci.java)
2. Search: [Binary](https://github.com/otaviofff/smallo/blob/master/src/main/java/org/smallo/algorithms/search/adapters/BinarySearch.java), [Linear](https://github.com/otaviofff/smallo/blob/master/src/main/java/org/smallo/algorithms/search/adapters/LinearSearch.java)
3. Shuffle: [Fisher-Yates](https://github.com/otaviofff/smallo/blob/master/src/main/java/org/smallo/algorithms/shuffle/adapters/FisherYatesShuffle.java)
4. Sort: [BogoSort](https://github.com/otaviofff/smallo/blob/master/src/main/java/org/smallo/algorithms/sort/adapters/BogoSort.java), [BubbleSort](https://github.com/otaviofff/smallo/blob/master/src/main/java/org/smallo/algorithms/sort/adapters/BubbleSort.java), [InsertionSort](https://github.com/otaviofff/smallo/blob/master/src/main/java/org/smallo/algorithms/sort/adapters/InsertionSort.java), [MergeSort](https://github.com/otaviofff/smallo/blob/master/src/main/java/org/smallo/algorithms/sort/adapters/MergeSort.java), [QuickSort](https://github.com/otaviofff/smallo/blob/master/src/main/java/org/smallo/algorithms/sort/adapters/QuickSort.java), [SelectionSort](https://github.com/otaviofff/smallo/blob/master/src/main/java/org/smallo/algorithms/sort/adapters/SelectionSort.java)

## Usage

Examples under namespace [org.smallo.algorithms.math](https://github.com/otaviofff/smallo/blob/master/src/main/java/org/smallo/algorithms/math):

```java
//Calculates the factorial of 10.
java -cp smallo.jar org.smallo.algorithms.math.Console -n=10 -a=factorial

//Calculates the fibonacci of 12.
java -cp smallo.jar org.smallo.algorithms.math.Console -n=12 -a=fibonacci
```

Examples under namespace [org.smallo.algorithms.search](https://github.com/otaviofff/smallo/blob/master/src/main/java/org/smallo/algorithms/search):

```java
//Executes a binary search for number 6900, 
//in a randomly-generated array with 155000 elements.
java -cp smallo.jar org.smallo.algorithms.search.Console -n=6900 -l=155000 -a=binary

//Executes a linear search for number 77, 
//in a randomly-generated array with 150 elements.
java -cp smallo.jar org.smallo.algorithms.search.Console -n=77 -l=150 -a=linear
```

Examples under namespace [org.smallo.algorithms.shuffle](https://github.com/otaviofff/smallo/blob/master/src/main/java/org/smallo/algorithms/shuffle):

```java
//Shuffles a randonly-generated array with 30 elements.
java -cp smallo.jar org.smallo.algorithms.shuffle.Console -l=30 -a=fisher
```

Examples under namespace [org.smallo.algorithms.sort](https://github.com/otaviofff/smallo/blob/master/src/main/java/org/smallo/algorithms/sort):

```java
//Sorts a ramdomly-generated array, with 3200 elements, 
//according to MergeSort.
java -cp smallo.jar org.smallo.algorithms.sort.Console -l=3200 -a=merge -v

//Sorts a ramdomly-generated array, with 45 elements, 
//according to QuickSort.
java -cp smallo.jar org.smallo.algorithms.sort.Console -l=45 -a=quick -v
```

Note that sorting algorithms can be executed with an extra argument, named ```-v```, which stands for "verbose". When this agument is given, Smallo prints both the randonly-generated array (input) and the sorted array (output). Smallo also prints the time elapsed, so we can easily compare which algorithm performs better.

## Output

When any algorithm is executed, Smallo prints an output report, so that we can check the actual results. The following example shows the report printed for a QuickSort execution. 

```java
java -cp smallo.jar org.smallo.algorithms.sort.Console -l=25 -a=quick -v
Input: 
4 23 13 14 1 18 6 10 9 15 15 7 24 17 5 13 20 14 8 17 2 9 9 20 11 

Sorted: 
1 2 4 5 6 7 8 9 9 9 10 11 13 13 14 14 15 15 17 17 18 20 20 23 24 

Elapsed:
1 ms
```

Computer Science is fun. Enjoy your studies =)
