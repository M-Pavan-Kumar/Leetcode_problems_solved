package java.strings;

public class Reverse_String_II_541 {
        public String reverseStr(String s, int k) {
        char[] a=s.toCharArray();
        for(int i=0;i<a.length;i+=2*k){
            int left=i;
            int right=Math.min(i+k-1,a.length-1);
            while (left<right){
                char temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
        }
        return new String(a);
    }
}
