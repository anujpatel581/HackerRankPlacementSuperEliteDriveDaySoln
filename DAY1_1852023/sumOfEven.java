/*
To find sum of even numbers we need to iterate through even numbers from 1 to n. Get a number n from user and add all the even number
Input Format

integer
Constraints

1 < n < 1000000

Output Format

integer

Sample Input 0

5
Sample Output 0

6
Explanation 0

n = 5 1 2 3 4 5 -> even = 2 + 4 = 6

Sample Input 1

10
Sample Output 1

30
Explanation 1

n = 10 1 2 3 4 5 6 7 8 9 10 even = 2 + 4 + 6 + 8 + 10 = 30*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int even(int n){
    
    int sum = 0;
        int i=2;
        while(i<=n){
            sum +=i;
            i = i+2;
        }
        return sum;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(even(n));
    }
}
