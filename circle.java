import java.util.Scanner;

 class circle1{
    private double radius=1.0;
    private String color="Red";
    circle1(){}
    circle1(double r){
        radius=r;
    }

    public double getRadius(){      //get radius of circle
        return radius;
    }

    public double getArea(){        //calc and return area of circle
        double area=Math.PI*radius*radius;
        return area;
    }
}

public class circle{
    public static void main(String[] args){
        circle1 c=new circle1();
        System.out.println(" The circle has a radius of  "+c.getRadius()+ " and it's Area is "+c.getArea());

    }

}