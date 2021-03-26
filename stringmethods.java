import java.io.BufferedReader;

import java.io.*; 




public class stringmethods {
    public static void print(Object o){
        System.out.println(o);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("STRING METHODS\n");
        while(true){
        System.out.println("1. length");
System.out.println("2. Concant ");
System.out.println("3. Contains");
System.out.println("4. Lowercase and Uppercase ");

        int choice = Integer.parseInt(br.readLine());
        switch(choice){
            case 1:
                print("Enter String : ");
                String s = br.readLine();
                print(s.length());
                break;
            case 2:
                System.out.println("Enter String 1 : ");
                String s1 = br.readLine();
                System.out.println("Enter string 2 : ");
                String s2 = br.readLine();
                System.out.println(s1.concat(s2));
                break;
            case 3: 
                print("Enter parent string: ");
                String s3 = br.readLine();
                print("Enter child string : ");
                String s4 = br.readLine();
                if(s3.contains(s4)){
                    print("True!");

                }
                else{
                    print("False");
                }
                break;
            case 4:
                print("Enter String : ");
                String s5 = br.readLine();
                print("Lower case : " + s5.toLowerCase());
                print("Upper case : " + s5.toUpperCase());
                break;
                

        }
        }
        
    }
}
