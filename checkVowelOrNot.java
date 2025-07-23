import java.util.*;
class checkVowelOrNot
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter A Alphabet :");
char ch=sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
System.out.println("Vowel");
}
else
{
System.out.println("Alphabet ");
}
}
}