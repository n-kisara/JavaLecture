package som.ansurs.practice1;

public class tryCatch {
    public static void main(String[] args) {
        try {
            int[] array = {23,3,6,42,9,28};
            int currentNumber = 0;
            for(int i = 0;i < array.length - 1;i++) {
                for(int j = 0;j < array.length;j++) {
                    if(array[j] > array[j+1]) {
                        currentNumber = array[j];
                        array[j] = array[j+1];
                        array[j+1] = currentNumber;
                    }
                }
                System.out.println(array[i] + "");
            }
        } catch(Exception e) {
            System.out.println("例外が発生しました");
        }
    }
}
