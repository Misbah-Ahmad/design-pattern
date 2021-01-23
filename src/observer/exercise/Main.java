package observer.exercise;

public class Main {

    public static void main(String[] args) {                
        StatusBar statusBar = new StatusBar();
        
        StockHouse stockHouse = new StockHouse();
        
        stockHouse.addObserver(statusBar);
        
        stockHouse.addStock(new Stock(1, 5f));
        stockHouse.addStock(new Stock(2, 6f));
        stockHouse.addStock(new Stock(3, 8f));

        statusBar.addStockList(stockHouse.getStocks());

        statusBar.show();

        System.out.println("Changing");
        stockHouse.changeStockPrice(1, 19F);
        System.out.println("Changed");
        statusBar.show();

    }
}
