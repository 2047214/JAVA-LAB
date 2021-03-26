import java.io.*;
class EgReadWrite2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER ANY NUMBER:");
int num=Integer.parseInt(br.readLine());
System.out.println("ENTER ANY STRING:");
String name=br.readLine();
System.out.println("THE ENTERED NUMBER IS: "+num+" and the string is" +name);
}
}
