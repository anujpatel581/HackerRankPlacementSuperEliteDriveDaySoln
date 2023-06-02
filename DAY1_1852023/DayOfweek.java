/*we will learn how to print days of week in words using if else ladder statement. We will take a number between 1 to 7 as input from user, where 1 corresponds to Monday, 2 corresponds to Tuesday and so on. We will use if else ladder statement to print name of day in words

1 - Sunday 2 - Monday 3 - Tuesday 4 - Wednesday 5 - Thursday 6 - Friday 7 - Saturday lesser than 1 or more than 7 - Invalid day

Input Format

integer

Constraints

0 < n <=10

Output Format

days

Sample Input 0

2
Sample Output 0

Monday
Submissions: 47
Max Score: 10
Difficulty: Medium
Rate This Challenge:

    
More
*/

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
        if(1<n && n>7){
            System.out.println("Invalid day");
        }
        else if(n==1){
            System.out.println("Sunday");
        }
        else if(n==2){
            System.out.println("Monday");
        }
        else if(n==3){
            System.out.println("Tuesday");
        }
        else if(n==4){
            System.out.println("Wednesday");
        }
        else if(n==5){
            System.out.println("Thursday");
        }
        else if(n==6){
            System.out.println("Friday");
        }
        else{
            System.out.println("Saturday");
        }
        
    }
}
