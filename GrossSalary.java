// Q14. Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.

import java.util.*;
class GrossSalary
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Basic Salary Number:");
int bs=sc.nextInt();
float HRA,DA;
if(bs<=10000)
{
HRA=0.2f*bs;
DA=0.8f*bs;
}else if(bs<=20000)
{
HRA=bs*0.25f;
DA=bs*0.9f;
}else

{
HRA=bs*0.3f;
DA=bs*0.95f;
}
System.out.println("Gross salary :"+(bs+HRA+DA));

}
}









