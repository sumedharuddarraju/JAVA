/* Single level inheritance */
import java.io.*;
class Base
{
        int a;
        Base()
        {
                a=20;
        }
}

class Derived extends Base
{
        void show()
        {
        System.out.println("a = "+a);
        }
}
class SingleLevel
{
        public static void main(String args[])
        {
                Derived d = new Derived();
                d.show();
        }
}