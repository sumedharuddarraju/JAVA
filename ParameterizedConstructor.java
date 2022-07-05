import java.io.*;
class ParameterizedConstructor
{
        int a,b;
        ParameterizedConstructor(int x,int y)
        {
                a=x;
                b=y;
        }
        void show()
        {
                System.out.println("a = "+a+" b = "+b);
        }
        public static void main(String args[])
        {
               ParameterizedConstructor p = new ParameterizedConstructor(10,20);
               p.show();
        }
}
