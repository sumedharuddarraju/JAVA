import java.io.*;
class Runtime1
{
        void m1()
        {
                System.out.println("Class Parent");            
        }
}
class Runtime2 extends Runtime1
{
        void m1()
        {
                System.out.println("Class child");
        }
}
class Runtime
{
        public static void main(String args[])
        {
                Runtime1 obj=new Runtime2();
                obj.m1();
        }
}
