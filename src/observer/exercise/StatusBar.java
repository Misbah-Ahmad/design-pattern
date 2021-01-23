package observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements StockChangeListener {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }
    public void addStockList(List<Stock> stocks) {
        this.stocks.addAll(stocks);
    }

    public void show() {
        for (Stock stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void onStockChanged(Stock stock) {

        for (int i=0; i < stocks.size(); i++) {
            if (stock.getId() == stocks.get(i).getId()) {
                stocks.remove(i);
                stocks.add(stock);
                break;
            }
        }
    }
}
