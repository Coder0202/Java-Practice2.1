import java.util.*;
class checkIsTriangle
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int A=sc.nextInt();
int B=sc.nextInt();
int C=sc.nextInt();
if(A==B&&A==C)
{
System.out.println("Given Triangle is equilateral");
}
else if(A==B||A==C)
{
System.out.println("Given Triangle is Isoscalets");
}
else
{
System.out.println("Given Triangle is scalence");
}

}
}