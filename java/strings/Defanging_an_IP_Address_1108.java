package java.strings;


public class Defanging_an_IP_Address_1108 {
    public String defangIPaddr(String address) {
        StringBuilder sb=new StringBuilder();
        for(char ch : address.toCharArray()){
            if (ch=='.'){
                sb.append("[.]");
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        
    }
}
