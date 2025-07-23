import java.util.*;

class numOddOrEven
{
public static void main (String x[])
{
Scanner sc =new Scanner(System.in);
System.out.print("Enter A Number");
int num=sc.nextInt();
if(num%2==0)
{
System.out.print("Even Number");
}
else
{
System.out.print("Odd Number");
}
}
}