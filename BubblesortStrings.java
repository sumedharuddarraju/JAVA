// Java Program to perform bubble sort on Strings

public class BubblesortStrings 
{
   public static void main(String []args) 
{
      String str[] = { "Sahasra", "Aditi", "Ram", "Teju", "Aashrita"};
      String temp;
      System.out.println("Sorted string...");
      for (int i = 0; i < str.length; i++) {
         for (int j = i + 1; j < str.length; j++) {
            
            if (str[i].compareTo(str[j]) > 0) {
               temp = str[j];
               str[j] = str[i];
               str[i] = temp;
            }
         }
         System.out.println(str[i]);
      }
   }
}
