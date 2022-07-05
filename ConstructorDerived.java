import java.io.*;
class Base
{
        Base()
        {
                System.out.println("BASE CONSTRUCTOR");
        }
}
class Derived extends Base
{
        Derived()
        {
                System.out.println("DERIVED CONSTRUCTOR");
        }
}
class ConstructorDerived
{
        public static void main(String args[])
                {
                Derived obj=new Derived();
        }
}