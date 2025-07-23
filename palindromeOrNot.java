//Q22. Write a java program to check whether a number is palindrome or not. 

import java.util.*;
class palindromeOrNot
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A Number");
int sum=0;
int num=sc.nextInt();
int n=num;
sum=sum+(num%10)*100;
num=num/10;
sum=sum+(num%10)*10;
num=num/10;
sum=sum+(num%10)*1;
num=num/10;
if(sum==n)
{
System.out.print("palindrome");
}
else
{
System.out.print("Not palindrome");
}


}
}