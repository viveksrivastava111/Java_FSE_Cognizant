public class Main {
    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice("TCS", 3500.50);

        stockMarket.deregisterObserver(webApp);

        stockMarket.setStockPrice("Infosys", 1450.75);
    }
}