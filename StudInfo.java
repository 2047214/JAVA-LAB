import java.util.Scanner;

public class StudInfo
{
int regno;
String name,course;
int eng,tam,mat,tot;
double avg;
//*
void getdata()
{
Scanner ip=new Scanner(System.in);
System.out.print("\n\n Enter Roll No.\t:\t");
regno=ip.nextInt();
System.out.print("\n Enter Name   \t:\t");
name=ip.next();
System.out.println();
System.out.print(" Enter Marks [English, Tamil and Maths Marks out of 100] : ");
eng=ip.nextInt();
tam=ip.nextInt();
mat=ip.nextInt();
}

void display()
{
tot=eng+tam+mat;
avg=tot/3;
System.out.println("\n"+"\n Roll No.\t:\t"+regno+
    "\n Name   \t:\t"+name+
    "\n English\t:\t"+eng+
    "\n Tamil   \t:\t"+tam+
    "\n Maths   \t:\t"+mat+
    "\n Total   \t:\t"+tot+
    "\n Average\t:\t"+avg);


System.out.print(" Grade   \t:\t");
if((eng>=50)&&(tam>=50)&&(mat>=50))
{
if(avg>=91) System.out.print("O");
else if(avg>=81) System.out.print("A");
else if(avg>=71) System.out.print("B");
else if (avg>=61) System.out.print("C");
else if(avg>=51) System.out.print("D");
else System.out.print("Fail");
}
else System.out.print("Fail");
System.out.println();
}
public static void main(String[] args) {
    int maxs, nos;
    Scanner ip1 = new Scanner(System.in);
    System.out.print("\nEnter No. of Students : ");
    nos = ip1.nextInt();
    StudInfo[] studInfos = new StudInfo[nos];
    for (maxs = 0; maxs < nos; maxs++) {
        System.out.println("\nWelcome to Student database");
        System.out.print("\n Enter Student [ " + (maxs + 1) + " ] details");
        studInfos[maxs] = new StudInfo();
        studInfos[maxs].getdata();
    }
    for (StudInfo s : studInfos) {
        s.display();
    }
}
}