import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Kazuate {
    public static void main(String[] args) {
        try {
            Random rand = new Random();
            int numberA = rand.nextInt(200);
            int numberB = -1;
            int inputCount = 0;
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
             while (numberA != numberB) {
                 System.out.println("Please input the number");
                 numberB = Integer.parseInt(br.readLine());
                if(numberA == numberB) {
                    System.out.println("...　BINGO!!  answer is " + numberA);
                    System.out.println("...　You took " +  inputCount + " times.");
                    break;
                } else {
                    if(numberB > numberA) {
                        System.out.println("...　Answer is smaller then " + numberB);
                        inputCount++;
                    } else {
                        System.out.println("...　Answer is larger then " + numberB);
                        inputCount++;
                    }
                }

             }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
