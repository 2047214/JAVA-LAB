import java.io.*;


public class Palindrome 
{
   public static void main(String args[])
   {

      String myString = "racecar";
      StringBuffer buffer = new StringBuffer(myString);
      buffer.reverse();
      String data = buffer.toString();
      if(myString.equals(data))
      {
         System.out.println("Given String is palindrome");
      }
      else
      {
         System.out.println("Given String is not palindrome");
      }
   }
}