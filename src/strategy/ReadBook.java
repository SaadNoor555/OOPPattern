package strategy;

public class ReadBook implements BookStrat{

    @Override
    public void operate() {
        System.out.println("Reading Book");
    }
}
