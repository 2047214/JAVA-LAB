import java.util.*;
public class Method{
String name;
String gender;
char Ans;
public  Method()
{
name="Yashi";
}
public Method(String g,char A)
{

gender=g;
Ans=A;
}

static void myFirst(){
System.out.println("Enter Your age ");
}
static int myFirst(int age){
return age;
}
public static void main(String args[])
{
Method myobj=new Method();
System.out.println("Name is :"+myobj.name);
Method myob1=new Method("female",'Y');

System.out.println("Gender is:"+myob1.gender);
System.out.println("Do You Want to keep continuing:"+myob1.Ans);



myFirst();
int age=myFirst(22);
System.out.println("Age:" +age);
}
}
