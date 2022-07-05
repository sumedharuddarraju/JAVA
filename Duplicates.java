public class Duplicates
 {  
     public static void main(String[] args) {  
        String str = "Great responsibility";  
        int count;  
        char arr[] = str.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");    
        for(int i = 0; i <arr.length; i++)
	 {  
         	   count = 0;  
            	  for(int j = i+1; j <arr.length; j++) 
		{  
                 		  if(arr[i] == arr[j] && arr[i] != ' ') 
		 	{  
                  		  count++;  
                    		//Set arr[j] to 0 to avoid printing visited character  
                    		arr[j] = '0';  
                		  }  
                     }  
            	if(count > 0 && arr[i] != '0')  
                 System.out.println(arr[i]);  
        }  
    }  
}  