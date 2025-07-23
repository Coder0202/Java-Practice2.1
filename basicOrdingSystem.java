//Q60. Create a Java program to simulate a basic food ordering system using switch:
 //1: Burger
 //2: Pizza
 //3: Pasta
 //4: Sandwich
 //Display the price for the selected item.
//Explanation:
 //Switch on food item number. Print item name and price. Default for invalid selection.

import java.util.*;
class basicOrdingSystem
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A order Number:");
int order=sc.nextInt();
switch(order)
{
case 1:
   System.out.print("Burger");
break;
case 2:
   System.out.print("Pizza");
break;
case 3:
   System.out.print("Pasta");
break;
case 4:
   System.out.print("Sandwich");
break;
default:

   System.out.print("Invalid");

}
}
}