import java.util.Scanner;


public class seq{

    int num;
    void printSeq(int n) {
        if (n < -num) {
            System.out.println("");
        } else {
            System.out.println(Math.abs(n));
            printSeq(n-1);
        }
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        seq s=new seq();
        s.num=n;
        s.printSeq(n);

    }
}



