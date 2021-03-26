import java.util.Scanner;
import java.util.*;
import java.lang.StringBuffer;

    class BookDetails
{

    Scanner in = new Scanner(System.in);
    static int n=10;
    String[] Book_Name = new String[n];
    String[] Category = new String[n];
    int[] Year_of_Publishing= new int[n];
    static String ID;
    static
    {
        ID ="Book_ID";
    }
    public void setdata()
    {
      for(int i=0;i < n;i++)
       {
          System.out.println("\nEnter the name of the " + (i+1) +" BOOK :");
          Book_Name[i] = in.nextLine();
          System.out.println("Enter the Category of the " + (i+1) +" BOOK  :");
          Category[i] = in.nextLine();
          System.out.println("Enter the Publishing year of the " + (i+1) +" BOOK ");
          Year_of_Publishing[i] = in.nextLine();
          in.nextLine();
 
       }
    }


}

public class McaBookRepo {
public static void main(String[] args) 

{
    McaBookRepo ob = new McaBookRepo();
    String choice = null;
    Scanner input = new Scanner(System.in);
    System.out.println("");
    System.out.println("KINDLY SELECT ANY ONE OPTION FROM THE FOLLOWING:");
    System.out.println("");
    System.out.println("(1) ADD a Book ");
    System.out.println("(2) DISPLAY any Book ");
    System.out.println("(3) SEARCH for a Book ");
    System.out.println("(0) EXIT ");
    choice = input.nextLine();
  
    do
     {
     
        System.out.println("KINDLY SELECT ANY ONE OPTION FROM THE FOLLOWING :");
        System.out.println("");
        System.out.println("(1) ADD a Book ");
        System.out.println("(2) DISPLAY any Book ");
        System.out.println("(3) SEARCH for a Book ");
        System.out.println("(0) EXIT ");

        switch (choice) {

        case "1":
            System.out.println("ADD a Book ");
            ob.setdata();
            choice = input.nextLine();
            break;
        case "2":
            System.out.println("DISPLAY any Book");
            choice = input.nextLine();
            break;
        case "3":
            System.out.println("Search for a Book");
            choice = input.nextLine();
            break;
        }
    }
    while ( Integer.parseInt(choice) > 0);

    System.out.println("YOU ARE SUCCESSFULLY OUT! (EXIT)");
}
