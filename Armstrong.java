import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check for armstrong number");
        int n = sc.nextInt();
        int result = Arm(n);

        if (n == result) {
            System.out.println( "Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

    }

    public static int Arm(int n) {
        int temp = n;
        int rem, result = 0;
        for(temp=n;temp>0;){
            rem=temp%10;
            result=result+(rem*rem*rem);
            temp=temp/10;
        }
        return result;


    }
}