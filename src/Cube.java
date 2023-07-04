import java.util.Scanner;

public class Cube {
    public static void main(String args[])
    {
        int i,num=0,n=0;
        long cube=0;
        Scanner s1=new Scanner(System.in);
        num=s1.nextInt();
        System.out.println("Numbers:"+num);


                for(i=0;i<num;i++) {
                    Scanner sc = new Scanner(System.in);
                    n = sc.nextInt();
                    System.out.println("number is" + n);

                    cube = n * n * n;
                    System.out.println("Cube is:" + cube);

                }
    }

}

