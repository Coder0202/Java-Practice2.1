// Q13. Write a java program to accept two integers and check whether they are equal or not.

import java.util.*;

class checkEqualOrNot
{
public static void main (String x[])
{
Scanner sc =new Scanner(System.in);
System.out.print("Enter A Number");
int A=sc.nextInt();
System.out.print("Enter A Number");
int B=sc.nextInt();
if(A==B)
{
System.out.println("Equal Number");
}
else
{
System.out.println(" Not Equal");
}
}
}