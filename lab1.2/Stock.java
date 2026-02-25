
public class Stock {
    public String symbol;
    public String name ;
    double currentPrice = 0;
    double previousClosingPrice = 0;


    public Stock() {

    }
    public Stock (String _symbol ,String _name,double _previousClosingPrice, double _currentPrice) {
        previousClosingPrice = _previousClosingPrice;
        currentPrice = _currentPrice;
        name = _name;
        symbol =_symbol;



    }

    public double getChangePercent() {
        return previousClosingPrice = currentPrice;
    }
    public double getPersents() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;

    }
     

    public String toString() {
        return "" + symbol + " " + name + ": " + previousClosingPrice + " -> " + currentPrice + ": " + getPersents() + "%";
    }

}
 