public class VowelConsonantCount
 {  
    public static void main(String[] args)
 {  
        int vowel_count= 0, consonant_count = 0;   
        String str = "Apple is a healthy fruit";
        str = str.toLowerCase();  
          
        for(int i = 0; i < str.length(); i++) 
	{  
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
	   { 
                vowel_count++;  
            }  
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') 
	    {    
                consonant_count++;  
            }  
        }  
        System.out.println("Number of vowels: " + vowel_count);  
        System.out.println("Number of consonants: " + consonant_count);  
    }  
}  