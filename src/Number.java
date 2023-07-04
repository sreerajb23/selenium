    import java.util.*;
    public class Number {
    public static void main (String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        if (num>0)
            System.out.println("The given number is positive");
        else if (num<0)
            System.out.println("The given number is negative");
        else
            System.out.println("Number is equal to zero");

    }
}


