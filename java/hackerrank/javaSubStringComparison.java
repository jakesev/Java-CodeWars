
public class javaSubStringComparison {
    
    public static void main(String[] args){
        String s = "welcometojava";
        String result ="";
        result = getSmallestAndLargest(s,3);

        System.out.println(result);
    
    }
    
    public static String getSmallestAndLargest(String s, int k){
        String smallest = s.substring(0,k);
        String largest = s.substring(0, k);

        for(int i = 0; i <= s.length()-k; i++){
            String tempWord = s.substring(i, k+i);
  
            if(smallest.compareTo(tempWord) > 0 ){
                smallest = tempWord;
            } 
            if(largest.compareTo(tempWord) < 0){
                largest = tempWord;
            }
        }
        
        return smallest +"\n" + largest;
    }
}