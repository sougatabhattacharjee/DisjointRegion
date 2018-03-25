## Counting disjoint regions ##
--------------------------------
Write a function that takes a two dimensional array of the
type shown below and returns the number of disjoint regions within the array as an integer.

A region is defined as a set of non-zero members of the array which are contiguous with
each other – that is they are neighbours above, below, left or right of each other. Note that
diagonals are not considered neighbours.

#### Example ####
    1101             1001             1001
    1001             1011             1001
    0100             1001             1001
    0000             1100             1111
    
    3 regions        2 regions        1 region
    
### Notes and Constraints ###
    * The input array is a 2D-array consists of non-zero integers 
    * The elements are not limited to 0 and 1 and both negative and positive integers are allowed
    * The input array is a 2D-array of any size N X M (not has to be square matrix)
    * The solution is written in Java
    * Intellij IDEA is used the editor
    * Maven 3.5.2 is used for build pipeline and dependencies
    * JUnit & JUnitParams Libraries are used to perform Unit tests
    * The main solution class is DisjointRegionsFinder.java
    * The test class is TestDisjointRegionsFinder.java

### How to build and run
    mvn clean package
    
### How to run tests
    mvn test    
    
### Approach ###
The basic idea of this solution is starting from one non-zero element
and apply depth-first-search(DFS) approach to mark neighbor elements as visited.
Unlike standard DFS algorithm, here we will only call for 4 neighbors recursively. 
We keep track of the visited non-zero(s) so that they are not visited again.
The marking of the elements has been done recursively. 
If an element is non-zero integer, then check all its 4 neighbours except the diagonal.
If a neighbour element is also non-zero, then mark it as visited and check its neighbour.
This process will continue until there is any non-zero element as neighbor exist.
To mark as visited, currently the value of the element is replaced by ```Integer.MIN_VALUE```.


### Complexity ###    
Each element in the array is visited only once because we are marking them as visited in-place.
So time is ```O(row * column)``` or ```O(number of elements)```.

### Test cases ###
All the test cases are provided under TestDisjointRegionsFinder class.

4 x 4 and 5 x 5 matrix used with different values to test the solution.