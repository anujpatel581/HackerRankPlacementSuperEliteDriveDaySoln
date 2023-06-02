/*Your task is to take two numbers of int data type, two numbers of float data type as input and output their sum:

Declare variables: two of type int and two of type float. Read lines of input from stdin (according to the sequence given in the 'Input Format' section below) and initialize your variables. Use the and operator to perform the following operations: Print the sum and difference of two int variable on a new line. Print the sum and difference of two float variable rounded to one decimal place on a new line.

Input Format

The first line contains two integers. The second line contains two floating point numbers.

Constraints

1 <= integer variables <= 100000 1 <= float variables <= 100000

Output Format

Print the sum and difference of both integers separated by a space on the first line, and the sum and difference of both float (scaled to 1 decimal place) separated by a space on the second line.

Sample Input 0

10 4
4.0 2.0
Sample Output 0

14 6
6.0 2.0
Explanation 0

When we sum the integers 10 and 4 , we get 14 the integer . When we subtract the second number 4 from the first number 10, we get 6 as their difference . When we sum the floating-point numbers 4.0 and 2.0, we get 6.0 . When we subtract the second number 2.0 from the first number 4.0, we get 2.0 as their difference.*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();
        System.out.println((n1+n2) + " " + (n1-n2));
        System.out.println((n3+n4) + " " + (n3-n4));
    }
}
