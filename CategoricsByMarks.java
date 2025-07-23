//Q19. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — using nested ternary operators.
import java.util.*;

class CategoricsByMarks
{
public static void main (String x[])
{
Scanner sc =new Scanner(System.in);
System.out.print("Enter A Marks");
int Marks=sc.nextInt();
String str=(Marks>=90)?"Excellent":(Marks>=75)?"Good":(Marks>=50)?"Average":(Marks<50)?"Poor":"Fail";
System.out.println(str);
}
}