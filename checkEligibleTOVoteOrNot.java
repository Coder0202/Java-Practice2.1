//Q12. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.


import java.util.*;
class checkEligibleTOVoteOrNot
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter A Age :");
int Age=sc.nextInt();
if(Age>=18)
{
System.out.println("Eligible TO Vote");
}
else
{
System.out.println("Not Eligible TO Vote");
}
}
}