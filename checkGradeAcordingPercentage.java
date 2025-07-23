//Q27. Write a java program to input marks of five subjects Physics, Chemistry, Biology,
//        	    Mathematics and Computer, calculate percentage and grade according to given conditions:
  //                  	percentage >= 90% : Grade A
    //                	percentage >= 80% : Grade B
      //              	percentage >= 70% : Grade C
        //            	percentage >= 60% : Grade D
          //          	percentage >= 40% : Grade E
            //        	percentage < 40% : Grade F	

import java.util.*;
class checkGradeAcordingPercentage
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter A percentage");
int percentage=sc.nextInt();
if(percentage >= 90)
{
System.out.println("Grade A");
}
else if(percentage >= 80)
{
System.out.println("Grade B");
}
else if(percentage >= 70)
{
System.out.println("Grade C");
}
else if(percentage >= 60)
{
System.out.println("Grade D");
}
else if(percentage >= 40)
{
System.out.println("Grade E");
}
else if(percentage < 40)
{
System.out.println("Grade F");
}
else
{
System.out.println("Invalid");
}


}
}
