//Multilevel inheritance
import java.io.*;

class Base
{
        int a;
        Base()
        {
                a=20;
        }
}

class Derived1 extends Base
{
        int b;
        Derived1()
        {
                b=10;
        }
     
}
class Derived2 extends Derived1
{
        int c;
        void show()
        {
                c=a*b;
                System.out.println("a * b  = "+c);
        }
}
class MultiLevel
{
        public static void main(String args[])
        {
                Derived2 d = new Derived2();
                d.show();
        }
             
}