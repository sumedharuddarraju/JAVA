import java.lang.String;
class Stringbuild
{
        public static void main(String args[])
        {
                /* StringBuilder append() method   */
               StringBuilder sb1=new StringBuilder("Hello");
               sb1.append("World");
               System.out.println(sb1);
               
                /* StringBuilder insert() method */
               StringBuilder sb2=new StringBuilder("Hello");
               sb2.insert(1,"Java");
               System.out.println(sb2);
               
               /*   StringBuilder replace() Method  */
               StringBuilder sb3=new StringBuilder("Hello");  
               sb3.replace(1,3,"Java");  
               System.out.println(sb3);
               
               /*  StringBuilder delete() Method  */
               StringBuilder sb4=new StringBuilder("Hello");  
               sb4.delete(1,3);  
               System.out.println(sb4);
               
               /*  StringBuilder reverse() Method  */
               StringBuilder sb5=new StringBuilder("Hello");  
               sb5.reverse();  
               System.out.println(sb5);
               
               /* StringBuilder capacity() Method */
               StringBuilder sb6=new StringBuilder();  
                System.out.println(sb6.capacity());//default 16  
                sb6.append("Hello");  
                System.out.println(sb6.capacity());//now 16  
                sb6.append("java is my favourite language");  
                System.out.println(sb6.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
               
                /*  StringBuilder ensureCapacity() method  */
                StringBuilder sb=new StringBuilder();  
                System.out.println(sb.capacity());//default 16  
                sb.append("Hello");  
                System.out.println(sb.capacity());//now 16  
                sb.append("java is my favourite language");  
                System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
                sb.ensureCapacity(10);//now no change  
                System.out.println(sb.capacity());//now 34  
                sb.ensureCapacity(50);//now (34*2)+2  
                System.out.println(sb.capacity());//now 70  
        }
       
}
