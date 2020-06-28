import java.util.Scanner;

public class seq1 {

    int no, num;

    void Seq(int n,int k) {
        if (Math.abs(n) <= num) {
            if (n > 0) {
                System.out.print(" " + n);
                Seq(n - k, k);
            }
            if (n <= 0) {
                no = n;
                System.out.print(" " + no);
                no = Math.abs(no);
                while (Math.abs(no) < num) {
                    no=no-k;
                    System.out.println(" " + Math.abs(no));
                }
            }

        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();
        System.out.println("enter k");
        int k= sc.nextInt();
        seq1 s=new seq1();
        s.num=n;
        s.Seq(n,k);

    }
}