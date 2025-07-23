//Q28. Write a java program to find all roots of a quadratic equation using if else. How to find all roots of a quadratic equation using if else in java programming.
 
//Example
//Input a: 8 ,  b: -4 , c: -2
//Output Root1: 0.80
//Root2: -0.30

import java.util.*;
class findQuadratic
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Value Of a:");
int a=sc.nextInt();
System.out.print("Enter Value Of b:");
int b=sc.nextInt();
System.out.print("Enter Value Of c:");
int c=sc.nextInt();
int y=b*b-4*a*c;
if(y<0)
{
System.out.print("NO Result");
}
else if(y>0)
{
double x1=(-b+Math.sqrt(y))/(2*a);
System.out.print("Value :"+x1);
double x2=(-b-Math.sqrt(y))/(2*a);
System.out.print("Value :"+x2);

}
else
{
double x1=(-b+Math.sqrt(y))/(2*a);
System.out.print("Value :"+x1);
}

}
}
