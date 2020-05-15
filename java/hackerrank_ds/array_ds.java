import java.util.Scanner;

public class array_ds{

    static int[] reverseArray(int[] a){
        int[] arr =  new int[a.length];
        int j = 0;

        for(int i=a.length-1; i >= 0 ; i--){

            arr[j] = a[i];
            j++;

        }

        return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        String[] arrItems = scanner.nextLine().split(" ");
        int[] arr = new int[arrItems.length];

        for(int i = 0; i < arrItems.length; i++){
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }



        int[] res = reverseArray(arr);

        for(int i = 0; i<res.length; i++){
            System.out.print(res[i]);
        }


    }


}