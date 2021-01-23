package observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    
    List<StockChangeListener> listeners = new ArrayList<>();

    
    public void update(Stock stock) {
        for (StockChangeListener stockChangeListener : listeners) {
            stockChangeListener.onStockChanged(stock);
        }
    }

    public void addObserver(StockChangeListener listener) {
        listeners.add(listener);
    }

}
