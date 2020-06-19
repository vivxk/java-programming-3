import java.util.Scanner;

public class palindrome{
    int n;
    int sum=0;

    int checkPal(int n){
        if(n<=0){               //Base condition
            return sum;
        }else{                   //general condition
            sum=(sum*10) + n%10;
            return checkPal(n/10);
        }
    }

    public static void main(String[] args ){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int tmp=n;

        palindrome p=new palindrome();
        p.checkPal(n);
        if(p.sum==tmp){
            System.out.println(+n+" is a Palindrome");
        }
        else {
            System.out.println(+n+" is not a Palindorme");
        }
    }
}



