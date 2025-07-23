//Q58. Develop a program to simulate a basic banking menu:
 //1: Deposit
 //2: Withdraw
 //3: Check Balance
 //4: Exit
 //Use a switch to handle user choice and print appropriate messages.
//Explanation:
 //Switch on user choice. Use variables for balance and update accordingly.
import java.util.*;
class basicBanking 
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Choice :");
int Choice=sc.nextInt();
switch(Choice)
{
case 1:
    System.out.print("Deposit");  
    break;
case 2:
    System.out.print("Withdraw");  
    break;
case 3:
    System.out.print("Check Balance");  
    break;
case 4:
    System.out.print(" Exit");  
    break;

default:
System.out.println("Invalid");
}
}
}