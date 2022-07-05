import java.lang.String;
class Stringbuf
{
        public static void main(String args[])
        {
                /* StringBuffer append() method   */
               StringBuffer sb1=new StringBuffer("Hello");
               sb1.append("World");
               System.out.println(sb1);
               
                /* StringBuffer insert() method */
               StringBuffer sb2=new StringBuffer("Hello");
               sb2.insert(1,"Java");
               System.out.println(sb2);
               
               /*   StringBuffer replace() Method  */
               StringBuffer sb3=new StringBuffer("Hello");  
               sb3.replace(1,3,"Java");  
               System.out.println(sb3);
               
               /*  StringBuffer delete() Method  */
               StringBuffer sb4=new StringBuffer("Hello");  
               sb4.delete(1,3);  
               System.out.println(sb4);
               
               /*  StringBuffer reverse() Method  */
               StringBuffer sb5=new StringBuffer("Hello");  
               sb5.reverse();  
               System.out.println(sb5);
               
               /* StringBuffer capacity() Method */
               StringBuffer sb6=new StringBuffer();  
                System.out.println(sb6.capacity());//default 16  
                sb6.append("Hello");  
                System.out.println(sb6.capacity());//now 16  
                sb6.append("java is my favourite language");  
                System.out.println(sb6.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
               
                /*  StringBuffer ensureCapacity() method  */
                StringBuffer sb=new StringBuffer();  
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