import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class javaRegex2 {
    
    public static void main(String[] args){
        String regex ="\b([A-Z]+)\s+\1\b";
        Pattern p = Pattern.compile(regex);
        System.out.println("before");

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        System.out.println("before");

        while(numSentences-- > 0){

            System.out.println("after 1");
            String input = in.nextLine();
            Matcher m = p.matcher(input);

            System.out.println("after 2");
            while(m.find()){
            //    input = input.replace();
                System.out.println(m);
            }
        }

    }


}