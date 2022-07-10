package StringFormat;

public class Loader {
    public static final int STEP_MILLIS = 200;
    public static final double STEP_PERCENT = 0.5;
    public static final int PERCENT_MAX_VALUE = 100;

    static double loadingPercent = 0.0;
    static String halfPercentIndicator;
    static String progressBar;

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        while (loadingPercent < PERCENT_MAX_VALUE) {
            try {
                Thread.sleep(STEP_MILLIS);
                loadingPercent += STEP_PERCENT;
                halfPercentIndicator = getHalfPercentIndicator(loadingPercent);
                progressBar = getProgressBar(loadingPercent, builder);
                System.out.printf("Wczytywanie: %5.2f%% %s (%-10s) \r", loadingPercent, halfPercentIndicator, progressBar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static String getHalfPercentIndicator(double loadingPercent) {
        return loadingPercent % 1.0 == 0 ? "/" : "\\";
    }

    private static String getProgressBar(double loadingPercent, StringBuilder builder) {
        String progressBarSign = "#";
        if (loadingPercent % 10.0 == 0) {
            builder.append(progressBarSign);
        }
        return builder.toString();
    }
}
