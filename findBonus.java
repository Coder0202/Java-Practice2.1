//Q34. Check whether a given employee is eligible for bonus:
 
//Input: Years of service and salary.
//Logic: If service > 5 years, give 5% bonus.
//Output: Display bonus amount or no bonus.
 
import java.util.*;
class findBonus
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A Year of Salary:");
int Salary=sc.nextInt();
System.out.print("Enter A Year of Exp:");
int Exp=sc.nextInt();
if(Exp>5)
{

double bouns=Salary*0.5;
System.out.print("Bouns :"+bouns);

}
else
{
System.out.print("No Bonus for new Emploey");

}
}
}