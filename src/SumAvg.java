import java.util.Scanner;

public class SumAvg {
    public static void main(String args[])
    {
        int i,n=0,sum=0;
        double avg;
        System.out.println("Input the 5 numbers");
        for(i=0;i<5;i++)
        {
            Scanner sc=new Scanner(System.in);
            n= sc.nextInt();
            sum=sum+n;
        }
        System.out.println("Sum of  5 numbers:"+sum);
        avg=(sum/5);
        {
            System.out.println("Average of 5 numbers:"+avg);

        }
    }
}
