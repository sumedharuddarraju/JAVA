import java.io.*; 
import java.io.IOException; 
import java.io.InputStreamReader; 
public class BufferMain {
    public static void main(String[] args) throws IOException {
          
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
FileWriter fw=new FileWriter("Test.txt");    
          
        System.out.println("Enter the product name");
        String name = reader.readLine(); 
fw.write(name); 
   System.out.println("Enter the product price");
        String price = reader.readLine(); 
 fw.write(price);    
           fw.close();    
        System.out.println("You entered product name: " + name); 
System.out.println("You entered product price: " + price);         
    } 
}