//Q38. Check whether a student is eligible for scholarship:
 
  //  Attendance >= 75% and marks >= 80**
    //Input: Attendance %, marks
    //Logic: if-else
    //Output: Eligible or not.
 
import java.util.*;
class checkEligibleForScholarship
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A Marks: ");
int marks=sc.nextInt();
System.out.print("Enter A Attendance: ");
int Attendance=sc.nextInt();
if(Attendance >= 75&&marks >= 80)
{
System.out.println("Eligible for scholarship");
}
else
{
System.out.println("Not Eligible for scholarship");
}
}
}
