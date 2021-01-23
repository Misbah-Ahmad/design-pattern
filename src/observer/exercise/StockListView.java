package observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements StockChangeListener{
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void onStockChanged(Stock stock) {
        for (int i = 0; i < stocks.size(); i++) {
            if (stock.getId() == stocks.get(i).getId()) {
                stocks.remove(i);
                stocks.add(stock);
                show();
                break;
            }
        }
    }
}
