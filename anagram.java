public class anagram {
    
  public static void main(String[] args) {
    
} 
public static boolean isAnagram(String str1, String str2)   
{  
   
if (str1.length() != str2.length())   
{  
  
return false;  
}  

char[] chars = str1.toCharArray();  
 
for (char c : chars)   
{  
     
int index = str2.indexOf(c);  
if (index != -1)   
{  
 
str2 = str2.substring(0, index) + str2.substring(index + 1, str2.length());  
}   
else   
{  
return false;  
}  
}  
return str2.isEmpty();
} 
    
}

