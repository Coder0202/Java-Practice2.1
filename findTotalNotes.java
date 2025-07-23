 //Q25.Write a java program to find the total number of notes in a given amount.  
                    	
   //         Enter the amount: 2528
//Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1

import java.util.*;
class findTotalNotes
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int rem=1;
System.out.print("Enter A Amount :");
int Amount=sc.nextInt();
 int n500=Amount/500;
   rem=rem%500;
int n100=Amount/100;
  rem=rem%100;
int n50=Amount/50;
    rem=rem%50;
int n20=Amount/20;
    rem=rem%20;
int n10=Amount/10;
   rem=rem%10;
int n5=Amount/5;
   rem=rem%5;
int n2=Amount/2;
   rem=rem%2;
int n1=Amount/1;
   rem=rem%1;
System.out.println("500 notes :"+n500);
System.out.println("100 notes :"+n100);
System.out.println("50 notes :"+n50);
System.out.println("20 notes :"+n20);
System.out.println("10 notes :"+n10);
System.out.println("5 notes :"+n5);
System.out.println("2 notes :"+n2);
System.out.println("1 notes :"+n1);
}
}