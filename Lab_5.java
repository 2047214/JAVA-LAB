import java.io.*;


public class Lab_5
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("\n\tTiffin Booking System "+args[0]);
		Users[] U=new Users[100];
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		int i=0,choice;
		String Name;
		String Gender="";
		String Emailid="";
		String Phone="";
		String Address;
		boolean Valid=true;
		while(i>=0)
		{
			System.out.print("\n 1. Input User Details.\n 2. Display All User Details\n 3. Search User\n 4. Exit\n\n Enter your choice : ");
			choice=Integer.parseInt(in.readLine());
			switch(choice)
			{
				case 1:
						U[i]=new Users();
						
						System.out.print("\n Enter Name : ");
						Name=in.readLine();
						while(Valid)
						{
							System.out.print("\n Enter Gender : ");
							Gender=in.readLine();
							StringBuffer gender=new StringBuffer(Gender);
							if("M".equalsIgnoreCase(gender.toString()))        //String Functions
							{
								gender.append("ale");						   //Buffer Functions
								Valid=false;
							}
							else if("F".equalsIgnoreCase(gender.toString()))
							{
								gender.toString().concat("emale");			   //String Functions
								Valid=false;
							}
							else
							{
								System.out.print("\n Invalid Gender.");
							}
							Gender=gender.toString();
						}
						Valid=true;
						while(Valid)
						{
							System.out.print("\n Enter EmailID : ");
							Emailid=in.readLine();
							StringBuffer emailid=new StringBuffer(Emailid);
							if(Emailid.length()<256)							//Buffer Functions				
							{
								Valid=false;
							}
							Emailid.toString().toLowerCase();                              //Buffer Functions
						}
						Valid=true;
						while(Valid)
						{
							System.out.print("\n Enter Phone : ");
							Phone=in.readLine();
							if(Phone.length()==10)
							{
								Valid=false;
							}
							else
							{
								System.out.print("\n Invalid Input.");
							}
						}
						System.out.print("\n Enter Address : ");
						Address=in.readLine();
						U[i].setDetails(i,Name,Gender,Emailid,Phone,Address);
						System.out.print("\n\n Details Inserted Successfully..\n\n---------------------------------------------------");
						U[i].Usercount();
						System.out.print("\n---------------------------------------------------");
						i++;
						break;
				case 2:
						if(i==0)
						{
							System.out.print("\n\n!!! No data Present..\n");
						}
						else
						{
							for(int j=0;j<i;j++)
							{
								U[j].getDetails();
							}
						}
						break;
				case 3:
						int cnt=0;
						System.out.print("\n Enter ID to be searched : ");
						int sid=Integer.parseInt(in.readLine());
						for(int j=0;j<i;j++)
						{
							if(U[j].getDetails(sid))
							{
								cnt++;
							}
						}
						if(cnt==0)
						{
							System.out.print("\n !!! ID NOT PRESENT...\n\n-------------------------------------------------------");
						}
						break;
				case 4: 
						System.exit(0);
			}
		}
	
	}
	
	
}
class Users
{
	int ID;
	private String Name;
	private String Gender;
	private String Emailid;
	private String Phone;
	private String Address;
	private static int totalusers;
	static
	{
		totalusers=0;
		System.out.print("\n Static Block Called.\n--------------------------------\n\n");
	}
	public Users()
	{
		this.Name="";
		this.Gender="";
		this.Emailid="";
		this.Phone="";
		this.Address="";
	}
	public Users(int ID,String Name,String Gender,String Emailid,String Phone,String Address)
	{
		this.ID=ID;
		this.Name=Name;
		this.Gender=Gender;
		this.Emailid=Emailid;
		this.Phone=Phone;
		this.Address=Address;
	}
	public static void Usercount()
	{
		totalusers++;
		System.out.println("\n\n Total Users Registered In This System Are Now " + totalusers);
	}
	public void setDetails(int ID,String Name,String Gender,String Emailid,String Phone,String Address)
	{
		this.ID=ID;
		this.Name=Name;
		this.Gender=Gender;
		this.Emailid=Emailid;
		this.Phone=Phone;
		this.Address=Address;
	}
	public void getDetails()
	{
		System.out.print("\n\tID : " + this.ID + "\n\tName : " + this.Name + "\n\tGender : " + this.Gender + "\n\tEmail ID : " + this.Emailid+ "\n\tPhone : " + this.Phone + "\n\tAddress : " + this.Address + "\n\n-------------------------------------------------------\n\n");
	}
	public boolean getDetails(int ID)
	{
		if(this.ID==ID)
		{
			System.out.print("\n\tName : " + this.Name + "\n\tGender : " + this.Gender + "\n\tEmail ID : " + this.Emailid+ "\n\tPhone : " + this.Phone + "\n\tAddress : " + this.Address + "\n\n-------------------------------------------------------\n\n");
			return true;
		}
		return false;
	}
}







