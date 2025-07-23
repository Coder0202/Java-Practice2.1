//Q51: Write a Java program using a switch case to input a month number (1-12) and display the number of days in that month. Consider leap year for February.
import java.util.*;
class numberMonthDisplay
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A NumberMonth:");
int NumberMonth=sc.nextInt();

switch(NumberMonth)
{
case 1:
    System.out.print("January Days=30");  
    break;
case 2:
    System.out.print("February Days=28To29");  
    break;
case 3:
    System.out.print("March Days=31");  
    break;
case 4:
    System.out.print("April Days=30");  
    break;
case 5:
    System.out.print("May Days=31");  
    break;
case 6:
    System.out.print("June Days=30");  
    break;
case 7:
    System.out.print("July Days=31");  
    break;
case 8:
    System.out.print("August Days=31");  
    break;
case 9:
    System.out.print("September Days=30");  
    break;
case 10:
    System.out.print("October Days=31");  
    break;
case 11:
    System.out.print("November Days=30");  
    break;
case 12:
    System.out.print("December Days=31");  
    break;

default:
System.out.print("Wrong Input");

}
}
}