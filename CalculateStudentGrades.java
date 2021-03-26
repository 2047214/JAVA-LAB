import java.util.Scanner;

public class CalculateStudentGrades {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter average of your marks (less than 100)::");
      int average = sc.nextInt();
      char grade;

      if(average>=80){
         grade = 'A';
      }else if(average>=60 && average<80){
         grade = 'B';
      }
      else if(average>=40 && average<60){
         grade = 'C';
      }
      else {
         grade = 'D';
      }

      switch(grade) {
         case 'A' :
            System.out.println("EXCELLENT!");
            break;
         case 'B' :
         case 'C' :
            System.out.println("WELL DONE!");
            break;
         case 'D' :
            System.out.println("YOU HAVE PASSED, GOOD!");
         case 'F' :
            System.out.println("TRY AGAIN!");
            break;
         default :
         System.out.println("INVALID GRADE");
      }
      System.out.println("YOUR GRADE IS " + grade);
   }
}