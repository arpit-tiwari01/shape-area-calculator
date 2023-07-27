import java.util.Scanner;

abstract class Shape{
    float area;
    abstract public void acceptInput();
    abstract public void compute();
    public void disp(){
        System.out.println("Area: "+area);
    }   //concrete method
}
class Square extends Shape{
    float length;

    @Override
    public void acceptInput() {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the Length of Square: ");
        length= scan.nextFloat();
    }

    @Override
    public void compute() {
        area=length*length;
    }

}

class Rectangle extends Shape{
    float length;
    float breadth;

    @Override
    public void acceptInput() {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the Length of Rectangle: ");
        length= scan.nextFloat();
        System.out.println("Enter the breadth of Rectangle: ");
        breadth=scan.nextFloat();
    }

    @Override
    public void compute() {
        area=length*breadth;
    }
}
class Circle extends Shape{
    float radius;

    @Override
    public void acceptInput() {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        radius= scan.nextFloat();
    }

    @Override
    public void compute() {
        area=(3.14f*radius*radius);
    }
}
class Geometry{
    public void permit(Shape ref){
        ref.acceptInput(); // Accepting input for the given shape.
        ref.compute(); // Computing the area of the given shape.
        ref.disp(); // Displaying the computed area of the shape.
    }
}
class ShapeAreaCalculator{
    public static void main(String[] args) {
        Square s =new Square();
        Rectangle r=new Rectangle();
        Circle c=new Circle();


        Geometry g=new Geometry();
        g.permit(s);
        g.permit(r);
        g.permit(c);

    }
}

