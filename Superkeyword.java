//super keyword

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
        int a,b,c;
       public Derived(int x,int y,int z)
        {
        super();
                a=x;
                b=y;
                c=z;
                System.out.println("DERIVED CONSTRUCTOR");
               
        }
}
class Superkeyword
{
        public static void main(String args[])
                {
                Derived obj=new Derived(10,20,30);
        }
}