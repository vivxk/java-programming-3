
import java.util.Scanner;

class rectArea{
    int length,breadth;
    void setDim(){
        System.out.println("Enter Length Of Rectangle: ");
        Scanner sc= new Scanner(System.in);
        length = sc.nextInt();
        System.out.println("Enter Breadth Of Rectangle");
        breadth = sc.nextInt();
    }
    int getArea(){
        int area=length * breadth;
        return area;
    }

}

public class Area{
    public static void main(String[] args){
        rectArea a = new rectArea();
        a.setDim();
        System.out.println("Area of Rectangle is: " + a.getArea());
    }
}
