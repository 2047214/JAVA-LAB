import java.io.*;
class Student1{
int i,age;
String name;
Student(String nam,int old)
{name=nam; age=old;}
public void showOutput(){
System.out.println(" *******Student Details*********\n\n");
System.out.println("Name:"+ name  +"  "+ "Age:"+ age);
System.out.println("*******************************");

}
}

class DemoAoO{
public static void main(String args[]) throws IOException{
int i,age=1;
String name="";
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

Student obj[]=new Student[3];
for(i=0;i<3;i++){
obj[i]=new Student(name,age);
System.out.println(" Enter the name of Student "+i+1);
name=br.readLine();
System.out.println(" Enter the age of Student  " +i+1);
age=Integer.parseInt(br.readLine());
}
for(i=0;i<3;i++)
{obj[i].showOutput();} 

}}