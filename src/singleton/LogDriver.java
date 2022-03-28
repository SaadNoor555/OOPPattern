package singleton;

public class LogDriver {
    public static void runLog(){
        Logfile log1= Logfile.getInstance(1);
        Logfile log2= Logfile.getInstance(2);

        log1.getData();
        log2.getData();
    }

}
