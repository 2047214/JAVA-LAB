import java.io.*;

class Customer {
    String id;
    int charge1, charge2, charge3;
    int bill;

    // static variable
    static String HotelName;
    static String ThankYouNote;

    // Static Block
    static {
        System.out.println("Static block initialized");
        ThankYouNote = " **** *** Thank you for your stay at ";

    }

    public void SetCustomer(String id, int charge1, int charge2, int charge3) {
        this.id = id;
        this.charge1 = charge1;
        this.charge2 = charge2;
        this.charge3 = charge3;
        SetBill(this.charge1, this.charge2, this.charge3);

    }

    public void SetBill(int charge1, int charge2, int charge3) {
        this.bill = charge1 + charge2 + charge3;
    }

    // static method
    static void HotelName(String name) {
        HotelName = name;
    }

    // instance method
    void GetCustomerInfo() {
        System.out.println("\n" + ThankYouNote + HotelName + " *** ****"); // accessing static variable
        System.out.println("\t\tCustomer ID : " + this.id);
        System.out.println("\t\tCustomer's Bill : " + this.bill + "\n\n");
    }
}

// Driver class
public class program4 {
    public static void main(String[] args) throws IOException {
        // calling static method
        // without instantiating Customer class
        Customer.HotelName("TAJ HOTEL");
        int i = 0;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        Customer[] U = new Customer[100];
        while (i >= 0) {
            System.out.print(
                    "\n\n\t1 -> Input Customer Details.\n\t2 -> Display Customer Details\n\t3 -> Exit\n\n\t Enter your choice : ");
            int choice = Integer.parseInt(in.readLine());
            switch (choice) {
                case 1:
                    U[i] = new Customer();
                    System.out.print("\tEnter the Customer's ID : ");
                    String id = in.readLine();
                    System.out.print("\tEnter Room Charger: ");
                    int amt1 = Integer.parseInt(in.readLine());
                    System.out.print("\tEnter Food Charger: ");
                    int amt2 = Integer.parseInt(in.readLine());
                    System.out.print("\tEnter Misc Charger: ");
                    int amt3 = Integer.parseInt(in.readLine());
                    U[i].SetCustomer(id, amt1, amt2, amt3);
                    System.out.print("\t ! Details Inserted Successfully !");
                    i++;
                    break;
                case 2:
                    if (i == 0) {
                        System.out.print("\n\n!!! No data Present..\n");
                    } else {
                        for (int j = 0; j < i; j++) {
                            U[j].GetCustomerInfo();
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
            }
        }

    }
}