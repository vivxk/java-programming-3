import java.util.Scanner;

class complexNum{
    double r,i,r1,i1,r2,i2;
    Scanner sc=new Scanner(System.in);
    void getNumebr() {
        System.out.println("Enter real and imaginary part of first complex numebr");
        r1 = sc.nextInt();
        //System.out.println("Enter imaginary part of first complex number ");
        i1 = sc.nextInt();
        System.out.println("Enter real and imaginary part of second complex number");
        r2 = sc.nextInt();
        i2 = sc.nextInt();
    }
    void sum(){
        r=r1+r2;
        i=i1+i2;
        System.out.println("The sum is " +r+" + "+i+"i");
    }

    void diff(){
        r=r1-r2;
        i=i1-i2;
        System.out.println("The difference is " +r+" + "+i+"i");
    }

    void mul(){
        r=(r1*r2)-(i1*i2);
        i=(r1*i2)+(r2*i1);
        System.out.println("Product is "+r+" + "+i+"i");
    }

}

public class complex{
    public static void main(String[] args){
        complexNum c=new complexNum();
        c.getNumebr();
        c.sum();
        c.diff();
        c.mul();
    }
}
