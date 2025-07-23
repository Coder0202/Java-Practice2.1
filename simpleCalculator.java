//Q52: Create a Java program to simulate a simple calculator using a switch case. It should take two numbers and an operator (+, -, *, /, %) as input and perform the corresponding operation.
import java.util.*;
class simpleCalculator
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Value :");
int A=sc.nextInt();
System.out.print("Enter A Choice +,*,/,-,%:");
char Choice=sc.next().charAt(0);
System.out.print("Enter Value :");
int B=sc.nextInt();
switch(Choice)
{
case '+':
    System.out.print("Add:"+(A+B));  
    break;
case '*':
    System.out.print("Multi:"+(A*B));  
    break;
case '/':
    System.out.print("Div:"+(A/B));  
    break;
case '-':
    System.out.print("Sub:"+(A-B));  
    break;
case '%':
    System.out.print("Modu:"+(A%B));  
    break;
default:
System.out.println("Invalid");
}
}
}