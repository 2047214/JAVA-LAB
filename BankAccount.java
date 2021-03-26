import java.io.*;
// importing the 3 packages created to this program
import pack1.BankAccount.*;
import pack2.SavingBankAccount.*;
import pack3.CurrentBankAccount.*;
public class ATMpgm
{
public static void main(String args[]) throws IOException
{
int c1,c2;
char ch1,ch2;
BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println(&quot;********************WELCOME****************************&quot;);
System.out.println(&quot;***********AUTOMATED TELLER MACHINE********************&quot;);

System.out.println(&quot;********************************************************&quot;);
System.out.println(&quot; Program to deposit and withdraw money from an ATM Machine &quot;);
System.out.println(&quot;*****************************************************&quot;);

System.out.println(&quot; &quot;);
System.out.println(&quot; &quot;);
System.out.println(&quot; Enter account details: &quot;);
pack1.BankAccount ba = new pack1.BankAccount();
ba.getdata();
System.out.println(&quot; Choose your account type: &quot;);
System.out.println(&quot; 1. Savings Account &quot;);
System.out.println(&quot; 2. Current Account &quot;);
System.out.println(&quot; Enter your choice: &quot;);
c1 = Integer.parseInt(b.readLine());
switch(c1)
{
case 1: pack2.SavingBankAccount s = new pack2.SavingBankAccount();

do
{
System.out.println(&quot; What do you want to do? &quot;);
System.out.println(&quot; 1. Deposit &quot;);
System.out.println(&quot; 2. Withdraw &quot;);
System.out.println(&quot; 3.Calculate Interest &quot;);
System.out.println(&quot; Enter your choice: &quot;);
c2 = Integer.parseInt(b.readLine());

switch(c2)
{

case 1: s.deposit();
break;
case 2: s.withdraw();
break;
case 3: s.calcInterest();
break;

default: System.out.println(&quot;Invalid choice&quot;);
}
System.out.println(&quot;Do you wish to continue? &quot;);

ch1 = (char)b.readLine().charAt(0);
}while(ch1 == &#39;y&#39;);

break;

case 2: pack3.CurrentBankAccount c = new pack3.CurrentBankAccount();
do{System.out.println(&quot; What do you want to do? &quot;);
System.out.println(&quot; 1. Deposit &quot;);
System.out.println(&quot; 2. Withdraw &quot;);
System.out.println(&quot; 3.Calculate Interest &quot;);
System.out.println(&quot; Enter your choice: &quot;);
c2 = Integer.parseInt(b.readLine());

switch(c2)
{

case 1: c.deposit();
break;
case 2: c.withdraw();
break;
case 3: c.calcInterest();
break;

default: System.out.println(&quot;Invalid choice&quot;);
}
System.out.println(&quot;Do you wish to continue? &quot;);

ch1 = (char)b.readLine().charAt(0);;
}while(ch1 == &#39;y&#39;);

break;
default: System.out.println(&quot;Invalid choice&quot;);
break;

}
System.out.println(&quot;Do you wish to continue for another account? &quot;);

ch2 = (char)b.readLine().charAt(0);

}while(ch2 == &#39;y&#39;);
}
}