import java.util.Scanner;

class Palindrome{
  
    public static void main(String args[])
   {
      String str;// rev = "";
     Scanner input = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      str = input.nextLine();
 
      String pal= reverseString(str);
      System.out.println(pal);
         input.close();
         Palindrome obj = new Palindrome();
         obj.exemple();

   } 

   
   public static String reverseString(String str ){
    String  rev = "";
    int length = str.length();
 
    for ( int i = length - 1; i >= 0; i-- )
       rev = rev + str.charAt(i);
//System.out.println(rev);   
    if (str.equals(rev))
       return (str+" is a palindrome");
    else
       return(str+" is not a palindrome");

   }
   public void exemple(){
      System.out.println( " Just a message");

   }
}