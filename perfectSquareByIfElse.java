//Q20. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square 

import java.util.*;
class perfectSquareByIfElse
{
public static void main(String e[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a Number :");
int num=sc.nextInt();
if(Math.sqrt(num)==Math.sqrt(num))
{
System.out.println("Perfect Square");
}
else
{
System.out.println("Not Perfect Square");
}
}
}