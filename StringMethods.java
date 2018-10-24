package introduction;

import javax.naming.CommunicationException;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "This is the test string";
   String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Welcome";
	String str4 = "" ;
	String str5 =     "         spaces all around";
	String str7 = "bye";
	
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.concat("This is the original string"));
        System.out.println(str.contains("is"));
        System.out.println(str.startsWith("This"));
        System.out.println(str.endsWith("test"));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str.indexOf("h"));
        System.out.println(str4.isEmpty());
     
     
        
      
        
        
        
      
      System.out.println(str5.trim());
        System.out.println(str7.replace("e", "a"));
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 10));
        
        char[] charArray = str.toCharArray();
        for(int i=0; i<charArray.length; i++)
        {
        System.out.println(charArray[i]);
        }
       
        
}
	

}
