/* Q. Design a class MatRev to reverse each element of a matrix.
          Example:
                   Matrix A                                                        MAtrix B
                   72  371  5                                                      27  173  5
                   12   6  426               Becomes                               21   6  624
                   5   123  94                                                      5  321  49
Some of the members of the class are given below:
Class Name                                      : MatRev
Data Members / Instance Variable 
arr[][]                                         : to store integer elements 
m                                               : to store the number of rows
n                                               : to store the number of columns 
Member Function / Methods
MatRev(int mm , int nn)                         : parameterised constructor to initialise the data member m = mm and n = nn
void fillarray()                                : to enter elements in the array
int reverse(int x)                              : returns the reverse of the number x 
void revMat(MatRev P)                           : reverse each elements of the array of the parameterised object and stores it in the array of the current object
void show()                                     : display the array elements in matrix form. 
Define the class MatRev giving details of the constructor(), void fillarray(), int reverse(int), void revMat(MatRev) and void show(). Define a main`8()
  */