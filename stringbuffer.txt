import java.io.*;

public class StringBuffer {
    public static void print(Object o){
        System.out.println(o);
    }
    public static void main(String[] args) throws Exception{
        
        while(true){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            print("Enter String : ");
            String s1 = br.readLine();
            StringBuffer sb = new StringBuffer(s1);
            print("1.Append 2.Insert 3.Replace 4.Reverse 5.length ");
            int choice = Integer.parseInt(br.readLine());
            if(choice ==1){
                
                sb.append("hello");
                print("String after appending with hello. ");
                print(sb);
            }
            else if(choice==2){
                print("Enter string to insert at location 1 ");
                sb.insert(1,br.readLine());
                print(sb);

            }
            else if(choice==3){
                print("enter string to replace from 1 to 3");
                sb.replace(1,3,br.readLine());
                print(sb);
            }
            else if(choice ==4 ){
                print(sb.reverse());
            }
            else if(choice ==5){
                print(sb.length());
            }
                       
        }
    }
    
}
