//Q59. Write a program using switch that takes a number (1-4) and displays a season:
 //1: Spring
 //2: Summer
 //3: Autumn
 //4: Winter
//Explanation:
//Simple switch with four cases and default for invalid input.


import java.util.*;
class displaySeason
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A Season Number:");
int Season=sc.nextInt();
switch(Season)
{
case 1:
   System.out.print("Spring");
break;
case 2:
   System.out.print("Summer");
break;
case 3:
   System.out.print("Autumn");
break;
case 4:
   System.out.print("Winter");
break;
default:

   System.out.print("Invalid");

}
}
}