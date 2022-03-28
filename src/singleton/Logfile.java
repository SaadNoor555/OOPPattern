package singleton;

public class Logfile {
    private static Logfile log;
    private static int counter;
    private Logfile(int x){
        counter = x;
    }

    public static Logfile getInstance(int x){
        if(log == null){
            log = new Logfile(x);
        }
        return log;
    }
    public void getData(){
        System.out.println("this is log: " + counter);
    }
}
