//Q62. Write a menu-driven program in java using switch case.
  //         	1.Check Number is positive , negative or zero.
    //       	2.Check Number is even or odd

import java.util.*;
class twoInOne62
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Choice one find posi and nega or Two find Even and odd :");
int choice=sc.nextInt();

switch(choice)
{
case 1:
       System.out.println("Enter A Number:");
       int num=sc.nextInt();
        
       if(num>0)
         {
           System.out.println("Number Is Positive");

           }
       else if(num<0)
           {
           System.out.println("Number Is Nagetive");

           }
       else
        {
           System.out.println("Zero");

           }
case 2:
       System.out.print("Enter A Number:");
       int num1=sc.nextInt();
       if(num1%2==0)
         {
           System.out.print("Number Is Even");

           }
       else 
           {
           System.out.print("Number Is Odd");

           }


}
}
}