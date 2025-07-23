//Q61. Write a menu-driven program in java using switch case.
  //         	1.Addition
    //       	2.Subtraction
      //     	3.Multiplication
        //   	4,Division


import java.util.*;
class basicCalculeter
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A First Number:");
int First=sc.nextInt();
System.out.print("Enter A choice 1.Addition 2.Subtraction 3.Multiplication 4.Division:");
int choice=sc.nextInt();
System.out.print("Enter A Second Number:");
int Second=sc.nextInt();

switch(choice)
{
case 1:
   System.out.print("Addition:"+(First+Second));
break;
case 2:
   System.out.print("Subtraction:"+(First-Second));
break;
case 3:
   System.out.print("Multiplication:"+(First*Second));
break;
case 4:
   System.out.print("Division:"+(First/Second));
break;
default:

   System.out.print("Invalid");

}
}
}