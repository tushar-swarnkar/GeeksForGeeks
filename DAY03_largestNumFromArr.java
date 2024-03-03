import java.util.Arrays;
import java.util.Comparator;

public class DAY03_largestNumFromArr {
    public static void main(String[] args) {
        int n = 5;
        String arr[] =  {"3", "30", "34", "5", "9"};

        System.out.println(printLargest(n, arr));
    }
    static String printLargest(int n, String[] arr) {
        // code here
        Arrays.sort(arr,new Comparator<String>(){
           @Override 
           public int compare(String x, String y){
               String xy = x+y;
               String yx = y+x;
               return yx.compareTo(xy);
           }
       });
       String ans = "";
       for(int i=0; i<arr.length; i++)
           ans += arr[i];
       return ans;
    }
}
