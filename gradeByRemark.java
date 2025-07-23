//Q53. Write a program that takes a grade (A, B, C, D, F) as input and displays the corresponding remark using switch:
//A: Excellent
//B: Good
//C: Average
//D: Poor
//F: Fail
import java.util.*;
class gradeByRemark
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);


System.out.print("Enter Grade :");
char Grade= sc.next().charAt(0);
switch(Grade)
{
case 'A':
    System.out.print("Excellent");  
    break;
case 'B':
    System.out.print("Good");  
    break;
case 'C':
    System.out.print("Average");  
    break;
case 'D':
    System.out.print("Poor:");  
    break;
case 'E':
    System.out.print("Fail");  
    break;
default:
System.out.println("Invalid");
}
}
}
