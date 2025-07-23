import java.util.*;
class checkCharactarOrAlphabet
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter");
char ch=sc.next().charAt(0);
if((ch>=97&&ch<=97)||(ch>=65&&ch<=90))
{
System.out.println("Alphabet");
}
else
{
System.out.println(" Not Alphabet");
}
}
}