import java.io.*;
class 	ConstructorOverloading
{
        int x,y,z;
        ConstructorOverloading(int a, int b)
        {
                x=a;
                y=b;
                System.out.println("x = "+x+"   y = "+y);
        }
        ConstructorOverloading(int a, int b,int c)
        {
                x=a;
                y=b;
                z=c;
               System.out.println("x = "+x+"   y = "+y+"  z = "+z);
        }
        public static void main(String args[])
        {
                ConstructorOverloading obj1 = new ConstructorOverloading(10,20);
                ConstructorOverloading obj2 = new ConstructorOverloading(70,80,30);
        }
}
