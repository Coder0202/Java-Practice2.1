//Q29. Write a java program to input electricity unit charges & calculate total electricity bill according to the given condition
  //              	For first 50 units Rs. 0.50/unit
    //            	For next 100 units Rs. 0.75/unit
      //          	For next 150 units Rs. 1.20/unit
        //        	For unit above 250 Rs. 1.50/unit
// An additional surcharge of 20% is added to the bill.

import java.util.*;
class checkElectricityUnitANDTotalUnit
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A electricity unit");
int electri=sc.nextInt();
if(electri<50)
{
double unit=(electri*0.50);
double additional=(electri*0.20);
System.out.print("Total electricity bill:"+(unit+additional));
}
else if(electri>=50)
{
double unit=(electri*0.50);
double additional=(electri*0.20);
System.out.print("Total electricity bill:"+(unit+additional));
}
else if(electri>=100)
{
double unit=(electri*0.75);
double additional=(electri*0.20);
System.out.print("Total electricity bill:"+(unit+additional));
}
else if(electri>=150)
{
double unit=(electri*1.25);
double additional=(electri*0.20);
System.out.print("Total electricity bill:"+(unit+additional));
}
else if(electri>=250)
{
double unit=(electri*1.50);
double additional=(electri*0.20);
System.out.print("Total electricity bill:"+(unit+additional));

}

}
}
