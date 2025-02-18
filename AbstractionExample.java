abstract class Shape {
    abstract void draw();

}
  class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a Circle");
    }
}
    class Rectangle extends Shape{
        void draw(){
            System.out.println("Drawing a Rectangle");
        }
    }
    class Square extends Shape{
        void draw(){
            System.out.println("Drawing a Square");
        }
    }


public class AbstractionExample{
    public static void main(String[] args){
        Shape circle=new Circle();
        Shape rectangle=new Rectangle();
        Shape square=new Square();


        circle.draw();
        rectangle.draw();
        square.draw();
    }

    
}

















