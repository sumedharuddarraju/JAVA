//Hybrid Inheritance
class A
{
   public void disp()
   {
System.out.println("A");
   }
}

class B extends A
{
   public void disp()
   {
System.out.println("B");
   }
}

class C extends A
{
   public void disp()
   {
System.out.println("C");
   }

}

class Hybrid extends B
{
   public void disp()
   {
System.out.println("D");
   }
   public static void main(String args[]){

Hybrid obj = new Hybrid();
obj.disp();
   }
}