/*Check whether a number (entered by the user) is negative or positive or neutral.

greater than 0 = positive lesser than 0 = negative equal to 0 = neutral

Input Format

integer

Constraints

-100000 < n < 100000

Output Format

positive / negative / neutral

Sample Input 0

7
Sample Output 0

positive
Explanation 0

n = 7 ,

7 is a positive number

Sample Input 1

-123
Sample Output 1

negative*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(0<n){
            System.out.println("positive");
        }
        else if(0>n){
            System.out.println("negative");
        }
        else{
            System.out.println("neutral");
        }
    }
}
