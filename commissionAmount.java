//Q39. Calculate commission based on sales amount:
//Input: Sales amount
//Logic:
//Sales < 5000 → 2% commission
//Sales 5000–10000 → 5% commission
//Sales > 10000 → 10% commission
//Output: Display commission amount.

import java.util.*;
class commissionAmount
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A Sales:");
int Sales=sc.nextInt();
if(Sales<=5000)
{
double totalCommi=Sales*0.2;
System.out.println("Total Commission:"+totalCommi);
}
else if(Sales>5000&&Sales<10000)
{
double totalCommi=Sales*0.5;
System.out.println("Total Commission:"+totalCommi);
}
else if(Sales>10000)
{
double totalCommi=Sales*0.10;
System.out.println("Total Commission:"+totalCommi);
}
else
{
System.out.print("Invalid");
}

}
}