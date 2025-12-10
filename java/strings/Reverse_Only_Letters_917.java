package java.strings;

public class Reverse_Only_Letters_917 {
        public String reverseOnlyLetters(String s) {
        int left=0;
        int right=s.length()-1;
        char[] s_chars=s.toCharArray();
        while (left<right){
            if (!Character.isAlphabetic(s_chars[left])){
                left+=1;
                continue;
            }
            if(!Character.isAlphabetic(s_chars[right])){
                right-=1;
                continue;
            }
            char temp=s_chars[left];
            s_chars[left]=s_chars[right];
            s_chars[right]=temp;
            left++;
            right--;

        }
        return new String(s_chars);
    }
}
