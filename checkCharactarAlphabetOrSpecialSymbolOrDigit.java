import java.util.*;
class checkCharactarAlphabetOrSpecialSymbolOrDigit
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter A Alphabet :");
char ch=sc.next().charAt(0);
int n = (int) ch;
if((n>=65&&n<=90)||(n>=97&&n<=122))
{
System.out.println("alphabet");
}
else
{
System.out.println("digit or special character");
}
}
}
