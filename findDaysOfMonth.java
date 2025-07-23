//Q30. Write a java program to enter month number between(1-12) and print number of days in month using if else. How to print the number of days in a given month using if else in java //programming.

import java.util.*;
class findDaysOfMonth
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A month Number:");
int monthNum=sc.nextInt();
if(monthNum==1)
{
System.out.print("JanuaryDays=31");
}
else if(monthNum==2)
{
System.out.print("February Days=28To29");
}
else if(monthNum==3)
{
System.out.print("March Days=31");
}
else if(monthNum==4)
{
System.out.print("April Days=30");
}
else if(monthNum==5)
{
System.out.print("May Days=31");
}
else if(monthNum==6)
{
System.out.print("June Days=30");
}
else if(monthNum==7)
{
System.out.print("July Days=31");
}
else if(monthNum==8)
{
System.out.print("August Days=31");
}
else if(monthNum==9)
{
System.out.print("September Days=30");
}
else if(monthNum==10)
{
System.out.print("October Days=31");
}
else if(monthNum==11)
{
System.out.print("November Days=30");
}
else if(monthNum==12)
{
System.out.print("December Days=31");
}
else
{
System.out.print("Invalid");

}

}
}