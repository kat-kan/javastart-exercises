package StringFormat;

public class Loader {
    public static void main(String[] args) {
        double loadingPercent = 0.0;
        while (loadingPercent <= 100){
            try {
                Thread.sleep(200);
                loadingPercent+= 0.5;
                System.out.print("Wczytywanie" + loadingPercent + "\r");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
