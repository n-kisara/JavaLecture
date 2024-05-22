import java.io.*;
import java.util.StringTokenizer;

public class Uranai2 implements Uranai{
    public int calculateChemistry(int month,int day,int month2,int day2) {
        int chemistry = 0;

        int total1 = calculateTotalDays(month,day);
        int total2 = calculateTotalDays(month2,day2);
        chemistry = (total1 + total2) % 101;

        return chemistry;
    }

    static int calculateTotalDays(int month1,int day1) {
        int total = 0;
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i = 0;i < (month1 - 1);i++) {
            total += days[i];
        }
        total += day1;
        return total;
    }

    public void main(String[] args) {
        int chemistry = 0;
        String result;
        String fileName = "./day1/src/birthday.txt";
        String fileNameOut = "./day1/src/aisho.txt";
        File file = new File(fileName);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader breader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(fileNameOut);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            while(breader.ready()) {
                int aishoResult = 0;
                String line = breader.readLine();
                if(line == null) break;
                StringTokenizer token = new StringTokenizer(line);
                if(token.countTokens() > 4) continue;
                int maleMonth = Integer.parseInt(token.nextToken());
                int maleDay = Integer.parseInt(token.nextToken());
                int femaleMonth = Integer.parseInt(token.nextToken());
                int femaleDay = Integer.parseInt(token.nextToken());
                aishoResult = calculateChemistry(maleMonth,maleDay,femaleMonth,femaleDay);
                if(aishoResult >= 50) {
                    result = "Good";
                } else {
                    result = "Bad";
                }
                String lineWrite = "maleMonth=" + maleMonth + " maleDay=" + maleDay + " femaleMonth=" + femaleMonth + " femaleDay=" + femaleDay + " AISHOU=" + aishoResult + " " + result + "!";
                System.out.println("linewrite Length=" + lineWrite.length());
                bufferedWriter.write(lineWrite,0,lineWrite.length());
                bufferedWriter.flush();
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            breader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
