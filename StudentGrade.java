import java.util.Scanner;
 
public class StudentGrade {
    public static void main(String[] args) {

int[] about = {4, 565, 8790};

  System.out.println("HALTON WALDROF SCHOOL");
   System.out.println("NUMBER OF BRANCHES: " + about[0]);
   System.out.println("TEACHING AND NON-TEACHING STAFFS: " + about[1]);
   System.out.println("TOTAL NUMBER OF STUDENTS: " + about[2]);
 

        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);

System.out.println("MARK REPORT"); 

        System.out.println("ENTER NUMBER OF SUBJECTS :");
        count = scanner.nextInt();
 
        System.out.println("ENTER MARKS OF" + count + " SUBJECT");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
        System.out.println("TOTAL MARKS : " + totalMarks);
        
average = totalMarks / count;
       
        percentage = (totalMarks / (count * 100)) * 100;

System.out.println("Average Marks : " + average);
        System.out.println("Percentage : " + percentage);
 
        switch ((int) percentage / 10) {
        case 9:
            System.out.println("Grade : A+");
            break;
        case 8:
        case 7:
            System.out.println("Grade : B");
            break;
        case 6:
            System.out.println("Grade : C");
            break;
        case 5:
            System.out.println("Grade : D");
            break;
        default:
            System.out.println("Grade : FAIL");
            break;
        }
    }
}