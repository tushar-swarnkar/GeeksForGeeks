public class DAY97_binaryRepresentation {
    public static void main(String[] args) {
        
    }
    String binaryNextNumber(String s) {
        
        StringBuilder str=new StringBuilder(""); 
        boolean r=false;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                str.append("1");
                r=true;
            }
            else if(r==true){
                str.append("0");
            }
        
        }
        
        s=str.toString();
        
        StringBuilder sb=new StringBuilder(s);
        boolean p=true;
        
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                sb.setCharAt(i,'0');
            }
            else{
                sb.setCharAt(i,'1');
                p=false;
                break;
            }
        }
        
        if(p==true){
            return "1"+sb.toString();
        }
        else{
            return sb.toString();
        }
    }
}
