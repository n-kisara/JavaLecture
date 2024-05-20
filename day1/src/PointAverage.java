
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class PointAverage {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter number of subjects");
        int count = Integer.parseInt(br.readLine());
        Scanner scan = new Scanner(System.in);
        int[] pointArray = new int[count];
        int i;
        int sum = 0;
        for(i = 0;i < count;i++) {
            System.out.println("Enter marks");
            pointArray[i] = scan.nextInt();
            sum += pointArray[i];
        }

        System.out.println("Average marks of " + Arrays.toString(pointArray) + "=" + sum/count);

    }

}
