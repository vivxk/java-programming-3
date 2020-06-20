import java.util.Scanner;

public class sum{
    int n, sum=0, r;
    public int calcSum(int n){
        if(n<=0){
            return sum;
        }
        else {
            r=n%10;
            sum=sum+r;
            return calcSum(n/10);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        sum s= new sum();
        System.out.println("the sum is: "+s.calcSum(n));

    }


}