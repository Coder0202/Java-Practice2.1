//Q41. Employee salary hike based on performance and years of service:
//Input: Basic salary, Years of service, Performance rating (1–5)
//Logic:
//If rating >= 4 and service > 5 yrs → 20% hike
//Else if rating >= 3 → 10%
//Else → 5%
//Output: New salary.

import java.util.*;
class bonusByRating
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A rating:");
int rating=sc.nextInt();
System.out.print("Enter A service:");
int service=sc.nextInt();
if(rating>=4&&service>=5)
{
System.out.print("Enter A Bounas:20%");
}
else if(rating<4&&service<5)
{
System.out.print("Enter A Bounas:10%");
}
else
{
System.out.print("Enter A Bounas:5%");
}
}
}