package findarea;
//method overloading
public class AreaOfShapes {
    //for circle
    public double calculateArea(double radius){
        return Math.PI*radius*radius;
    }
    //for square
        public double calculateArea(int side ){
        return side*side;
        }
        //for rectangle
    public double calculateArea(float length,float width){
        return length*width;
    }
    //for
    public double calculateArea(double base,double height){
        return (1/2)*base*height;
    }

    public static void main(String[] args) {
        AreaOfShapes areaOfShapes = new AreaOfShapes();
        //square
        System.out.println("Area of Square : "+areaOfShapes.calculateArea(10));
        //circle
        System.out.println("Area of Circle : "+areaOfShapes.calculateArea(23.5));
        //triangle
        System.out.println("Area of Triangle : "+areaOfShapes.calculateArea(10,20));
        //rectangle
        System.out.println("Area of Rectangle : "+areaOfShapes.calculateArea(5f,7f));
    }
}
