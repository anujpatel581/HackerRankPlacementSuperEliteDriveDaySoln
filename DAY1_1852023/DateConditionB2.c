/*Write a program to find given a specic date ,check whether the date is valid or not. Year will be in range 1900 to 9999

Input Format

INT INT INT Accept three integer as a input

Constraints

NULL

Output Format

Print the date is valid or not

Sample Input 0

08/16/2000
Sample Output 0

Invalid
Sample Input 1

17/10/1994
Sample Output 1

Valid*/


#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
 
int main()
{
    int dd,mm,yy;
     
   
    scanf("%d/%d/%d",&dd,&mm,&yy);
     
    //check year
    if(yy>=1900 && yy<=9999)
    {
        //check month
        if(mm>=1 && mm<=12)
        {
            //check days
            if((dd>=1 && dd<=31) && (mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12))
                printf("Valid\n");
            else if((dd>=1 && dd<=30) && (mm==4 || mm==6 || mm==9 || mm==11))
                printf("Valid\n");
            else if((dd>=1 && dd<=28) && (mm==2))
                printf("Valid\n");
            else if(dd==29 && mm==2 && (yy%400==0 ||(yy%4==0 && yy%100!=0)))
                printf("Valid\n");
            else
                printf("Valid\n");
        }
        else
        {
            printf("Invalid\n");
        }
    }
    else
    {
        printf("Invalid\n");
    }
 
    return 0;    
}
