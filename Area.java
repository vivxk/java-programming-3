
import java.util.Scanner;

class rectArea{
    int length,breadth;
    void setDim(){
        System.out.println("Enter Length Of Rectangle: ");     //Take i/p from user
        Scanner sc= new Scanner(System.in);
        length = sc.nextInt();
        System.out.println("Enter Breadth Of Rectangle");
        breadth = sc.nextInt();
    }
    int getArea(){       // Calculate Area Of rectangle 
        int area=length * breadth;
        return area;
    }

}

public class Area{
    public static void main(String[] args){             //Main
        rectArea a = new rectArea();
        a.setDim();
        System.out.println("Area of Rectangle is: " + a.getArea());
    }
}
