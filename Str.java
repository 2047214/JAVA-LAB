class Str
{
 public static void main( String args[] )
 {
  StringBuffer s = new StringBuffer("Coding Atharva");
     
  System.out.println("\n String = "+s); // Will Print the string
  
  System.out.println("\n Length = "+s.length() ); // total numbers of characters   
  System.out.println("\n Length = "+s.capacity() ); // total allocated capacity
  
  s.setLength(6); // Sets the length and destroy the remaining characters 
  System.out.println("\n After setting length String = "+s );
 
  s.setCharAt(0,'K'); // It will change character at specified position
  System.out.println("\n SetCharAt String = "+s );
   
  s.setCharAt(0,'C');
 
  int a = 007;
  s.append(a); // It concatenates the other data type value
  System.out.println("\n Appended String = "+s );
   
  s.insert(6," Atharva"); // used to insert one string or char or object
  System.out.println("\n Inserted String = "+s );
 
  s.reverse();  
  System.out.println("\n Reverse String = "+s );
 
  s.reverse();  
 
  s.delete(6,14); // used to delete sequence of character
  System.out.println("\n\n After deleting string="+s);
 }
}