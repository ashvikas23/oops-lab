import java.io.*;
import java.util.*;

class negativeNumbersException extends Exception
{
    public negativeNumbersException(String s)
    {
        super(s);
    }
}

class average
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count,i;
        float num, sum=0, avg;

        try
        {
            System.out.println("Please Enter Numbers to be Calculated : ");
            count = sc.nextInt();
            float numbers[] = new float[count];

            System.out.println("Please Enter "+count+" numbers");

            for(i=0;i<count;i++)
            {
                num = sc.nextFloat();
                if(num<0)
                {
                    throw new negativeNumbersException("Negative Numbers are not allowed");
                }
                numbers[i]=num;
            }

            for(i=0;i<count;i++)
            {
                sum = sum + numbers[i];
            }

            avg = sum/count;
            System.out.println("Average of given numbers is :"+avg);
        }
        catch(negativeNumbersException ex)
        {
            System.out.println("Exception Caught!!!");
            System.out.println(ex.getMessage());
        }
    }
}
