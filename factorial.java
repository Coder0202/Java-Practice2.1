import java.util.*;
class factorial
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int i=0,no;
no=sc.nextInt();

while(i<=no)
{
i=i*no;
i++;
}
System.out.print(i);
}
}