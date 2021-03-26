package PACKAGE;

class MyException extends Exception {
    // store STUDENT MARK information
    private static int ID[] = { 101, 102, 103, 104, 105, 106, 107, 108, 109, 110 };

    private static String NAME[] = { "ANSHIKA", "HARSHA", "SUNIL", "VASANTHIKA", "BALU", "RENUKA", "MAHESH", "INDU",
            "MALAVIKA", "KANISHL" };

    private static int AGE[] = { 12, 16, 11, 12, 18, 13, 11, 10, 07, 15 };

    private static double MARKS[] = { 998.20, 876.03, 600.5, 999.00, 975.55, 843.01, 756.01, 799.00, 879.43, 999.10 };

    // default constructor
    MyException() {
    }

    // parametrized constructor
    MyException(String str) {
        super(str);
    }

    // write main()
    class MyException {

        public static void main(String[] args) {
            try {
                // display the heading for the table
                System.out.println("ID NUMBER" + "\t" + "STUDENT_NAME" + "\t" + "AGE" + "\t" + "MARKS");

                // display the actual account information
                for (int i = 0; i < 5; i++) {
                    System.out.println(ID[i] + "\t" + NAME[i] + "\t" + MARKS[i]);

                    // display own exception if MARKS < 700
                    if (MARKS[i] < 700) {
                        MyException me = new MyException(" AMRKS ARE LESS THAN 1000");
                        throw me;
                    }
                }
            } // end of try

            catch (MyException e) {
                e.printStackTrace();
            }
        }
    }
}