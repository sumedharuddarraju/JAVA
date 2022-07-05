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
                System.out.println("Class child-1");
        }
}
class Runtime3 extends Runtime2
{
        void m1()
        {
                System.out.println("Class child-2");
        }
}
class Runtime_Multilevel
{
        public static void main(String args[])
        {
                Runtime1 obj1=new Runtime2();
                Runtime2 obj2=new Runtime3();
                obj1.m1();
                obj2.m1();
        }
}