package strategy;

public class WriteBook implements BookStrat{
    @Override
    public void operate() {
        System.out.println("writing book");
    }
}
