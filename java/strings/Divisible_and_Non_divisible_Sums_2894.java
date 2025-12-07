package java.strings;

public class Divisible_and_Non_divisible_Sums_2894 {
        public int differenceOfSums(int n, int m) {
        int num1=0,num2=0;
        for(int i=0;i<=n;i++){
            if (i%m!=0){
                num1+=i;
            }
            else{
                num2+=i;
            }
        }
        return num1-num2;
    }
}
