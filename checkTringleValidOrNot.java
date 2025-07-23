import java.util.*;
class checkTringleValidOrNot
{
public static void main(String c[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A First Side:");
int firstSide=sc.nextInt();
System.out.print("Enter A Second Side:");
int secondSide=sc.nextInt();
System.out.print("Enter A third Side:");
int thirdSide=sc.nextInt();


if(firstSide+thirdSide+secondSide==180)
{
System.out.println("Valid");
}
else
{
System.out.println(" Not Valid");
}
}
}