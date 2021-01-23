package observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class StockHouse extends Observable{

    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public List<Stock> getStocks() {
        return stocks;
    }


    public void changeStockPrice(int index, float price) {
        stocks.get(index).setPrice(price);
        update(stocks.get(index));
    }

}
