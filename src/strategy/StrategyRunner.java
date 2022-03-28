package strategy;

public class StrategyRunner {
    public static void runStrategy(){
        MyBook myBook1 = new MyBook(new ReadBook());
        myBook1.plsOperate();
        MyBook myBook2 = new MyBook(new WriteBook());
        myBook2.plsOperate();
    }

}
