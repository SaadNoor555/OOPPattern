package strategy;

public class MyBook {
    BookStrat bookStrat;

    public MyBook(BookStrat bookStrat){
        this.bookStrat = bookStrat;
    }

    public void plsOperate(){
        this.bookStrat.operate();
    }

}
