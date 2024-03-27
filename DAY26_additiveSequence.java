public class DAY26_additiveSequence {
    public static void main(String[] args) {
        String n = "1235813";

        System.out.println(isAdditiveSequence(n));
    }
    static boolean isAdditiveSequence(String n) {
        // code here
         int num1 = 0;
        int size =n.length();
        for(int i=0;i < (size/2);i++){
            num1 = num1*10 + (n.charAt(i)-'0');
            int num2 = 0;
        for(int j=i+1;j<size-1;j++){
            num2 = num2*10 + (n.charAt(j)-'0');
            int first = num1,second = num2,num3=0;
            int k=j+1;
            while(k <size){
                num3 = num3*10 + (n.charAt(k)-'0');
                if(num3==first+second){
                    first = second;
                    second = num3;
                    num3 =0;
                }
                k++;
            }
            if(k==size && num3==0){
                return true;
            }
        }
        }
        return false;
    }
}
