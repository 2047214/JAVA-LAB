import java.io.*;
public class StringFunctions
{
	public static void main(String[] args)throws IOException
	{
		String str1="Hello Raj";
		String str2="Hello Deep";
		String str3="Hello Yash";
		String str4="Hello Rahul";
		System.out.print("\n Charecter at position 3 : " + str1.charAt(3));
		if(str1.compareTo(str2)==0)
		{
			System.out.print("\n\n String 1 = " + str1 + " is equal to String 2 = " + str2);
		}
		else
		{
			System.out.print("\n\n String 1 = " + str1 + " is not equal to String 2 = " + str2);
		}
		System.out.print("\n\n After merging String 1 and String 2 : " + str1.concat(str2));
		if(str3.contains("Hello"))
		{
			System.out.print("\n\n String 3 = " + str3 + " contains Hello.");
		}
		else
		{
			System.out.print("\n\n String 3 = " + str3 + " doesn't contain Hello.");	
		}
		System.out.print("\n\n Length of String 4 = " + str4 + " is " + str4.length());
	}
}