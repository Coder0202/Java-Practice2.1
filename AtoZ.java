//Q24. Write a java program to check whether a character is uppercase or lowercase alphabet.

import java.util.*;
class AtoZ
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A charatar");
char ch=sc.next().charAt(0);
int A= (int)ch;
if(A>=65&&A<=90)
{
System.out.print("Upper charatar");
}
else
{
System.out.print("Lower charatar");
}

}
}