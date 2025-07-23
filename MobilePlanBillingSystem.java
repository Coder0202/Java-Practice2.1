//Q42. Mobile plan billing system:
//Input: Minutes used in a month
//Logic:
//Up to 100 mins → Base ₹199
//101–300 mins → ₹199 + ₹1/min for extra
//301–500 mins → ₹199 + ₹1.5/min for extra
//Above 500 mins → ₹199 + ₹2/min for extra
//Output: Total monthly bill.

import java.util.*;
class MobilePlanBillingSystem
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A Minutes:");
int Minutes=sc.nextInt();
if(Minutes<100)
{
System.out.print("Base Plan");
}
else if(Minutes>=100&&Minutes<=300)
{
System.out.print("₹199 + ₹1/min for extra");
}
else if(Minutes>=301&&Minutes<=500)
{
System.out.print("₹199 + ₹1.5/min for extra");
}
else
{

System.out.print(" ₹199 + ₹2/min for extra");

}

}
}
