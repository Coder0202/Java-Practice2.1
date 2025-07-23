import java.util.*;

class divisibleBy5Or11
{
public static void main (String x[])
{
Scanner sc =new Scanner(System.in);
System.out.print("Enter A Number");
int A=sc.nextInt();
if(A%5==0&&A%11==0)
{
System.out.println("divisible");
}
else
{
System.out.println(" NOt divisible");
}

}
}