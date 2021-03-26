interface BANK {
    void CreateAccount();

    void Deposit();

    void Withdraw();

    void GetBalance();

    float SetMonthlyInterest();

    Scanner Bn = new Scanner(System.in);
}

class SBI implements Bank {
    private int BankID;
    private String Branch, Location, IFSC;

    public float SetMonthlyInterest() {
        return (12.3f);
    }
}

class AXIS implements Bank {
    private int BankID;
    private String Branch, Location, IFSC;

    public float SetMonthlyInterest() {
        return (15.6f);
    }

}

public CreateAccount()
{
    System.out.println("ENTER THE ACCOUNT/BANK ID? : ");
    BankID=Bn.next();
    System.out.println("ENTER THE BRANCH NAME? : ");
    BranchName=Bn.next();
    System.out.println("ENTER THE LOCATION? : ");
    Location=Bn.next();
    System.out.println("ENTER THE IFSC CODE? : ");
    IFSC=Bn.next();  
}