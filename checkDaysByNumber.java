//Q54. Develop a Java program using switch to print the day type for an input day number (1-7):
//1 for Monday, …, 7 for Sunday.
//For 1-5, display “Weekday”; for 6-7, display “Weekend”.

import java.util.*;
class checkDaysByNumber
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);


System.out.print("Enter Days :");
char Days= sc.next().charAt(0);
switch(Days)
{
case '1':
    System.out.print("Monday");  
    break;
case '2':
    System.out.print("Tuesday");  
    break;
case '3':
    System.out.print("Wednesday");  
    break;
case '4':
    System.out.print("Thursday:");  
    break;
case '5':
    System.out.print("Friday");  
    break;
case '6':
    System.out.print("Saturday");  
    break;
case '7':
    System.out.print("Sunday");  
    break;
default:
System.out.println("Invalid");
}
}
}