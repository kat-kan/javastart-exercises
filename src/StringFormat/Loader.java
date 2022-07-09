package StringFormat;

public class Loader {
    public static void main(String[] args) {
        double loadingPercent = 0.0;
        while (loadingPercent <= 100){
            try {
                Thread.sleep(200);
                loadingPercent+= 0.5;
                String halfPercentSign = loadingPercent % 1.0 == 0 ? "/": "\\";
                /*String tenPercentSign = " ";
                StringBuilder builder = new StringBuilder();
                if (loadingPercent%10.0==0){
                    builder.append(tenPercentSign).append("#");
                }
                tenPercentSign = builder.toString();*/
                System.out.printf("Wczytywanie: %.2f %% %s \r", loadingPercent, halfPercentSign);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
