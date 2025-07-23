//Q21. Write a java program to check whether a number is neon or not.      	
  //      	Input : 9
    //    	Output : Neon Number
      //  	Explanation: square is 9*9 = 81 and
        //	The sum of the digits of the square is 9.    


import java.util.*;
class neonNumberIFElse
{
public static void main(String c[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter A Number");
int number=sc.nextInt();
int Square=number*number;
System.out.println("Square Is :"+Square);

int last=Square/100;
int first=(Square/10)%10;
int mid =Square%10;
if(first+last+mid==number)
{
System.out.println("Neon");
}
else
{
System.out.println("Not Neon");
}

}
}