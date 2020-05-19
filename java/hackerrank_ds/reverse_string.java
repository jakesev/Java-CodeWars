import java.util.Scanner;

public class reverse_string {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String temp = "";

        for(int i = A.length()-1; i>=0; i--){
            temp += A.charAt(i);
            System.out.println(temp);
        }

        if(A.contains(temp)) System.out.println("Yes");
         else System.out.println("No");
        

         //This is a simpler whay
         System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );
    }

}