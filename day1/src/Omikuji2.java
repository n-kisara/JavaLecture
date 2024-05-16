public class Omikuji2 {
        public static void main(String[] args) {
            double value = Math.floor(Math.random()*10);
            int DaikichiCount = 0;
            int ChukichiCount = 0;
            int SyoukichiCount = 0;
            int KyoCount = 0;
            for(int i = 0;i < 10;i++) {
                double fortuneNumber =value * i;
                if(fortuneNumber > 80) {
                    System.out.println("Daikichi");
                    DaikichiCount++;
                }
                else if(fortuneNumber > 60) {
                    System.out.println("Chukichi");
                    ChukichiCount++;
                }
                else if(fortuneNumber > 40) {
                    System.out.println("Syoukichi");
                    SyoukichiCount++;
                }
                else {
                    System.out.println("Kyo");
                    KyoCount++;
                }
            }
            System.out.println("Daikichi:"+ DaikichiCount + " Chukichi:" + ChukichiCount + " Syoukichi:" + SyoukichiCount + " Kyo:" + KyoCount);
        }
    }
