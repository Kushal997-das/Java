import java.util.*;
public class JavaInttoString {
    public static void main(String[] args) {
       //Write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Integer Value");
        int num=sc.nextInt();
       String s =Integer.toString(num);
        System.out.println("Output is "+s);
    }
}
