import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PointAverage2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter number of subjects");
            int numberOfSub = Integer.parseInt(br.readLine());
            int marks[] = new int[numberOfSub];

            System.out.println("Enter marks");
            for(int i = 0;i < numberOfSub;i++) {
                marks[i] = Integer.parseInt(br.readLine());
            }
            int sum = 0;
            for(int sumMark:marks) {
                sum += sumMark;
            }
            double average = (double) sum/numberOfSub;
            System.out.println("Average marks of (");
            for(int j =0;j < numberOfSub;j++) {
                System.out.println(marks[j]);
                if(j < numberOfSub -1)
                    System.out.println(",");
            }
            System.out.println(")=" + average);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}