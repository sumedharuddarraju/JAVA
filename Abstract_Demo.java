abstract class Shape
{
        abstract void draw();
}
class Rectangle extends Shape
{
        void draw()
        {
                System.out.println("Drawing rectangle");
        }
}
class Circle extends Shape
{
        void draw()
        {
                System.out.println("Drawing circle");
        }
}
class Abstract_Demo
{
        public static void main(String args[])
        {
                Shape rect =new Rectangle();
                rect.draw();
                Shape circ =new Circle();
                circ.draw();
        }
}