//Q43. Calculate fine for library book return:
//Input: Number of days late
//Logic:
//Up to 5 days → ₹2/day
//6–10 days → ₹3/day
//11–30 days → ₹5/day
//More than 30 days → Membership canceled + ₹500 fine
//Output: Total fine + membership status

import java.util.*;
class calculateFineForLibrary
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A days late:");
int daysLate =sc.nextInt();
if(daysLate<=5)
{
System.out.print("Two Days of Membership canceled + ₹100 fine");
}
else if(daysLate>=6&&daysLate<=10)
{
System.out.print("Three Days of Membership canceled + ₹200 fine");
}
else if(daysLate>=11&&daysLate<=30)
{
System.out.print("Five Days of Membership canceled + ₹300 fine");
}
else
{

System.out.print("Membership canceled + ₹500 fine");

}

}
}
