public class StudentFile
{
    String name;
    int rollNo;
    String className;
    boolean isFromCity;
    
    StudentFile(String name, int rollNo)
    {
        this.name = name;
        this. rollNo = rollNo;
    }
    
    StudentFile(String name, int rollNo, String className, boolean isFromCity)
    {
        this.name = name;
        this. rollNo = rollNo;
        this.className = className;
        this.isFromCity = isFromCity;        
    }
    
    public void studentData()
    {
        System.out.println("Name of Student = " + name);
        System.out.println("Roll no = "+ rollNo);
        System.out.println("Class Name = "+ className);
        System.out.println("Is student belongs to city = "+ isFromCity);
    }
    
    public static void main (String arg[])
    {
       // Creating object and providing some values by using parameterized constructor
        
        StudentFile student1 = new StudentFile("Ravi", 1);
        student1.studentData();
        
        StudentFile student2 = new StudentFile("Ram", 2, "MCA", true);
        student2.studentData();
        
    }    
}