
import java.util.*;
import java.lang.StringBuffer;
class StudentDetails
{
     Scanner in = new Scanner(System.in);
     static int n=2;
     String[] name = new String[n];
     String[] address = new String[n];
     String[] gender = new String[n];
     int[] roll_no= new int[n];
     static String comment;
     static
     {
         comment="Special offers are available";
     }
     public void setdata()
      {
        for(int i=0;i < n;i++)
         {
            System.out.println("\nEnter the name of the " + (i+1) +" student:");
            name[i] = in.nextLine();
            System.out.println("Enter the address of the " + (i+1) +" student:");
            address[i] = in.nextLine();
            System.out.println("Enter the gender of the " + (i+1) +" student:");
            gender[i] = in.nextLine();
            System.out.println("Enter the roll_no of the " + (i+1) + " student:");
            roll_no[i]=in.nextInt();
			in.nextLine();
   
         }
      }
	  static int login(String usnm,String pwd)
   {
      String user="admin";
      String passw="admin321";
      if(usnm.equals(user) && pwd.equals(passw))
      {
         return 1;
      }
      else
      {
         return 0;
      }
    }  
}

      
class Studentvalues
{
  public static void main(String args[])
    {
          int ch;
          StudentDetails ob = new StudentDetails();
          Scanner in = new Scanner(System.in);
          StringBuffer str = new StringBuffer("Welcome to ");
          str.append("Wisdom School");
          System.out.println(str);
          System.out.println("Please enter username:");
          String name = in.nextLine();//Keyboard input name
          System.out.println("Please enter the password:");
          String pwd = in.next();
          int check=ob.login(name,pwd);
          if(check==1)
          {
             System.out.println("Successfully logged in");
            while(true)
            {
              System.out.println("\nMENU");
              System.out.println("1.Enter the data\n2.Exit"); 
              System.out.println("Enter your choice");
              ch = in.nextInt();
              switch(ch)
               {
                  case 1: ob.setdata();
                              break;
                   case 2: System.exit(0);
               }
             }
          }
          else
          {
              System.out.println("Login failed");
          }
 }
}