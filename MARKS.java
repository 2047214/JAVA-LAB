import java.lang.*;
import java.util.*;  
import java.util.Scanner;


public class MARKS
{
String NAME;
int REG_NUMBER;
 static int MATHS;                              //STATIC VARIABLE
 static int SCIENCE;
static int SOCIAL;
static  int HINDI;
static int ENGLISH;
 static {                                                                  //STATIC BLOCK
    int MATHS;
    int SCIENCE;
int SOCIAL;
int HINDI;
int ENGLISH;
 }
static void m1()                                         // STATIC METHOD
    { 
        System.out.println("              HALTON WALDROF SCHOOL          "); 
    } 
 public static void main(String args[]) 
{
m1(); 
float percentage, average;
System.out.println(" ");
System.out.println("  STUDENT TOTAL MARKS   ");
System.out.println(" ");
Scanner sc= new Scanner(System.in); 
System.out.println(" Enter the STUDENT ID (STU_ID) :" );
int STU_ID= sc.nextInt();
System.out.println(" ");
System.out.println(" Enter the Name of the student:" );
String NAME= sc.nextInt();
System.out.println(" Enter the Register Number of the student:" );
int REG_NUMBER=sc.nextInt();
System.out.println(" ");
  System.out.println(" Enter Marks obtained in MATHS :" );
int MATHS= sc.nextInt();
  System.out.println("Enter Marks obtained in SCIENCE :" );
int SCIENCE= sc.nextInt();
 System.out.println("Enter Marks obtained in SOCIAL :" );
int SOCIAL= sc.nextInt();
System.out.println("Enter Marks obtained in HINDI : " );
int HINDI= sc.nextInt();
System.out.println("Enter Marks obtained in ENGLISH :" );
int ENGLISH= sc.nextInt();

System.out.println(" ");

  System.out.println("Marks in MATHS = " + MATHS);
  System.out.println("Marks in  of SCIENCE = " + SCIENCE);
System.out.println("Marks in  of SOCIAL = " + SOCIAL);
System.out.println("Marks in  of HINDI= " + HINDI);
System.out.println("Marks in  of  ENGLISH = " + ENGLISH);
System.out.println(" ");

int Total=MATHS+SCIENCE+SOCIAL+HINDI+ENGLISH;  
average = MATHS+SCIENCE+SOCIAL+HINDI+ENGLISH/ 500;
System.out.println("Average Marks : " + average);
System.out.println("Total Marks obtained= " +Total);  
System.out.println(" ");

            
 	}
}