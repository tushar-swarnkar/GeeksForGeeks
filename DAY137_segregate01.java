public class DAY137_segregate01 {
    void segregate0and1(int[] arr) {
        
        int i=0, j = arr.length-1;
        
        while(i <j){
            while(i < j && arr[i] == 0) i++;
            while(j > i && arr[j] == 1) j--;
            
        // swap-:    
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
