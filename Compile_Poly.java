import java.io.*;
class Sample
{
        static int Multiply(int a,int b)
        {
                return a*b;
        }
        static double Multiply(double a,double b)
        {
                return a*b;
        }      
}
class Compile_Poly
{
        public static void main(String args[])
        {
                System.out.println(Sample.Multiply(10,20));
                System.out.println(Sample.Multiply(2,3.3));
        }
}