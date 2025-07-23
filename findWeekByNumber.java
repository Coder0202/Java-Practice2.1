//Q31. Write a java program to input week number(1-7) and print the corresponding day of week name using if else. How to print day of week using if else in java programming.
import java.util.*;
class findWeekByNumber
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A month Number:");
int monthNum=sc.nextInt();
if(monthNum==1)
{
System.out.print("Monday");
}
else if(monthNum==2)
{
System.out.print("Tuesday");
}
else if(monthNum==3)
{
System.out.print("Wednesday");
}
else if(monthNum==4)
{
System.out.print("Thursday");
}
else if(monthNum==5)
{
System.out.print("Feiday");
}
else if(monthNum==6)
{
System.out.print("Saturday");
}
else if(monthNum==7)
{
System.out.print("Sunday");
}
else
{
System.out.println("Invalid");
}
}
}
