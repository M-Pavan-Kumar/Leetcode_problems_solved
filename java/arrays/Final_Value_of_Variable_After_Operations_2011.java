package java.arrays;

public class Final_Value_of_Variable_After_Operations_2011 {
        public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("X++")){
                x++;
            }
            else if(operations[i].equals("++X")){
                x++;
            }
            else if(operations[i].equals("--X")){
                x--;
            }
            else if(operations[i].equals("X--")){
                x--;
            }
        }
        return x;
    }
}
